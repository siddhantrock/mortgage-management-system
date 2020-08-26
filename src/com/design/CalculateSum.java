package com.design;

import com.database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CalculateSum extends javax.swing.JFrame 
{
    Connect connect;
    Object[] obj;
    
    public CalculateSum() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        table_combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        sum_txt = new javax.swing.JTextField();
        calculate_sum_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        calculate_profit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(CalculateSum.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Select table");

        table_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Sum is");

        sum_txt.setEditable(false);
        sum_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        calculate_sum_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        calculate_sum_btn.setText("Calculate sum");
        calculate_sum_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_sum_btnActionPerformed(evt);
            }
        });

        home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

        calculate_profit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        calculate_profit.setText("Calculate profit");
        calculate_profit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_profitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calculate_sum_btn)
                        .addGap(120, 120, 120)
                        .addComponent(home_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(calculate_profit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sum_txt)
                            .addComponent(table_combo, 0, 207, Short.MAX_VALUE))))
                .addGap(244, 244, 244))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(sum_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate_sum_btn)
                    .addComponent(home_btn)
                    .addComponent(calculate_profit))
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                connect = new Connect();
                ArrayList<Object> al=null;
                
                ResultSet rs = connect.showTables();
                
                try 
                {
                    while(rs.next())
                    {
                        table_combo.addItem(rs.getString(1));
                        
                        if(rs.getString(1).length() == 12)
                        {
                            al = new ArrayList();
                            al.add(rs.getString(1));
                        }
                    }
                    
                    obj = al.toArray();
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(CalculateSum.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
    }//GEN-LAST:event_formWindowOpened

    private void calculate_sum_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_sum_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                ResultSet rs = connect.calculateThingSum(table_combo.getItemAt(table_combo.getSelectedIndex()));
                
                try 
                {
                    if(rs.next())
                    {
                        sum_txt.setText(rs.getInt(1) + "");
                    }
                }
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(CalculateSum.this, "Something went wrong please try again later");
                }
            }
        }).start();
        
    }//GEN-LAST:event_calculate_sum_btnActionPerformed

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

    private void calculate_profitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_profitActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                String table =(String) JOptionPane.showInputDialog(CalculateSum.this, "please select table","",JOptionPane.PLAIN_MESSAGE,null, obj,"");
                
                ResultSet rs = connect.calculateThingProfit(table);
                
                try 
                {
                    if(rs.next())
                    {
                        JOptionPane.showMessageDialog(CalculateSum.this, "Profit = " + rs.getInt(1));
                    }
                }
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(CalculateSum.this, "Something went wrong please try again later");
                }
            }
        }).start();
        
    }//GEN-LAST:event_calculate_profitActionPerformed

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
            java.util.logging.Logger.getLogger(CalculateSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateSum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate_profit;
    private javax.swing.JButton calculate_sum_btn;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField sum_txt;
    private javax.swing.JComboBox<String> table_combo;
    // End of variables declaration//GEN-END:variables
}
