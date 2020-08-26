package com.design;

public class Home extends javax.swing.JFrame 
{

    public Home() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_btn = new javax.swing.JButton();
        search_btn = new javax.swing.JButton();
        notes_btn = new javax.swing.JButton();
        calculate_sum_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(Home.MAXIMIZED_BOTH);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        getContentPane().add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        search_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        notes_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        notes_btn.setText("Notes");
        notes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notes_btnActionPerformed(evt);
            }
        });
        getContentPane().add(notes_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        calculate_sum_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        calculate_sum_btn.setText("Calculate sum");
        calculate_sum_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_sum_btnActionPerformed(evt);
            }
        });
        getContentPane().add(calculate_sum_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -9, 1310, 1320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        
        new Thread(new Runnable()
        {
            public void run()
            {
                new AddRecord().setVisible(true);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_add_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        
        new Thread(new Runnable()
        {
            public void run()
            {
                new Searching().setVisible(true);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_search_btnActionPerformed

    private void calculate_sum_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_sum_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new CalculateSum().setVisible(true);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_calculate_sum_btnActionPerformed

    private void notes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notes_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new NotesHome().setVisible(true);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_notes_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton calculate_sum_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton notes_btn;
    private javax.swing.JButton search_btn;
    // End of variables declaration//GEN-END:variables
}
