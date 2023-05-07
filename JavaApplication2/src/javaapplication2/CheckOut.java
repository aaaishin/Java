package javaapplication2;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
 
public class CheckOut extends javax.swing.JFrame {

   
     public CheckOut() {
         initComponents();
         setLocationRelativeTo(null);
         setResizable(false);
         getContentPane().setBackground(new Color((0xFAFAFA)));
         RoomIDChckOut.setFocusable(false); 
         }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Rooms = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RoomIDChckOut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CheckOutButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 725));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(138, 138, 138));
        jButton1.setText("Check In");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, 60));

        jButton2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(233, 107, 70));
        jButton2.setText("Check Out");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 60));

        Rooms.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Rooms.setForeground(new java.awt.Color(138, 138, 138));
        Rooms.setText("Rooms");
        Rooms.setBorderPainted(false);
        Rooms.setContentAreaFilled(false);
        Rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsActionPerformed(evt);
            }
        });
        getContentPane().add(Rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 130, 60));

        jButton6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(138, 138, 138));
        jButton6.setText("Guests");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 130, 60));

        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel1.setText("Input Room ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        RoomIDChckOut.setFont(new java.awt.Font("Niagara Solid", 1, 48)); // NOI18N
        RoomIDChckOut.setForeground(new java.awt.Color(138, 138, 138));
        RoomIDChckOut.setText("ID");
        RoomIDChckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomIDChckOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RoomIDChckOutMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RoomIDChckOutMousePressed(evt);
            }
        });
        RoomIDChckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomIDChckOutActionPerformed(evt);
            }
        });
        getContentPane().add(RoomIDChckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 210, 70));

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 107, 70));
        jLabel2.setText("CHECK OUT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, 60));

        CheckOutButton.setBackground(new java.awt.Color(233, 107, 70));
        CheckOutButton.setText("Check Out");
        CheckOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CheckOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, -1, -1));

        jLabel21.setFont(new java.awt.Font("Lucida Fax", 1, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(233, 107, 70));
        jLabel21.setText("logo");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 70, 30));

        jLabel18.setFont(new java.awt.Font("Lucida Fax", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(233, 107, 70));
        jLabel18.setText("Digital Haven ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 100));

        jLabel17.setFont(new java.awt.Font("Lucida Fax", 3, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(233, 107, 70));
        jLabel17.setText("Hotel");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 70, 30));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CheckIn().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         new Main().setVisible(true);
         this.setVisible(false); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void RoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsActionPerformed
         Rooms roomsForm = new Rooms();
         String query = "SELECT RoomID, RoomType, RoomCapacity, Availability FROM roomstable";
         
         try {
             Connection conn = DriverManager.getConnection(DbCons.DB_CONNECTION, "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery();
             
             DefaultTableModel model = (DefaultTableModel) roomsForm.getRoomsTable().getModel();
             model.setRowCount(0);

         while (rs.next()) {
             Object[] row = { rs.getInt("RoomID"), rs.getString("RoomType"), rs.getString("RoomCapacity"), rs.getString("Availability") };
             model.addRow(row);
             }
             roomsForm.getRoomsTable().setModel(model);
             roomsForm.setVisible(true);
             this.dispose();
             rs.close();
             pstmt.close();
             conn.close();
             } 
         catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Connection Error!");
        }    
    }//GEN-LAST:event_RoomsActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         Guests GuestsForm = new Guests();
         String query = "SELECT RoomId, Name, Email, Address, ValidID, CardNumber, ContactNumber, CheckInDate, CheckOutDate, DaysStaying, TotalCost FROM guests";
         
         try {
             Connection conn = DriverManager.getConnection(DbCons.DB_CONNECTION, "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery();
             
             DefaultTableModel model = (DefaultTableModel) GuestsForm.getGuestsTable().getModel();
             model.setRowCount(0);

         while (rs.next()) {
             Object[] row = { rs.getInt("RoomId"), rs.getString("Name"), rs.getString("Email"), rs.getString("Address") ,
             rs.getString("ValidID"), rs.getLong("CardNumber"), rs.getLong("ContactNumber"), rs.getString("CheckInDate"),
             rs.getString("CheckOutDate"), rs.getString("DaysStaying"), rs.getLong("TotalCost")};
             model.addRow(row);
             }
         
             GuestsForm.getGuestsTable().setModel(model);
             GuestsForm.setVisible(true);
             this.dispose();
             rs.close();
             pstmt.close();
             conn.close();
             } 
         catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Connection Error!");
        } 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void RoomIDChckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomIDChckOutActionPerformed
       
    }//GEN-LAST:event_RoomIDChckOutActionPerformed

    private void CheckOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutButtonActionPerformed
         String roomId = RoomIDChckOut.getText();
         
             try (Connection conn = DriverManager.getConnection(DbCons.DB_CONNECTION, "root", "root");
                 Statement stmt = conn.createStatement();) {

         String updateRoomQuery = "UPDATE roomstable SET Availability = 'Available' WHERE RoomID = '" + roomId + "'";
         stmt.executeUpdate(updateRoomQuery);

         String deleteGuestQuery = "DELETE FROM guests WHERE RoomId = '" + roomId + "'";
         stmt.executeUpdate(deleteGuestQuery);

                 JOptionPane.showMessageDialog(null, "Check out Completed!");
                 } 
         catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Connection error: ");
        }   
    }//GEN-LAST:event_CheckOutButtonActionPerformed

    private void RoomIDChckOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomIDChckOutMousePressed
         if(RoomIDChckOut.getText().equals("ID")){
             RoomIDChckOut.setText("");
             RoomIDChckOut.setFocusable(true);  
        } 
    }//GEN-LAST:event_RoomIDChckOutMousePressed

    private void RoomIDChckOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomIDChckOutMouseClicked
        
    }//GEN-LAST:event_RoomIDChckOutMouseClicked

    private void RoomIDChckOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomIDChckOutMouseEntered
         RoomIDChckOut.setFocusable(true); 
    }//GEN-LAST:event_RoomIDChckOutMouseEntered

   
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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckOutButton;
    private javax.swing.JTextField RoomIDChckOut;
    private javax.swing.JButton Rooms;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
