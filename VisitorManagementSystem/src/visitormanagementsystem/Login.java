/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visitormanagementsystem;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author justi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    ImageIcon logo = new ImageIcon("C:\\Users\\justi\\Desktop\\Programming\\Java\\VisitorManagementSystem\\src\\assets\\SJCF_LOGO.png");
    
    public Login() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        loginTextField.setFocusable(false);
        passwordField.setFocusable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeLogo = new javax.swing.JLabel();
        minimizeLogo = new javax.swing.JLabel();
        stJudetxt = new javax.swing.JLabel();
        home4agedtxt = new javax.swing.JLabel();
        careFacilitytxt = new javax.swing.JLabel();
        imageLogo = new javax.swing.JLabel();
        loginLogo = new javax.swing.JLabel();
        welcomeTxt = new javax.swing.JLabel();
        passTxt = new javax.swing.JLabel();
        emailTxt = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JLabel();
        loginBG = new javax.swing.JLabel();
        loginBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("St. Jude Care Facility");
        setIconImage(logo.getImage());
        setName("loginFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/closeLogo.png"))); // NOI18N
        closeLogo.setToolTipText("Close");
        closeLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLogo.setFocusable(false);
        closeLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLogoMouseClicked(evt);
            }
        });
        getContentPane().add(closeLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));

        minimizeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minimizeLogo.png"))); // NOI18N
        minimizeLogo.setToolTipText("Minimize");
        minimizeLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeLogo.setFocusable(false);
        minimizeLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLogoMouseClicked(evt);
            }
        });
        getContentPane().add(minimizeLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        stJudetxt.setFont(new java.awt.Font("Segoe UI Black", 1, 75)); // NOI18N
        stJudetxt.setForeground(new java.awt.Color(129, 159, 29));
        stJudetxt.setText("St. Jude");
        stJudetxt.setFocusable(false);
        getContentPane().add(stJudetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 320, 70));

        home4agedtxt.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        home4agedtxt.setForeground(new java.awt.Color(129, 159, 29));
        home4agedtxt.setText("Home for the Aged");
        home4agedtxt.setFocusable(false);
        getContentPane().add(home4agedtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, 40));

        careFacilitytxt.setFont(new java.awt.Font("Segoe UI Light", 0, 55)); // NOI18N
        careFacilitytxt.setForeground(new java.awt.Color(129, 159, 29));
        careFacilitytxt.setText("Care Facility");
        careFacilitytxt.setFocusable(false);
        getContentPane().add(careFacilitytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, 70));

        imageLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imageLogo.png"))); // NOI18N
        imageLogo.setFocusable(false);
        getContentPane().add(imageLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 330, -1));

        loginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/loginLogo.png"))); // NOI18N
        loginLogo.setFocusable(false);
        getContentPane().add(loginLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        welcomeTxt.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        welcomeTxt.setForeground(new java.awt.Color(129, 159, 29));
        welcomeTxt.setText("Hello, Welcome to St. Jude!");
        welcomeTxt.setFocusable(false);
        getContentPane().add(welcomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, 40));

        passTxt.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        passTxt.setForeground(new java.awt.Color(129, 159, 29));
        passTxt.setText("Enter your password:");
        passTxt.setFocusable(false);
        getContentPane().add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, 40));

        emailTxt.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(129, 159, 29));
        emailTxt.setText("Enter your email address:");
        emailTxt.setFocusable(false);
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, 40));

        passwordField.setBackground(new java.awt.Color(129, 159, 29));
        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setToolTipText("Password");
        passwordField.setBorder(null);
        passwordField.setOpaque(true);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordFieldMousePressed(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 310, 40));

        loginTextField.setBackground(new java.awt.Color(129, 159, 29));
        loginTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginTextField.setForeground(new java.awt.Color(255, 255, 255));
        loginTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginTextField.setToolTipText("Email Address");
        loginTextField.setBorder(null);
        loginTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        loginTextField.setOpaque(true);
        loginTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginTextFieldFocusLost(evt);
            }
        });
        loginTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginTextFieldMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginTextFieldMousePressed(evt);
            }
        });
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 310, 40));

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/loginButton.png"))); // NOI18N
        loginButton.setToolTipText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));

        loginBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/loginBG.png"))); // NOI18N
        loginBG.setFocusable(false);
        getContentPane().add(loginBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        loginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/loginBackground.png"))); // NOI18N
        loginBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginBackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginBackground.setMaximumSize(new java.awt.Dimension(1020, 570));
        loginBackground.setMinimumSize(new java.awt.Dimension(1020, 570));
        loginBackground.setPreferredSize(null);
        getContentPane().add(loginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 570));
        loginBackground.getAccessibleContext().setAccessibleName("imageBackground");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLogoMouseClicked
        ExitDialog exDiag = new ExitDialog();
        exDiag.setVisible(true);
    }//GEN-LAST:event_closeLogoMouseClicked

    private void minimizeLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLogoMouseClicked
        this.setExtendedState(Login.ICONIFIED);
    }//GEN-LAST:event_minimizeLogoMouseClicked

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(DatabaseConnection.DB_CONNECTION,"root","root");
            String sql = "SELECT * FROM adminlogin WHERE Email = ? AND Password = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, loginTextField.getText());
            pst.setString(2,passwordField.getText());
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                ContinueDialog conDiag = new ContinueDialog();
                conDiag.setVisible(true);
                loginTextField.setText("");
                passwordField.setText("");
                this.setVisible(false);
            }
            else{
                IncorrectDialog incorDiag = new IncorrectDialog();
                incorDiag.setVisible(true);
            }
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection Error!" + e.getMessage());
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void loginTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTextFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldMouseClicked

    private void loginTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTextFieldMousePressed
        if(loginTextField.getText().equals("Enter your email address")){
            loginTextField.setText("");
            loginTextField.setFocusable(true);
        }
    }//GEN-LAST:event_loginTextFieldMousePressed

    private void passwordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMousePressed
        if(passwordField.getText().equals("Enter your password")){
            passwordField.setText("");
            passwordField.setFocusable(true);
        }
    }//GEN-LAST:event_passwordFieldMousePressed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        loginTextField.setFocusable(true);
        passwordField.setFocusable(true);
    }//GEN-LAST:event_formMouseEntered

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldMouseClicked

    private void loginTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginTextFieldFocusGained

    }//GEN-LAST:event_loginTextFieldFocusGained

    private void loginTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginTextFieldFocusLost

    }//GEN-LAST:event_loginTextFieldFocusLost

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel careFacilitytxt;
    private javax.swing.JLabel closeLogo;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JLabel home4agedtxt;
    private javax.swing.JLabel imageLogo;
    private javax.swing.JLabel loginBG;
    private javax.swing.JLabel loginBackground;
    private javax.swing.JLabel loginButton;
    private javax.swing.JLabel loginLogo;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JLabel minimizeLogo;
    private javax.swing.JLabel passTxt;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel stJudetxt;
    private javax.swing.JLabel welcomeTxt;
    // End of variables declaration//GEN-END:variables
}
