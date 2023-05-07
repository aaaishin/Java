package javaapplication2;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;


public class Main extends javax.swing.JFrame {

     public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
     }   
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        RoomsMain = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Guests = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Progress1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Progress2 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setPreferredSize(new java.awt.Dimension(800, 725));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(237, 161, 126));
        jButton1.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(138, 138, 138));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-hotel-check-in-50.png"))); // NOI18N
        jButton1.setText("Check In");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 200, 150));

        RoomsMain.setBackground(new java.awt.Color(237, 161, 126));
        RoomsMain.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        RoomsMain.setForeground(new java.awt.Color(138, 138, 138));
        RoomsMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-rooms-32.png"))); // NOI18N
        RoomsMain.setText("Rooms");
        RoomsMain.setBorderPainted(false);
        RoomsMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsMainActionPerformed(evt);
            }
        });
        jPanel1.add(RoomsMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 200, 150));

        jButton4.setBackground(new java.awt.Color(237, 161, 126));
        jButton4.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(138, 138, 138));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-hotel-check-out-50.png"))); // NOI18N
        jButton4.setText("Check Out");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 200, 150));

        Guests.setBackground(new java.awt.Color(237, 161, 126));
        Guests.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        Guests.setForeground(new java.awt.Color(138, 138, 138));
        Guests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-guest-60.png"))); // NOI18N
        Guests.setText("Guest");
        Guests.setToolTipText("");
        Guests.setBorderPainted(false);
        Guests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuestsActionPerformed(evt);
            }
        });
        jPanel1.add(Guests, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 200, 150));

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 107, 70));
        jLabel2.setText("HOTEL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 110, 70));
        jPanel1.add(Progress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, -1, 20));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("Available Rooms");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 120, -1));

        jLabel5.setForeground(new java.awt.Color(138, 138, 138));
        jLabel5.setText("Percentage");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setText("Unavailable Rooms");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 130, -1));
        jPanel1.add(Progress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, -1, 20));

        jLabel7.setForeground(new java.awt.Color(138, 138, 138));
        jLabel7.setText("Percentage");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, 70, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("Settings");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Kristen ITC", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(233, 107, 70));
        jLabel8.setText("DIGITAL HAVEN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 460, 120));

        jLabel9.setFont(new java.awt.Font("Kristen ITC", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(233, 107, 70));
        jLabel9.setText("____________");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 380, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new CheckIn().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RoomsMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsMainActionPerformed

         Rooms roomsForm = new Rooms();
         String query = "SELECT RoomID, RoomType, RoomCapacity, Availability FROM roomstable";
         
         try {
             Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.100.8:3306/finalproj", "root", "root");
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
    }//GEN-LAST:event_RoomsMainActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         new Editing().setVisible(true); 
         this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         new CheckOut().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void GuestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuestsActionPerformed
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
    }//GEN-LAST:event_GuestsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
      try (Connection conn = DriverManager.getConnection(DbCons.DB_CONNECTION, "root", "root");
             Statement stmt1 = conn.createStatement();
             Statement stmt2 = conn.createStatement();
             ResultSet rs1 = stmt1.executeQuery("SELECT COUNT(*) AS AvailableRooms FROM roomstable WHERE Availability = 'Available'");
             ResultSet rs2 = stmt2.executeQuery("SELECT COUNT(*) AS UnavailableRooms FROM roomstable WHERE Availability = 'Unavailable'")) {
          
      if (rs1.next()) {
             int availableRooms = rs1.getInt("AvailableRooms");
             Progress1.setValue(availableRooms);
         } 
      
      if (rs2.next()) {
             int unavailableRooms = rs2.getInt("UnavailableRooms");
             Progress2.setValue(unavailableRooms);
             } 
          } 
     catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Connection Error!");
        }
    }//GEN-LAST:event_formWindowOpened

   
    public static void main(String args[]) {
        
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guests;
    private javax.swing.JProgressBar Progress1;
    private javax.swing.JProgressBar Progress2;
    private javax.swing.JButton RoomsMain;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
