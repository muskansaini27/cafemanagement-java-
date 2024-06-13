
package foodfiles;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CartFrame extends javax.swing.JFrame {

    DefaultTableModel model; 
    
    private String productId; 
    public CartFrame() {
        initComponents();
        
        
    }
     

     public void dt(){
        Date d =new Date();
        SimpleDateFormat sdf =new  SimpleDateFormat("yyyy-MMM-dd");
        
        String dd =sdf.format(d);
        pdate.setText(dd);
    }
     
     
     
    public CartFrame(String productId) {
        initComponents();
        this.productId = productId;
        System.out.println(productId);
        tableProduct();
        dt();
    }
    
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
        //jTable2 .getColumnModel().getColumn(3).setCellRenderer(new OrderFrame.ImageRenderer());
        
        
        
    }
    
    
    public void getallProducts(JTable table){ 
        String id1 = id.getText();
        System.out.println(id1);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_app", "root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "SELECT * FROM cart WHERE cid = '" + productId + "'";
            ResultSet rs = stmt.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;

            while (rs.next()) {
                row = new Object[6];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getString(3);
                row[3] = rs.getInt(4);
                row[4] = rs.getInt(5);
                row[5] = rs.getInt(6);
                model.addRow(row);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        int columnIndex = 5; // Replace with the actual index of the column you want to sum
        double subtotalPrice = 0.0;
        double totalprice = 0.0;

        for (int row = 0; row < table.getRowCount(); row++) {
            Object value = table.getValueAt(row, columnIndex); // Get the value in the specified column
            Object value1 = table.getValueAt(row, 3); // Get the value in another column (column index 4)

            if (value instanceof Number && value1 instanceof Number) {
                double itemPrice = ((Number) value).doubleValue();
                subtotalPrice += itemPrice; // Add the value to the subtotal
                int quantity = ((Number) value1).intValue();
                System.out.println("Quantity: " + quantity);
                double totalPriceForItem = itemPrice + (3 * quantity); // Calculate total price for the item

                totalprice += totalPriceForItem; // Add it to the total price

    }
}

        System.out.println("Subtotal Price: " + subtotalPrice);
        System.out.println("Total Price: " + totalprice);
        pstotal.setText("" + subtotalPrice);
        ptotal.setText("" + totalprice);    
        }
     
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pdate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ptotal = new javax.swing.JTextField();
        payment = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ptax = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pstotal = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cnumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(158, 111, 78));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

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
                "Cart ID", "Product ID", "Product Name", "Quantity", "Price", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cart ID :");

        id.setEditable(false);
        id.setBackground(new java.awt.Color(204, 204, 204));
        id.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Payment Date");

        pdate.setEditable(false);
        pdate.setBackground(new java.awt.Color(204, 204, 204));
        pdate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sub Total (Rs) :");

        ptotal.setEditable(false);
        ptotal.setBackground(new java.awt.Color(204, 204, 204));
        ptotal.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        payment.setBackground(new java.awt.Color(237, 226, 219));
        payment.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        payment.setText("Print");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tax (Rs) :");

        ptax.setEditable(false);
        ptax.setBackground(new java.awt.Color(204, 204, 204));
        ptax.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total (Rs) :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Customer Name :");

        pstotal.setEditable(false);
        pstotal.setBackground(new java.awt.Color(204, 204, 204));
        pstotal.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pstotal.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pstotalComponentShown(evt);
            }
        });

        cname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Customer Number :");

        cnumber.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pstotal, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id)
                                    .addComponent(pdate)
                                    .addComponent(ptax)
                                    .addComponent(ptotal)
                                    .addComponent(cname)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cnumber)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ptax, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pstotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ptotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        
        
        String custname = cname.getText();
        String paydate = pdate.getText();
        String number = cnumber.getText();
        
        String regexPattern = "\\d{10}";
        if (custname.isEmpty() && number.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill name and number.");
            return;
        } else if (!number.matches(regexPattern)) {
            JOptionPane.showMessageDialog(null, "Invalid phone number. Please enter a 10-digit number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;   
} 

DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

       

        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_app", "root", "");
            Statement stmt = con.createStatement();
            for (int row = 0; row < jTable2.getRowCount(); row++) {
                Object value = jTable2.getValueAt(row, 5); // Get the value in the total price column
                Object value1 = jTable2.getValueAt(row, 1); // Get the value in id column 
                Object value2 = jTable2.getValueAt(row, 2); // Get the value in Name column 

                double itemPrice = ((Number) value).doubleValue();
                int pid = ((Number) value1).intValue();
                String prodname = value2.toString();

                String query = "INSERT INTO payment(cid, cName, proid, pName, total, pdate,number) VALUES "
                        + "('" + productId + "', '" + custname + "', '" + pid + "', '" + prodname + "', '" + itemPrice + "', '" + paydate + "', '" + number + "')";
                stmt.executeUpdate(query);
            }
            JOptionPane.showMessageDialog(null, "Successfully Added"); 
            cname.setText("");
            cnumber.setText("");
            }catch(Exception e){
           System.out.println("Error!"+e.getMessage()); 
        }
        report re= new report(productId);
        re.setVisible(true);
    }//GEN-LAST:event_paymentActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_idActionPerformed

    private void jPanel1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorMoved
        // TODO add your handling code here:
                id.setText(productId);
                ptax.setText("3.0");
                
                
    }//GEN-LAST:event_jPanel1AncestorMoved

    private void pstotalComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pstotalComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_pstotalComponentShown

    private void pdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdateActionPerformed

    
    public static void main(String args[]) {
         
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartFrame().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cname;
    private javax.swing.JTextField cnumber;
    public static javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton payment;
    private javax.swing.JTextField pdate;
    private javax.swing.JTextField pstotal;
    private javax.swing.JTextField ptax;
    private javax.swing.JTextField ptotal;
    // End of variables declaration//GEN-END:variables
}
