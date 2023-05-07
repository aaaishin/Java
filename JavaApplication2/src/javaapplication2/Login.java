package javaapplication2;
import javax.swing.JOptionPane;
import java.sql.*;

public class Login extends javax.swing.JFrame {

   
    public Login() {
       initComponents();
       EmailType.setFocusable(false);  
       AdminPass.setFocusable(false);
       setLocationRelativeTo(null);
       setResizable(false);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EmailType = new javax.swing.JTextField();
        AdminPass = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(320, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmailType.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        EmailType.setForeground(new java.awt.Color(138, 138, 138));
        EmailType.setText("email");
        EmailType.setToolTipText("");
        EmailType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailTypeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EmailTypeMousePressed(evt);
            }
        });
        EmailType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTypeActionPerformed(evt);
            }
        });
        EmailType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailTypeKeyTyped(evt);
            }
        });
        jPanel1.add(EmailType, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 150, 25));

        AdminPass.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        AdminPass.setForeground(new java.awt.Color(138, 138, 138));
        AdminPass.setText("password");
        AdminPass.setFocusable(false);
        AdminPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdminPassMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AdminPassMousePressed(evt);
            }
        });
        AdminPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPassActionPerformed(evt);
            }
        });
        jPanel1.add(AdminPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 150, 25));

        Login.setBackground(new java.awt.Color(233, 107, 70));
        Login.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Login.setText("Login");
        Login.setBorderPainted(false);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 150, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 107, 70));
        jLabel1.setText("Admin Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailTypeKeyTyped
        
    }//GEN-LAST:event_EmailTypeKeyTyped

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
      try{ 
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection(DbCons.DB_CONNECTION,"root","root");
         String sql = "Select * from login where Username = ? and OurPassword = ?";
         PreparedStatement pst = con.prepareStatement(sql);
         pst.setString(1, EmailType.getText());
         pst.setString(2,AdminPass.getText());
         ResultSet rs = pst.executeQuery();
                 
         if(rs.next()){
          JOptionPane.showMessageDialog(null, "Login Successful!");
          EmailType.setText("");
          AdminPass.setText("");
          new Main().setVisible(true); 
          this.setVisible(false);
         }
         else{
          JOptionPane.showMessageDialog(null,"Incorrect Username or Password!");
          EmailType.setText("");
          AdminPass.setText("");
          }
          con.close();
          }      
       catch(Exception e){
          JOptionPane.showMessageDialog(null, "Connection Error!" + e.getMessage());
         }
    }//GEN-LAST:event_LoginActionPerformed

    private void EmailTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTypeActionPerformed
       
    }//GEN-LAST:event_EmailTypeActionPerformed

    private void EmailTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailTypeMouseClicked
         
    }//GEN-LAST:event_EmailTypeMouseClicked

    private void AdminPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPassActionPerformed
      
    }//GEN-LAST:event_AdminPassActionPerformed

    private void AdminPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminPassMouseClicked
        
    }//GEN-LAST:event_AdminPassMouseClicked

    private void EmailTypeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailTypeMousePressed
         if(EmailType.getText().equals("email")){
         EmailType.setText("");
         EmailType.setFocusable(true);  
         }                                 
    }//GEN-LAST:event_EmailTypeMousePressed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
         EmailType.setFocusable(true);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void AdminPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminPassMousePressed
         if(AdminPass.getText().equals("password")){
         AdminPass.setText("");
         AdminPass.setFocusable(true);
         }
    }//GEN-LAST:event_AdminPassMousePressed

    private void AdminPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminPassMouseEntered
         AdminPass.setFocusable(true);
    }//GEN-LAST:event_AdminPassMouseEntered
    
    

    public static void main(String args[]) {
        
         java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField AdminPass;
    private javax.swing.JTextField EmailType;
    private javax.swing.JButton Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
