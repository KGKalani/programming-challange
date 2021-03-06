/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import controller.controller;
import javax.swing.JFrame;
import tac.tic.teo.player;

/**
 *
 * @author HP
 */
public class GameMain extends javax.swing.JFrame {

    /**
     * Creates new form GameMain
     */
    public GameMain() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        single = new javax.swing.JButton();
        multy = new javax.swing.JButton();
        highScore = new javax.swing.JButton();
        close = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        single.setBorder(null);
        single.setContentAreaFilled(false);
        single.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleActionPerformed(evt);
            }
        });
        getContentPane().add(single, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, 30));

        multy.setBorder(null);
        multy.setContentAreaFilled(false);
        multy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multyActionPerformed(evt);
            }
        });
        getContentPane().add(multy, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 130, 40));

        highScore.setBorder(null);
        highScore.setContentAreaFilled(false);
        highScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highScoreActionPerformed(evt);
            }
        });
        getContentPane().add(highScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 130, 30));

        close.setBorder(null);
        close.setContentAreaFilled(false);
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 60, 30));

        exit.setBorder(null);
        exit.setContentAreaFilled(false);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 20, 20));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 10, 20, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleActionPerformed
        logIn1 loIn1 = new logIn1();
        this.dispose();
        loIn1.setVisible(true);
    }//GEN-LAST:event_singleActionPerformed

    private void multyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multyActionPerformed
        player2Login loIn2 = new player2Login();
        this.dispose();
        loIn2.setVisible(true);
    }//GEN-LAST:event_multyActionPerformed

    private void highScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highScoreActionPerformed
        List<player> highScore1 = null;
        try {
            highScore1 = controller.getHighScore();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scoretable scoretable = new Scoretable(highScore1);
        scoretable.setVisible(true);
    }//GEN-LAST:event_highScoreActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        dispose();
    }//GEN-LAST:event_exitMouseClicked

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
            java.util.logging.Logger.getLogger(GameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GameMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JButton exit;
    private javax.swing.JButton highScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton multy;
    private javax.swing.JButton single;
    // End of variables declaration//GEN-END:variables
}
