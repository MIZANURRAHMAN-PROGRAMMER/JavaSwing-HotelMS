/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManage;

import com.toedter.calendar.JCalendar;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.PrintJob;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mizanur Rahman
 */
public class Checkout extends javax.swing.JFrame {

    /**
     * Creates new form Checkout
     */
    public Checkout() {
        initComponents();
        setId();
        dateSet();
    }

       Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    Statement st=null;
    void Myconnect(){
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
           
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void Myconnection1(){
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
           st=con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void printBill(){
        PrinterJob prJob=PrinterJob.getPrinterJob();
        prJob.setJobName("Printing.....");
        prJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if(pageIndex>0){
                    return Printable.NO_SUCH_PAGE;
                    
                    
                    
                }
                Graphics2D gp2d=(Graphics2D)graphics;
                gp2d.translate(pageFormat.getImageableX()*2,pageFormat.getImageableY()*2);
                gp2d.scale(0.5, 0.5);
                
                jPanel1.print(gp2d);
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           
            return Printable.PAGE_EXISTS;
            }
        });
        boolean pp=prJob.printDialog();
        if(pp){
            try {
                prJob.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
    void checkup(){
        try {
            Myconnect();
            String id=txtid.getSelectedItem().toString();
            String m="UPDATE `cutomer` SET `checked`='NO' WHERE `id_num`=?";
            pst=con.prepareCall(m);
            pst.setString(1,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }
    void roomup(){
        try {
            Myconnection1();
            String room=txtroom.getText().toString();
            String m="UPDATE `room` SET `availity`='Available' WHERE `room_no`='"+room+"'";
            st.executeUpdate(m);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtid = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtroom = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtday = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtdep = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        txtpaid = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 144, 208));
        jPanel2.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_checked_user_male_50px.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(390, -40, 119, 160);

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Check out");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(250, 30, 740, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1180, 100);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(null);

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Card Number:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(200, 40, 110, 19);

        txtid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtid.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                txtidPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(txtid);
        txtid.setBounds(330, 30, 260, 40);

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Name:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(230, 90, 80, 19);

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname);
        txtname.setBounds(330, 80, 260, 40);

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Room No:");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(200, 130, 110, 40);

        txtroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtroomActionPerformed(evt);
            }
        });
        txtroom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtroomKeyReleased(evt);
            }
        });
        jPanel1.add(txtroom);
        txtroom.setBounds(330, 130, 260, 40);

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("No Of Days:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(220, 180, 90, 40);

        txtday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdayActionPerformed(evt);
            }
        });
        jPanel1.add(txtday);
        txtday.setBounds(330, 180, 260, 40);

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Deposit:");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(160, 240, 150, 30);

        txtdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdepActionPerformed(evt);
            }
        });
        jPanel1.add(txtdep);
        txtdep.setBounds(330, 240, 260, 40);

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Total Amount:");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(160, 290, 150, 30);

        txtamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountActionPerformed(evt);
            }
        });
        jPanel1.add(txtamount);
        txtamount.setBounds(330, 290, 260, 40);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Date:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(445, 1, 57, 28);

        date.setText("jLabel9");
        jPanel1.add(date);
        date.setBounds(508, 1, 123, 28);

        txtpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaidActionPerformed(evt);
            }
        });
        jPanel1.add(txtpaid);
        txtpaid.setBounds(330, 340, 260, 40);

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Paid Amount:");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(160, 340, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(200, 110, 820, 390);

        jPanel3.setBackground(new java.awt.Color(102, 144, 208));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Paid Amount ");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(480, 10, 320, 43);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_paypal_30px_2.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel3.add(jLabel5);
        jLabel5.setBounds(490, 80, 80, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/mlogo.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel3.add(jLabel6);
        jLabel6.setBounds(580, 80, 110, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/Nagad-Logo.wine.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel3.add(jLabel7);
        jLabel7.setBounds(700, 80, 80, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("With");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(520, 50, 188, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 560, 1180, 130);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 510, 140, 40);

        jButton2.setText("Check Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(460, 510, 140, 40);

        setSize(new java.awt.Dimension(1196, 729));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtroomActionPerformed

    private void txtroomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtroomKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtroomKeyReleased

    private void txtdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdayActionPerformed

    private void txtdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdepActionPerformed

    private void txtamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamountActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int b=Integer.parseInt(txtpaid.getText().toString());
        if(s<=b){
             roomup();
             checkup();
            printBill();
            txtid.setSelectedIndex(0);
            txtname.setText("");
            txtroom.setText("");
            txtday.setText("");
            txtamount.setText("");
            txtpaid.setText("");
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Your paid amount is insafficent!");
            //txtpaid.setText("");
            txtpaid.requestFocus();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

        void dateSet(){
       JCalendar d=new JCalendar();
         SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
            String mm=sd.format(d.getDate());
       date.setText(mm);
        
    }
        int s;
    private void txtidPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_txtidPopupMenuWillBecomeInvisible
        try {
            s=0;
            String da="";
            int a=0;
            int b=0;
            // TODO add your handling code here:
            Myconnection1();
            String id=txtid.getSelectedItem().toString();
            String m="SELECT `name`,`room`,`deposite`,`room_Price`,`date` FROM `cutomer` WHERE `id_num`='"+id+"'";
            rs=st.executeQuery(m);
            while(rs.next()){
                txtname.setText(rs.getString(1));
                txtroom.setText(rs.getString(2));
                 da=rs.getString(5);
                 a=rs.getInt(3);
                txtdep.setText(a+"");
                b=rs.getInt(4);
                
            }
           
            JCalendar d=new JCalendar();
         SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
            String mm=sd.format(d.getDate());
             LocalDate datebefore=LocalDate.parse(da);
           LocalDate dateafter=LocalDate.parse(mm);
           long noDays=ChronoUnit.DAYS.between(datebefore,dateafter);
           txtday.setText(""+noDays);
            s=(int) ((b*noDays)-a);
           txtamount.setText(s+"");
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(DateTimeParseException ex){
            JOptionPane.showMessageDialog(this, ex);
        }
        
        
    }//GEN-LAST:event_txtidPopupMenuWillBecomeInvisible

    private void txtpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    void setId(){
        try {
            Myconnect();
            txtid.removeAllItems();
            //Myconnect();
            txtid.addItem("Select");
            String m="SELECT `id_num` FROM `cutomer` WHERE `checked`='YES'";
            pst=con.prepareCall(m);
            rs=pst.executeQuery();
            while(rs.next()){
              
                txtid.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtday;
    private javax.swing.JTextField txtdep;
    private javax.swing.JComboBox txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpaid;
    private javax.swing.JTextField txtroom;
    // End of variables declaration//GEN-END:variables
}