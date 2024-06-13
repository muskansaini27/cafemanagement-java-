
package foodfiles;
import java.sql.*;
import javax.swing.*;
import java.awt.Color;

/**
 *
 * @author MUSKAN SAINI
 */
public class forgotpass extends javax.swing.JFrame {

   
     Color notEdit = new Color(204,204,204);
     Color edit= new Color(255,255,255);
    public forgotpass() {
        initComponents();
        password.setBackground(notEdit);
        password.setEnabled(false);
        save.setEnabled(false);
    }

  
    
  public int setPassword() {
    String usern = user.getText();
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_app", "root", "");
        String selectQuery = "SELECT email FROM signup WHERE email = '" + usern + "'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(selectQuery);
        
        if (rs.next()) {
            password.setBackground(edit);
            password.setEnabled(true);
            save.setEnabled(true);
            
         } else {
            JOptionPane.showMessageDialog(null, "User Not Found", "Error", JOptionPane.ERROR_MESSAGE);
             // User not found
        }
    } catch (Exception e) {
        System.out.println("Error!"+e.getMessage()); 
        
    }
    return 0;
  }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        search = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(158, 111, 78));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(158, 111, 78));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forgot Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 286, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 238, 87, -1));

        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 173, 306, 37));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 141, 87, -1));

        save.setBackground(new java.awt.Color(237, 226, 219));
        save.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 158, 40));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 173, 37, 37));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 30, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visible.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 310, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String username=user.getText();
        String pass=password.getText();
        System.out.println(username);
        System.out.println(pass);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_app", "root", "");

            String updateQuery = "UPDATE signup SET password = '" + pass + "' WHERE email = '" + username + "'";
            Statement updateStatement = con.createStatement();
            int rowsUpdated = updateStatement.executeUpdate(updateQuery);

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Password updated successfully");
                this.dispose();
                Login_form login=new Login_form();
                 login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                login.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Password is not updated", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (Exception e) {
            System.out.println("Error!"+e.getMessage()); 
       }
    }//GEN-LAST:event_saveActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        
        password.setEchoChar((char) 0);
        jLabel8.setVisible(false);
        jLabel6.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        
                password.setEchoChar('*');
        jLabel6.setVisible(false);
        jLabel8.setVisible(true);

    }//GEN-LAST:event_jLabel6MouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
        
        if(user.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "PLease fill in the username field", "Error", JOptionPane.ERROR_MESSAGE);
            return;   
        }     
        else{
            setPassword();
            
        }
    }//GEN-LAST:event_searchMouseClicked

    private void userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_userKeyPressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        Login_form login = new Login_form();
        login.setVisible(true);
       // this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton save;
    private javax.swing.JLabel search;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
