package com.rdani2005.views;

import com.rdani2005.event.EventLogin;
import com.rdani2005.event.EventSignUp;
import com.rdani2005.model.UserModel;
import com.rdani2005.model.db.UsersDB;
import java.awt.Frame;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;

public class Login_View extends javax.swing.JFrame {

    public Login_View() {
        initComponents();

        EventSignUp signUp = new EventSignUp() {
            @Override
            public void SignUp(String name, String username, String email, String password) {
                if (name.equals("") || email.equals("") || username.equals("") || password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
                    return;
                }

                
                UsersDB db = new UsersDB();
                UserModel right = db.SignUp(name, username, email, password);

                if (right == null) {
                    JOptionPane.showMessageDialog(null, "Error registrando usuario");
                    return;
                }
                
                Main_View main = new Main_View();
                main.setUser(right);
                main.setLoginEvent(null);
                main.setSignEvent(this);
                main.setHeaderData();

                main.setVisible(true);

                Login_View.this.dispose();

            }

            @Override
            public void logOut(Frame f) {
                new Login_View().setVisible(true);
                f.dispose();
            }
        };

        EventLogin e = new EventLogin() {
            @Override
            public void loginDone(String username, String password) {

                if (username.equals("") || password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
                    return;
                }

                UsersDB db = new UsersDB();
                UserModel right = db.login(username, password);

                if (right == null) {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos");
                    return;
                }

                Main_View main = new Main_View();
                main.setUser(right);
                main.setHeaderData();
                
                main.setSignEvent(null);
                main.setLoginEvent(this);
                // Delete this frame and create set visible the main view
                main.setVisible(true);
                Login_View.this.dispose();
            }

            @Override
            public void logOut(Frame f) {
                new Login_View().setVisible(true);
                f.dispose();
            }
        };

        loginAndRegister1.setEventLogin(e);
        loginAndRegister1.setEventSignUp(signUp);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginAndRegister1 = new com.rdani2005.login.LoginAndRegister();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login School");
        setIconImage(new ImageIcon(getClass().getResource("/com/rdani2005/icon/icon.png")).getImage());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 825, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginAndRegister1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginAndRegister1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rdani2005.login.LoginAndRegister loginAndRegister1;
    // End of variables declaration//GEN-END:variables
}
