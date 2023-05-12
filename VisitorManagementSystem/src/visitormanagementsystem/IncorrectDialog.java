/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visitormanagementsystem;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author justi
 */
public class IncorrectDialog extends javax.swing.JFrame {

    /**
     * Creates new form ExitDialog
     */
    
    ImageIcon logo = new ImageIcon("C:\\Users\\justi\\Desktop\\Programming\\Java\\VisitorManagementSystem\\src\\assets\\SJCF_LOGO.png");
    
    public IncorrectDialog() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        incorrectDialogLogo = new javax.swing.JLabel();
        incorrecttxt = new javax.swing.JLabel();
        tryButton = new javax.swing.JLabel();
        incorrectDialogbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("exitDialog"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        incorrectDialogLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/incorrectLogo.png"))); // NOI18N
        incorrectDialogLogo.setFocusable(false);
        getContentPane().add(incorrectDialogLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 130));

        incorrecttxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        incorrecttxt.setForeground(new java.awt.Color(129, 159, 29));
        incorrecttxt.setText("Incorrect Email or Password!");
        incorrecttxt.setFocusable(false);
        getContentPane().add(incorrecttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        tryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tryButton.png"))); // NOI18N
        tryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tryButtonMouseClicked(evt);
            }
        });
        getContentPane().add(tryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        incorrectDialogbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/exitDialogbg.png"))); // NOI18N
        getContentPane().add(incorrectDialogbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        setSize(new java.awt.Dimension(435, 310));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tryButtonMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_tryButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IncorrectDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncorrectDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncorrectDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncorrectDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncorrectDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel incorrectDialogLogo;
    private javax.swing.JLabel incorrectDialogbg;
    private javax.swing.JLabel incorrecttxt;
    private javax.swing.JLabel tryButton;
    // End of variables declaration//GEN-END:variables
}
