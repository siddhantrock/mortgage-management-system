package com.design;

import javax.swing.JOptionPane;

public class NotesHome extends javax.swing.JFrame 
{
    public NotesHome() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_note_btn = new javax.swing.JButton();
        show_note_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(NotesHome.MAXIMIZED_BOTH);

        add_note_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        add_note_btn.setText("Add note");
        add_note_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_note_btnActionPerformed(evt);
            }
        });

        show_note_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        show_note_btn.setText("Show notes");
        show_note_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_note_btnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(add_note_btn)
                .addGap(127, 127, 127)
                .addComponent(show_note_btn)
                .addGap(129, 129, 129)
                .addComponent(jButton1)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_note_btn)
                    .addComponent(show_note_btn)
                    .addComponent(jButton1))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_note_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_note_btnActionPerformed
        
        new Thread(new Runnable()
        {
            public void run()
            {
                new AddNotes().setVisible(true);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_add_note_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new Home().setVisible(true);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void show_note_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_note_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                Object[] obj = {"notes","notes_1"};
                
                String table = (String)JOptionPane.showInputDialog(NotesHome.this, "Please select table", "", JOptionPane.PLAIN_MESSAGE, null, obj, "");
                
                DisplayNotes display_notes = new DisplayNotes();
                display_notes.setVisible(true);
                display_notes.setTable(table);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_show_note_btnActionPerformed

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
            java.util.logging.Logger.getLogger(NotesHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotesHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotesHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotesHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotesHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_note_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton show_note_btn;
    // End of variables declaration//GEN-END:variables
}
