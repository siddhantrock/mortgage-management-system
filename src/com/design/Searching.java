package com.design;

import com.commodity.Thing;
import com.database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Searching extends javax.swing.JFrame 
{

    Connect connect;
    
    public Searching() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        table_combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        thing_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        date_dtpicker = new com.toedter.calendar.JDateChooser();
        search_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        pending_btn = new javax.swing.JButton();
        show_all_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(Searching.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Select table");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 72, -1, -1));

        table_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getContentPane().add(table_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 69, 187, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Enter id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 176, -1, -1));

        id_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getContentPane().add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 176, 187, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("Enter thing");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 271, -1, -1));

        thing_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getContentPane().add(thing_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 271, 187, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("Enter date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 370, -1, -1));

        date_dtpicker.setDateFormatString("MM/dd/yyyy");
        date_dtpicker.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getContentPane().add(date_dtpicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 370, 187, -1));

        search_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 460, -1, -1));

        home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        getContentPane().add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 460, -1, -1));

        pending_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        pending_btn.setText("Pending");
        pending_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pending_btnActionPerformed(evt);
            }
        });
        getContentPane().add(pending_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, -1));

        show_all_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        show_all_btn.setText("Show all");
        show_all_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_all_btnActionPerformed(evt);
            }
        });
        getContentPane().add(show_all_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(877, 460, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -9, 1310, 1320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new Home().setVisible(true);
                connect.closeConnection();
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_home_btnActionPerformed
    
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                connect = new Connect();
                ResultSet rs = connect.showTables();
                
                try 
                {
                    while(rs.next())
                    {
                        String table = rs.getString(1);
                
                        if(table.length() >= 10)
                        {
                            table_combo.addItem(table);
                        }
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(Searching.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
    }//GEN-LAST:event_formWindowOpened

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                int id;
                String thing="",date="";
        
                try
                {
                    id = Integer.parseInt(id_txt.getText());
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(Searching.this, "Please enter valid id");
                    return;
                }
                
                try
                {
                    thing = thing_txt.getText().trim().toUpperCase();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(Searching.this, "Please enter valid thing");
                    return;
                }
                
                if(date_dtpicker.getDate() != null)
                {
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                    date = sdf.format(date_dtpicker.getDate());
                }
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                try
                {
                    date = sdf.format(date_dtpicker.getDate());
                }
                catch(NullPointerException e)
                {
                    
                }
                
                Thing obj=null;
                
                if(thing.length() == 0 && date.length() == 0)
                {
                    obj = new Thing(id);
                }
                else if(thing.length() != 0 && date.length() == 0)
                {
                    obj = new Thing(id,thing);
                }
                
                else if(thing.length() == 0 && date.length() != 0)
                {
                    obj = new Thing(id,date,false);
                }
                
                else if(thing.length() != 0 && date.length() != 0)
                {
                    obj = new Thing(id,thing,date);
                }
                
                try 
                {
                    obj.searchValidate();
                }
                catch (Exception ex) 
                {
                    JOptionPane.showMessageDialog(Searching.this, ex.getMessage());
                    return;
                }
                
                ResultSet rs = obj.retriveThing(connect, table_combo.getItemAt(table_combo.getSelectedIndex()),false,false);
                
                try 
                {
                    if(rs.next())
                    {
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(Searching.this, "No record found");
                        return;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(Searching.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                DisplayRecord dr = new DisplayRecord();
                dr.setVisible(true);
                dr.setResultSet(rs,table_combo.getItemAt(table_combo.getSelectedIndex()),connect);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_search_btnActionPerformed

    private void pending_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pending_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                ResultSet rs = connect.getPendingRecord();
               
                try 
                {
                    if(rs.next())
                    {
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(Searching.this, "No record found");
                        return;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(Searching.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                DisplayRecord dr = new DisplayRecord();
                dr.setVisible(true);
                dr.setResultSet(rs,"pending",connect);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_pending_btnActionPerformed

    private void show_all_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_all_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                ResultSet rs = connect.showAllRecord(table_combo.getItemAt(table_combo.getSelectedIndex()));
                
                try 
                {
                    if(rs.next())
                    {
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(Searching.this, "No record found");
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(Searching.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                DisplayRecord dr = new DisplayRecord();
                dr.setVisible(true);
                dr.setResultSet(rs,table_combo.getItemAt(table_combo.getSelectedIndex()),connect);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_show_all_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Searching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Searching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Searching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Searching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Searching().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date_dtpicker;
    private javax.swing.JButton home_btn;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton pending_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JButton show_all_btn;
    private javax.swing.JComboBox<String> table_combo;
    private javax.swing.JTextField thing_txt;
    // End of variables declaration//GEN-END:variables
}
