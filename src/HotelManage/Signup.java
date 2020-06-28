/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManage;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Mizanur Rahman
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtpass1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_hide_20px_3.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 330, 34, 40);

        txtpass.setBackground(new java.awt.Color(223, 230, 238));
        txtpass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtpass.setOpaque(false);
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
        });
        getContentPane().add(txtpass);
        txtpass.setBounds(140, 340, 308, 38);

        txtname.setBackground(new java.awt.Color(223, 230, 238));
        txtname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtname.setOpaque(false);
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname);
        txtname.setBounds(140, 120, 300, 40);

        txtemail.setBackground(new java.awt.Color(223, 230, 238));
        txtemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtemail.setOpaque(false);
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail);
        txtemail.setBounds(140, 190, 300, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_male_user_80px_2.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 0, 110, 110);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 430, 90, 30);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_hide_20px_3.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(420, 250, 34, 40);

        txtpass1.setBackground(new java.awt.Color(223, 230, 238));
        txtpass1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtpass1.setOpaque(false);
        getContentPane().add(txtpass1);
        txtpass1.setBounds(140, 260, 308, 38);

        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("your e-mail");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 180, 110, 14);

        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 240, 90, 14);

        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("comfirm password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 310, 150, 14);

        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("your name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 100, 120, 14);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_cancel_20px.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(670, 0, 20, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/purple-petaled-flower-on-white-surface-934011.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

        setSize(new java.awt.Dimension(694, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    int count=0;
    String [] imagename={"icons8_eye_20px_2.png","icons8_hide_20px_3.png","icons8_eye_20px_2.png","icons8_hide_20px_3.png","icons8_eye_20px_2.png","icons8_hide_20px_3.png"};
    
    void ViewIconSet(JLabel label,JPasswordField jp){
        
         ImageIcon[] ic=new ImageIcon[6];
        for (int i = 0; i < ic.length; i++) {
           // ImageIcon imageIcon = ic[i];
            
        
        ic [i]=new ImageIcon(getClass().getResource("/HotelManage/Picture/"+imagename[i]));
        }
        //setIcon(iic);
        if(count<ic.length)
        {
            label.setIcon(ic[count]);
            count++;
            if(count==1){
               jp.setEchoChar((char)0);
           }
            else if(count==2){
               jp.setEchoChar('*'); 
            }
             else if(count==3){
               jp.setEchoChar((char)0); 
            }
              else if(count==4){
               jp.setEchoChar('*'); 
            }
              else if(count==5){
               jp.setEchoChar((char)0); 
            }
           else{
               jp.setEchoChar('*');
           }
        }
        
    }
    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        ViewIconSet(jLabel8,txtpass);

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
          ViewIconSet(jLabel9,txtpass1);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
        // TODO add your handling code here:
        
        String pass=txtpass1.getText().toString();
        String com=txtpass.getText().toString();
        if(pass.contains(com)){
            
        }
        else{
            
            JOptionPane.showMessageDialog(this, "your password is Wrong!");
            txtpass.setText("");
            txtpass.requestFocus();
        }
    }//GEN-LAST:event_txtpassKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            MyConnection mc=new  MyConnection();
            mc.Myconnect();
            String name=txtname.getText().toString();
            
            String email=txtemail.getText().toString();
            String pas=txtpass1.getText().toString();
            String m="INSERT INTO `admin`VALUES (?,?,?)";
            mc.pst=mc.con.prepareCall(m);
            mc.pst.setString(1, name);
            mc.pst.setString(2, email);
            mc.pst.setString(3, pas);
            int a=mc.pst.executeUpdate();
            if(a>0){
                new Login().setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "you cannot signup!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JPasswordField txtpass1;
    // End of variables declaration//GEN-END:variables
}