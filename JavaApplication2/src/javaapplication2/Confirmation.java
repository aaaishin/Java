package javaapplication2;
import java.awt.Color;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.*;

 public class Confirmation extends javax.swing.JFrame {

     public Confirmation() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color((0xFAFAFA)));   
     }

   
     

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NameDisplay = new javax.swing.JTextField();
        ContactNumConf = new javax.swing.JTextField();
        EmailConfirm = new javax.swing.JTextField();
        AddressConf = new javax.swing.JTextField();
        ValidIDNumConf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        NumberOfNights = new javax.swing.JTextField();
        NightCostConfirm = new javax.swing.JTextField();
        TotalPriceConfirm = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SaveConfirmation = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        RoomTypeConfirm = new javax.swing.JTextField();
        RoomCapacityConfirm = new javax.swing.JTextField();
        CheckInDateConfirm1 = new javax.swing.JTextField();
        CheckOutDateConfirm1 = new javax.swing.JTextField();
        RoomIDConfirm = new javax.swing.JTextField();
        CardNumConfirm = new javax.swing.JTextField();
        CVCConfirm = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 37, 37));
        jLabel1.setText("Full Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 37, 37));
        jLabel2.setText("Contact Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(37, 37, 37));
        jLabel3.setText("E-mail Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(37, 37, 37));
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(37, 37, 37));
        jLabel7.setText("Valid ID Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(37, 37, 37));
        jLabel9.setText("Card Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(37, 37, 37));
        jLabel10.setText("CVC");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(37, 37, 37));
        jLabel11.setText("Room Type ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(37, 37, 37));
        jLabel12.setText("Room Capacity ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(37, 37, 37));
        jLabel13.setText("Check-in Date ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        NameDisplay.setForeground(new java.awt.Color(138, 138, 138));
        NameDisplay.setEnabled(false);
        NameDisplay.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                NameDisplayAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        NameDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(NameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 230, -1));

        ContactNumConf.setForeground(new java.awt.Color(138, 138, 138));
        ContactNumConf.setEnabled(false);
        getContentPane().add(ContactNumConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 240, -1));

        EmailConfirm.setForeground(new java.awt.Color(138, 138, 138));
        EmailConfirm.setEnabled(false);
        EmailConfirm.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                EmailConfirmAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        EmailConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(EmailConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 230, -1));

        AddressConf.setForeground(new java.awt.Color(138, 138, 138));
        AddressConf.setEnabled(false);
        getContentPane().add(AddressConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 240, -1));

        ValidIDNumConf.setForeground(new java.awt.Color(138, 138, 138));
        ValidIDNumConf.setEnabled(false);
        getContentPane().add(ValidIDNumConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 200, -1));

        jLabel14.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(37, 37, 37));
        jLabel14.setText("Check-out Date ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel15.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(37, 37, 37));
        jLabel15.setText("Room ID ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel17.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(37, 37, 37));
        jLabel17.setText("Number of Nights ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        jLabel18.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(37, 37, 37));
        jLabel18.setText("Night Cost ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        jLabel19.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(37, 37, 37));
        jLabel19.setText("Total Price ");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, -1));

        NumberOfNights.setForeground(new java.awt.Color(138, 138, 138));
        NumberOfNights.setEnabled(false);
        NumberOfNights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberOfNightsActionPerformed(evt);
            }
        });
        getContentPane().add(NumberOfNights, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 100, -1));

        NightCostConfirm.setForeground(new java.awt.Color(138, 138, 138));
        NightCostConfirm.setEnabled(false);
        getContentPane().add(NightCostConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 100, -1));

        TotalPriceConfirm.setForeground(new java.awt.Color(138, 138, 138));
        TotalPriceConfirm.setEnabled(false);
        getContentPane().add(TotalPriceConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 100, -1));

        jLabel20.setForeground(new java.awt.Color(138, 138, 138));
        jLabel20.setText("Room Type");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel21.setForeground(new java.awt.Color(138, 138, 138));
        jLabel21.setText("Capacity");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel22.setForeground(new java.awt.Color(138, 138, 138));
        jLabel22.setText("Check-in");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel23.setForeground(new java.awt.Color(138, 138, 138));
        jLabel23.setText("Check-out");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, -1));

        SaveConfirmation.setBackground(new java.awt.Color(233, 107, 70));
        SaveConfirmation.setText("Save");
        SaveConfirmation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveConfirmationActionPerformed(evt);
            }
        });
        getContentPane().add(SaveConfirmation, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, -1));

        jLabel24.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(233, 107, 70));
        jLabel24.setText("CONFIRMATION");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        RoomTypeConfirm.setEnabled(false);
        getContentPane().add(RoomTypeConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 90, -1));

        RoomCapacityConfirm.setEnabled(false);
        getContentPane().add(RoomCapacityConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 90, -1));

        CheckInDateConfirm1.setEnabled(false);
        getContentPane().add(CheckInDateConfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 382, 130, 30));

        CheckOutDateConfirm1.setEnabled(false);
        getContentPane().add(CheckOutDateConfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 432, 130, 30));

        RoomIDConfirm.setEnabled(false);
        getContentPane().add(RoomIDConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 100, -1));

        CardNumConfirm.setEnabled(false);
        getContentPane().add(CardNumConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 180, -1));

        CVCConfirm.setEnabled(false);
        getContentPane().add(CVCConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveConfirmationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveConfirmationActionPerformed
         try{
             Connection conn = DriverManager.getConnection(DbCons.DB_CONNECTION, "root", "root");
             String sql = "INSERT INTO guests(RoomId, Name, Email, Address, ValidID, CardNumber, ContactNumber, CheckInDate, CheckOutDate, DaysStaying, TotalCost) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
             PreparedStatement stmt = conn.prepareStatement(sql);
             stmt.setString(1, RoomIDConfirm.getText());
             stmt.setString(2, NameDisplay.getText());
             stmt.setString(3, EmailConfirm.getText());
             stmt.setString(4, AddressConf.getText());
             stmt.setString(5, ValidIDNumConf.getText());
             stmt.setString(6, CardNumConfirm.getText());
             stmt.setString(7, ContactNumConf.getText());
             stmt.setString(8,  CheckInDateConfirm1.getText());
             stmt.setString(9,  CheckOutDateConfirm1.getText());
             stmt.setString(10, NumberOfNights.getText());
             stmt.setString(11, TotalPriceConfirm.getText());
             stmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Guest information saved successfully.!");
             } 
        
             catch(SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error saving guest information.\n" + ex.getMessage());
             }
        
             String roomId = RoomIDConfirm.getText();
         try (Connection conn = DriverManager.getConnection(DbCons.DB_CONNECTION, "root", "root");
             Statement stmt = conn.createStatement()) {
             stmt.executeUpdate("UPDATE roomstable SET Availability = 'Unavailable' WHERE RoomID = '" + roomId + "'");
             this.dispose();
             } 
         
         catch (SQLException ex) {  
             JOptionPane.showMessageDialog(null, "Connection Error!");
        }   
    }//GEN-LAST:event_SaveConfirmationActionPerformed

    private void NameDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameDisplayActionPerformed
        
    }//GEN-LAST:event_NameDisplayActionPerformed
                                             
    private void NameDisplayAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_NameDisplayAncestorMoved
        
    }//GEN-LAST:event_NameDisplayAncestorMoved

    private void EmailConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailConfirmActionPerformed
        
    }//GEN-LAST:event_EmailConfirmActionPerformed

    private void EmailConfirmAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_EmailConfirmAncestorMoved
       
    }//GEN-LAST:event_EmailConfirmAncestorMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.setVisible(false); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NumberOfNightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfNightsActionPerformed
      
    }//GEN-LAST:event_NumberOfNightsActionPerformed

    public JTextField getRoomIDConfirm() {
     return this.RoomIDConfirm; 
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirmation().setVisible(true);       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextField AddressConf;
    javax.swing.JTextField CVCConfirm;
    javax.swing.JTextField CardNumConfirm;
    javax.swing.JTextField CheckInDateConfirm1;
    javax.swing.JTextField CheckOutDateConfirm1;
    javax.swing.JTextField ContactNumConf;
    javax.swing.JTextField EmailConfirm;
    javax.swing.JTextField NameDisplay;
    javax.swing.JTextField NightCostConfirm;
    javax.swing.JTextField NumberOfNights;
    javax.swing.JTextField RoomCapacityConfirm;
    javax.swing.JTextField RoomIDConfirm;
    javax.swing.JTextField RoomTypeConfirm;
    private javax.swing.JButton SaveConfirmation;
    javax.swing.JTextField TotalPriceConfirm;
    javax.swing.JTextField ValidIDNumConf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
