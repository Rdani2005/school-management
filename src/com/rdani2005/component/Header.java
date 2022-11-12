package com.rdani2005.component;

import com.rdani2005.model.UserModel;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Header extends javax.swing.JPanel {

    public Header() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdMenu = new com.rdani2005.swing.buttons.Button();
        avatarImage1 = new com.rdani2005.swing.AvatarImage();
        username_lbl = new javax.swing.JLabel();
        roll_lbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonBadges1 = new com.rdani2005.swing.buttons.ButtonBadges();
        buttonBadges2 = new com.rdani2005.swing.buttons.ButtonBadges();

        setBackground(new java.awt.Color(255, 255, 255));

        cmdMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rdani2005/icon/menu.png"))); // NOI18N

        avatarImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rdani2005/icon/profile.jpg"))); // NOI18N
        avatarImage1.setPreferredSize(new java.awt.Dimension(40, 40));

        username_lbl.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        username_lbl.setForeground(new java.awt.Color(127, 127, 127));
        username_lbl.setText("Username");

        roll_lbl.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        roll_lbl.setForeground(new java.awt.Color(127, 127, 127));
        roll_lbl.setText("user roll");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        buttonBadges1.setForeground(new java.awt.Color(231, 77, 77));
        buttonBadges1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rdani2005/icon/notification.png"))); // NOI18N
        buttonBadges1.setBadges(12);

        buttonBadges2.setForeground(new java.awt.Color(63, 158, 232));
        buttonBadges2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rdani2005/icon/message.png"))); // NOI18N
        buttonBadges2.setBadges(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roll_lbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(avatarImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(username_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roll_lbl))
                            .addComponent(avatarImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(buttonBadges2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonBadges1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void AddMenuEvent(ActionListener event) {
        cmdMenu.addActionListener(event);
    }
    
    
    public void setData(UserModel user) {
        username_lbl.setText(user.getName());
        roll_lbl.setText(user.getType());
        
        if (user.getProfile_image() == null) {
           
            avatarImage1.setIcon(new ImageIcon(getClass().getResource("/com/rdani2005/icon/user.png")));
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rdani2005.swing.AvatarImage avatarImage1;
    private com.rdani2005.swing.buttons.ButtonBadges buttonBadges1;
    private com.rdani2005.swing.buttons.ButtonBadges buttonBadges2;
    private com.rdani2005.swing.buttons.Button cmdMenu;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel roll_lbl;
    private javax.swing.JLabel username_lbl;
    // End of variables declaration//GEN-END:variables
}
