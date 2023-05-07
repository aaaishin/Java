/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visitormanagementsystem;

import java.awt.Color;

/**
 *
 * @author justi
 */
public class ContinueDialog extends javax.swing.JFrame {

    /**
     * Creates new form ExitDialog
     */
    public ContinueDialog() {
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

        successDialogLogo = new javax.swing.JLabel();
        loginSuccesstxt = new javax.swing.JLabel();
        continueButton = new javax.swing.JLabel();
        continueDialogbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("exitDialog"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        successDialogLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/successLogo.png"))); // NOI18N
        successDialogLogo.setFocusable(false);
        getContentPane().add(successDialogLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 130));

        loginSuccesstxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginSuccesstxt.setForeground(new java.awt.Color(129, 159, 29));
        loginSuccesstxt.setText("Login Successful!");
        loginSuccesstxt.setFocusable(false);
        getContentPane().add(loginSuccesstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        continueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/continueButton.png"))); // NOI18N
        continueButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continueButtonMouseClicked(evt);
            }
        });
        getContentPane().add(continueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        continueDialogbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/exitDialogbg.png"))); // NOI18N
        getContentPane().add(continueDialogbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        setSize(new java.awt.Dimension(435, 310));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void continueButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueButtonMouseClicked
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_continueButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ContinueDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContinueDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContinueDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContinueDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ContinueDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel continueButton;
    private javax.swing.JLabel continueDialogbg;
    private javax.swing.JLabel loginSuccesstxt;
    private javax.swing.JLabel successDialogLogo;
    // End of variables declaration//GEN-END:variables
}