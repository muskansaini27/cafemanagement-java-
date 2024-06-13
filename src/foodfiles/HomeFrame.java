
package foodfiles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author MUSKAN SAINI
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        dt();
        time();
    }

    public void dt(){
        Date d =new Date();
        SimpleDateFormat sdf =new  SimpleDateFormat("yyyy-MMM-dd");
        
        String dd =sdf.format(d);
        datef.setText(dd);
    }
    
    Timer t;
    SimpleDateFormat st;
    
    public void time(){
        
        t=new Timer (0,new ActionListener(){
        @ Override
        public void actionPerformed(ActionEvent e){
            
    
        Date dt =new Date();
        st=new SimpleDateFormat("hh:mm:ss a");
        DateFormatSymbols symbols = st.getDateFormatSymbols();
        symbols.setAmPmStrings(new String[]{"AM", "PM"});
        st.setDateFormatSymbols(symbols);
        
        String tt=st.format(dt);
        timef.setText(tt);
        }
        
    });
        t.start();
                }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        statsbtn = new javax.swing.JButton();
        addprod = new javax.swing.JButton();
        manageprod = new javax.swing.JButton();
        allprod = new javax.swing.JButton();
        orderbtn = new javax.swing.JButton();
        vieworderbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        timef = new javax.swing.JLabel();
        datef = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statsbtn.setBackground(new java.awt.Color(237, 226, 219));
        statsbtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        statsbtn.setText("Statistics");
        statsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsbtnActionPerformed(evt);
            }
        });
        jPanel2.add(statsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 270, 40));

        addprod.setBackground(new java.awt.Color(237, 226, 219));
        addprod.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        addprod.setText("Add Product");
        addprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addprodActionPerformed(evt);
            }
        });
        jPanel2.add(addprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 270, 40));

        manageprod.setBackground(new java.awt.Color(237, 226, 219));
        manageprod.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        manageprod.setText("Manage Product");
        manageprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageprodActionPerformed(evt);
            }
        });
        jPanel2.add(manageprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 270, 40));

        allprod.setBackground(new java.awt.Color(237, 226, 219));
        allprod.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        allprod.setText("All Products");
        allprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allprodActionPerformed(evt);
            }
        });
        jPanel2.add(allprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 270, 40));

        orderbtn.setBackground(new java.awt.Color(237, 226, 219));
        orderbtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        orderbtn.setText("Place Order");
        orderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderbtnActionPerformed(evt);
            }
        });
        jPanel2.add(orderbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 270, 40));

        vieworderbtn.setBackground(new java.awt.Color(237, 226, 219));
        vieworderbtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        vieworderbtn.setText("View Orders");
        vieworderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vieworderbtnActionPerformed(evt);
            }
        });
        jPanel2.add(vieworderbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 270, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Foodies");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1200, 50));

        timef.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        timef.setForeground(new java.awt.Color(255, 255, 255));
        timef.setText("00:00:00");
        jPanel2.add(timef, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 190, -1));

        datef.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        datef.setForeground(new java.awt.Color(255, 255, 255));
        datef.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datef.setText("Monday ,2-10-2024");
        jPanel2.add(datef, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 170, -1));

        logoutbtn.setBackground(new java.awt.Color(237, 226, 219));
        logoutbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        jPanel2.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void orderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderbtnActionPerformed
        // TODO add your handling code here:
        OrderFrame order =new OrderFrame();
        order.setVisible(true);
        order.pack();
        order.setLocationRelativeTo(null);
          
    }//GEN-LAST:event_orderbtnActionPerformed

    private void addprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addprodActionPerformed
        // TODO add your handling code here:
        AddProductFrame adds= new AddProductFrame();
        adds.setVisible(true);
        adds.pack();
        adds.setLocationRelativeTo(null);
            
    }//GEN-LAST:event_addprodActionPerformed

    private void allprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allprodActionPerformed
        // TODO add your handling code here:
        AllProductsFrame all= new AllProductsFrame();
        all.setVisible(true);
        all.pack();
        all.setLocationRelativeTo(null);
    }//GEN-LAST:event_allprodActionPerformed

    private void manageprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageprodActionPerformed
        // TODO add your handling code here:
        ManageProductFrame manage= new ManageProductFrame();
        manage.setVisible(true);
        manage.pack();
        manage.setLocationRelativeTo(null);
    }//GEN-LAST:event_manageprodActionPerformed

    private void statsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsbtnActionPerformed
        // TODO add your handling code here:
        StatisticsFrame stats =new StatisticsFrame();
        stats.setVisible(true);
        stats.pack();
        stats.setLocationRelativeTo(null);
    }//GEN-LAST:event_statsbtnActionPerformed

    private void vieworderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vieworderbtnActionPerformed
        // TODO add your handling code here:
        ViewOrderFrame vorder =new ViewOrderFrame();
        vorder.setVisible(true);
        vorder.pack();
        vorder.setLocationRelativeTo(null);
    }//GEN-LAST:event_vieworderbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        Login_form login=new Login_form();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addprod;
    private javax.swing.JButton allprod;
    private javax.swing.JLabel datef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton manageprod;
    private javax.swing.JButton orderbtn;
    private javax.swing.JButton statsbtn;
    private javax.swing.JLabel timef;
    private javax.swing.JButton vieworderbtn;
    // End of variables declaration//GEN-END:variables
}
