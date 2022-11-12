package com.rdani2005.model.db;

import com.rdani2005.model.UserModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UsersDB {

    /**
     * Funcion que retorna un valor booleano, indicando si existe o no el
     * usuario con la contraseña ingresada.
     *
     * @param username = username del usuario
     * @param password = contraseña del usuario
     * @return null in case user is not found, UserModel in case user is found
     */
    public UserModel login(String username, String password) {
        ConectionDatabase cn = new ConectionDatabase();
        ResultSet rs;
        UserModel user;
        Statement statement;
        // Realizar consulta
        try {
            statement = cn.getCn().createStatement();
            rs = statement.executeQuery("SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "';");
            if (rs.next()) {

                Statement st2;
                ResultSet rs2;

                // Getting the user type description from the foreign key!
                String type = rs.getString("type");
                String user_type;
                try {
                    st2 = cn.getCn().createStatement();
                    rs2 = st2.executeQuery("SELECT description FROM user_type WHERE id = '" + type + "';");
                    user_type = rs2.getString(1);
                } catch (SQLException e) {
                    System.out.println("");
                    user_type = "admin";
                }

                user = new UserModel(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password"),
                        user_type,
                        null
                );

                return user;
            }

            rs.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error en el login: " + e);
            return null;
        }

        return null;
    }

    public UserModel SignUp(String name, String username, String email, String password) {

        ConectionDatabase cn = new ConectionDatabase();
        ResultSet rs;
        ResultSet rs3;
        UserModel user;
        Statement statement;
        Statement st2;
        Statement st3;
        int result;

        try {
            // Comprobar que no exista otro usuario con el mismo username
            statement = cn.getCn().createStatement();
            rs = statement.executeQuery("SELECT * FROM users WHERE username = '" + username + "';");
            // Detener el metodo en caso de ver otro usuario con el mismo username
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Username ya registrado!");
                return null;
            }
            // Insertar otro usuario, en caso de no tener el mismo username
            st2 = cn.getCn().createStatement();
            result = st2.executeUpdate("INSERT INTO users (name, username, email, password, type) VALUES ("
                    + "'" + name + "',"
                    + "'" + username + "',"
                    + "'" + email + "',"
                    + "'" + password + "',"
                    + "'" + 2 + "'"
                    + ");");

            user = getId(username, name, email, password);
            
        } catch (SQLException e) {
            System.out.println("Error en la parte de registrar usuarios: " + e);
            user = null;
        }

        return user;
    }

    private UserModel getId(String username, String name, String email, String password) {
        Statement st;
        ResultSet rs;
        UserModel user;
        ConectionDatabase cn = new ConectionDatabase();
        try {
            st = cn.getCn().createStatement();
            rs = st.executeQuery("SELECT * FROM users WHERE username = '" + username + "';");
            if (rs.next()) {
                int id = rs.getInt(1);
                System.out.println("Usuario encontrado");
                user = new UserModel(id, name, username, email, password, "user", null);
                return user;
            }
            System.out.println("usuario no encontrado!");
            return null;

        } catch (SQLException e) {
            System.out.println("Error en buscar el id de usuario: " + e);
            return null;
        }
    }
}
