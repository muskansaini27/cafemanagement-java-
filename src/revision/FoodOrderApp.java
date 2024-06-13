/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package revision;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
/**
 *
 * @author MUSKAN SAINI
 */
public class FoodOrderApp extends javax.swing.JFrame {
            private JPanel mainPanel;
             
    /**   
     * Creates new form FoodOrderApp
     */
   public FoodOrderApp() {
        setTitle("Food Order App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1132, 850);

        mainPanel = new JPanel(new GridLayout(0, 5)); // One column for food items

        JButton addItemButton = new JButton("Add Item");
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Simulate adding a new food item
                addFoodItem("New Food Item", "$9.99", "C:/Users/MUSKAN SAINI/OneDrive/Documents/NetBeansProjects/clg/src/food/img1.png");

            }
        });
        

        JPanel controlPanel = new JPanel();
        controlPanel.add(addItemButton);

        // Create a JScrollPane and add mainPanel to it
        JScrollPane scrollPane = new JScrollPane(mainPanel);

        add(scrollPane, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
   }
   
   private void addFoodItem(String name, String price, String imageFileName) {
          JPanel foodItemPanel = new JPanel();
        foodItemPanel.setLayout(new BoxLayout(foodItemPanel, BoxLayout.Y_AXIS)); // Vertical layout
        JLabel nameLabel = new JLabel("Name: " + name);
        JLabel priceLabel = new JLabel("Price: " + price);

        // Load the image
    ImageIcon imageIcon = new ImageIcon(imageFileName);

    // Get the original image
    Image originalImage = imageIcon.getImage();

    // Calculate the desired width and height to fit within your JLabel
    int maxWidth = 200; // Set your desired maximum width
    int maxHeight = 200; // Set your desired maximum height

    int originalWidth = originalImage.getWidth(null);
    int originalHeight = originalImage.getHeight(null);

    int newWidth = originalWidth;
    int newHeight = originalHeight;

    // Resize the image while maintaining aspect ratio
    if (originalWidth > maxWidth) {
        newWidth = maxWidth;
        newHeight = (newWidth * originalHeight) / originalWidth;
    }

    if (newHeight > maxHeight) {
        newHeight = maxHeight;
        newWidth = (newHeight * originalWidth) / originalHeight;
    }

    // Create a scaled instance of the image
    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    // Create an ImageIcon from the scaled image
    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

    // Create a JLabel with the scaled image
    JLabel imageLabel = new JLabel(scaledImageIcon);
    

        foodItemPanel.add(nameLabel, BorderLayout.NORTH);
        foodItemPanel.add(priceLabel, BorderLayout.CENTER);
        foodItemPanel.add(imageLabel, BorderLayout.SOUTH);

        mainPanel.add(foodItemPanel);
        //rowCount++; // Move to the next row
        mainPanel.revalidate(); // Refresh the layout
        mainPanel.repaint();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FoodOrderApp app = new FoodOrderApp();
                app.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
