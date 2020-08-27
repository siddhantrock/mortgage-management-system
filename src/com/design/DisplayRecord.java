package com.design;

import com.commodity.Thing;
import com.database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class DisplayRecord extends javax.swing.JFrame 
{
    Connect connect;
    ResultSet resultset;
    int id,row=-1;
    String table,pending_year=null;
    
    public DisplayRecord() 
    {
        initComponents();
    }
    
    public void setResultSet(ResultSet rs , String table , Connect connect)
    {
        resultset = rs;
        this.table = table;
        this.connect = connect;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        delete_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        data_report_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        Home_btn = new javax.swing.JButton();
        Pending_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(DisplayRecord.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Thing", "Date", "Rupess", "Interest", "Date difference", "SI", "Total", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setAutoscrolls(false);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(28);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(400);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1200, 361));

        delete_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.setEnabled(false);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        getContentPane().add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 438, -1, -1));

        update_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        update_btn.setText("Update");
        update_btn.setEnabled(false);
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        getContentPane().add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 438, -1, -1));

        data_report_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        data_report_btn.setText("Data report");
        data_report_btn.setEnabled(false);
        getContentPane().add(data_report_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 438, -1, -1));

        back_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 438, -1, -1));

        Home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Home_btn.setText("Home");
        Home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 438, -1, -1));

        Pending_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Pending_btn.setText("Pending");
        Pending_btn.setEnabled(false);
        Pending_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pending_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Pending_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1055, 438, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                ArrayList<Thing> al = new ArrayList();
                int total_rs = 0 , total_si = 0 , tota_total = 0;
                
                try 
                {
                    do
                    {
                        Thing thing = new Thing(resultset.getInt("id"),resultset.getString("thing"),resultset.getString("type"),
                                resultset.getInt("n_gold"),resultset.getInt("n_silver"),resultset.getInt("n_total"),
                                resultset.getString("date1"),resultset.getFloat("interest"),resultset.getFloat("g_gold"),
                                resultset.getFloat("g_silver"),resultset.getInt("rupess"),resultset.getString("description"));
                        al.add(thing);
                    }while(resultset.next());
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Object[] obj = new Object[9];
                DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
                
                for(int i=0;i<al.size();i++)
                {   
                    obj[0] = al.get(i).getId();
                    obj[1] = al.get(i).getThing();
                    obj[2] = al.get(i).getDate();
                    obj[3] = al.get(i).getRupess();
                    total_rs += al.get(i).getRupess();
                    
                    obj[4] = al.get(i).getInterest();
                    
                    String data[] = Thing.dateDifference(al.get(i).getDate(), al.get(i).getInterest(), al.get(i).getRupess());
                    
                    obj[5] = data[0];
                    
                    obj[6] = data[1];
                    total_si += Integer.parseInt(data[1]);
                    
                    
                    obj[7] = Integer.parseInt(data[1]) + al.get(i).getRupess();
                    tota_total += Integer.parseInt(data[1]) + al.get(i).getRupess();
                    
                    obj[8] = al.get(i).getDescription();
                    
                    model1.addRow(obj);
                }
                
                obj[0] = "";
                obj[1] = "";
                obj[2] = "";
                obj[3] = "";
                obj[4] = "";
                obj[5] = "";
                obj[6] = "";
                obj[7] = "";
                obj[8] = "";
                
                model1.addRow(obj);
                model1.addRow(obj);
                model1.addRow(obj);
                
                obj[0] = "";
                obj[1] = "Total";
                obj[2] = "";
                obj[3] = total_rs;
                obj[4] = "";
                obj[5] = "";
                obj[6] = total_si;
                obj[7] = tota_total;
                obj[8] = "";
                
                model1.addRow(obj);
                
                ListSelectionModel model = jTable1.getSelectionModel();
                model.addListSelectionListener(new ListSelectionListener()
                {
                    @Override
                    public void valueChanged(ListSelectionEvent e) 
                    {
                        if(! model.isSelectionEmpty())
                        {
                            if(table.length() == 10)
                            {
                                delete_btn.setEnabled(true);
                                update_btn.setEnabled(true);
                                data_report_btn.setEnabled(true);
                                Pending_btn.setEnabled(true);
                            }
                            else if(table.length() == 7)
                            {
                                delete_btn.setEnabled(true);
                                update_btn.setEnabled(true);
                                data_report_btn.setEnabled(true);
                            }
                                 
                            if(model1.getValueAt(model.getMinSelectionIndex(),0) == "")
                            {
                                jTable1.setSelectionMode(0);
                                return;
                            }
                            
                            id = Integer.parseInt(model1.getValueAt(model.getMinSelectionIndex(),0)+"");
                            row = model.getMinSelectionIndex();
                            pending_year = model1.getValueAt(model.getMinSelectionIndex(),2)+"";
                            
                        }
                        else
                        {
                            delete_btn.setEnabled(false);
                            update_btn.setEnabled(false);
                            data_report_btn.setEnabled(false);
                            Pending_btn.setEnabled(false);
                        }
                    }
                    
                });
            }
        }).start();
        
    }//GEN-LAST:event_formWindowOpened

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new Searching().setVisible(true);
                connect.closeConnection();
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_back_btnActionPerformed

    private void Home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new Home().setVisible(true);
                connect.closeConnection();
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_Home_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
        {
            boolean flag=false;
            int rupess = 0;
            
            int i = JOptionPane.showConfirmDialog(DisplayRecord.this, "Do you really want to delete this record");
            
            if(i != 0)
            {
                return;
            }
            try
            {
                rupess = Integer.parseInt(JOptionPane.showInputDialog(DisplayRecord.this, "Please enter rupess"));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(DisplayRecord.this, "Please enter valid rupess");
                return;
            }
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            String date = sdf.format(new Date());
            
            if(table.length() == 10)
            {
               flag = Thing.removeThing(connect, table, id, rupess, date);
            }
            else if(table.length() == 7)
            {
                flag = connect.deletePendingRecord(pending_year,id,rupess,date);
            }
                 
            if(flag == true)
            {
                JOptionPane.showMessageDialog(DisplayRecord.this, "Deletion Successfull");
                if(row != -1)
                {
                    DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                    model.removeRow(row);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(DisplayRecord.this, "Something went wrong please try again later");
                return;
            }
        }
        }).start();
    }//GEN-LAST:event_delete_btnActionPerformed

    private void Pending_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pending_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                boolean flag = connect.pendingRecord(table, id);
                if(flag == true)
                {
                    JOptionPane.showMessageDialog(DisplayRecord.this, "Data inerted into pending");
                    if(row != -1)
                    {
                        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                        model.removeRow(row);
                    }
                }
            }
        }).start();
        
    }//GEN-LAST:event_Pending_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                UpdateRecord ur = new UpdateRecord();
                ur.setVisible(true);
                ur.setData(id,table,DisplayRecord.this,connect);
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
            java.util.logging.Logger.getLogger(DisplayRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home_btn;
    private javax.swing.JButton Pending_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton data_report_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
