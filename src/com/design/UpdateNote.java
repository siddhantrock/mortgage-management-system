package com.design;

import com.database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UpdateNote extends javax.swing.JFrame 
{
    Connect connect;
    int id;
    DisplayNotes obj;
    boolean note_check,date_check;
    ResultSet rs;
    
    public UpdateNote() 
    {
        initComponents();
    }

    public void setData(int id , DisplayNotes obj , Connect connect)
    {
        this.id = id;
        this.obj = obj;
        this.connect = connect;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        note_txt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        date_dtpicker = new com.toedter.calendar.JDateChooser();
        update_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(UpdateNote.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Enter note");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 80, -1, -1));

        note_txt.setColumns(20);
        note_txt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        note_txt.setRows(5);
        note_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                note_txtFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(note_txt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 44, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Enter date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 304, -1, -1));

        date_dtpicker.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        date_dtpicker.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                date_dtpickerFocusLost(evt);
            }
        });
        getContentPane().add(date_dtpicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 304, 210, -1));

        update_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        update_btn.setText("Update");
        update_btn.setEnabled(false);
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        getContentPane().add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 430, -1, -1));

        back_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 430, -1, -1));

        home_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        getContentPane().add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 430, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                rs = connect.getNotes("notes",id);
                
                try 
                {
                    if(rs.next())
                    {
                        note_txt.setText(rs.getString("note"));
                        date_dtpicker.setDate(new Date(rs.getString("date1")));
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateNote.class.getName()).log(Level.SEVERE, null, ex);
                }
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
                obj.dispose();
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
                obj.dispose();
            }
        }).start();
        
    }//GEN-LAST:event_home_btnActionPerformed

    private void note_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_note_txtFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    if(note_txt.getText().equals(rs.getString("note")))
                    {
                        note_check = false;
                    }
                    else
                    {
                        note_check = true;
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(UpdateNote.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(note_check == true || date_check == true)
                {
                    update_btn.setEnabled(true);
                }
                else
                {
                    update_btn.setEnabled(false);
                }
            }
        }).start();
        
    }//GEN-LAST:event_note_txtFocusLost

    private void date_dtpickerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_date_dtpickerFocusLost

        new Thread(new Runnable()
        {
            public void run()
            {
                try 
                {
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                    String date = sdf.format(date_dtpicker.getDate());
                    
                    if(date.equals(rs.getString("date1")))
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
                    Logger.getLogger(UpdateNote.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(note_check == true || date_check == true)
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
                String query = "update notes set ";
                
                if(note_check == true)
                {
                    query += "note = '" + note_txt.getText().toUpperCase() + "'";
                }
                
                if(date_check == true)
                {
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                    String date = sdf.format(date_dtpicker.getDate());
                    query += " , date1 = '" + date + "'";
                }
                
                boolean flag = connect.updateNote(query);
                
                if(flag == true)
                {
                    JOptionPane.showMessageDialog(UpdateNote.this, "Updation successfull");
                    new NotesHome().setVisible(true);
                    connect.closeConnection();
                    dispose();
                    obj.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(UpdateNote.this, "Something went wrong please try again later");
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
            java.util.logging.Logger.getLogger(UpdateNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateNote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private com.toedter.calendar.JDateChooser date_dtpicker;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea note_txt;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
