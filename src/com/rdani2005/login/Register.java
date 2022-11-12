package com.rdani2005.login;

import com.rdani2005.event.EventSignUp;
import lombok.Setter;

public class Register extends PanelCustom {

    @Setter
    EventSignUp eventSignUp;

    public Register() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logButton1 = new com.rdani2005.swing.buttons.LogButton();
        jLabel1 = new javax.swing.JLabel();
        name_txt = new com.rdani2005.swing.Textfield();
        email_txt = new com.rdani2005.swing.Textfield();
        username_txt = new com.rdani2005.swing.Textfield();
        password_txt = new com.rdani2005.swing.Password();
        register_btn = new com.rdani2005.swing.buttons.LogButton();

        logButton1.setText("logButton1");

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");

        name_txt.setForeground(new java.awt.Color(255, 255, 255));
        name_txt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        name_txt.setHint("Name");

        email_txt.setForeground(new java.awt.Color(255, 255, 255));
        email_txt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        email_txt.setHint("Email");

        username_txt.setForeground(new java.awt.Color(255, 255, 255));
        username_txt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        username_txt.setHint("Username");

        password_txt.setForeground(new java.awt.Color(255, 255, 255));
        password_txt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        password_txt.setHint("Password");

        register_btn.setBackground(new java.awt.Color(0, 102, 255));
        register_btn.setForeground(new java.awt.Color(255, 255, 255));
        register_btn.setText("Sign Up");
        register_btn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(password_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed
        eventSignUp.SignUp(getuName(), getUsername(), getEmail(), getPassword());
    }//GEN-LAST:event_register_btnActionPerformed

    public String getUsername() {
        if (username_txt == null) {
            return "";
        }

        return username_txt.getText().trim();
    }

    public String getPassword() {
        if (password_txt == null) {
            return "";
        }
        return new String(password_txt.getPassword()).trim();
    }

    public String getuName() {
        if (name_txt == null) {
            return "";
        }

        return name_txt.getText().trim();
    }

    public String getEmail() {
        if (email_txt == null) {
            return "";
        }
        return email_txt.getText().trim();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rdani2005.swing.Textfield email_txt;
    private javax.swing.JLabel jLabel1;
    private com.rdani2005.swing.buttons.LogButton logButton1;
    private com.rdani2005.swing.Textfield name_txt;
    private com.rdani2005.swing.Password password_txt;
    private com.rdani2005.swing.buttons.LogButton register_btn;
    private com.rdani2005.swing.Textfield username_txt;
    // End of variables declaration//GEN-END:variables
}
