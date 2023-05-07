package javaapplication2;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class CheckIn extends javax.swing.JFrame {

     public CheckIn()
     {
        initComponents();
         FullName.setFocusable(false);  
         ChckInEmail.setFocusable(false);
         ContactChckIn.setFocusable(false);  
         ValidIDChckIn.setFocusable(false);
         AddressChckIn.setFocusable(false);  
         CardNumberChckIn.setFocusable(false);
         CVCChckIn.setFocusable(false);  
         ValidIDEnter.addItem("Driver's License");
         ValidIDEnter.addItem("Passport");
         ValidIDEnter.addItem("National ID");
         ValidIDEnter.addItem("Voter ID");
         getContentPane().setBackground(new Color((0xFAFAFA))); 
         setLocationRelativeTo(null);
         setResizable(false);
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        ContactChckIn = new javax.swing.JTextField();
        ChckInEmail = new javax.swing.JTextField();
        AddressChckIn = new javax.swing.JTextField();
        ValidIDChckIn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Economy = new javax.swing.JRadioButton();
        Normal = new javax.swing.JRadioButton();
        VIP = new javax.swing.JRadioButton();
        Single = new javax.swing.JRadioButton();
        Double = new javax.swing.JRadioButton();
        Family = new javax.swing.JRadioButton();
        RoomIDChckIn = new javax.swing.JLabel();
        SearchChckIn = new javax.swing.JButton();
        CardNumberChckIn = new javax.swing.JTextField();
        CVCChckIn = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        CheckInDate = new org.netbeans.modules.form.InvalidComponent();
        CheckOutDate = new org.netbeans.modules.form.InvalidComponent();
        ValidIDEnter = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(233, 107, 70));
        jButton1.setText("Check In");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, 60));

        jButton2.setBackground(new java.awt.Color(250, 250, 250));
        jButton2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(138, 138, 138));
        jButton2.setText("Check Out");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 60));

        jButton5.setBackground(new java.awt.Color(250, 250, 250));
        jButton5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(138, 138, 138));
        jButton5.setText("Rooms");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 130, 60));

        jButton6.setBackground(new java.awt.Color(250, 250, 250));
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

        Submit.setBackground(new java.awt.Color(233, 107, 70));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, -1, -1));

        jButton8.setText("Clear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, -1, -1));

        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        jLabel1.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 37, 37));
        jLabel1.setText("Full Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 37, 37));
        jLabel2.setText("Contact Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(37, 37, 37));
        jLabel3.setText("E-mail Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(37, 37, 37));
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(37, 37, 37));
        jLabel7.setText("Valid ID Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        jLabel21.setFont(new java.awt.Font("Lucida Fax", 1, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(233, 107, 70));
        jLabel21.setText("logo");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 70, 30));

        FullName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FullName.setForeground(new java.awt.Color(138, 138, 138));
        FullName.setText("Insert your full name");
        FullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FullNameMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FullNameMousePressed(evt);
            }
        });
        FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameActionPerformed(evt);
            }
        });
        getContentPane().add(FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, -1));

        ContactChckIn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ContactChckIn.setForeground(new java.awt.Color(138, 138, 138));
        ContactChckIn.setText("Insert your contact number");
        ContactChckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ContactChckInMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContactChckInMousePressed(evt);
            }
        });
        ContactChckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactChckInActionPerformed(evt);
            }
        });
        getContentPane().add(ContactChckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 200, -1));

        ChckInEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChckInEmail.setForeground(new java.awt.Color(138, 138, 138));
        ChckInEmail.setText("Insert your e-mail address");
        ChckInEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChckInEmailMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChckInEmailMousePressed(evt);
            }
        });
        ChckInEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckInEmailActionPerformed(evt);
            }
        });
        getContentPane().add(ChckInEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 200, -1));

        AddressChckIn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddressChckIn.setForeground(new java.awt.Color(138, 138, 138));
        AddressChckIn.setText("Insert your address");
        AddressChckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddressChckInMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddressChckInMousePressed(evt);
            }
        });
        AddressChckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressChckInActionPerformed(evt);
            }
        });
        getContentPane().add(AddressChckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 200, -1));

        ValidIDChckIn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ValidIDChckIn.setForeground(new java.awt.Color(138, 138, 138));
        ValidIDChckIn.setText("Insert your Valid ID number");
        ValidIDChckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ValidIDChckInMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ValidIDChckInMousePressed(evt);
            }
        });
        ValidIDChckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidIDChckInActionPerformed(evt);
            }
        });
        getContentPane().add(ValidIDChckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 200, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel8.setText("Credit Card Information");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel9.setText("Card Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel10.setText("CVC ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel11.setText("Room Type");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel12.setText("Room Capacity");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        jLabel13.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel13.setText("Check in Date ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, -1));

        jLabel14.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel14.setText("Check Out Date");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, -1, -1));

        jLabel15.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel15.setText("Room ID : ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, 20));

        Economy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Economy.setText("Economy");
        getContentPane().add(Economy, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        Normal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Normal.setText("Normal");
        getContentPane().add(Normal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        VIP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        VIP.setText("VIP");
        getContentPane().add(VIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        Single.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Single.setText("Single");
        getContentPane().add(Single, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, -1, -1));

        Double.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Double.setText("Double");
        getContentPane().add(Double, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, -1, -1));

        Family.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Family.setText("Family");
        getContentPane().add(Family, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, -1, -1));

        RoomIDChckIn.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(RoomIDChckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 30, 20));

        SearchChckIn.setBackground(new java.awt.Color(255, 102, 102));
        SearchChckIn.setText("Search");
        SearchChckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchChckInActionPerformed(evt);
            }
        });
        getContentPane().add(SearchChckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, -1, -1));

        CardNumberChckIn.setForeground(new java.awt.Color(138, 138, 138));
        CardNumberChckIn.setText("0000-0000-0000-0000");
        CardNumberChckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CardNumberChckInMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CardNumberChckInMousePressed(evt);
            }
        });
        CardNumberChckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardNumberChckInActionPerformed(evt);
            }
        });
        getContentPane().add(CardNumberChckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 120, -1));

        CVCChckIn.setForeground(new java.awt.Color(138, 138, 138));
        CVCChckIn.setText("000");
        CVCChckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CVCChckInMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CVCChckInMousePressed(evt);
            }
        });
        CVCChckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVCChckInActionPerformed(evt);
            }
        });
        getContentPane().add(CVCChckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 40, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Fax", 3, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(233, 107, 70));
        jLabel17.setText("Hotel");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 70, 30));

        jLabel18.setFont(new java.awt.Font("Lucida Fax", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(233, 107, 70));
        jLabel18.setText("Digital Haven ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 100));

        jLabel20.setFont(new java.awt.Font("Lucida Fax", 1, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(233, 107, 70));
        jLabel20.setText("Check In");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 240, 60));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 750));
        getContentPane().add(CheckInDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 140, -1));
        getContentPane().add(CheckOutDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 140, -1));

        ValidIDEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidIDEnterActionPerformed(evt);
            }
        });
        getContentPane().add(ValidIDEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        jLabel5.setText("Choose Your Valid ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
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
    }//GEN-LAST:event_jButton5ActionPerformed
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
         double roomCost = 0;
         int capacityCost = 0;
         int numberOfDays;
         double TotalPrice;
         double NightCost;
         int roomID = Integer.parseInt(RoomIDChckIn.getText());
         
         Confirmation targetJForm = new Confirmation();
         
         String fullname = FullName.getText();
         targetJForm.NameDisplay.setText(fullname);  
         
         String chckInemail = ChckInEmail.getText();     
         targetJForm.EmailConfirm.setText(chckInemail);   
         
         long validIDChckIn = Long.parseLong(ValidIDChckIn.getText());
         targetJForm.ValidIDNumConf.setText(Long.toString(validIDChckIn));
         
         String contactchkin = ContactChckIn.getText();
         
             if (contactchkin.length() ==11) {
                 long Contactchkin = Long.parseLong(contactchkin);
                 targetJForm.ContactNumConf.setText(Long.toString(Contactchkin));
                 targetJForm.setVisible(true);
                 } 
             
             else {
                 JOptionPane.showMessageDialog(null, "Invalid Contact Number"); 
                 }
             
         String addressChckIn = AddressChckIn.getText();     
         targetJForm.AddressConf.setText(addressChckIn);
         String cardNumberChckIn = CardNumberChckIn.getText();
         
             if (cardNumberChckIn.length() == 16) {
                 long CArdNumberChckIn = Long.parseLong(cardNumberChckIn);
                 targetJForm.CardNumConfirm.setText(Long.toString(CArdNumberChckIn));     
                 targetJForm.setVisible(true);
                 } 
             else {
                 JOptionPane.showMessageDialog(null, "Invalid Card Number"); 
                 }
         
         String cvcChckIn = CVCChckIn.getText();
         
             if (cvcChckIn.length() == 3) {
                 int CArdNumberChckIn = Integer.parseInt(cvcChckIn);
                 targetJForm.CVCConfirm.setText(Integer.toString(CArdNumberChckIn));     
                 targetJForm.setVisible(true);
                 } 
             
             else {
                 JOptionPane.showMessageDialog(null, "Invalid CVC Number"); 
                 }
         
             if (Economy.isSelected()) {     
                 targetJForm.RoomTypeConfirm.setText("Economy");         
                 } 
             
             else if (Normal.isSelected()) {
                 targetJForm.RoomTypeConfirm.setText("Normal"); 
                 }
             
             else if (VIP.isSelected()) {
                 targetJForm.RoomTypeConfirm.setText("VIP"); 
                 }
             
             if (Single.isSelected()) {
                 targetJForm.RoomCapacityConfirm.setText("Single"); 
                 }  
             
             else if (Double.isSelected()) {
                 targetJForm.RoomCapacityConfirm.setText("Double"); 
                 } 
             
             else if (Family.isSelected()) {
                 targetJForm.RoomCapacityConfirm.setText("Family"); 
                  }
             
             if (Economy.isSelected()) {
                 roomCost = 200;
                 } 
             
             else if (Normal.isSelected()) {
                 roomCost = 500;
                 } 
             
             else if (VIP.isSelected()) {
                 roomCost = 1000;
                 }
          
             if (Single.isSelected()) {
                 capacityCost = 100;
                 } 
             
            else if (Double.isSelected()) {
                 capacityCost = 200;
                 } 
             else if (Family.isSelected()) {
                 capacityCost = 500;
                 }
         
           LocalDate checkInDate = CheckInDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           LocalDate checkOutDate = CheckOutDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
           String formattedCheckInDate = checkInDate.format(formatter);
           String formattedCheckOutDate = checkOutDate.format(formatter);  
           numberOfDays = (int) ChronoUnit.DAYS.between(checkInDate, checkOutDate);     
           TotalPrice = roomCost * capacityCost * numberOfDays;
           NightCost = roomCost * capacityCost;
           targetJForm.NumberOfNights.setText(String.valueOf(numberOfDays));
           targetJForm.TotalPriceConfirm.setText(String.valueOf(TotalPrice));
           targetJForm.NightCostConfirm.setText(String.valueOf(NightCost));
           targetJForm.CheckInDateConfirm1.setText(formattedCheckInDate); 
           targetJForm.CheckOutDateConfirm1.setText(formattedCheckOutDate);
           targetJForm.getRoomIDConfirm().setText(Integer.toString(roomID));
           targetJForm.setVisible(true);
    }//GEN-LAST:event_SubmitActionPerformed
   
    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameActionPerformed
            
    }//GEN-LAST:event_FullNameActionPerformed

    private void CardNumberChckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardNumberChckInActionPerformed
    
    }//GEN-LAST:event_CardNumberChckInActionPerformed

    private void CVCChckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVCChckInActionPerformed
       
    }//GEN-LAST:event_CVCChckInActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         new Main().setVisible(true);
         this.setVisible(false); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new CheckOut().setVisible(true);
         this.setVisible(false); 
    }//GEN-LAST:event_jButton2ActionPerformed

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
         rs.close();
         pstmt.close();
         conn.close();
         this.dispose();
                 } 
             
             catch (SQLException ex) { 
                 JOptionPane.showMessageDialog(null,"Connection Error!");
        } 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void ChckInEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckInEmailActionPerformed
      
    }//GEN-LAST:event_ChckInEmailActionPerformed

    private void ValidIDChckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidIDChckInActionPerformed
       
    }//GEN-LAST:event_ValidIDChckInActionPerformed

    private void ContactChckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactChckInActionPerformed
           
    }//GEN-LAST:event_ContactChckInActionPerformed

    private void AddressChckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressChckInActionPerformed
        
    }//GEN-LAST:event_AddressChckInActionPerformed

    private void FullNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullNameMouseEntered
         FullName.setFocusable(true);  
    }//GEN-LAST:event_FullNameMouseEntered
   
    private void FullNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullNameMousePressed
         if(FullName.getText().equals("Insert your full name")){
         FullName.setText("");
         FullName.setFocusable(true);  
         } 
    }//GEN-LAST:event_FullNameMousePressed
                
    private void ChckInEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChckInEmailMouseEntered
         ChckInEmail.setFocusable(true);  
    }//GEN-LAST:event_ChckInEmailMouseEntered

    private void ChckInEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChckInEmailMousePressed
         if(ChckInEmail.getText().equals("Insert your e-mail address")){
         ChckInEmail.setText("");
         ChckInEmail.setFocusable(true);  
        }   
    }//GEN-LAST:event_ChckInEmailMousePressed

    private void ContactChckInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactChckInMouseEntered
         ContactChckIn.setFocusable(true);  
    }//GEN-LAST:event_ContactChckInMouseEntered

    private void ContactChckInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactChckInMousePressed
         if(ContactChckIn.getText().equals("Insert your contact number")){
         ContactChckIn.setText("");
         ContactChckIn.setFocusable(true);  
         }   
    }//GEN-LAST:event_ContactChckInMousePressed

    private void AddressChckInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddressChckInMouseEntered
         AddressChckIn.setFocusable(true);
    }//GEN-LAST:event_AddressChckInMouseEntered

    private void AddressChckInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddressChckInMousePressed
         if(AddressChckIn.getText().equals("Insert your address")){
         AddressChckIn.setText("");
         AddressChckIn.setFocusable(true);  
         }   
    }//GEN-LAST:event_AddressChckInMousePressed

    private void ValidIDChckInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValidIDChckInMouseEntered
         ValidIDChckIn.setFocusable(true); 
    }//GEN-LAST:event_ValidIDChckInMouseEntered

    private void ValidIDChckInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValidIDChckInMousePressed
         if(ValidIDChckIn.getText().equals("Insert your Valid ID number")){
         ValidIDChckIn.setText("");
         ValidIDChckIn.setFocusable(true);  
         } 
    }//GEN-LAST:event_ValidIDChckInMousePressed

    private void CardNumberChckInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CardNumberChckInMouseEntered
         CardNumberChckIn.setFocusable(true);
    }//GEN-LAST:event_CardNumberChckInMouseEntered

    private void CardNumberChckInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CardNumberChckInMousePressed
         if(CardNumberChckIn.getText().equals("0000-0000-0000-0000")){
         CardNumberChckIn.setText("");
         CardNumberChckIn.setFocusable(true);  
         } 
    }//GEN-LAST:event_CardNumberChckInMousePressed

    private void CVCChckInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CVCChckInMouseEntered
         CVCChckIn.setFocusable(true);  
    }//GEN-LAST:event_CVCChckInMouseEntered

    private void CVCChckInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CVCChckInMousePressed
         if(CVCChckIn.getText().equals("000")){
         CVCChckIn.setText("");
         CVCChckIn.setFocusable(true);  
         } 
    }//GEN-LAST:event_CVCChckInMousePressed
  
    private void SearchChckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchChckInActionPerformed
         String roomType = null;
         String roomCapacity = null;

             if (Economy.isSelected()) {
                 roomType = "Economy";
                 } 
             else if (Normal.isSelected()) {
                 roomType = "Normal";
                 } 
             else if (VIP.isSelected()) {
                 roomType = "VIP";
                 }

             if (Single.isSelected()) {
                 roomCapacity = "Single";
                 }
             else if (Double.isSelected()) {
                 roomCapacity = "Double";
                 } 
             else if (Family.isSelected()) {
                 roomCapacity = "Family";
                 }

         try (Connection conn = DriverManager.getConnection(DbCons.DB_CONNECTION, "root", "root");
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT RoomID FROM roomstable WHERE RoomType = '" + roomType + "' AND RoomCapacity = '" + roomCapacity + "' AND Availability = 'Available' LIMIT 1");) {
        
             if (rs.next()) {
                 String roomId = rs.getString("RoomID");
                 JOptionPane.showMessageDialog(null, "Room ID: " + roomId);
                 RoomIDChckIn.setText(roomId);               
                 } 
             else {
                 JOptionPane.showMessageDialog(null, "No available room found");
                 }
            }
         catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Connection error!");
        }                              
    }//GEN-LAST:event_SearchChckInActionPerformed

    private void ValidIDEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidIDEnterActionPerformed
     
    }//GEN-LAST:event_ValidIDEnterActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         JTextField[] TextFields = {FullName, ContactChckIn, ChckInEmail, AddressChckIn,ValidIDChckIn,CardNumberChckIn,CVCChckIn};
        
             for (JTextField textField : TextFields) {
             textField.setText("");
             }
         CheckInDate.setDate(null);
         CheckOutDate.setDate(null);
         ValidIDEnter.setSelectedIndex(0);
         Economy.setSelected(false);
         Double.setSelected(false);
         Family.setSelected(false);
         Single.setSelected(false);
         Double.setSelected(false);
         Normal.setSelected(false);
         RoomIDChckIn.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed
        
    public static void main(String args[]) {
          
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextField AddressChckIn;
    javax.swing.JTextField CVCChckIn;
    javax.swing.JTextField CardNumberChckIn;
    javax.swing.JTextField ChckInEmail;
    private org.netbeans.modules.form.InvalidComponent CheckInDate;
    private org.netbeans.modules.form.InvalidComponent CheckOutDate;
    javax.swing.JTextField ContactChckIn;
    private javax.swing.JRadioButton Double;
    private javax.swing.JRadioButton Economy;
    private javax.swing.JRadioButton Family;
    javax.swing.JTextField FullName;
    private javax.swing.JRadioButton Normal;
    javax.swing.JLabel RoomIDChckIn;
    javax.swing.JButton SearchChckIn;
    private javax.swing.JRadioButton Single;
    public javax.swing.JButton Submit;
    private javax.swing.JRadioButton VIP;
    javax.swing.JTextField ValidIDChckIn;
    private javax.swing.JComboBox<String> ValidIDEnter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
