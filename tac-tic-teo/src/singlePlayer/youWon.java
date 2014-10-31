/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singlePlayer;
import singlePlayer.Single;
import view.BoardMultiPlayer;

/**
 *
 * @author HP
 */
public class youWon extends javax.swing.JFrame {

    /**
     * Creates new form youWon
     */
    Single s;
    public youWon() {
        initComponents();
    }
    
    public youWon(Single aThis) {
        initComponents();
        s = aThis;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playAgain = new javax.swing.JLabel();
        quit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playAgainMouseClicked(evt);
            }
        });
        getContentPane().add(playAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 90, 20));

        quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitMouseClicked(evt);
            }
        });
        getContentPane().add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 160, 100, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/youWon.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 403, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   
    private void playAgainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playAgainMouseClicked

        s.restart();
        dispose();
    }//GEN-LAST:event_playAgainMouseClicked

    private void quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseClicked
        dispose();
        s.dispose();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_quitMouseClicked

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
            java.util.logging.Logger.getLogger(youWon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(youWon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(youWon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(youWon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new youWon().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel playAgain;
    private javax.swing.JLabel quit;
    // End of variables declaration//GEN-END:variables
}