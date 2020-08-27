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
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(CalculateSum.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Select table");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 137, -1, -1));

        table_combo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getContentPane().add(table_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 137, 207, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Sum is");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 274, -1, -1));

        sum_txt.setEditable(false);
        sum_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getContentPane().add(sum_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 274, 207, -1));

        calculate_sum_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        calculate_sum_btn.setText("Calculate sum");
        calculate_sum_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_sum_btnActionPerformed(evt);
            }
        });
        getContentPane().add(calculate_sum_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 401, -1, -1));

        home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        getContentPane().add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 401, -1, -1));

        calculate_profit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        calculate_profit.setText("Calculate profit");
        calculate_profit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_profitActionPerformed(evt);
            }
        });
        getContentPane().add(calculate_profit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 401, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField sum_txt;
    private javax.swing.JComboBox<String> table_combo;
    // End of variables declaration//GEN-END:variables
}
