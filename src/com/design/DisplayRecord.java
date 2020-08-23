package com.design;

import com.commodity.Thing;
import com.database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DisplayRecord extends javax.swing.JFrame 
{
    Connect connect;
    ResultSet resultset;
    public DisplayRecord() 
    {
        initComponents();
    }
    
    public void setResultSet(ResultSet rs)
    {
        resultset = rs;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(DisplayRecord.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Thing", "Date", "Rupess", "Interest", "Date difference", "SI", "Total", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        delete_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        delete_btn.setText("Delete");

        update_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        update_btn.setText("Update");

        data_report_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        data_report_btn.setText("Data report");

        back_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        back_btn.setText("Back");

        Home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Home_btn.setText("Home");

        Pending_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Pending_btn.setText("Pending");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delete_btn)
                        .addGap(89, 89, 89)
                        .addComponent(update_btn)
                        .addGap(104, 104, 104)
                        .addComponent(data_report_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back_btn)
                        .addGap(124, 124, 124)
                        .addComponent(Home_btn)
                        .addGap(120, 120, 120)
                        .addComponent(Pending_btn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_btn)
                    .addComponent(update_btn)
                    .addComponent(data_report_btn)
                    .addComponent(back_btn)
                    .addComponent(Home_btn)
                    .addComponent(Pending_btn))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                connect = new Connect();
                ArrayList<Thing> al = new ArrayList();
                
                try 
                {
                    while(resultset.next())
                    {
                        Thing thing = new Thing(resultset.getInt("id"),resultset.getString("thing"),resultset.getString("type"),
                                resultset.getInt("n_gold"),resultset.getInt("n_silver"),resultset.getInt("n_total"),
                                resultset.getString("date1"),resultset.getInt("interest"),resultset.getInt("g_gold"),
                                resultset.getInt("g_silver"),resultset.getInt("rupess"),resultset.getString("description"));
                        al.add(thing);
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Object[] obj = new Object[9];
                
                for(int i=0;i<al.size();i++)
                {
                    obj[0] = al.get(i).getId();
                    obj[1] = al.get(i).getThing();
                    obj[2] = al.get(i).getDate();
                    obj[3] = al.get(i).getRupess();
                    obj[4] = al.get(i).getInterest();
                    obj[5] = 0;
                    obj[6] = 0;
                    obj[7] = 0;
                    obj[8] = al.get(i).getDescription();
                }
                
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(obj);
            }
        }).start();
        
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
