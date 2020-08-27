package com.design;

import com.commodity.Thing;
import com.database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.HashMap;

public class AddRecord extends javax.swing.JFrame 
{
    Connect connect;
    int total;
    
    public AddRecord() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        table_combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        thing_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        type_combo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        n_gold_combo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        n_silver_combo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        n_total_combo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        date_dtpicker = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        interest_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        g_gold_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        g_silver_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rupess_txt = new javax.swing.JTextField();
        table_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(AddRecord.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Choose table");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 14, -1, -1));

        table_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel1.add(table_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 11, 186, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Enter id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 99, -1, -1));

        id_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel1.add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 96, 186, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("Enter thing");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 191, -1, -1));

        thing_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel1.add(thing_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 191, 186, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("Select Type");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 293, -1, -1));

        type_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        type_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GOLD", "SILVER", "BOTH" }));
        type_combo.setSelectedIndex(-1);
        type_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                type_comboItemStateChanged(evt);
            }
        });
        jPanel1.add(type_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 290, 186, -1));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setText("Number of gold");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 384, -1, -1));

        n_gold_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        n_gold_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        n_gold_combo.setSelectedIndex(-1);
        n_gold_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                n_gold_comboItemStateChanged(evt);
            }
        });
        jPanel1.add(n_gold_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 381, 186, -1));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel6.setText("Number of silver");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 501, -1, -1));

        n_silver_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        n_silver_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        n_silver_combo.setSelectedIndex(-1);
        n_silver_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                n_silver_comboItemStateChanged(evt);
            }
        });
        jPanel1.add(n_silver_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 498, 186, -1));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel7.setText("Number of total");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 609, -1, -1));

        n_total_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        n_total_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        n_total_combo.setSelectedIndex(-1);
        n_total_combo.setEnabled(false);
        jPanel1.add(n_total_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 606, 186, -1));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel8.setText("Enter date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 716, -1, -1));

        date_dtpicker.setDateFormatString("MM/dd/yyyy");
        date_dtpicker.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        date_dtpicker.setMaxSelectableDate(new java.util.Date(253370748694000L));
        jPanel1.add(date_dtpicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 716, 186, -1));

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel9.setText("Enter interest");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 807, -1, -1));

        interest_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel1.add(interest_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 807, 186, -1));

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel10.setText("Gross weight of gold");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 920, -1, -1));

        g_gold_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel1.add(g_gold_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 920, 186, -1));

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel11.setText("Gross weight of silver");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 1036, -1, -1));

        g_silver_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel1.add(g_silver_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 1036, 186, -1));

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel12.setText("Enter rupess");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 1152, -1, -1));

        rupess_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel1.add(rupess_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 1152, 186, -1));

        table_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        table_btn.setText("Create table");
        table_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_btnActionPerformed(evt);
            }
        });
        jPanel1.add(table_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 1261, -1, -1));

        add_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        jPanel1.add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 1261, -1, -1));

        home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        jPanel1.add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 1261, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -19, 1320, 1330));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1191, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1475, Short.MAX_VALUE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                String year = JOptionPane.showInputDialog(AddRecord.this,"Please enter the year");
                boolean flag = connect.createTable(year);
                if(flag == true)
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Table created successfully");
                }
                else
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Something went wrong please try again later");
                }
                new Home().setVisible(true);
                connect.closeConnection();
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_table_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        new Thread(new Runnable()
        {
            public void run()
            {
                connect = new Connect();
                ResultSet rs = connect.showTables();
                Date obj = new Date();
                date_dtpicker.setDate(obj);
                
                try 
                {
                    while(rs.next())
                    {
                        String table = rs.getString(1);
                
                        if(table.length() == 10)
                        {
                            table_combo.addItem(table);
                        }
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
        
    }//GEN-LAST:event_formWindowOpened

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

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        
        new Thread(new Runnable()
        {
            public void run()
            {
                int id=0,n_gold=0,n_silver=0,n_total=0,rupess=0;
                float interest=0,g_gold=0,g_silver=0;
                String thing,type,date;
                
                try
                {
                    id = Integer.parseInt(id_txt.getText());
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Please enter valid id");
                    return;
                }
                
                thing = thing_txt.getText().trim().toUpperCase();
                
                try
                {
                    type = type_combo.getItemAt(type_combo.getSelectedIndex()).trim().toUpperCase();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Please select valid type");
                    return;
                }
                
                try
                {
                    n_gold = Integer.parseInt(n_gold_combo.getItemAt(n_gold_combo.getSelectedIndex()));
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Please select valid number of gold");
                    return;
                }
                
                try
                {
                    n_silver = Integer.parseInt(n_silver_combo.getItemAt(n_silver_combo.getSelectedIndex()));
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Please select valid number of silver");
                    return;
                }
                
                try
                {
                    n_total = Integer.parseInt(n_total_combo.getItemAt(n_total_combo.getSelectedIndex()));
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Please select valid number of total");
                    return;
                }
                
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                date = sdf.format(date_dtpicker.getDate());
                
                try
                {
                    interest = Float.parseFloat(interest_txt.getText());
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Please enter valid interest rate");
                    return;
                }
                
                try
                {
                    g_gold = Float.parseFloat(g_gold_txt.getText());
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Please enter valid gross weight of gold");
                    return;
                }
                
                try
                {
                    g_silver = Float.parseFloat(g_silver_txt.getText());
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Please enter valid gross weight of silver");
                    return;
                }
                
                try
                {
                    rupess = Integer.parseInt(rupess_txt.getText());
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Please enter valid rupess");
                    return;
                }
                
                Thing obj = new Thing(id,thing,type,n_gold,n_silver,n_total,date,interest,g_gold,g_silver,rupess);
                try
                {
                    obj.validate();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(AddRecord.this, e.getMessage());
                    return;
                }
                
                boolean flag = obj.insertThing(connect,table_combo.getItemAt(table_combo.getSelectedIndex()),false);
                if(flag == true)
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Record inserted successfully");
                }
                else
                {
                    JOptionPane.showMessageDialog(AddRecord.this, "Something went wrong please try again later");
                }
                
                new Home().setVisible(true);
                connect.closeConnection();
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_add_btnActionPerformed

    private void type_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_type_comboItemStateChanged

        new Thread(new Runnable()
        {
            public void run()
            {
                switch (type_combo.getItemAt(type_combo.getSelectedIndex())) 
                {
                    case "GOLD":
                        n_gold_combo.setEnabled(true);
                        n_gold_combo.setSelectedIndex(-1);
                        g_gold_txt.setEnabled(true);
                        g_gold_txt.setText("");
                        n_silver_combo.setSelectedIndex(0);
                        n_silver_combo.setEnabled(false);
                        n_total_combo.setEnabled(false);
                        g_silver_txt.setText("0");
                        g_silver_txt.setEnabled(false);
                        break;
                    
                    case "SILVER":
                        n_silver_combo.setEnabled(true);
                        n_silver_combo.setSelectedIndex(-1);
                        g_silver_txt.setEnabled(true);
                        g_silver_txt.setText("");
                        n_gold_combo.setSelectedIndex(0);
                        n_gold_combo.setEnabled(false);
                        n_total_combo.setEnabled(false);
                        g_gold_txt.setText("0");
                        g_gold_txt.setEnabled(false);
                        break;
                        
                    case "BOTH":
                        n_gold_combo.setEnabled(true);
                        n_gold_combo.setSelectedIndex(-1);
                        g_gold_txt.setEnabled(true);
                        g_gold_txt.setText("");
                        
                        n_silver_combo.setEnabled(true);
                        n_silver_combo.setSelectedIndex(-1);
                        g_silver_txt.setEnabled(true);
                        g_silver_txt.setText("");
                    default:
                        break;
                }
            }
        }).start();
        
    }//GEN-LAST:event_type_comboItemStateChanged

    private void n_gold_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_n_gold_comboItemStateChanged

        new Thread(new Runnable()
        {
            public void run()
            {
                if(n_gold_combo.getSelectedIndex() >= 0)
                {
                    total = Integer.parseInt(n_gold_combo.getItemAt(n_gold_combo.getSelectedIndex()));
                }

                n_total_combo.setSelectedIndex(total);
            }
        }).start();
        
    }//GEN-LAST:event_n_gold_comboItemStateChanged

    private void n_silver_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_n_silver_comboItemStateChanged

        new Thread(new Runnable()
        {
            public void run()
            {
                if(n_silver_combo.getSelectedIndex() >= 0)
                {
                    total = Integer.parseInt(n_silver_combo.getItemAt(n_silver_combo.getSelectedIndex()));
                }
                
                n_total_combo.setSelectedIndex(total);
            }
        }).start();
        
    }//GEN-LAST:event_n_silver_comboItemStateChanged
    
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
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private com.toedter.calendar.JDateChooser date_dtpicker;
    private javax.swing.JTextField g_gold_txt;
    private javax.swing.JTextField g_silver_txt;
    private javax.swing.JButton home_btn;
    private javax.swing.JTextField id_txt;
    private javax.swing.JTextField interest_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> n_gold_combo;
    private javax.swing.JComboBox<String> n_silver_combo;
    private javax.swing.JComboBox<String> n_total_combo;
    private javax.swing.JTextField rupess_txt;
    private javax.swing.JButton table_btn;
    private javax.swing.JComboBox<String> table_combo;
    private javax.swing.JTextField thing_txt;
    private javax.swing.JComboBox<String> type_combo;
    // End of variables declaration//GEN-END:variables
}
