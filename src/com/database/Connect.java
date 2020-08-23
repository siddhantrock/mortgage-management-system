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

    @Override
    protected void finalize() throws Throwable 
    {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        st.close();
        con.close();
    }
    
    
    
    public boolean addRecord(String table_name)
    {
        return false;
    }
    
    public boolean createTable(String year)
    {
        boolean flag=false;
        try 
        {
            st.execute("create table table_" + year + "(id int primary key , thing varchar(30) , type char(10) , n_gold int , "
                    + "n_silver int , n_total int , date1 char(10) , interest int , g_gold int , g_silver int , rupess int , description char(20))");
            
             st.execute("create table table_" + year + "_1(id int primary key , thing varchar(30) , type char(10) , n_gold int , "
                    + "n_silver int , n_total int , date1 char(10) , interest int , g_gold int , g_silver int , rupess int , description char(20))");
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
}
