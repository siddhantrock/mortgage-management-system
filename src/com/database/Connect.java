package com.database;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

public class Connect 
{
    private Connection con;
    private Statement st;
    
    public Connect()
    {
        try 
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul_shop_management","root","siddhu1234@#");
           st=con.createStatement();
       }
       catch (ClassNotFoundException | SQLException ex) 
       {
          ex.printStackTrace();
       }
    }
    
    
    public boolean addRecord(String query)
    {
        boolean flag = false;
        try 
        {
            st.executeUpdate(query);
            flag = true;
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    
    public boolean createTable(String year)
    {
        boolean flag=false;
        try 
        {
            st.execute("create table table_" + year + "(id int primary key , thing varchar(100) , type char(10) , n_gold int , "
                    + "n_silver int , n_total int , date1 char(10) , interest float , g_gold float , g_silver float , rupess int , description text)");
            
             st.execute("create table table_" + year + "_1(id int primary key , thing varchar(100) , type char(10) , n_gold int , "
                    + "n_silver int , n_total int , date1 char(10) , interest float , g_gold float , g_silver float , rupess int , rupess2 int , date2 char(10) , description text)");
             flag=true;
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
    
    public ResultSet showTables()
    {
        ResultSet rs=null;
        try 
        {
            rs = st.executeQuery("show tables");
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getRecord(String query)
    {
        ResultSet rs=null;
        try 
        {
            rs = st.executeQuery(query);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public boolean deleteRecord(String table , int id , int rupess , String date)
    {
        boolean flag=false;
        try 
        {
            ResultSet rs = st.executeQuery("select * from " + table + " where id = " + id);
            
            rs.next();
            
            st.executeUpdate("insert into " + table + "_1 values(" + rs.getInt("id") + ",'" + rs.getString("thing") + "','" + rs.getString("type")
            + "'," + rs.getInt("n_gold") + "," + rs.getInt("n_silver") + "," + rs.getInt("n_total") + ",'" + rs.getString("date1")
            + "'," + rs.getFloat("interest") + "," + rs.getFloat("g_gold") + "," + rs.getFloat("g_silver") + "," + rs.getInt("rupess")
            + "," + rupess + ",'" + date + "','" + rs.getString("description") + "')");
            
            st.execute("delete from " + table + " where id = " + id);
            
            flag = true;
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
    
    public boolean pendingRecord(String table , int id)
    {
        boolean flag=false;
        
        try 
        {
            st.executeUpdate("insert into pending select * from " + table + " where id = " + id);
            st.execute("delete from " + table + " where id = " + id);
            flag = true;
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
    
    public ResultSet getPendingRecord()
    {   
        ResultSet rs = null;
        
        try 
        {
            rs = st.executeQuery("select * from pending");
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public boolean deletePendingRecord(String pending_year , int id , int rupess , String date)
    {
        boolean flag = false;
        String table = "table_" + pending_year.substring(6) + "_1";
        
        try 
        {
            ResultSet rs = st.executeQuery("select * from pending" + " where id = " + id);
            
            rs.next();
            
            st.executeUpdate("insert into " + table + " values(" + rs.getInt("id") + ",'" + rs.getString("thing") + "','" + rs.getString("type")
            + "'," + rs.getInt("n_gold") + "," + rs.getInt("n_silver") + "," + rs.getInt("n_total") + ",'" + rs.getString("date1")
            + "'," + rs.getFloat("interest") + "," + rs.getFloat("g_gold") + "," + rs.getFloat("g_silver") + "," + rs.getInt("rupess")
            + "," + rupess + ",'" + date + "','" + rs.getString("description") + "')");
            
            st.execute("delete from pending" + " where id = " + id);
            
            flag = true;
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
    
    public void closeConnection()
    {
        try 
        {
            st.close();
            con.close();
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean updateRecord(String query)
    {
        boolean flag = false;
        
        try 
        {
            st.execute(query);
            flag = true;
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
    
    public ResultSet calculateThingSum(String table)
    {
        ResultSet rs=null;
        try 
        {
            rs = st.executeQuery("select sum(rupess) from " + table);
        }
        catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet calculateThingProfit(String table)
    {
        ResultSet rs=null;
        
        try 
        {
            rs = st.executeQuery("select sum(rupess2 - rupess) from " + table);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public boolean addNote(String data, String date)
    {
        boolean flag=false;
        
        try 
        {
            st.executeUpdate("insert into notes(note,date1) values('" + data + "','" + date + "')");
            flag = true;
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
    
    public ResultSet getNotes(String table)
    {
        ResultSet rs=null;
        
        try 
        {
            rs = st.executeQuery("select * from " + table);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    public ResultSet getNotes(String table, int id)
    {
        ResultSet rs = null;
        
        try 
        {
            rs = st.executeQuery("select * from " + table + " where id = " + id);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public boolean updateNote(String query)
    {
        boolean flag=false;
        
        try 
        {
            st.execute(query);
            flag = true;
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
    
    public boolean deleteNote(int id , String note_1)
    {
        boolean flag=false;
        
        try 
        {
            ResultSet rs = st.executeQuery("select * from notes where id = " + id);
            rs.next();
            
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            String date = sdf.format(new Date());
            st.executeUpdate("insert into notes_1(note,date1,note1,date2) values('" + rs.getString("note") + "','" + rs.getString("date1")
                             + "','" + note_1 + "','" + date + "')");
            
            st.execute("delete from notes where id = " + id);
            flag = true;
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
    
    public ResultSet showAllRecord(String table)
    {
        ResultSet rs=null;
        
        try 
        {
            rs = st.executeQuery("select * from " + table);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
}
