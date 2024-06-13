
package foodfiles;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel ;


public class OrderFrame extends javax.swing.JFrame {
     private int existingNumber = -1; 
    public int Total=0;
    int rowIndex;
    DefaultTableModel model;
    public OrderFrame() {
        initComponents();
        tableProduct();
        int randomValue = generateRandomNumber();
        pid.setText("" + randomValue);
        System.out.println("OrderFrame randomValue: " + randomValue);
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tprice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        addtocartbtn = new javax.swing.JButton();
        cartbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(158, 111, 78));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Price", "Image"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        tprice.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        tprice.setForeground(new java.awt.Color(255, 255, 255));
        tprice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tprice.setText("0.0");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cart ID :");

        pid.setEditable(false);
        pid.setBackground(new java.awt.Color(204, 204, 204));
        pid.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Name :");

        pname.setEditable(false);
        pname.setBackground(new java.awt.Color(204, 204, 204));
        pname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity :");

        quantity.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantity.setText("0");

        addtocartbtn.setBackground(new java.awt.Color(237, 226, 219));
        addtocartbtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addtocartbtn.setText("Add to Cart");
        addtocartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartbtnActionPerformed(evt);
            }
        });

        cartbtn.setBackground(new java.awt.Color(237, 226, 219));
        cartbtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cartbtn.setText("Cart");
        cartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartbtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total (Rs) : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addtocartbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cartbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pname)
                            .addComponent(quantity)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tprice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(460, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(291, 291, 291)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(tprice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(addtocartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(533, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     private void tableProduct(){
        getallProducts(jTable2 );
        model =(DefaultTableModel) jTable2 .getModel();
        jTable2.setRowHeight(100);
        jTable2 .setShowGrid(true);
        jTable2 .setGridColor(Color.black);
        jTable2 .setBackground(Color.white);
        jTable2 .setSelectionBackground(Color.gray);
        jTable2 .setModel(model);
        jTable2 .getTableHeader().setReorderingAllowed(false);
        jTable2 .getColumnModel().getColumn(3).setCellRenderer(new OrderFrame.ImageRenderer());
        
        
        
    }
    
    
    
    public void getallProducts(JTable table){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_app", "root", "");
                Statement stmt = (Statement) con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from product order by id desc");
                
                DefaultTableModel model=(DefaultTableModel) table.getModel();
                Object[] row;
                
                while(rs.next()){
                    row=new Object[4];
                    row[0]=rs.getInt(1);
                    row[1]=rs.getString(2);
                    row[2]=rs.getDouble(3);
                    row[3]=rs.getBytes(4);
                    model.addRow(row);
                    
                }
                
      }
      catch(Exception e){
          System.out.println(e.getMessage()); 
         
      }
            
        }
    
    
    
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void cartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartbtnActionPerformed
        // TODO add your handling code here:
       String productId = OrderFrame.pid.getText();
    
    // Create a new CartFrame instance and pass the product ID to it
    CartFrame cart = new CartFrame(productId);
        cart.setVisible(true);
        cart.pack();
        cart.setLocationRelativeTo(null);
               
    }//GEN-LAST:event_cartbtnActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        model=(DefaultTableModel) jTable2.getModel();
        rowIndex =jTable2.getSelectedRow();
        if (rowIndex != -1) {
             Object value1 = model.getValueAt(rowIndex, 0);
    // Rest of your code for processing the selected row
} else {
    // Handle the case where no row is selected, e.g., display an error message
    JOptionPane.showMessageDialog(null, "Please select a row.", "Error", JOptionPane.ERROR_MESSAGE);
}
        //pid.setText(model.getValueAt(rowIndex,0).toString());
        pname.setText(model.getValueAt(rowIndex,1).toString());
        
        
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void addtocartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartbtnActionPerformed
        // TODO add your handling code here:
         model=(DefaultTableModel) jTable2.getModel();
        rowIndex =jTable2.getSelectedRow();
        String id =pid.getText();
        String name =pname.getText();
        String quant=quantity.getText();
         
        int quantityInt = Integer.parseInt(quant);
        if(name.isEmpty()){
        JOptionPane.showMessageDialog(null, "Please select a product.");
        return;
    }
        else if (quantityInt == 0  ) {
        JOptionPane.showMessageDialog(null, "Quantity cannot be 0", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method
    } 
        //Getting Product id value
        Object value1 = model.getValueAt(rowIndex,0);
        //System.out.println(value1);
        
        //Calculating price
        Object value = model.getValueAt(rowIndex,2);
        double price = ((Number) value).doubleValue();
        //int quantityInt = Integer.parseInt(quant);
        double totalPrice = price * quantityInt;
        tprice.setText(String.valueOf(totalPrice));
        String  total=tprice.getText();      
     try{
          Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_app", "root", "");
         Statement stmt = con.createStatement();

         String query = "INSERT INTO cart(cid,pid,pName,qty,price,total) VALUES ('" + id + "', '" + value1 + "', '" + name + "','" + quant + "','" + value + "','" + total + "')";
         stmt.executeUpdate(query);
         JOptionPane.showMessageDialog(null, "Added to cart");
        
         pname.setText("");
         quantity.setText("0");
         tprice.setText("");


     } catch (Exception e) {
         System.out.println("Error!"+e.getMessage()); 
        }
       
        
    }//GEN-LAST:event_addtocartbtnActionPerformed
     
    public int generateRandomNumber() {
        int newNumber;
        do {
            newNumber = new Random().nextInt(2000) + 1;
        } while (newNumber == existingNumber);

        existingNumber = newNumber;
        return existingNumber;
        
        
    }

    
    
    private class ImageRenderer extends DefaultTableCellRenderer {
       private final int iconWidth = 100; // Set the preferred width
    private final int iconHeight = 100;
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        //System.out.println("Value type: " + value.getClass().getName());
        JLabel jL = new JLabel();

        try {
            byte[] bytes = (byte[]) value;
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bytes).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            jL.setIcon(imageIcon);
        } catch (Exception e) {
            // Log or print the exception to see if there's an issue with the image data
            e.printStackTrace();
        }
        jL.setPreferredSize(new Dimension(iconWidth, iconHeight));
        return jL;
    }
}
    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtocartbtn;
    private javax.swing.JButton cartbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    public static javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel tprice;
    // End of variables declaration//GEN-END:variables
}
