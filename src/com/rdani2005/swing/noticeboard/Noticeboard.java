package com.rdani2005.swing.noticeboard;

import com.rdani2005.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

public class Noticeboard extends javax.swing.JPanel {
    
    public Noticeboard() {
        initComponents();
        setBackground(Color.WHITE);
        scrollpanel.setVerticalScrollBar(new ScrollBarCustom());
        panel.setLayout(new MigLayout("nogrid, fillx"));
    }
    
    public void addNoticeBoard(ModelNoticeBoard data) {
        JLabel title = new JLabel(data.getTitle());
        title.setFont(new Font("sansserif", 1, 12));
        title.setForeground(data.getTitleColor());
        panel.add(title);
        JLabel time = new JLabel(data.getTime());
        time.setForeground(new Color(180, 180, 180));
        panel.add(time, "gap 10, wrap");
        JTextPane txt = new JTextPane();
        txt.setBackground(new Color(0, 0, 0, 0));
        txt.setForeground(new Color(120, 120, 120));
        txt.setSelectionColor(new Color(150, 150, 150));
        txt.setBorder(null);
        txt.setOpaque(false);
        txt.setEditable(false);
        txt.setText(data.getDescripcion());
        panel.add(txt, "w 100::90%, wrap");
    }

    public void addDate(String date) {
        JLabel lbDate = new JLabel(date);
        lbDate.setBorder(new EmptyBorder(5, 5, 5, 5));
        lbDate.setFont(new Font("sansserif", 1, 13));
        lbDate.setForeground(new Color(80, 80, 80));
        panel.add(lbDate, "wrap");
    }
    
    public void scrollToTop() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                scrollpanel.getVerticalScrollBar().setValue(0);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollpanel = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        scrollpanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollpanel.setBorder(null);
        scrollpanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        scrollpanel.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpanel)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrollpanel;
    // End of variables declaration//GEN-END:variables
}
