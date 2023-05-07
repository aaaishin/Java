package javaapplication2;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Editing extends javax.swing.JFrame {

    
    public Editing() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackEdit = new javax.swing.JButton();
        LogOutEdit = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        ViewAllUsers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackEdit.setText("Back");
        BackEdit.setBorderPainted(false);
        BackEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackEditActionPerformed(evt);
            }
        });
        jPanel1.add(BackEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        LogOutEdit.setBackground(new java.awt.Color(255, 0, 0));
        LogOutEdit.setText("Log Out");
        LogOutEdit.setBorderPainted(false);
        LogOutEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutEditActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(233, 107, 70));
        jLabel20.setText("Settings");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 110, 60));

        ViewAllUsers.setText("View All Accounts");
        ViewAllUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllUsersActionPerformed(evt);
            }
        });
        jPanel1.add(ViewAllUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackEditActionPerformed
        new Main().setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_BackEditActionPerformed

    private void LogOutEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutEditActionPerformed
       this.setVisible(false); 
       Login loginForm = new Login();
       loginForm.setVisible(true);
    }//GEN-LAST:event_LogOutEditActionPerformed

    private void ViewAllUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllUsersActionPerformed
     
     String dbURL = DbCons.DB_CONNECTION;
     String user = "root";
     String pass = "root";   
     
        try (Connection conn = DriverManager.getConnection(dbURL, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("Select * from login")) {

             DefaultTableModel model = new DefaultTableModel();

    
             model.addColumn("ID");
             model.addColumn("Username");
             model.addColumn("Password");
             
         while (rs.next()) {
             Object[] row = {rs.getInt("ID"), rs.getString("Username"), rs.getString("OurPassword")};
             model.addRow(row);
             }

             JTable table = new JTable(model);
             JOptionPane.showMessageDialog(null, new JScrollPane(table), "All Users", JOptionPane.INFORMATION_MESSAGE);
             } 
         catch (SQLException ex) {   
             JOptionPane.showMessageDialog(null, "Connection Error!");
        }
    }//GEN-LAST:event_ViewAllUsersActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackEdit;
    private javax.swing.JButton LogOutEdit;
    private javax.swing.JButton ViewAllUsers;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
