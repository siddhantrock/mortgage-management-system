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

public class UpdateRecord extends javax.swing.JFrame 
{
    int id;
    Connect connect;
    Thing thing;
    String table;
    DisplayRecord display_record;
    ResultSet rs;
    
    boolean id_check,thing_check,type_check,n_gold_check,n_silver_check,n_total_check,date_check,interest_check,g_gold_check,g_silver_check,rupess_check;
    
    public UpdateRecord() 
    {
        initComponents();
    }

    public void setData(int id,String table , DisplayRecord display_record , Connect connect)
    {
        this.id = id;
        this.table = table;
        this.display_record = display_record;
        this.connect = connect;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        thing_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        type_combo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        n_gold_combo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        n_silver_combo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        n_total_combo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        date_dtpicker = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        interest_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        g_gold_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        g_silver_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rupess_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        description_txt = new javax.swing.JTextArea();
        update_btn = new javax.swing.JButton();
        update_description_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(UpdateRecord.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Enter id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 11, -1, -1));

        id_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        id_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_txtFocusLost(evt);
            }
        });
        jPanel1.add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 11, 187, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Enter thing");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 122, -1, -1));

        thing_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        thing_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                thing_txtFocusLost(evt);
            }
        });
        jPanel1.add(thing_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 122, 187, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("Enter type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 236, -1, -1));

        type_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        type_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gold", "Silver", "Both" }));
        type_combo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                type_comboFocusLost(evt);
            }
        });
        jPanel1.add(type_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 236, 187, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("Number of gold");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 351, -1, -1));

        n_gold_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        n_gold_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        n_gold_combo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                n_gold_comboFocusLost(evt);
            }
        });
        jPanel1.add(n_gold_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 351, 187, -1));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setText("Number of silver");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 465, -1, -1));

        n_silver_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        n_silver_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        n_silver_combo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                n_silver_comboFocusLost(evt);
            }
        });
        jPanel1.add(n_silver_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 465, 187, -1));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel6.setText("Number of total");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 581, -1, -1));

        n_total_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        n_total_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        n_total_combo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                n_total_comboFocusLost(evt);
            }
        });
        jPanel1.add(n_total_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 581, 187, -1));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel7.setText("Enter date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 714, -1, -1));

        date_dtpicker.setDateFormatString("MM/dd/yyyy");
        date_dtpicker.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        date_dtpicker.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                date_dtpickerFocusLost(evt);
            }
        });
        jPanel1.add(date_dtpicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 714, 187, -1));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel8.setText("Enter interest");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 836, -1, -1));

        interest_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        interest_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                interest_txtFocusLost(evt);
            }
        });
        jPanel1.add(interest_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 836, 187, -1));

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel9.setText("Gross weight of gold");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 956, -1, -1));

        g_gold_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        g_gold_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                g_gold_txtFocusLost(evt);
            }
        });
        jPanel1.add(g_gold_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 956, 187, -1));

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel10.setText("Gross weight of silver");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1091, -1, -1));

        g_silver_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        g_silver_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                g_silver_txtFocusLost(evt);
            }
        });
        jPanel1.add(g_silver_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 1091, 187, -1));

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel11.setText("Enter rupess");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1216, -1, -1));

        rupess_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        rupess_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rupess_txtFocusLost(evt);
            }
        });
        jPanel1.add(rupess_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 1216, 187, -1));

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel12.setText("Enter description");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1393, -1, -1));

        description_txt.setColumns(20);
        description_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        description_txt.setRows(5);
        description_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                description_txtFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(description_txt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 1347, 252, 124));

        update_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        update_btn.setText("Update");
        update_btn.setEnabled(false);
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        jPanel1.add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1617, -1, -1));

        update_description_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        update_description_btn.setText("Update description");
        update_description_btn.setEnabled(false);
        update_description_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_description_btnActionPerformed(evt);
            }
        });
        jPanel1.add(update_description_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(965, 1403, -1, -1));

        home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        jPanel1.add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 1617, -1, -1));

        back_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        back_btn.setText("Back");
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 1617, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 1310, 1310));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                thing = new Thing(id);
                rs = thing.retriveThing(connect, table, false, false);
                
                try 
                {
                    if(rs.next())
                    {
                        id_txt.setText(rs.getInt("id") + "");
                        
                        thing_txt.setText(rs.getString("thing"));
                        type_combo.setSelectedItem(rs.getString("type"));
                        
                        n_gold_combo.setSelectedItem(rs.getInt("n_gold") + "");
                        n_silver_combo.setSelectedItem(rs.getInt("n_silver") + "");
                        n_total_combo.setSelectedItem(rs.getInt("n_total") + "");
                        
                        Date date = new Date(rs.getString("date1"));
                        date_dtpicker.setDate(date);
                        
                        interest_txt.setText(rs.getFloat("interest") + "");
                        
                        g_gold_txt.setText(rs.getFloat("g_gold") + "");
                        g_silver_txt.setText(rs.getFloat("g_silver") + "");
                        
                        rupess_txt.setText(rs.getInt("rupess") + "");
                        
                        description_txt.setText(rs.getString("description"));
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
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
                display_record.dispose();
            }
        }).start();
        
    }//GEN-LAST:event_home_btnActionPerformed

    private void update_description_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_description_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                String data = description_txt.getText();
                boolean flag = thing.modifyDescription(connect, table, id, data);
                
                if(flag == true)
                {
                    JOptionPane.showMessageDialog(UpdateRecord.this, "Description updation successfull");
                    connect.closeConnection();
                    dispose();
                    display_record.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(UpdateRecord.this, "Something went wrong please try again later");
                }
            }
        }).start();
        
    }//GEN-LAST:event_update_description_btnActionPerformed

    private void description_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_description_txtFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    if(description_txt.getText().equals(rs.getString("description")))
                    {
                        update_description_btn.setEnabled(false);
                    }
                    else
                    {
                        update_description_btn.setEnabled(true);
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
    }//GEN-LAST:event_description_txtFocusLost

    private void id_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_txtFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    if(Integer.parseInt(id_txt.getText()) == rs.getInt("id"))
                    {
                        id_check = false;
                    }
                    else
                    {
                        id_check = true;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(id_check==true || thing_check==true || type_check==true || n_gold_check==true || n_silver_check==true || n_total_check ==true
                      || date_check==true || interest_check==true || g_gold_check==true || g_silver_check==true || rupess_check==true)
                {
                    update_btn.setEnabled(true);
                }
                else
                {
                    update_btn.setEnabled(false);
                }
            }
        }).start();
        
    }//GEN-LAST:event_id_txtFocusLost

    private void thing_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_thing_txtFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    if(thing_txt.getText().equals(rs.getString("thing")))
                    {
                        thing_check = false;
                    }
                    else
                    {
                        thing_check = true;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(id_check==true || thing_check==true || type_check==true || n_gold_check==true || n_silver_check==true || n_total_check ==true
                      || date_check==true || interest_check==true || g_gold_check==true || g_silver_check==true || rupess_check==true)
                {
                    update_btn.setEnabled(true);
                }
                else
                {
                    update_btn.setEnabled(false);
                }
            }
        }).start();
        
    }//GEN-LAST:event_thing_txtFocusLost

    private void interest_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_interest_txtFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    if(Float.parseFloat(interest_txt.getText()) == rs.getFloat("interest"))
                    {
                        interest_check = false;
                    }
                    else
                    {
                        interest_check = true;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(id_check==true || thing_check==true || type_check==true || n_gold_check==true || n_silver_check==true || n_total_check ==true
                      || date_check==true || interest_check==true || g_gold_check==true || g_silver_check==true || rupess_check==true)
                {
                    update_btn.setEnabled(true);
                }
                else
                {
                    update_btn.setEnabled(false);
                }
            }
        }).start();
        
    }//GEN-LAST:event_interest_txtFocusLost

    private void g_gold_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_g_gold_txtFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    if(Float.parseFloat(g_gold_txt.getText()) == rs.getFloat("g_gold"))
                    {
                        g_gold_check = false;
                    }
                    else
                    {
                        g_gold_check = true;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(id_check==true || thing_check==true || type_check==true || n_gold_check==true || n_silver_check==true || n_total_check ==true
                      || date_check==true || interest_check==true || g_gold_check==true || g_silver_check==true || rupess_check==true)
                {
                    update_btn.setEnabled(true);
                }
                else
                {
                    update_btn.setEnabled(false);
                }
            }
        }).start();
        
    }//GEN-LAST:event_g_gold_txtFocusLost

    private void g_silver_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_g_silver_txtFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    if(Float.parseFloat(g_silver_txt.getText()) == rs.getFloat("g_silver"))
                    {
                        g_silver_check = false;
                    }
                    else
                    {
                        g_silver_check = true;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(id_check==true || thing_check==true || type_check==true || n_gold_check==true || n_silver_check==true || n_total_check ==true
                      || date_check==true || interest_check==true || g_gold_check==true || g_silver_check==true || rupess_check==true)
                {
                    update_btn.setEnabled(true);
                }
                else
                {
                    update_btn.setEnabled(false);
                }
            }
        }).start();
        
    }//GEN-LAST:event_g_silver_txtFocusLost

    private void rupess_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rupess_txtFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    if(Integer.parseInt(rupess_txt.getText()) == rs.getInt("rupess"))
                    {
                        rupess_check = false;
                    }
                    else
                    {
                        rupess_check = true;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(id_check==true || thing_check==true || type_check==true || n_gold_check==true || n_silver_check==true || n_total_check ==true
                      || date_check==true || interest_check==true || g_gold_check==true || g_silver_check==true || rupess_check==true)
                {
                    update_btn.setEnabled(true);
                }
                else
                {
                    update_btn.setEnabled(false);
                }
            }
        }).start();
        
    }//GEN-LAST:event_rupess_txtFocusLost

    private void type_comboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_type_comboFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    if(type_combo.getItemAt(type_combo.getSelectedIndex()).equals(rs.getString("type")))
                    {
                        type_check = false;
                    }
                    else
                    {
                        type_check = true;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(id_check==true || thing_check==true || type_check==true || n_gold_check==true || n_silver_check==true || n_total_check ==true
                      || date_check==true || interest_check==true || g_gold_check==true || g_silver_check==true || rupess_check==true)
                {
                    update_btn.setEnabled(true);
                }
                else
                {
                    update_btn.setEnabled(false);
                }
            }
        }).start();
        
    }//GEN-LAST:event_type_comboFocusLost

    private void n_gold_comboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_n_gold_comboFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    if(Integer.parseInt(n_gold_combo.getItemAt(n_gold_combo.getSelectedIndex())) == rs.getInt("n_gold"))
                    {
                        n_gold_check = false;
                    }
                    else
                    {
                        n_gold_check = true;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(id_check==true || thing_check==true || type_check==true || n_gold_check==true || n_silver_check==true || n_total_check ==true
                      || date_check==true || interest_check==true || g_gold_check==true || g_silver_check==true || rupess_check==true)
                {
                    update_btn.setEnabled(true);
                }
                else
                {
                    update_btn.setEnabled(false);
                }
            }
        }).start();
        
    }//GEN-LAST:event_n_gold_comboFocusLost

    private void n_silver_comboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_n_silver_comboFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    if(Integer.parseInt(n_silver_combo.getItemAt(n_silver_combo.getSelectedIndex())) == rs.getInt("n_silver"))
                    {
                        n_silver_check = false;
                    }
                    else
                    {
                        n_silver_check = true;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(id_check==true || thing_check==true || type_check==true || n_gold_check==true || n_silver_check==true || n_total_check ==true
                      || date_check==true || interest_check==true || g_gold_check==true || g_silver_check==true || rupess_check==true)
                {
                    update_btn.setEnabled(true);
                }
                else
                {
                    update_btn.setEnabled(false);
                }
            }
        }).start();
        
    }//GEN-LAST:event_n_silver_comboFocusLost

    private void n_total_comboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_n_total_comboFocusLost

        
        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    if(Integer.parseInt(n_total_combo.getItemAt(n_total_combo.getSelectedIndex())) == rs.getInt("n_total"))
                    {
                        n_total_check = false;
                    }
                    else
                    {
                        n_total_check = true;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(id_check==true || thing_check==true || type_check==true || n_gold_check==true || n_silver_check==true || n_total_check ==true
                      || date_check==true || interest_check==true || g_gold_check==true || g_silver_check==true || rupess_check==true)
                {
                    update_btn.setEnabled(true);
                }
                else
                {
                    update_btn.setEnabled(false);
                }
            }
        }).start();
        
    }//GEN-LAST:event_n_total_comboFocusLost

    private void date_dtpickerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_date_dtpickerFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                String d = sdf.format(date_dtpicker.getDate());
                
                try 
                {
                    if(d.equals(rs.getString("date1")))
                    {
                        date_check = false;
                    }
                    else
                    {
                        date_check = true;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(id_check==true || thing_check==true || type_check==true || n_gold_check==true || n_silver_check==true || n_total_check ==true
                      || date_check==true || interest_check==true || g_gold_check==true || g_silver_check==true || rupess_check==true)
                {
                    update_btn.setEnabled(true);
                }
                else
                {
                    update_btn.setEnabled(false);
                }
            }
        }).start();
        
    }//GEN-LAST:event_date_dtpickerFocusLost

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                String query = "update " + table + " set ";
                
                if(id_check == true)
                {
                    query += "id = " + Integer.parseInt(id_txt.getText());
                }
                
                if(thing_check == true)
                {
                    query += " , thing = '" + thing_txt.getText().toUpperCase() + "'";
                }
                
                if(type_check == true)
                {
                    query += " , type = '" + type_combo.getItemAt(type_combo.getSelectedIndex()).toUpperCase() + "'";
                }
                
                if(n_gold_check == true)
                {
                    query += " , n_gold = " + n_gold_combo.getItemAt(n_gold_combo.getSelectedIndex());
                }
                
                if(n_silver_check == true)
                {
                    query += " , n_silver = " + n_silver_combo.getItemAt(n_silver_combo.getSelectedIndex());
                }
                
                if(n_total_check == true)
                {
                    query += " , n_total = " + n_total_combo.getItemAt(n_total_combo.getSelectedIndex());
                }
                
                if(date_check == true)
                {
                    SimpleDateFormat abc = new SimpleDateFormat("MM/dd/yyyy");
                    String da = abc.format(date_dtpicker.getDate());
                    query += " , date1 = '" + da + "'";
                }
                
                if(interest_check == true)
                {
                    query += " , interest = " + interest_txt.getText();
                }
                
                if(g_gold_check == true)
                {
                    query += " , g_gold = " + g_gold_txt.getText();
                }
                
                if(g_silver_check == true)
                {
                    query += " , g_silver = " + g_silver_txt.getText();
                }
                
                if(rupess_check == true)
                {
                    query += " , rupess = " + rupess_txt.getText();
                }
                
                boolean flag = thing.modifyThing(connect, query, id);
                
                if(flag == true)
                {
                    JOptionPane.showMessageDialog(UpdateRecord.this, "Updation successfull");
                    new Home().setVisible(true);
                    connect.closeConnection();
                    dispose();
                    display_record.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(UpdateRecord.this, "Something went wrong please try again later");
                }
            }
        }).start();
        
    }//GEN-LAST:event_update_btnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private com.toedter.calendar.JDateChooser date_dtpicker;
    private javax.swing.JTextArea description_txt;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> n_gold_combo;
    private javax.swing.JComboBox<String> n_silver_combo;
    private javax.swing.JComboBox<String> n_total_combo;
    private javax.swing.JTextField rupess_txt;
    private javax.swing.JTextField thing_txt;
    private javax.swing.JComboBox<String> type_combo;
    private javax.swing.JButton update_btn;
    private javax.swing.JButton update_description_btn;
    // End of variables declaration//GEN-END:variables
}
