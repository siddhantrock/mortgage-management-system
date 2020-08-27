package com.design;

import com.database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class DisplayNotes extends javax.swing.JFrame 
{
    Connect connect;
    int id,row;
    String table;

    public DisplayNotes() 
    {
        initComponents();
    }
    
    public void setTable(String table)
    {
        this.table = table;
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
        home_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(DisplayNotes.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Note", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(1100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        delete_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.setEnabled(false);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        update_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        update_btn.setText("Update");
        update_btn.setEnabled(false);

        data_report_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        data_report_btn.setText("Data report");
        data_report_btn.setEnabled(false);

        back_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(delete_btn)
                .addGap(207, 207, 207)
                .addComponent(update_btn)
                .addGap(153, 153, 153)
                .addComponent(data_report_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(back_btn)
                .addGap(126, 126, 126)
                .addComponent(home_btn)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_btn)
                    .addComponent(update_btn)
                    .addComponent(data_report_btn)
                    .addComponent(back_btn)
                    .addComponent(home_btn))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new NotesHome().setVisible(true);
                connect.closeConnection();
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_back_btnActionPerformed

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
                
                ResultSet rs = connect.getNotes(table);
                
                try 
                {
                    if(rs.next())
                    {
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(DisplayNotes.this, "No Record found");
                        new NotesHome().setVisible(true);
                        connect.closeConnection();
                        dispose();
                        return;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(DisplayNotes.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Object obj[] = new Object[3];
                
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                ListSelectionModel model1 = jTable1.getSelectionModel();
                
                try 
                {
                    do
                    {
                        obj[0] = rs.getInt("id");
                        obj[1] = rs.getString("note");
                        obj[2] = rs.getString("date1");
                        
                        model.addRow(obj);
                    }while(rs.next());
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(DisplayNotes.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                model1.addListSelectionListener(new ListSelectionListener()
                {
                    @Override
                    public void valueChanged(ListSelectionEvent e) 
                    {
                        if(! model1.isSelectionEmpty())
                        {
                            if(table.length() == 5)
                            {
                                delete_btn.setEnabled(true);
                                update_btn.setEnabled(true);
                                data_report_btn.setEnabled(true);
                            }
                            else
                            {
                                delete_btn.setEnabled(false);
                                update_btn.setEnabled(false);
                            }
                            
                            id = Integer.parseInt(model.getValueAt(model1.getMinSelectionIndex(),0)+"");
                            row = model1.getMinSelectionIndex();
                        }
                        else
                        {
                            delete_btn.setEnabled(false);
                            update_btn.setEnabled(false);
                            data_report_btn.setEnabled(false);
                        }
                    }
                    
                });
                
            }
        }).start();
        
    }//GEN-LAST:event_formWindowOpened

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                int i = JOptionPane.showConfirmDialog(DisplayNotes.this, "Do you really wants to delete this record");
                
                if(i != 0)
                {
                    return;
                }
                
                String note_1 = "";
                note_1 = JOptionPane.showInputDialog(DisplayNotes.this, "Add release note");
                
                
                
                boolean flag = connect.deleteNote(id,note_1);
                
                if(flag == true)
                {
                    JOptionPane.showMessageDialog(DisplayNotes.this, "Deletion successfull");
                    DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                    model.removeRow(row);
                }
                else
                {
                    JOptionPane.showMessageDialog(DisplayNotes.this, "Something went wrong please try again later");
                }
            }
        }).start();
        
    }//GEN-LAST:event_delete_btnActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayNotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton data_report_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton home_btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
