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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(UpdateRecord.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Enter id");

        id_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        id_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_txtFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Enter thing");

        thing_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        thing_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                thing_txtFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("Enter type");

        type_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        type_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gold", "Silver", "Both" }));
        type_combo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                type_comboFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("Number of gold");

        n_gold_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        n_gold_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        n_gold_combo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                n_gold_comboFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setText("Number of silver");

        n_silver_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        n_silver_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        n_silver_combo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                n_silver_comboFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel6.setText("Number of total");

        n_total_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        n_total_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        n_total_combo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                n_total_comboFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel7.setText("Enter date");

        date_dtpicker.setDateFormatString("MM/dd/yyyy");
        date_dtpicker.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        date_dtpicker.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                date_dtpickerFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel8.setText("Enter interest");

        interest_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        interest_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                interest_txtFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel9.setText("Gross weight of gold");

        g_gold_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        g_gold_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                g_gold_txtFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel10.setText("Gross weight of silver");

        g_silver_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        g_silver_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                g_silver_txtFocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel11.setText("Enter rupess");

        rupess_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        rupess_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rupess_txtFocusLost(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel12.setText("Enter description");

        description_txt.setColumns(20);
        description_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        description_txt.setRows(5);
        description_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                description_txtFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(description_txt);

        update_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        update_btn.setText("Update");
        update_btn.setEnabled(false);
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        update_description_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        update_description_btn.setText("Update description");
        update_description_btn.setEnabled(false);
        update_description_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_description_btnActionPerformed(evt);
            }
        });

        home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

        back_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        back_btn.setText("Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(update_btn)
                        .addGap(252, 252, 252)
                        .addComponent(home_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back_btn)
                        .addGap(466, 466, 466))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(442, 442, 442)
                                .addComponent(rupess_txt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(360, 360, 360)
                                .addComponent(g_silver_txt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(366, 366, 366)
                                .addComponent(g_gold_txt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(430, 430, 430)
                                .addComponent(interest_txt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(458, 458, 458)
                                .addComponent(date_dtpicker, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(401, 401, 401)
                                .addComponent(n_total_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(398, 398, 398)
                                .addComponent(n_silver_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(404, 404, 404)
                                .addComponent(n_gold_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(457, 457, 457)
                                .addComponent(type_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(448, 448, 448)
                                .addComponent(thing_txt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addComponent(update_description_btn)
                        .addGap(210, 210, 210))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(thing_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(type_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(n_gold_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(n_silver_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(n_total_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(date_dtpicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(interest_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(g_gold_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(g_silver_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(rupess_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update_description_btn)
                        .addGap(368, 368, 368))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update_btn)
                            .addComponent(home_btn)
                            .addComponent(back_btn))
                        .addGap(154, 154, 154))))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1812, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    query += " , thing = '" + thing_txt.getText() + "'";
                }
                
                if(type_check == true)
                {
                    query += " , type = '" + type_combo.getItemAt(type_combo.getSelectedIndex()) + "'";
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
