/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class cart2 extends javax.swing.JFrame {
    
   

    /**
     * Creates new form cart2
     */
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public cart2() {
        initComponents();
        Connect();
    }
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/storej", "root", "");
            System.out.println("Database Connect");
        } 
        catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Connection Lost " + ex);
        }
        
    }
    
    public static int stocks(int stocks){
        int stock1 = stocks;
        return stock1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxt_qty = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(java.awt.Color.gray);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product ID :");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRODUCT INFORMATION");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product Name :");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Stocks :");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("-");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 40));

        jtxt_qty.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtxt_qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt_qty.setText("0");
        jtxt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxt_qtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_qtyKeyTyped(evt);
            }
        });
        jPanel8.add(jtxt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 80, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("+");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, 40));

        jPanel10.setBackground(new java.awt.Color(153, 255, 153));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel10ComponentHidden(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Add_Shopping_Cart_50px.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 60));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 70, 60));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sub Total :");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Unit Price:");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Add to Cart");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 60, 20));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Quantity:");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel2.setOpaque(true);
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 140, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel3.setOpaque(true);
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel4.setOpaque(true);
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel5.setOpaque(true);
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 80, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel6.setOpaque(true);
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 80, 20));

        jLabel20.setText("jLabel20");
        jLabel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, 120));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("jLabel10");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 40, 40));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_qtyKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        
    }//GEN-LAST:event_jtxt_qtyKeyTyped

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
           int qty1 = Integer.parseInt(jtxt_qty.getText());
        int total1 ;
        int stock = Integer.parseInt(jLabel5.getText());
        total1 = stock - qty1;
        //IF MAGKULANG IT STOCK
         if (total1 < 0){
            JOptionPane.showMessageDialog(null, "Sorry, Insuficient Stocks", "Insuficient", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }//IF UBOS NA IT STOCK
         else if (stock == 0){
            JOptionPane.showMessageDialog(null, "Out Of Stock", "Sorry", JOptionPane.ERROR_MESSAGE);
            this.dispose();
            //IF WARAY PROBLEMA
        }else{
        
        int response = JOptionPane.showConfirmDialog(null, "That Would Be: " + jLabel2.getText() +"₱", "Are You Sure? ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        //KUN MAG YES KA
        if(response == JOptionPane.YES_OPTION){
        
        //IF WARAY MAG BUTANG HIN QTY
        if(jtxt_qty.getText().equals("0") || jtxt_qty.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Quantity");
        }
        //KUN MAG BUTANG haha
        else{
            JOptionPane.showMessageDialog(null, "Product Added to Cart");
        Purchase.AddRowTable(new Object[]{  
                                            jLabel3.getText(),
                                            jLabel4.getText(),
                                            jLabel6.getText(),
                                            jtxt_qty.getText(),
                                            jLabel2.getText()
        });
        this.dispose();
       Purchase.getTotal();
        /*new Purchase(new Object[]{jLabel3.getText(),
                                            jLabel4.getText(),
                                            jLabel6.getText(),
                                            jtxt_qty.getText(),
                                            jLabel2.getText()}).setVisible(true);
            setVisible(false);
            //
        */
        } 
        //KUN PIDLITON IT X
        }else{
            JOptionPane.showMessageDialog(null, "Oh Sure Take Your Time :)");
            this.dispose();
        }
        }

    }//GEN-LAST:event_jPanel10MouseClicked

    private void jtxt_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_qtyKeyReleased
        // TODO add your handling code here:
        double total = 0;
        double qty = Double.parseDouble(jtxt_qty.getText());
        double price = Double.parseDouble(jLabel6.getText());
        cart2 c = new cart2();
        
        
         total = qty * price;
        jLabel2.setText(String.valueOf(total));
        
         
    }//GEN-LAST:event_jtxt_qtyKeyReleased

    private void jPanel10ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel10ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10ComponentHidden

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        int qty1 = Integer.parseInt(jtxt_qty.getText());
        int total1 ;
        int stock = Integer.parseInt(jLabel5.getText());
        total1 = stock - qty1;
        
         if (total1 < 0){
            JOptionPane.showMessageDialog(null, "Sorry, Insuficient Stocks", "Insuficient", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }else if (stock == 0){
            JOptionPane.showMessageDialog(null, "Out Of Stock", "Sorry", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }else{
        
        int response = JOptionPane.showConfirmDialog(null, "That Would Be: " + jLabel2.getText() +"₱", "Are You Sure? ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(response == JOptionPane.YES_OPTION){
         
        
        
        
        if(jtxt_qty.getText().equals("0") || jtxt_qty.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Quantity");
        }
        
        else{
        Purchase.jtable.setValueAt(total1, Integer.parseInt(jLabel10.getText()), 2);
        Purchase.AddRowTable(new Object[]{  
                                            jLabel3.getText(),
                                            jLabel4.getText(),
                                            jLabel6.getText(),
                                            jtxt_qty.getText(),
                                            jLabel2.getText()
                                            
        });
            JOptionPane.showMessageDialog(null, "Product Added to Cart");
        this.dispose();
       
            
            Purchase.getTotal();
        
        }   
        }else{
            JOptionPane.showMessageDialog(null, "Oh Sure Take Your Time :)");
            this.dispose();
        }
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

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
            java.util.logging.Logger.getLogger(cart2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cart2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cart2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cart2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cart2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel8;
    public javax.swing.JTextField jtxt_qty;
    // End of variables declaration//GEN-END:variables
}
