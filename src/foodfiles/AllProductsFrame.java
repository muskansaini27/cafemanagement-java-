
package foodfiles;
import java.awt.Color;
import java.sql.*;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel ;


public class AllProductsFrame extends javax.swing.JFrame {

    DefaultTableModel model;
    public AllProductsFrame() {
        initComponents();
        tableProduct();
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
        jTable2 .getColumnModel().getColumn(3).setCellRenderer(new AllProductsFrame.ImageRenderer());
        
        
        
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(158, 111, 78));

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
                "ID", "Name", "Price", "Image"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

   private class ImageRenderer extends DefaultTableCellRenderer {
       private final int iconWidth = 100; // Set the preferred width
    private final int iconHeight = 100;
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        System.out.println("Value type: " + value.getClass().getName());
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
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllProductsFrame().setVisible(true);
                
            }
           
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
