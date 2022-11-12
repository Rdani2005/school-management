package com.rdani2005.views;

import com.rdani2005.form.FormHome;
import com.rdani2005.form.MainForm;
import com.rdani2005.swing.MenuItem;
import com.rdani2005.component.Menu;
import com.rdani2005.swing.PopupMenu;
import com.rdani2005.component.Header;
import com.rdani2005.event.EventLogin;
import com.rdani2005.event.EventSignUp;

import com.rdani2005.form.OtherForm;
import com.rdani2005.model.UserModel;
import com.rdani2005.swing.icon.GoogleMaterialDesignIcons;
import com.rdani2005.swing.icon.IconFontSwing;

import java.awt.Component;
import java.awt.event.ActionEvent;

import net.miginfocom.swing.MigLayout;

import javax.swing.ImageIcon;
import lombok.Getter;
import lombok.Setter;

import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Main_View extends javax.swing.JFrame {

    public Main_View() {
        initComponents();
        init();
    }

    private void init() {
        layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
        bg.setLayout(layout);
        menu = new Menu();
        header = new Header();
        main = new MainForm();

        menu.addEvent((int menuIntex, int subMenuIntex) -> {
            if (menuIntex == 0 && subMenuIntex == 0) {
                main.showForm(new FormHome());
            } else if (subMenuIntex > 0) {
                main.showForm(new OtherForm());
            }

        });

        menu.addEventShowPopup((Component com) -> {
            MenuItem item = (MenuItem) com;
            PopupMenu popup = new PopupMenu(Main_View.this, item.getIndex(), item.getEventSelected(), item.getMenu().getSubMenu());
            int x1 = Main_View.this.getX() + 52;
            int y1 = Main_View.this.getY() + com.getY() + 86;
            popup.setLocation(x1, y1);
            popup.setVisible(true);
        });

        menu.initMenuItem();

        bg.add(menu, "w 230!, spany 2");
        bg.add(header, "h 50!, wrap");
        bg.add(main, "w 100%, h 100%");

        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.isShowMenu()) {
                    width = 60 + (170 * (1f - fraction));
                } else {
                    width = 60 + (170 * fraction);
                }
                layout.setComponentConstraints(menu, "w " + width + "!, spany2");
                menu.revalidate();
            }

            @Override
            public void end() {
                menu.setShowMenu(!menu.isShowMenu());
                menu.setEnableMenu(true);
            }

        };

        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);

        header.AddMenuEvent((ActionEvent ae) -> {
            if (!animator.isRunning()) {
                animator.start();
            }
            menu.setEnableMenu(false);
            if (menu.isShowMenu()) {
                menu.hideallMenu();
            }
        });
        // init google icons
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        // This is the main view
        main.showForm(new FormHome());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School Managment");
        setIconImage(new ImageIcon(getClass().getResource("/com/rdani2005/icon/icon.png")).getImage());
        setUndecorated(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setHeaderData() {
        menu.setData(user.getUsername());
        header.setData(user);
    }
    
    private MigLayout layout;
    private Menu menu;
    private Header header;
    private MainForm main;
    private Animator animator;
    
    @Getter
    @Setter
    private UserModel user; 
    @Setter
    private EventLogin loginEvent;
    
    @Setter
    private EventSignUp signEvent;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}
