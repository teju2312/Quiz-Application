/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_management_system;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;



/**
 *
 * @author admin
 */
public class student_login extends javax.swing.JFrame {

    /**
     * Creates new form student_login
     */
  
    public student_login() {
        initComponents();
                this.setResizable(false);

        jPanel1.setBackground(new Color(0,0,0,64));
        jPanel2.setBackground(new Color(0,0,0,64));
        usernamet.setBackground(new Color(0,0,0,64));
        usernamel.setBackground(new Color(0,0,0,64));
        passwordt.setBackground(new Color(0,0,0,64));
        passwordl.setBackground(new Color(0,0,0,64));
        login.setBackground(new Color(0,0,0,64));
        forget.setBackground(new Color(0,0,0,64));
        register.setBackground(new Color(0,0,0,64));
        account.setBackground(new Color(0,0,0,64));
         home.setBackground(new Color(0,0,0,64));
         reset1.setBackground(new Color(0,0,0,64));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        usernamel = new javax.swing.JLabel();
        passwordl = new javax.swing.JLabel();
        usernamet = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        forget = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        account = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        passwordt = new javax.swing.JPasswordField();
        reset1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(255, 204, 0))); // NOI18N

        usernamel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usernamel.setForeground(new java.awt.Color(255, 255, 255));
        usernamel.setText("USERNAME");

        passwordl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        passwordl.setForeground(new java.awt.Color(255, 255, 255));
        passwordl.setText("PASSWORD");

        usernamet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        usernamet.setForeground(new java.awt.Color(255, 255, 255));
        usernamet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        forget.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        forget.setForeground(new java.awt.Color(255, 255, 255));
        forget.setText("Forget Password ?");
        forget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(153, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(204, 255, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(100, 30));

        account.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        account.setForeground(new java.awt.Color(255, 255, 255));
        account.setText("Don't have account ?");

        register.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("REGISTER HERE");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/s.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        home.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Back");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        passwordt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passwordt.setForeground(new java.awt.Color(255, 255, 255));

        reset1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reset1.setForeground(new java.awt.Color(255, 255, 255));
        reset1.setText("Reset");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(home)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(passwordl, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(forget, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(passwordt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(usernamel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(usernamet, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(usernamet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(usernamel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forget, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(home)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 660, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/441294.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        dispose();
        new welcome().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
      
        dispose();
        new register_student().setVisible(true);
        
    }//GEN-LAST:event_registerActionPerformed

    private void forgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetActionPerformed
           try {
             String user=usernamet.getText();
             String user1[];
             user1 = new String[10];
             String m1[];
             m1 = new String[16];
             int i=0;
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root","");
            String str="select moblie from stud_info where username=?";
            PreparedStatement pstmt = con.prepareStatement(str);
            pstmt.setString(1,user);
            
            
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
              
                m1[i]=rs.getString("moblie");
               i++;
            }
          
                   
             forgetpassword_page fr = new forgetpassword_page();
                forgetpassword_page.main(m1);
                
             
            
            con.close();
        } catch (SQLException ex){}    
             dispose();
           // new forgetpassword_page().setVisible(true);
    }//GEN-LAST:event_forgetActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        usernamet.setText(null);

        passwordt.setText(null);

    }//GEN-LAST:event_reset1ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
            try {
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root","");
            String str="select * from stud_info where username=? and pass=?";
            PreparedStatement pstmt = con.prepareStatement(str);
            String user=usernamet.getText();
            String pass=passwordt.getText();
            pstmt.setObject(1,user);
            pstmt.setObject(2,pass);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
            {
               
                JOptionPane.showMessageDialog(null,"Login Successfull");
                this.dispose();
                new student_homepage().setVisible(true);
                
               
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Login Unsuccessfull");
                usernamet.setText("");
                passwordt.setText("");
            }
            con.close();
        } catch (SQLException ex){}
    }//GEN-LAST:event_loginActionPerformed

    private void usernametActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametActionPerformed

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
            java.util.logging.Logger.getLogger(student_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account;
    private javax.swing.JButton forget;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton login;
    private javax.swing.JLabel passwordl;
    private javax.swing.JPasswordField passwordt;
    private javax.swing.JButton register;
    private javax.swing.JButton reset1;
    private javax.swing.JLabel usernamel;
    private javax.swing.JTextField usernamet;
    // End of variables declaration//GEN-END:variables
}
