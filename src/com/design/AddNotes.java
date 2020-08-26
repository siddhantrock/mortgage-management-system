package com.design;

import com.database.Connect;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class AddNotes extends javax.swing.JFrame 
{
    Connect connect;

    public AddNotes() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        note_txt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        date_dtpicker = new com.toedter.calendar.JDateChooser();
        add_note_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(AddNotes.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Enter note");

        note_txt.setColumns(20);
        note_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        note_txt.setRows(5);
        jScrollPane1.setViewportView(note_txt);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Enter date");

        date_dtpicker.setDateFormatString("MM/dd/yyyy");
        date_dtpicker.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        add_note_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        add_note_btn.setText("Add note");
        add_note_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_note_btnActionPerformed(evt);
            }
        });

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
                .addGap(233, 233, 233)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_note_btn)
                        .addGap(169, 169, 169)
                        .addComponent(back_btn)
                        .addGap(196, 196, 196)
                        .addComponent(home_btn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(354, 354, 354)
                            .addComponent(date_dtpicker, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(285, 285, 285)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(date_dtpicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_note_btn)
                    .addComponent(back_btn)
                    .addComponent(home_btn))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                connect = new Connect();
                
                date_dtpicker.setDate(new Date());
            }
        }).start();
        
    }//GEN-LAST:event_formWindowOpened

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

    private void add_note_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_note_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                String note = note_txt.getText().trim().toUpperCase();
                
                if(note.length() == 0)
                {
                    JOptionPane.showMessageDialog(AddNotes.this, "Notes cannot be empty");
                    return;
                }
                
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
                String date = sdf.format(date_dtpicker.getDate());
                
                boolean flag = connect.addNote(note, date);
                
                if(flag == true)
                {
                    JOptionPane.showMessageDialog(AddNotes.this, "Note inserted successfully");
                    new NotesHome().setVisible(true);
                    connect.closeConnection();
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(AddNotes.this, "Something went wrong please try again later");
                }
            }
        }).start();
        
    }//GEN-LAST:event_add_note_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AddNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_note_btn;
    private javax.swing.JButton back_btn;
    private com.toedter.calendar.JDateChooser date_dtpicker;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea note_txt;
    // End of variables declaration//GEN-END:variables
}
