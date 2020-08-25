package com.database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            System.out.println("connection close");
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
