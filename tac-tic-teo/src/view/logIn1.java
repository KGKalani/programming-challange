/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.controller;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import singlePlayer.Single;

/**
 *
 * @author HP
 */
public class logIn1 extends javax.swing.JFrame {

    /**
     * Creates new form logIn1
     */
    public logIn1() {
        initComponents();
        this.setLocationRelativeTo(null);
        player1.setBackground(new Color(0,0,0,0));
    }

    public void startGame() {
        List<String> allPlayers = null;
          
        String play1 = player1.getText();
        
        
        try {
            allPlayers = controller.getAllPlayers();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(logIn2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(allPlayers.toString());
        
        if(!allPlayers.contains(play1)){
            try {
                System.out.println("nethaaaaaa");
                controller.addNameDataBase(play1);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(logIn2.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                controller.setScoreFirstTime(play1);
            } catch (    ClassNotFoundException | SQLException ex) {
                Logger.getLogger(BoardMultiPlayer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else
            System.out.println("player Exists");
        
        
        this.dispose();
        
         Single single = new Single(play1);
         single.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        player1 = new javax.swing.JTextField();
        minimize = new javax.swing.JLabel();
        start1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 5, 20, 20));

        player1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        player1.setForeground(new java.awt.Color(235, 129, 29));
        player1.setBorder(null);
        player1.setOpaque(false);
        player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1ActionPerformed(evt);
            }
        });
        getContentPane().add(player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 97, 270, 30));

        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 4, 20, 20));

        start1.setBorder(null);
        start1.setContentAreaFilled(false);
        start1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start1ActionPerformed(evt);
            }
        });
        getContentPane().add(start1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 165, 50, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginfinal-single.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 197));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1ActionPerformed
         startGame();
         
    }//GEN-LAST:event_player1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void start1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start1ActionPerformed
        startGame();
    }//GEN-LAST:event_start1ActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(logIn1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logIn1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logIn1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logIn1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new logIn1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField player1;
    private javax.swing.JButton start1;
    // End of variables declaration//GEN-END:variables
}