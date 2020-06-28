/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManage;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mizanur Rahman
 */
public class Room extends javax.swing.JFrame {

    /**
     * Creates new form Room
     */
    public Room() {
        initComponents();
         Toolkit t1=Toolkit.getDefaultToolkit();
        int w=(int)t1.getScreenSize().getWidth();
        int h=(int)t1.getScreenSize().getHeight();
        this.setSize(w, h);
         txtroom.setText(autoid()+"");
         txtav.requestFocus();
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtroom = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtcl = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtbed = new javax.swing.JComboBox();
        txtav = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Room status");
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 144, 208));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("room status");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(500, 20, 470, 40);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/logso.jpg"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(120, 10, 140, 120);

        txtsearch.setBackground(new java.awt.Color(102, 144, 208));
        txtsearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsearch.setForeground(new java.awt.Color(255, 255, 255));
        txtsearch.setText("Search");
        txtsearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtsearch.setOpaque(false);
        txtsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtsearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtsearchMouseExited(evt);
            }
        });
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearchKeyPressed(evt);
            }
        });
        jPanel2.add(txtsearch);
        txtsearch.setBounds(580, 90, 270, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_search_30px_5.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(550, 80, 50, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1500, 170);

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
        getContentPane().add(txtroom);
        txtroom.setBounds(220, 290, 250, 40);

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        txtprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpriceKeyReleased(evt);
            }
        });
        getContentPane().add(txtprice);
        txtprice.setBounds(220, 410, 250, 40);

        txtcl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Cleaned", "Dirty" }));
        getContentPane().add(txtcl);
        txtcl.setBounds(220, 370, 250, 40);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ROOM NUMBER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 300, 111, 19);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Availabelity:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 330, 100, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 420, 36, 19);

        txtbed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtbed.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Double", "Single" }));
        getContentPane().add(txtbed);
        txtbed.setBounds(220, 450, 250, 40);

        txtav.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtav.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Available", "Ocupied" }));
        getContentPane().add(txtav);
        txtav.setBounds(220, 330, 250, 40);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bed Type");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 460, 65, 19);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cleaning Status");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 380, 120, 19);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 230, 490, 290);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Availablity", "Cleaning Status", "Price", "Bed Type"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(560, 230, 730, 440);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_update_20px_2.png"))); // NOI18N
        jButton5.setText("update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(210, 540, 120, 30);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_delete_bin_20px_2.png"))); // NOI18N
        jButton4.setText("delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(350, 540, 120, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_cancel_20px.png"))); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 580, 120, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_erase_20px_1.png"))); // NOI18N
        jButton1.setText("clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 580, 120, 30);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_show_property_20px_2.png"))); // NOI18N
        jButton6.setText("show");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(80, 580, 120, 30);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/icons8_add_20px_2.png"))); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 540, 120, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelManage/Picture/sara-dubler-Koei_7yYtIo-unsplash (2).jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 140, 1490, 670);

        setBounds(0, 0, 1433, 802);
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseClicked
        // TODO add your handling code here:
        txtsearch.setText("");
    }//GEN-LAST:event_txtsearchMouseClicked

    private void txtsearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseEntered
        // TODO add your handling code here:
        //txtsearch.setText("");
    }//GEN-LAST:event_txtsearchMouseEntered

    private void txtsearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseExited
        // TODO add your handling code here:
        txtsearch.setText("Search");
    }//GEN-LAST:event_txtsearchMouseExited

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyPressed
        // TODO add your handling code here:

        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try {
                Myconnect();
                DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
                dt.setRowCount(0);
                String id=txtsearch.getText().toString();
                String m="SELECT *FROM `room` where `room_no`=?";
                pst=con.prepareCall(m);
                pst.setString(1, id);
                rs=pst.executeQuery();
                while(rs.next()){
                    dt.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});

                }
            } catch (SQLException ex) {
                Logger.getLogger(Add_Employee.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_txtsearchKeyPressed

    private void txtroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtroomActionPerformed

    private void txtroomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtroomKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtroomKeyReleased

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpriceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Update data
        try {
            // TODO add your handling code here:
            //dateSet();
            Myconnection1();
            String id=txtroom.getText().toString();
            String name=txtprice.getText().toString();
            String cl=txtcl.getSelectedItem().toString();
           String av=txtav.getSelectedItem().toString();
           String bed=txtbed.getSelectedItem().toString();
           String price=txtprice.getText().toString();
            String m="UPDATE `room` SET `availity`='"+av+"',`clean`='"+cl+"',`price`='"+price+"',`bed`='"+bed+"' WHERE `room_no`='"+id+"'";

            /* pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, desig);
            pst.setString(4, ad);
            pst.setString(5, email);
            pst.setString(6, acc);
            pst.setString(7, cont);
            pst.setString(8, date);
            pst.setString(9, sal);*/
            int a=st.executeUpdate(m);
            if(a>0){

                JOptionPane.showMessageDialog(this, "Update Succesfull");
                Cl_panel();

                ShowData();
            }
            else{
                JOptionPane.showMessageDialog(this, "Cannot Update!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Add_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            Myconnect();
            String id=txtroom.getText().toString();
            String m="DELETE FROM `room`WHERE `room_no`=?";
            pst=con.prepareCall(m);
            pst.setString(1, id);
            int a=pst.executeUpdate();
            if(a>0){

                JOptionPane.showMessageDialog(this, "Delete Succesfult");
                ShowData();
                Cl_panel();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cutomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException n){
            txtroom.requestFocus();
            JOptionPane.showMessageDialog(this, "Please!Give Id number.");

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    void ShowData(){
        try {
            Myconnect();
            DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
            dtm.setRowCount(0);
            String m="SELECT *FROM `room`";
            pst=con.prepareCall(m);
            rs=pst.executeQuery();
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
    }
    int autoid(){
        int a=0;
        try {
            Myconnect();
            String m="SELECT `room_no` FROM`room` ORDER BY `room_no`ASC";
            pst=con.prepareCall(m);
            rs=pst.executeQuery();
            while(rs.next()){
                a=rs.getInt(1);
            }
            a++;
        } catch (SQLException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      return a;  
    }
    
    
    void Cl_panel(){
        txtroom.setText("");
        txtav.setSelectedIndex(0);
        txtbed.setSelectedIndex(0);
        txtcl.setSelectedIndex(0);
        txtprice.setText("");
        
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // dataadd();
        Cl_panel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ShowData();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            //dateSet();
            Myconnect();
            String id=txtroom.getText().toString();
            String price=txtprice.getText().toString();
            String avail=txtav.getSelectedItem().toString();
            //String ad=txtad.getText().toString();
            String clean=txtcl.getSelectedItem().toString();
            String bed=txtbed.getSelectedItem().toString();
            String m="INSERT INTO `room` VALUES(?,?,?,?,?)";
            pst=con.prepareCall(m);
            pst.setString(1, id);
            pst.setString(2, avail);
            pst.setString(3, clean);
            pst.setString(4, price);
            pst.setString(5, bed);
            
           
            int a=pst.executeUpdate();
            if(a>0){

                JOptionPane.showMessageDialog(this, "Added Succesfull");
                Cl_panel();
                txtroom.setText(autoid()+"");
                ShowData();
            }
            else{
                JOptionPane.showMessageDialog(this, "Cannot Added!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Add_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception cr){
            JOptionPane.showMessageDialog(this, "Enter data");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    void SelectedTablevaluesetTable(String x,JComboBox com){
        int p=0;
       int a=com.getItemCount();
        for (int i = 0; i !=a; i++) {
            String m=com.getItemAt(i).toString();
            if(m.contains(x))
            {
               p=i; 
                
            }
            
        }
        com.setSelectedIndex(p);
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
        txtroom.setText(dt.getValueAt(jTable1.getSelectedRow(),0).toString());
         //txtname.setText(dt.getValueAt(jTable1.getSelectedRow(),1).toString());
         String p=dt.getValueAt(jTable1.getSelectedRow(),1).toString();
        // JOptionPane.showMessageDialog(this, p);
          SelectedTablevaluesetTable(p,txtav);
          txtprice.setText(dt.getValueAt(jTable1.getSelectedRow(),3).toString());
         String pm=dt.getValueAt(jTable1.getSelectedRow(),2).toString();
        // JOptionPane.showMessageDialog(this, p);
          SelectedTablevaluesetTable(pm,txtcl);
          
           String pmn=dt.getValueAt(jTable1.getSelectedRow(),4).toString();
        // JOptionPane.showMessageDialog(this, p);
          SelectedTablevaluesetTable(pmn,txtbed);
          
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox txtav;
    private javax.swing.JComboBox txtbed;
    private javax.swing.JComboBox txtcl;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtroom;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
