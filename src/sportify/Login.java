package sportify;

import java.awt.Color;
import javax.swing.*;
import java.sql.*;

public class Login extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Login() {
        initComponents();
    }
    
    static String strToBinary(String s)
    {
        int n = s.length();
        String binary = "";
 
        for (int i = 0; i < n; i++) 
        {
            // convert each char to
            // ASCII value
            int val = Integer.valueOf(s.charAt(i));
 
            // Convert ASCII value to binary
            String bin = "";
            while (val > 0) 
            {
                if (val % 2 == 1)
                {
                    bin += '1';
                }
                else
                    bin += '0';
                val /= 2;
            }
            bin = reverse(bin);
            binary += bin;
 
        }
                    return binary;

    }
 
    static String reverse(String input) 
    {
        char[] a = input.toCharArray();
        int l, r = 0;
        r = a.length - 1;
 
        for (l = 0; l < r; l++, r--)
        {
            // Swap values of l and r 
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
        return String.valueOf(a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        left = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lpassword = new javax.swing.JPasswordField();
        blogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bsignup = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        exitlb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        left.setBackground(new java.awt.Color(102, 102, 102));
        left.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sportify/images/istockphoto-1286100689-612x612__1_-removebg-preview.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(219, 219, 219))
        );

        jPanel1.add(left);
        left.setBounds(0, 0, 400, 500);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome back!!");

        jLabel1.setFont(new java.awt.Font("Rubik", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");

        lemail.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        lemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rubik", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        lpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lpasswordActionPerformed(evt);
            }
        });

        blogin.setBackground(new java.awt.Color(255, 153, 0));
        blogin.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        blogin.setForeground(new java.awt.Color(255, 255, 255));
        blogin.setText("Login");
        blogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bloginMouseClicked(evt);
            }
        });
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });
        blogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bloginKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Don't have an account? ");

        bsignup.setBackground(new java.awt.Color(51, 51, 51));
        bsignup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bsignup.setForeground(new java.awt.Color(255, 255, 255));
        bsignup.setText("Sign Up");
        bsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsignupActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rubik", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sportify");

        exitlb.setForeground(new java.awt.Color(255, 255, 255));
        exitlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitlb.setText("X");
        exitlb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitlbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitlbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitlbMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bsignup))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lemail, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lpassword)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(blogin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitlb, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitlb)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lemail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(blogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bsignup))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemailActionPerformed
    }//GEN-LAST:event_lemailActionPerformed

    private void lpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lpasswordActionPerformed
    }//GEN-LAST:event_lpasswordActionPerformed

    private void bsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsignupActionPerformed

        this.dispose();
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_bsignupActionPerformed

    private void bloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloginMouseClicked

    }//GEN-LAST:event_bloginMouseClicked

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed

        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
            String pass = lpassword.getText();
            char ch;
            String nstr = "";
            for (int i = 0; i < pass.length(); i++) {
                ch = pass.charAt(i);
                nstr = ch + nstr;
            }
            
            nstr = strToBinary(nstr);
            
            String q1 = "SELECT * FROM USERDATA WHERE EMAIL =? AND PASSWORD =? ";
            pst = conn.prepareStatement(q1);
            pst.setString(1, lemail.getText());
            pst.setString(2, nstr);
            rs = pst.executeQuery();

            if (rs.next()) {
                this.dispose();
                JOptionPane.showMessageDialog(null, "Login Successfull");
                Landing LandingFrame = new Landing(lemail.getText());
                LandingFrame.setVisible(true);
                LandingFrame.pack();
                LandingFrame.setLocationRelativeTo(null);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Email or Password");
                lemail.setText("");
                lpassword.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_bloginActionPerformed

    private void exitlbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlbMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitlbMouseClicked

    private void exitlbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlbMouseEntered
        // TODO add your handling code here:
        exitlb.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_exitlbMouseEntered

    private void exitlbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlbMouseExited
        // TODO add your handling code here:
        exitlb.setBorder(BorderFactory.createLineBorder(new Color(51, 51, 51)));
    }//GEN-LAST:event_exitlbMouseExited

    private void bloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bloginKeyPressed
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
            String pass = lpassword.getText();
            char ch;
            String nstr = "";
            for (int i = 0; i < pass.length(); i++) {
                ch = pass.charAt(i);
                nstr = ch + nstr;
            }
            String q1 = "SELECT * FROM USERDATA WHERE EMAIL =? AND PASSWORD =? ";
            pst = conn.prepareStatement(q1);
            pst.setString(1, lemail.getText());
            pst.setString(2, nstr);
            rs = pst.executeQuery();

            if (rs.next()) {
                this.dispose();
                JOptionPane.showMessageDialog(null, "Login Successfull");
                Landing LandingFrame = new Landing(lemail.getText());
                LandingFrame.setVisible(true);
                LandingFrame.pack();
                LandingFrame.setLocationRelativeTo(null);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Email or Password");
                lemail.setText("");
                lpassword.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_bloginKeyPressed

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
    private javax.swing.JButton blogin;
    private javax.swing.JButton bsignup;
    private javax.swing.JLabel exitlb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel left;
    private javax.swing.JTextField lemail;
    private javax.swing.JPasswordField lpassword;
    // End of variables declaration//GEN-END:variables
}
