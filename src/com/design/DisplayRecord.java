package com.design;

import com.commodity.Thing;
import java.util.HashMap;
import com.database.Connect;
import com.itextpdf.kernel.colors.DeviceCmyk;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.AreaBreakType;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    HashMap<Integer, String> hash_date_diff = new HashMap();
    HashMap<Integer, String> hash_si = new HashMap();
    
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
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(255, 0, 0));
        jTable1.setRowHeight(28);
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(400);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1280, 361));

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
        data_report_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_report_btnActionPerformed(evt);
            }
        });
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
                int total_rs = 0 , total_si = 0 , total_total = 0;
                ArrayList<String> release_date = new ArrayList();
                
                try 
                {
                    if(table.length() == 10 || table.length() == 7)
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
                    else if(table.length() == 12)
                    {
                        do
                        {
                                Thing thing = new Thing(resultset.getInt("id"),resultset.getString("thing"),resultset.getString("type"),
                                resultset.getInt("n_gold"),resultset.getInt("n_silver"),resultset.getInt("n_total"),
                                resultset.getString("date1"),resultset.getFloat("interest"),resultset.getFloat("g_gold"),
                                resultset.getFloat("g_silver"),resultset.getInt("rupess"),resultset.getString("description"));
                                al.add(thing);
                                release_date.add(resultset.getString("date2"));
                        }while(resultset.next());
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Object[] obj = new Object[9];
                DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
                String data[] = new String[2];
                
                for(int i=0;i<al.size();i++)
                {   
                    obj[0] = al.get(i).getId();
                    obj[1] = al.get(i).getThing();
                    obj[2] = al.get(i).getDate();
                    obj[3] = al.get(i).getRupess();
                    total_rs += al.get(i).getRupess();
                    
                    obj[4] = al.get(i).getInterest();
                    
                    
                    if(table.length() == 10 || table.length() == 7)
                    {
                        data = Thing.dateDifference(al.get(i).getDate(), al.get(i).getInterest(), al.get(i).getRupess(),table,"");
                    }
                    else if(table.length() == 12)
                    {
                        data = Thing.dateDifference(al.get(i).getDate(), al.get(i).getInterest(), al.get(i).getRupess(),table,release_date.get(i));
                    }
                    
                    obj[5] = data[0];
                    hash_date_diff.put(al.get(i).getId(),data[0]);
                    
                    obj[6] = data[1];
                    total_si += Integer.parseInt(data[1]);
                    hash_si.put(al.get(i).getId(),data[1]);
                    
                    obj[7] = Integer.parseInt(data[1]) + al.get(i).getRupess();
                    total_total += Integer.parseInt(data[1]) + al.get(i).getRupess();
                    
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
                obj[1] = "Total = " + al.size();
                obj[2] = "";
                obj[3] = total_rs;
                obj[4] = "";
                obj[5] = "";
                obj[6] = total_si;
                obj[7] = total_total;
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
                            else if(table.length() == 12)
                            {
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

    private void data_report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_report_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                String file_name = "Report.pdf";
                Thing thing = new Thing(id);
                ResultSet rs = thing.retriveThing(connect, table, false, false);
                
                try 
                {
                    if(rs.next())
                    {
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(DisplayRecord.this, "Something went wrong please try again later");
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                PdfWriter writer=null;
        
                try 
                {
                  writer = new PdfWriter(file_name);
                }
                catch (FileNotFoundException ex) 
                {
                   //Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                PdfDocument pdfDoc=new PdfDocument(writer);
        
                Document document = new Document(pdfDoc);
         
                float cloumn[]={500f,500f};
                Table table1=new Table(cloumn);
                
                Cell id_c = new Cell();
                id_c.add(new Paragraph("ID").setBold());
                id_c.setBorder(Border.NO_BORDER);
                id_c.setTextAlignment(TextAlignment.CENTER);
                id_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(id_c);
                
                Cell id_c1 = new Cell();
                try {
                    id_c1.add(new Paragraph(rs.getInt("id")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                id_c1.setBorder(Border.NO_BORDER);
                id_c1.setTextAlignment(TextAlignment.CENTER);
                id_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(id_c1);
                
                Cell thing_c = new Cell();
                thing_c.add(new Paragraph("Thing").setBold());
                thing_c.setBorder(Border.NO_BORDER);
                thing_c.setTextAlignment(TextAlignment.CENTER);
                thing_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_c);
                
                Cell thing_c1 = new Cell();
                try {
                    thing_c1.add(new Paragraph(rs.getString("thing")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                thing_c1.setBorder(Border.NO_BORDER);
                thing_c1.setTextAlignment(TextAlignment.CENTER);
                thing_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_c1);
                
                Cell type_c = new Cell();
                type_c.add(new Paragraph("Type").setBold());
                type_c.setBorder(Border.NO_BORDER);
                type_c.setTextAlignment(TextAlignment.CENTER);
                type_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(type_c);
                
                Cell type_c1 = new Cell();
                try {
                    type_c1.add(new Paragraph(rs.getString("type")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                type_c1.setBorder(Border.NO_BORDER);
                type_c1.setTextAlignment(TextAlignment.CENTER);
                type_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(type_c1);
                
                Cell n_gold_c = new Cell();
                n_gold_c.add(new Paragraph("Number of gold").setBold());
                n_gold_c.setBorder(Border.NO_BORDER);
                n_gold_c.setTextAlignment(TextAlignment.CENTER);
                n_gold_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_gold_c);
                
                Cell n_gold_c1 = new Cell();
                try {
                    n_gold_c1.add(new Paragraph(rs.getInt("n_gold") + ""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                n_gold_c1.setBorder(Border.NO_BORDER);
                n_gold_c1.setTextAlignment(TextAlignment.CENTER);
                n_gold_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_gold_c1);
                
                Cell n_silver_c = new Cell();
                n_silver_c.add(new Paragraph("Number of silver").setBold());
                n_silver_c.setBorder(Border.NO_BORDER);
                n_silver_c.setTextAlignment(TextAlignment.CENTER);
                n_silver_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_silver_c);
                
                Cell n_silver_c1 = new Cell();
                try {
                    n_silver_c1.add(new Paragraph(rs.getInt("n_silver")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                n_silver_c1.setBorder(Border.NO_BORDER);
                n_silver_c1.setTextAlignment(TextAlignment.CENTER);
                n_silver_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_silver_c1);
                
                Cell n_total_c = new Cell();
                n_total_c.add(new Paragraph("Number of total").setBold());
                n_total_c.setBorder(Border.NO_BORDER);
                n_total_c.setTextAlignment(TextAlignment.CENTER);
                n_total_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_total_c);
                
                Cell n_total_c1 = new Cell();
                try {
                    n_total_c1.add(new Paragraph(rs.getInt("n_total")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                n_total_c1.setBorder(Border.NO_BORDER);
                n_total_c1.setTextAlignment(TextAlignment.CENTER);
                n_total_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_total_c1);
                
                Cell thing_date_c = new Cell();
                thing_date_c.add(new Paragraph("Date").setBold());
                thing_date_c.setBorder(Border.NO_BORDER);
                thing_date_c.setTextAlignment(TextAlignment.CENTER);
                thing_date_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_date_c);
                
                Cell thing_date_c1 = new Cell();
                try {
                    thing_date_c1.add(new Paragraph(rs.getString("date1")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                thing_date_c1.setBorder(Border.NO_BORDER);
                thing_date_c1.setTextAlignment(TextAlignment.CENTER);
                thing_date_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_date_c1);
                
                Cell interest_c = new Cell();
                interest_c.add(new Paragraph("Interest").setBold());
                interest_c.setBorder(Border.NO_BORDER);
                interest_c.setTextAlignment(TextAlignment.CENTER);
                interest_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(interest_c);
                
                Cell interest_c1 = new Cell();
                try {
                    interest_c1.add(new Paragraph(rs.getFloat("interest")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                interest_c1.setBorder(Border.NO_BORDER);
                interest_c1.setTextAlignment(TextAlignment.CENTER);
                interest_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(interest_c1);
                
                Cell g_gold_c = new Cell();
                g_gold_c.add(new Paragraph("Gross weight of gold").setBold());
                g_gold_c.setBorder(Border.NO_BORDER);
                g_gold_c.setTextAlignment(TextAlignment.CENTER);
                g_gold_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(g_gold_c);
                
                Cell g_gold_c1 = new Cell();
                try {
                    g_gold_c1.add(new Paragraph(rs.getFloat("g_gold")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                g_gold_c1.setBorder(Border.NO_BORDER);
                g_gold_c1.setTextAlignment(TextAlignment.CENTER);
                g_gold_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(g_gold_c1);
                
                Cell g_silver_c = new Cell();
                g_silver_c.add(new Paragraph("Gross weight of silver").setBold());
                g_silver_c.setBorder(Border.NO_BORDER);
                g_silver_c.setTextAlignment(TextAlignment.CENTER);
                g_silver_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(g_silver_c);
                
                Cell g_silver_c1 = new Cell();
                try {
                    g_silver_c1.add(new Paragraph(rs.getFloat("g_silver")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                g_silver_c1.setBorder(Border.NO_BORDER);
                g_silver_c1.setTextAlignment(TextAlignment.CENTER);
                g_silver_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(g_silver_c1);
                
                Cell rupess_c = new Cell();
                rupess_c.add(new Paragraph("Rupess").setBold());
                rupess_c.setBorder(Border.NO_BORDER);
                rupess_c.setTextAlignment(TextAlignment.CENTER);
                rupess_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(rupess_c);
                
                Cell rupess_c1 = new Cell();
                try {
                    rupess_c1.add(new Paragraph(rs.getInt("rupess")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                rupess_c1.setBorder(Border.NO_BORDER);
                rupess_c1.setTextAlignment(TextAlignment.CENTER);
                rupess_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(rupess_c1);
                
                Cell date_diff_c = new Cell();
                date_diff_c.add(new Paragraph("Date difference").setBold());
                date_diff_c.setBorder(Border.NO_BORDER);
                date_diff_c.setTextAlignment(TextAlignment.CENTER);
                date_diff_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(date_diff_c);
                
                Cell date_diff_c1 = new Cell();
                date_diff_c1.add(new Paragraph(hash_date_diff.get(id)));
                date_diff_c1.setBorder(Border.NO_BORDER);
                date_diff_c1.setTextAlignment(TextAlignment.CENTER);
                date_diff_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(date_diff_c1);
                
                Cell si_c = new Cell();
                si_c.add(new Paragraph("SI/CI Interest").setBold());
                si_c.setBorder(Border.NO_BORDER);
                si_c.setTextAlignment(TextAlignment.CENTER);
                si_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(si_c);
                
                Cell si_c1 = new Cell();
                si_c1.add(new Paragraph(hash_si.get(id)));
                si_c1.setBorder(Border.NO_BORDER);
                si_c1.setTextAlignment(TextAlignment.CENTER);
                si_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(si_c1);
                
                Cell total_c = new Cell();
                total_c.add(new Paragraph("Total Rupess").setBold());
                total_c.setBorder(Border.NO_BORDER);
                total_c.setTextAlignment(TextAlignment.CENTER);
                total_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(total_c);
                
                Cell total_c1 = new Cell();
                try {
                    total_c1.add(new Paragraph((rs.getInt("rupess") + Integer.parseInt(hash_si.get(id)))+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                total_c1.setBorder(Border.NO_BORDER);
                total_c1.setTextAlignment(TextAlignment.CENTER);
                total_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(total_c1);
                
                if(table.length() == 12)
                {
                    Cell release_rupess_c = new Cell();
                    release_rupess_c.add(new Paragraph("Rupess on releasing thing").setBold());
                    release_rupess_c.setBorder(Border.NO_BORDER);
                    release_rupess_c.setTextAlignment(TextAlignment.CENTER);
                    release_rupess_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                    table1.addCell(release_rupess_c);
                
                    Cell release_rupess_c1 = new Cell();
                    try {
                        release_rupess_c1.add(new Paragraph((rs.getInt("rupess2") + "")));
                    } catch (SQLException ex) {
                        Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    release_rupess_c1.setBorder(Border.NO_BORDER);
                    release_rupess_c1.setTextAlignment(TextAlignment.CENTER);
                    release_rupess_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                    table1.addCell(release_rupess_c1);
                    
                    Cell release_date_c = new Cell();
                    release_date_c.add(new Paragraph("Released date").setBold());
                    release_date_c.setBorder(Border.NO_BORDER);
                    release_date_c.setTextAlignment(TextAlignment.CENTER);
                    release_date_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                    table1.addCell(release_date_c);
                
                    Cell release_date_c1 = new Cell();
                    try {
                        release_date_c1.add(new Paragraph((rs.getString("date2"))));
                    } catch (SQLException ex) {
                        Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    release_date_c1.setBorder(Border.NO_BORDER);
                    release_date_c1.setTextAlignment(TextAlignment.CENTER);
                    release_date_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                    table1.addCell(release_date_c1);
                }
                
                document.add(table1);
                
                document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
                document.add(new Paragraph("Description").setBold().setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f));
                try 
                {
                    if(rs.getString("description") == null)
                    {
                        
                    }
                    else
                    {
                        document.add(new Paragraph(rs.getString("description")));
                    }
                }
                catch (SQLException ex) {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                document.close();
                
                
                try 
                {
                    Desktop.getDesktop().open(new File("Report.pdf"));
                }
                catch (IOException ex) 
                {
                    Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
    }//GEN-LAST:event_data_report_btnActionPerformed
    
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
