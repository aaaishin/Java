/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visitormanagementsystem;

import java.awt.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author justi
 */
public class AttendantUpdate extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    
    ImageIcon logo = new ImageIcon("C:\\Users\\justi\\Desktop\\Programming\\Java\\VisitorManagementSystem\\src\\assets\\SJCF_LOGO.png");
    
    public AttendantUpdate() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        attendantLastTextField.setFocusable(false);
        attendantFirstTextField.setFocusable(false);
        attendantMiddleTextField.setFocusable(false);
        attendantGender.setFocusable(false);
        attendantContact.setFocusable(false);
        attendantSuffix.setFocusable(false);
        attendantID.setFocusable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        attendantDetailsText = new javax.swing.JLabel();
        minimizeLogo = new javax.swing.JLabel();
        personalInfoBG = new javax.swing.JPanel();
        attendantIDText = new javax.swing.JLabel();
        attendantLastName = new javax.swing.JLabel();
        attendantID = new javax.swing.JTextField();
        attendantLastTextField = new javax.swing.JTextField();
        attendantFirstText = new javax.swing.JLabel();
        attendantFirstTextField = new javax.swing.JTextField();
        attendantMiddleText = new javax.swing.JLabel();
        attendantMiddleTextField = new javax.swing.JTextField();
        attendantSuffixText = new javax.swing.JLabel();
        attendantSuffix = new javax.swing.JTextField();
        attendantBirthdateText = new javax.swing.JLabel();
        attendantBirthdate = new com.toedter.calendar.JDateChooser();
        attendantContact = new javax.swing.JTextField();
        attendantContactNoText = new javax.swing.JLabel();
        attendantGender = new javax.swing.JTextField();
        attendantGenderText = new javax.swing.JLabel();
        attendantUpdateButton = new javax.swing.JButton();
        attendantBackButton = new javax.swing.JButton();
        attendantBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("St. Jude Care Facility");
        setIconImage(logo.getImage());
        setName("dashboardFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attendantDetailsText.setFont(new java.awt.Font("Verdana Pro Black", 1, 28)); // NOI18N
        attendantDetailsText.setForeground(new java.awt.Color(129, 159, 29));
        attendantDetailsText.setText("ATTENDANT DETAILS");
        attendantDetailsText.setFocusable(false);
        getContentPane().add(attendantDetailsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 420, 30));

        minimizeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minimizeLogo.png"))); // NOI18N
        minimizeLogo.setToolTipText("Minimize");
        minimizeLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeLogo.setFocusable(false);
        minimizeLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLogoMouseClicked(evt);
            }
        });
        getContentPane().add(minimizeLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, -1));

        personalInfoBG.setBackground(new java.awt.Color(255, 255, 255));
        personalInfoBG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 159, 29), 5, true));
        personalInfoBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attendantIDText.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        attendantIDText.setForeground(new java.awt.Color(107, 132, 22));
        attendantIDText.setText("AttendantID*");
        attendantIDText.setFocusable(false);
        personalInfoBG.add(attendantIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 20));

        attendantLastName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        attendantLastName.setForeground(new java.awt.Color(107, 132, 22));
        attendantLastName.setText("Last Name*");
        attendantLastName.setFocusable(false);
        personalInfoBG.add(attendantLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 80, 20));

        attendantID.setBackground(new java.awt.Color(231, 228, 228));
        attendantID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attendantID.setForeground(new java.awt.Color(107, 132, 22));
        attendantID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        attendantID.setToolTipText("Attendant ID");
        attendantID.setBorder(null);
        attendantID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendantIDMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attendantIDMousePressed(evt);
            }
        });
        attendantID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendantIDActionPerformed(evt);
            }
        });
        attendantID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                attendantIDKeyTyped(evt);
            }
        });
        personalInfoBG.add(attendantID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 40));

        attendantLastTextField.setBackground(new java.awt.Color(231, 228, 228));
        attendantLastTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attendantLastTextField.setForeground(new java.awt.Color(107, 132, 22));
        attendantLastTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        attendantLastTextField.setToolTipText("Last Name");
        attendantLastTextField.setBorder(null);
        attendantLastTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendantLastTextFieldMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attendantLastTextFieldMousePressed(evt);
            }
        });
        attendantLastTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendantLastTextFieldActionPerformed(evt);
            }
        });
        personalInfoBG.add(attendantLastTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 180, 40));

        attendantFirstText.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        attendantFirstText.setForeground(new java.awt.Color(107, 132, 22));
        attendantFirstText.setText("First Name*");
        attendantFirstText.setFocusable(false);
        personalInfoBG.add(attendantFirstText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 80, 20));

        attendantFirstTextField.setBackground(new java.awt.Color(231, 228, 228));
        attendantFirstTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attendantFirstTextField.setForeground(new java.awt.Color(107, 132, 22));
        attendantFirstTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        attendantFirstTextField.setToolTipText("First Name");
        attendantFirstTextField.setBorder(null);
        attendantFirstTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendantFirstTextFieldMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attendantFirstTextFieldMousePressed(evt);
            }
        });
        attendantFirstTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendantFirstTextFieldActionPerformed(evt);
            }
        });
        personalInfoBG.add(attendantFirstTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 180, 40));

        attendantMiddleText.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        attendantMiddleText.setForeground(new java.awt.Color(107, 132, 22));
        attendantMiddleText.setText("Middle Name");
        attendantMiddleText.setFocusable(false);
        personalInfoBG.add(attendantMiddleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 80, 20));

        attendantMiddleTextField.setBackground(new java.awt.Color(231, 228, 228));
        attendantMiddleTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attendantMiddleTextField.setForeground(new java.awt.Color(107, 132, 22));
        attendantMiddleTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        attendantMiddleTextField.setToolTipText("Middle Name");
        attendantMiddleTextField.setBorder(null);
        attendantMiddleTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendantMiddleTextFieldMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attendantMiddleTextFieldMousePressed(evt);
            }
        });
        attendantMiddleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendantMiddleTextFieldActionPerformed(evt);
            }
        });
        personalInfoBG.add(attendantMiddleTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 190, 40));

        attendantSuffixText.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        attendantSuffixText.setForeground(new java.awt.Color(107, 132, 22));
        attendantSuffixText.setText("Suffix Name");
        attendantSuffixText.setFocusable(false);
        personalInfoBG.add(attendantSuffixText, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 80, 20));

        attendantSuffix.setBackground(new java.awt.Color(231, 228, 228));
        attendantSuffix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attendantSuffix.setForeground(new java.awt.Color(107, 132, 22));
        attendantSuffix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        attendantSuffix.setToolTipText("Suffix Name");
        attendantSuffix.setBorder(null);
        attendantSuffix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendantSuffixMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attendantSuffixMousePressed(evt);
            }
        });
        attendantSuffix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendantSuffixActionPerformed(evt);
            }
        });
        personalInfoBG.add(attendantSuffix, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 80, 40));

        attendantBirthdateText.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        attendantBirthdateText.setForeground(new java.awt.Color(107, 132, 22));
        attendantBirthdateText.setText("Birthdate*");
        attendantBirthdateText.setFocusable(false);
        personalInfoBG.add(attendantBirthdateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 80, 20));

        attendantBirthdate.setBackground(new java.awt.Color(231, 228, 228));
        attendantBirthdate.setForeground(new java.awt.Color(107, 132, 22));
        attendantBirthdate.setToolTipText("Birth Date");
        attendantBirthdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        personalInfoBG.add(attendantBirthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 230, 40));

        attendantContact.setBackground(new java.awt.Color(231, 228, 228));
        attendantContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attendantContact.setForeground(new java.awt.Color(107, 132, 22));
        attendantContact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        attendantContact.setToolTipText("Contact Number");
        attendantContact.setBorder(null);
        attendantContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendantContactMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attendantContactMousePressed(evt);
            }
        });
        attendantContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendantContactActionPerformed(evt);
            }
        });
        attendantContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                attendantContactKeyTyped(evt);
            }
        });
        personalInfoBG.add(attendantContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 380, 40));

        attendantContactNoText.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        attendantContactNoText.setForeground(new java.awt.Color(107, 132, 22));
        attendantContactNoText.setText("Contact Number*");
        attendantContactNoText.setFocusable(false);
        personalInfoBG.add(attendantContactNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 110, 20));

        attendantGender.setBackground(new java.awt.Color(231, 228, 228));
        attendantGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attendantGender.setForeground(new java.awt.Color(107, 132, 22));
        attendantGender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        attendantGender.setToolTipText("Gender");
        attendantGender.setBorder(null);
        attendantGender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendantGenderMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attendantGenderMousePressed(evt);
            }
        });
        attendantGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendantGenderActionPerformed(evt);
            }
        });
        personalInfoBG.add(attendantGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 40));

        attendantGenderText.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        attendantGenderText.setForeground(new java.awt.Color(107, 132, 22));
        attendantGenderText.setText("Gender*");
        attendantGenderText.setFocusable(false);
        personalInfoBG.add(attendantGenderText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 20));

        getContentPane().add(personalInfoBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 840, 180));

        attendantUpdateButton.setBackground(new java.awt.Color(176, 212, 55));
        attendantUpdateButton.setFont(new java.awt.Font("Verdana Pro Black", 1, 18)); // NOI18N
        attendantUpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        attendantUpdateButton.setText("UPDATE");
        attendantUpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attendantUpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendantUpdateButtonMouseClicked(evt);
            }
        });
        attendantUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendantUpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(attendantUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 160, 30));

        attendantBackButton.setBackground(new java.awt.Color(176, 212, 55));
        attendantBackButton.setFont(new java.awt.Font("Verdana Pro Black", 1, 18)); // NOI18N
        attendantBackButton.setForeground(new java.awt.Color(255, 255, 255));
        attendantBackButton.setText("GO BACK");
        attendantBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attendantBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendantBackButtonMouseClicked(evt);
            }
        });
        attendantBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendantBackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(attendantBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 160, 30));

        attendantBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dashboardBackground.png"))); // NOI18N
        attendantBackground.setText("jLabel1");
        attendantBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 159, 29), 10, true));
        attendantBackground.setPreferredSize(new java.awt.Dimension(1020, 570));
        getContentPane().add(attendantBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void attendantLastTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantLastTextFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantLastTextFieldMouseClicked

    private void attendantLastTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantLastTextFieldMousePressed
        if(attendantLastTextField.getText().equals("Last Name")){
            attendantLastTextField.setText("");
            attendantLastTextField.setFocusable(true);
        }
    }//GEN-LAST:event_attendantLastTextFieldMousePressed

    private void attendantLastTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendantLastTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantLastTextFieldActionPerformed

    private void attendantFirstTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantFirstTextFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantFirstTextFieldMouseClicked

    private void attendantFirstTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantFirstTextFieldMousePressed
        if(attendantFirstTextField.getText().equals("First Name")){
            attendantFirstTextField.setText("");
            attendantFirstTextField.setFocusable(true);
        }
    }//GEN-LAST:event_attendantFirstTextFieldMousePressed

    private void attendantFirstTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendantFirstTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantFirstTextFieldActionPerformed

    private void attendantMiddleTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantMiddleTextFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantMiddleTextFieldMouseClicked

    private void attendantMiddleTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantMiddleTextFieldMousePressed
        if(attendantMiddleTextField.getText().equals("Middle Name")){
            attendantMiddleTextField.setText("");
            attendantMiddleTextField.setFocusable(true);
        }
    }//GEN-LAST:event_attendantMiddleTextFieldMousePressed

    private void attendantMiddleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendantMiddleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantMiddleTextFieldActionPerformed

    private void attendantSuffixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantSuffixMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantSuffixMouseClicked

    private void attendantSuffixMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantSuffixMousePressed
        if(attendantSuffix.getText().equals("Suffix Name")){
            attendantSuffix.setText("");
            attendantSuffix.setFocusable(true);
        }
    }//GEN-LAST:event_attendantSuffixMousePressed

    private void attendantSuffixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendantSuffixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantSuffixActionPerformed

    private void attendantContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantContactMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantContactMouseClicked

    private void attendantContactMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantContactMousePressed
        if(attendantContact.getText().equals("Contact Number")){
            attendantContact.setText("");
            attendantContact.setFocusable(true);
        }
    }//GEN-LAST:event_attendantContactMousePressed

    private void attendantContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendantContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantContactActionPerformed

    private void attendantGenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantGenderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantGenderMouseClicked

    private void attendantGenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantGenderMousePressed
        if(attendantGender.getText().equals("Gender")){
            attendantGender.setText("");
            attendantGender.setFocusable(true);
        }
    }//GEN-LAST:event_attendantGenderMousePressed

    private void attendantGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendantGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantGenderActionPerformed

    private void attendantUpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantUpdateButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantUpdateButtonMouseClicked

    private void attendantUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendantUpdateButtonActionPerformed
        try{
            //it will update the existing data and display the table when clicking the update button
            Connection con = DriverManager.getConnection(DatabaseConnection.DB_CONNECTION,"root","root");
            PreparedStatement pst = con.prepareStatement("UPDATE attendant SET LastName = ?, FirstName = ?, MiddleName = ?, SuffixName = ?, Gender = ?, BirthDate = ?, ContactNo = ? WHERE AttendantID = ?");

            String lastname = attendantLastTextField.getText();
            pst.setString(1, lastname);
            String firstname = attendantFirstTextField.getText();
            pst.setString(2, firstname);
            String middlename = attendantMiddleTextField.getText();
            pst.setString(3, middlename);
            String suffixname = attendantSuffix.getText();
            pst.setString(4, suffixname);
            String gender = attendantGender.getText();
            pst.setString(5, gender);
            int attendantid = Integer.parseInt(attendantID.getText());
            pst.setInt(8, attendantid);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate birthDate = attendantBirthdate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String formattedBirthDate = birthDate.format(formatter);
            pst.setString(6, formattedBirthDate);

            String contactNo = attendantContact.getText();

            if(contactNo.length() == 11){
                long ContactNo = Long.parseLong(contactNo);
                pst.setString(7, Long.toString(ContactNo));
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Contact Number");
            }
            
            int result = pst.executeUpdate();
            
            if(result == 1){
                JOptionPane.showMessageDialog(this, "Record Updated Successfully!");
                attendantLastTextField.setText("");
                attendantFirstTextField.setText("");
                attendantMiddleTextField.setText("");
                attendantSuffix.setText("");
                attendantGender.setText("");
                attendantContact.setText("");
                attendantID.setText("");
            }
            else{
                JOptionPane.showMessageDialog(this, "Record failed to update!");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection Error!" + e.getMessage());
        }
        
         AttendantDetails attendantDetails = new AttendantDetails();
         String database = "SELECT attendant.AttendantID, attendant.FirstName, attendant.MiddleName, attendant.LastName, attendant.SuffixName, attendant.Gender, attendant.BirthDate, attendant.ContactNo FROM attendant";
         
         try{
             Connection con = DriverManager.getConnection(DatabaseConnection.DB_CONNECTION,"root","root");
             PreparedStatement pst = con.prepareStatement(database);
             ResultSet rs = pst.executeQuery();
             DefaultTableModel table = (DefaultTableModel) attendantDetails.getAttendantTable().getModel();
             table.setRowCount(0);
             
             while(rs.next()){
                 Object[] row = {
                     rs.getLong("attendant.AttendantID"),
                     rs.getString("attendant.FirstName"),
                     rs.getString("attendant.MiddleName"),
                     rs.getString("attendant.LastName"),
                     rs.getString("attendant.SuffixName"),
                     rs.getString("attendant.Gender"),
                     rs.getObject("attendant.BirthDate"),
                     rs.getLong("attendant.ContactNo"),
                 };
                 table.addRow(row);
             }
             attendantDetails.getAttendantTable().setModel(table);
             attendantDetails.setVisible(true);
             this.setVisible(false);
             rs.close();
             pst.close();
             con.close();
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Connection Error!" + e.getMessage());
         }
    }//GEN-LAST:event_attendantUpdateButtonActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        attendantLastTextField.setFocusable(true);
        attendantFirstTextField.setFocusable(true);
        attendantMiddleTextField.setFocusable(true);
        attendantSuffix.setFocusable(true);
        attendantGender.setFocusable(true);
        attendantBirthdate.setFocusable(true);
        attendantContact.setFocusable(true);
        attendantID.setFocusable(true);

    }//GEN-LAST:event_formMouseEntered

    private void attendantContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_attendantContactKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_attendantContactKeyTyped

    private void attendantBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantBackButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantBackButtonMouseClicked

    private void attendantBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendantBackButtonActionPerformed
         AttendantDetails attendantDetails = new AttendantDetails();
         String database = "SELECT attendant.AttendantID, attendant.FirstName, attendant.MiddleName, attendant.LastName, attendant.SuffixName, attendant.Gender, attendant.BirthDate, attendant.ContactNo FROM attendant";
         
         try{
             Connection con = DriverManager.getConnection(DatabaseConnection.DB_CONNECTION,"root","root");
             PreparedStatement pst = con.prepareStatement(database);
             ResultSet rs = pst.executeQuery();
             DefaultTableModel table = (DefaultTableModel) attendantDetails.getAttendantTable().getModel();
             table.setRowCount(0);
             
             while(rs.next()){
                 Object[] row = {
                     rs.getString("attendant.AttendantID"),
                     rs.getString("attendant.FirstName"),
                     rs.getString("attendant.MiddleName"),
                     rs.getString("attendant.LastName"),
                     rs.getString("attendant.SuffixName"),
                     rs.getString("attendant.Gender"),
                     rs.getString("attendant.BirthDate"),
                     rs.getString("attendant.ContactNo"),
                 };
                 table.addRow(row);
             }
             attendantDetails.getAttendantTable().setModel(table);
             attendantDetails.setVisible(true);
             this.setVisible(false);
             rs.close();
             pst.close();
             con.close();
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Connection Error!" + e.getMessage());
         }
    }//GEN-LAST:event_attendantBackButtonActionPerformed

    private void attendantIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantIDMouseClicked

    private void attendantIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantIDMousePressed
        if(attendantID.getText().equals("Attendant ID")){
            attendantID.setText("");
            attendantID.setFocusable(true);
        }
    }//GEN-LAST:event_attendantIDMousePressed

    private void attendantIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendantIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendantIDActionPerformed

    private void attendantIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_attendantIDKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_attendantIDKeyTyped

    private void minimizeLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLogoMouseClicked
        this.setExtendedState(AttendantUpdate.ICONIFIED);
    }//GEN-LAST:event_minimizeLogoMouseClicked

    
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
            java.util.logging.Logger.getLogger(AttendantUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendantUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendantUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendantUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AttendantUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendantBackButton;
    private javax.swing.JLabel attendantBackground;
    private com.toedter.calendar.JDateChooser attendantBirthdate;
    private javax.swing.JLabel attendantBirthdateText;
    private javax.swing.JTextField attendantContact;
    private javax.swing.JLabel attendantContactNoText;
    private javax.swing.JLabel attendantDetailsText;
    private javax.swing.JLabel attendantFirstText;
    private javax.swing.JTextField attendantFirstTextField;
    private javax.swing.JTextField attendantGender;
    private javax.swing.JLabel attendantGenderText;
    private javax.swing.JTextField attendantID;
    private javax.swing.JLabel attendantIDText;
    private javax.swing.JLabel attendantLastName;
    private javax.swing.JTextField attendantLastTextField;
    private javax.swing.JLabel attendantMiddleText;
    private javax.swing.JTextField attendantMiddleTextField;
    private javax.swing.JTextField attendantSuffix;
    private javax.swing.JLabel attendantSuffixText;
    private javax.swing.JButton attendantUpdateButton;
    private javax.swing.JLabel minimizeLogo;
    private javax.swing.JPanel personalInfoBG;
    // End of variables declaration//GEN-END:variables
}
