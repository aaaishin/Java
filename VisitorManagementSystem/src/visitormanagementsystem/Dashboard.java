/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visitormanagementsystem;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author justi
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    
    ImageIcon logo = new ImageIcon("C:\\Users\\justi\\Desktop\\Programming\\Java\\VisitorManagementSystem\\src\\assets\\SJCF_LOGO.png");
    
    public Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardNavBG = new javax.swing.JPanel();
        stJudetxt = new javax.swing.JLabel();
        adminSettings = new javax.swing.JLabel();
        careFacilitytxt = new javax.swing.JLabel();
        adminLogo = new javax.swing.JLabel();
        minimizeWhiteLogo = new javax.swing.JLabel();
        closeWhiteLogo = new javax.swing.JLabel();
        dashboardSideBarBG = new javax.swing.JPanel();
        attendantText = new javax.swing.JLabel();
        reportLogo = new javax.swing.JLabel();
        visitorText = new javax.swing.JLabel();
        visitorLogo = new javax.swing.JLabel();
        elderlyText = new javax.swing.JLabel();
        elderlyLogo = new javax.swing.JLabel();
        dashboardText = new javax.swing.JLabel();
        dashboardLogo = new javax.swing.JLabel();
        reportText = new javax.swing.JLabel();
        attendantLogo = new javax.swing.JLabel();
        dashboardCalendar = new com.toedter.calendar.JCalendar();
        visitorCounterBG = new javax.swing.JPanel();
        peopleLogo = new javax.swing.JLabel();
        visitorCounter = new javax.swing.JLabel();
        visitorCounterText = new javax.swing.JLabel();
        elderlyCounterBG = new javax.swing.JPanel();
        elderlyCounter = new javax.swing.JLabel();
        elderlyCoupleLogo = new javax.swing.JLabel();
        elderlyCounterText = new javax.swing.JLabel();
        dashboardBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("St. Jude Care Facility");
        setIconImage(logo.getImage());
        setName("dashboardFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardNavBG.setBackground(new java.awt.Color(129, 159, 29));
        dashboardNavBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stJudetxt.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        stJudetxt.setForeground(new java.awt.Color(255, 255, 255));
        stJudetxt.setText("St. Jude");
        stJudetxt.setFocusable(false);
        dashboardNavBG.add(stJudetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 60));

        adminSettings.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        adminSettings.setForeground(new java.awt.Color(255, 255, 255));
        adminSettings.setText("ADMINISTRATOR");
        adminSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminSettings.setFocusable(false);
        adminSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminSettingsMouseClicked(evt);
            }
        });
        dashboardNavBG.add(adminSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, 60));

        careFacilitytxt.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        careFacilitytxt.setForeground(new java.awt.Color(255, 255, 255));
        careFacilitytxt.setText("Care Facility");
        careFacilitytxt.setFocusable(false);
        dashboardNavBG.add(careFacilitytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 60));

        adminLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/adminLogo.png"))); // NOI18N
        adminLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLogoMouseClicked(evt);
            }
        });
        dashboardNavBG.add(adminLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        minimizeWhiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minimizeWhiteLogo.png"))); // NOI18N
        minimizeWhiteLogo.setToolTipText("Minimize");
        minimizeWhiteLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeWhiteLogo.setFocusable(false);
        minimizeWhiteLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeWhiteLogoMouseClicked(evt);
            }
        });
        dashboardNavBG.add(minimizeWhiteLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        closeWhiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/closeWhiteLogo.png"))); // NOI18N
        closeWhiteLogo.setToolTipText("Close");
        closeWhiteLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeWhiteLogo.setFocusable(false);
        closeWhiteLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWhiteLogoMouseClicked(evt);
            }
        });
        dashboardNavBG.add(closeWhiteLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, -1, -1));

        getContentPane().add(dashboardNavBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        dashboardSideBarBG.setBackground(new java.awt.Color(42, 52, 11));
        dashboardSideBarBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attendantText.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        attendantText.setForeground(new java.awt.Color(255, 255, 255));
        attendantText.setText("ATTENDANT");
        attendantText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attendantText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendantTextMouseClicked(evt);
            }
        });
        dashboardSideBarBG.add(attendantText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        reportLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/reportLogo.png"))); // NOI18N
        reportLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportLogoMouseClicked(evt);
            }
        });
        dashboardSideBarBG.add(reportLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        visitorText.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        visitorText.setForeground(new java.awt.Color(255, 255, 255));
        visitorText.setText("VISITOR");
        visitorText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visitorText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visitorTextMouseClicked(evt);
            }
        });
        dashboardSideBarBG.add(visitorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        visitorLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/visitorLogo.png"))); // NOI18N
        visitorLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visitorLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visitorLogoMouseClicked(evt);
            }
        });
        dashboardSideBarBG.add(visitorLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        elderlyText.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        elderlyText.setForeground(new java.awt.Color(255, 255, 255));
        elderlyText.setText("ELDERLY");
        elderlyText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elderlyText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elderlyTextMouseClicked(evt);
            }
        });
        dashboardSideBarBG.add(elderlyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        elderlyLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/elderlyLogo.png"))); // NOI18N
        elderlyLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elderlyLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elderlyLogoMouseClicked(evt);
            }
        });
        dashboardSideBarBG.add(elderlyLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        dashboardText.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        dashboardText.setForeground(new java.awt.Color(255, 255, 255));
        dashboardText.setText("DASHBOARD");
        dashboardText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardSideBarBG.add(dashboardText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        dashboardLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dashboardLogo.png"))); // NOI18N
        dashboardLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardSideBarBG.add(dashboardLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        reportText.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        reportText.setForeground(new java.awt.Color(255, 255, 255));
        reportText.setText("REPORT");
        reportText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportTextMouseClicked(evt);
            }
        });
        dashboardSideBarBG.add(reportText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        attendantLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/attendantLogo.png"))); // NOI18N
        attendantLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attendantLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendantLogoMouseClicked(evt);
            }
        });
        dashboardSideBarBG.add(attendantLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        getContentPane().add(dashboardSideBarBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, 560));

        dashboardCalendar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(107, 132, 22), 10, true));
        dashboardCalendar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        dashboardCalendar.setTodayButtonVisible(true);
        dashboardCalendar.setWeekOfYearVisible(false);
        getContentPane().add(dashboardCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 420, 330));

        visitorCounterBG.setBackground(new java.awt.Color(183, 216, 72));
        visitorCounterBG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 159, 29), 10, true));
        visitorCounterBG.setFocusable(false);
        visitorCounterBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        peopleLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/peopleLogo.png"))); // NOI18N
        visitorCounterBG.add(peopleLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        visitorCounter.setFont(new java.awt.Font("Segoe UI Black", 1, 100)); // NOI18N
        visitorCounter.setForeground(new java.awt.Color(255, 255, 255));
        visitorCounter.setText("0");
        visitorCounterBG.add(visitorCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 90));

        visitorCounterText.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        visitorCounterText.setForeground(new java.awt.Color(255, 255, 255));
        visitorCounterText.setText("VISITORS");
        visitorCounterBG.add(visitorCounterText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(visitorCounterBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 300, 150));

        elderlyCounterBG.setBackground(new java.awt.Color(212, 245, 101));
        elderlyCounterBG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 159, 29), 10, true));
        elderlyCounterBG.setFocusable(false);
        elderlyCounterBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        elderlyCounter.setFont(new java.awt.Font("Segoe UI Black", 1, 100)); // NOI18N
        elderlyCounter.setForeground(new java.awt.Color(255, 255, 255));
        elderlyCounter.setText("0");
        elderlyCounterBG.add(elderlyCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, 90));

        elderlyCoupleLogo.setForeground(new java.awt.Color(255, 255, 255));
        elderlyCoupleLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/elderlyCouple.png"))); // NOI18N
        elderlyCounterBG.add(elderlyCoupleLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        elderlyCounterText.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        elderlyCounterText.setForeground(new java.awt.Color(255, 255, 255));
        elderlyCounterText.setText("ELDERLIES");
        elderlyCounterBG.add(elderlyCounterText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        getContentPane().add(elderlyCounterBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 300, 150));

        dashboardBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dashboardBackground.png"))); // NOI18N
        dashboardBackground.setText("jLabel1");
        dashboardBackground.setPreferredSize(new java.awt.Dimension(1020, 570));
        getContentPane().add(dashboardBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeWhiteLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeWhiteLogoMouseClicked
        this.setExtendedState(Login.ICONIFIED);
    }//GEN-LAST:event_minimizeWhiteLogoMouseClicked

    private void closeWhiteLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWhiteLogoMouseClicked
        ExitDialog exDiag = new ExitDialog();
        exDiag.setVisible(true);
    }//GEN-LAST:event_closeWhiteLogoMouseClicked

    private void elderlyLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elderlyLogoMouseClicked
         ElderlyDetails elderlyDetails = new ElderlyDetails();
         String database = "SELECT ElderlyID, FirstName, MiddleName, LastName, SuffixName, Gender, BirthDate, ContactNo, GuardianName, Street, Barangay, CityMunicipality, Province, AdmitDate, ElderlyRoomNo FROM elderly";
         
         try{
             Connection con = DriverManager.getConnection(DatabaseConnection.DB_CONNECTION,"root","root");
             PreparedStatement pst = con.prepareStatement(database);
             ResultSet rs = pst.executeQuery();
             DefaultTableModel table = (DefaultTableModel) elderlyDetails.getElderlyTable().getModel();
             table.setRowCount(0);
             
             while(rs.next()){
                 Object[] row = {
                     rs.getInt("ElderlyID"),
                     rs.getString("FirstName"),
                     rs.getString("MiddleName"),
                     rs.getString("LastName"),
                     rs.getString("SuffixName"),
                     rs.getString("Gender"),
                     rs.getObject("BirthDate"),
                     rs.getLong("ContactNo"),
                     rs.getString("GuardianName"),
                     rs.getString("Street"),
                     rs.getString("Barangay"),
                     rs.getString("CityMunicipality"),
                     rs.getString("Province"),
                     rs.getObject("AdmitDate"),
                     rs.getLong("ElderlyRoomNo")
                 };
                 table.addRow(row);
             }
             elderlyDetails.getElderlyTable().setModel(table);
             elderlyDetails.setVisible(true);
             this.setVisible(false);
             rs.close();
             pst.close();
             con.close();
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Connection Error!" + e.getMessage());
         }
    }//GEN-LAST:event_elderlyLogoMouseClicked

    private void elderlyTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elderlyTextMouseClicked
         ElderlyDetails elderlyDetails = new ElderlyDetails();
         String database = "SELECT ElderlyID, FirstName, MiddleName, LastName, SuffixName, Gender, BirthDate, ContactNo, GuardianName, Street, Barangay, CityMunicipality, Province, AdmitDate, ElderlyRoomNo FROM elderly";
         
         try{
             Connection con = DriverManager.getConnection(DatabaseConnection.DB_CONNECTION,"root","root");
             PreparedStatement pst = con.prepareStatement(database);
             ResultSet rs = pst.executeQuery();
             DefaultTableModel table = (DefaultTableModel) elderlyDetails.getElderlyTable().getModel();
             table.setRowCount(0);
             
             while(rs.next()){
                 Object[] row = {
                     rs.getInt("ElderlyID"),
                     rs.getString("FirstName"),
                     rs.getString("MiddleName"),
                     rs.getString("LastName"),
                     rs.getString("SuffixName"),
                     rs.getString("Gender"),
                     rs.getObject("BirthDate"),
                     rs.getLong("ContactNo"),
                     rs.getString("GuardianName"),
                     rs.getString("Street"),
                     rs.getString("Barangay"),
                     rs.getString("CityMunicipality"),
                     rs.getString("Province"),
                     rs.getObject("AdmitDate"),
                     rs.getLong("ElderlyRoomNo")
                 };
                 table.addRow(row);
             }
             elderlyDetails.getElderlyTable().setModel(table);
             elderlyDetails.setVisible(true);
             this.setVisible(false);
             rs.close();
             pst.close();
             con.close();
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Connection Error!" + e.getMessage());
         }
    }//GEN-LAST:event_elderlyTextMouseClicked

    private void visitorLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visitorLogoMouseClicked
        VisitorDetails visitorDetails = new VisitorDetails();
        String database = "SELECT visitor.VisitorID, visitor.FirstName, visitor.MiddleName, visitor.LastName, visitor.SuffixName, visitor.Gender, visitor.BirthDate, visitor.Relationship, visitor.ContactNo, visitor.Email, visitor.Street, visitor.Barangay, visitor.CityMunicipality, visitor.Province FROM visitor";
        try{
            Connection con = DriverManager.getConnection(DatabaseConnection.DB_CONNECTION,"root","root");
            PreparedStatement pst = con.prepareStatement(database);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel table = (DefaultTableModel) visitorDetails.getVisitorTable().getModel();
            table.setRowCount(0);

            while(rs.next()){
                Object[] row = {
                    rs.getInt("visitor.VisitorID"),
                    rs.getString("visitor.FirstName"),
                    rs.getString("visitor.MiddleName"),
                    rs.getString("visitor.LastName"),
                    rs.getString("visitor.SuffixName"),
                    rs.getString("visitor.Gender"),
                    rs.getObject("visitor.BirthDate"),
                    rs.getString("visitor.Relationship"),
                    rs.getLong("visitor.ContactNo"),
                    rs.getString("visitor.Email"),
                    rs.getString("visitor.Street"),
                    rs.getString("visitor.Barangay"),
                    rs.getString("visitor.CityMunicipality"),
                    rs.getString("visitor.Province"),
                };
                table.addRow(row);
            }
            visitorDetails.getVisitorTable().setModel(table);
            visitorDetails.setVisible(true);
            this.setVisible(false);
            rs.close();
            pst.close();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection Error!" + e.getMessage());
        }
    }//GEN-LAST:event_visitorLogoMouseClicked

    private void visitorTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visitorTextMouseClicked
        VisitorDetails visitorDetails = new VisitorDetails();
        String database = "SELECT visitor.VisitorID, visitor.FirstName, visitor.MiddleName, visitor.LastName, visitor.SuffixName, visitor.Gender, visitor.BirthDate, visitor.Relationship, visitor.ContactNo, visitor.Email, visitor.Street, visitor.Barangay, visitor.CityMunicipality, visitor.Province FROM visitor";
        try{
            Connection con = DriverManager.getConnection(DatabaseConnection.DB_CONNECTION,"root","root");
            PreparedStatement pst = con.prepareStatement(database);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel table = (DefaultTableModel) visitorDetails.getVisitorTable().getModel();
            table.setRowCount(0);

            while(rs.next()){
                Object[] row = {
                    rs.getInt("visitor.VisitorID"),
                    rs.getString("visitor.FirstName"),
                    rs.getString("visitor.MiddleName"),
                    rs.getString("visitor.LastName"),
                    rs.getString("visitor.SuffixName"),
                    rs.getString("visitor.Gender"),
                    rs.getObject("visitor.BirthDate"),
                    rs.getString("visitor.Relationship"),
                    rs.getLong("visitor.ContactNo"),
                    rs.getString("visitor.Email"),
                    rs.getString("visitor.Street"),
                    rs.getString("visitor.Barangay"),
                    rs.getString("visitor.CityMunicipality"),
                    rs.getString("visitor.Province"),
                };
                table.addRow(row);
            }
            visitorDetails.getVisitorTable().setModel(table);
            visitorDetails.setVisible(true);
            this.setVisible(false);
            rs.close();
            pst.close();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection Error!" + e.getMessage());
        }
    }//GEN-LAST:event_visitorTextMouseClicked

    private void reportLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportLogoMouseClicked
         ElderlyReport elderlyReport = new ElderlyReport();
         String database = "SELECT ElderlyID, FirstName, MiddleName, LastName, SuffixName, Gender, BirthDate, ContactNo, GuardianName, Street, Barangay, CityMunicipality, Province, AdmitDate, ElderlyRoomNo, AttendantID FROM elderly";
         
         try{
             Connection con = DriverManager.getConnection(DatabaseConnection.DB_CONNECTION,"root","root");
             PreparedStatement pst = con.prepareStatement(database);
             ResultSet rs = pst.executeQuery();
             DefaultTableModel table = (DefaultTableModel) elderlyReport.getElderlyTable().getModel();
             table.setRowCount(0);
             
             while(rs.next()){
                 Object[] row = {
                     rs.getLong("ElderlyID"),
                     rs.getString("FirstName"),
                     rs.getString("MiddleName"),
                     rs.getString("LastName"),
                     rs.getString("SuffixName"),
                     rs.getString("Gender"),
                     rs.getObject("BirthDate"),
                     rs.getLong("ContactNo"),
                     rs.getString("GuardianName"),
                     rs.getString("Street"),
                     rs.getString("Barangay"),
                     rs.getString("CityMunicipality"),
                     rs.getString("Province"),
                     rs.getObject("AdmitDate"),
                     rs.getLong("ElderlyRoomNo"),
                     rs.getLong("AttendantID")
                 };
                 table.addRow(row);
             }
             elderlyReport.getElderlyTable().setModel(table);
             elderlyReport.setVisible(true);
             this.setVisible(false);
             rs.close();
             pst.close();
             con.close();
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Connection Error!" + e.getMessage());
         }
    }//GEN-LAST:event_reportLogoMouseClicked

    private void reportTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportTextMouseClicked
         ElderlyReport elderlyReport = new ElderlyReport();
         String database = "SELECT ElderlyID, FirstName, MiddleName, LastName, SuffixName, Gender, BirthDate, ContactNo, GuardianName, Street, Barangay, CityMunicipality, Province, AdmitDate, ElderlyRoomNo, AttendantID FROM elderly";
         
         try{
             Connection con = DriverManager.getConnection(DatabaseConnection.DB_CONNECTION,"root","root");
             PreparedStatement pst = con.prepareStatement(database);
             ResultSet rs = pst.executeQuery();
             DefaultTableModel table = (DefaultTableModel) elderlyReport.getElderlyTable().getModel();
             table.setRowCount(0);
             
             while(rs.next()){
                 Object[] row = {
                     rs.getLong("ElderlyID"),
                     rs.getString("FirstName"),
                     rs.getString("MiddleName"),
                     rs.getString("LastName"),
                     rs.getString("SuffixName"),
                     rs.getString("Gender"),
                     rs.getObject("BirthDate"),
                     rs.getLong("ContactNo"),
                     rs.getString("GuardianName"),
                     rs.getString("Street"),
                     rs.getString("Barangay"),
                     rs.getString("CityMunicipality"),
                     rs.getString("Province"),
                     rs.getObject("AdmitDate"),
                     rs.getLong("ElderlyRoomNo"),
                     rs.getLong("AttendantID")
                 };
                 table.addRow(row);
             }
             elderlyReport.getElderlyTable().setModel(table);
             elderlyReport.setVisible(true);
             this.setVisible(false);
             rs.close();
             pst.close();
             con.close();
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Connection Error!" + e.getMessage());
         }
    }//GEN-LAST:event_reportTextMouseClicked

    private void attendantLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantLogoMouseClicked
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
                     rs.getString("attendant.BirthDate"),
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
    }//GEN-LAST:event_attendantLogoMouseClicked

    private void attendantTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendantTextMouseClicked
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
    }//GEN-LAST:event_attendantTextMouseClicked

    private void adminLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLogoMouseClicked
        DashboardLogOut logout = new DashboardLogOut();
        logout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adminLogoMouseClicked

    private void adminSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminSettingsMouseClicked
        DashboardLogOut logout = new DashboardLogOut();
        logout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adminSettingsMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLogo;
    private javax.swing.JLabel adminSettings;
    private javax.swing.JLabel attendantLogo;
    private javax.swing.JLabel attendantText;
    private javax.swing.JLabel careFacilitytxt;
    private javax.swing.JLabel closeWhiteLogo;
    private javax.swing.JLabel dashboardBackground;
    private com.toedter.calendar.JCalendar dashboardCalendar;
    private javax.swing.JLabel dashboardLogo;
    private javax.swing.JPanel dashboardNavBG;
    private javax.swing.JPanel dashboardSideBarBG;
    private javax.swing.JLabel dashboardText;
    public javax.swing.JLabel elderlyCounter;
    private javax.swing.JPanel elderlyCounterBG;
    private javax.swing.JLabel elderlyCounterText;
    private javax.swing.JLabel elderlyCoupleLogo;
    private javax.swing.JLabel elderlyLogo;
    private javax.swing.JLabel elderlyText;
    private javax.swing.JLabel minimizeWhiteLogo;
    private javax.swing.JLabel peopleLogo;
    private javax.swing.JLabel reportLogo;
    private javax.swing.JLabel reportText;
    private javax.swing.JLabel stJudetxt;
    public javax.swing.JLabel visitorCounter;
    private javax.swing.JPanel visitorCounterBG;
    private javax.swing.JLabel visitorCounterText;
    private javax.swing.JLabel visitorLogo;
    private javax.swing.JLabel visitorText;
    // End of variables declaration//GEN-END:variables
}
