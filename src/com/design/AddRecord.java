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

public class AddRecord extends javax.swing.JFrame 
{
    Connect connect;
    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(AddRecord.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Choose table");

        table_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Enter id");

        id_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("Enter thing");

        thing_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("Select Type");

        type_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        type_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gold", "Silver", "Both" }));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setText("Number of gold");

        n_gold_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        n_gold_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel6.setText("Number of silver");

        n_silver_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        n_silver_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel7.setText("Number of total");

        n_total_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        n_total_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel8.setText("Enter date");

        date_dtpicker.setDateFormatString("MM/dd/yyyy");
        date_dtpicker.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        date_dtpicker.setMaxSelectableDate(new java.util.Date(253370748694000L));

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel9.setText("Enter interest");

        interest_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel10.setText("Gross weight of gold");

        g_gold_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel11.setText("Gross weight of silver");

        g_silver_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel12.setText("Enter rupess");

        rupess_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        table_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        table_btn.setText("Create table");
        table_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_btnActionPerformed(evt);
            }
        });

        add_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(table_btn)
                        .addGap(230, 230, 230)
                        .addComponent(add_btn)
                        .addGap(175, 175, 175)
                        .addComponent(home_btn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(442, 442, 442)
                                .addComponent(g_gold_txt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(506, 506, 506)
                                .addComponent(interest_txt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(524, 524, 524)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(type_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(thing_txt)
                                    .addComponent(n_gold_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(n_silver_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(n_total_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(date_dtpicker, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(436, 436, 436)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(g_silver_txt)
                                    .addComponent(rupess_txt)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(509, 509, 509)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(table_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(id_txt))))
                        .addGap(211, 211, 211))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(table_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(thing_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(type_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(n_gold_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(n_silver_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(n_total_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(date_dtpicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(interest_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(g_gold_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(g_silver_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(rupess_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(table_btn)
                    .addComponent(add_btn)
                    .addComponent(home_btn))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1464, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                connect = null;
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
                
                type = type_combo.getItemAt(type_combo.getSelectedIndex()).trim().toUpperCase();
                
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
