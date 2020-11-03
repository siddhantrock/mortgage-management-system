package com.commodity;

import com.database.Connect;
import java.sql.ResultSet;
import java.util.Date;

public class Thing 
{
    private int id;
    private String thing;
    private String type;
    private int n_gold;
    private int n_silver;
    private int n_total;
    private String date;
    private float interest;
    private float g_gold;
    private float g_silver;
    private int rupess;
    private String description;

    public Thing(int id, String thing, String type, int n_gold, int n_silver, int n_total, String date, float interest, float g_gold, float g_silver, int rupess, String description) {
        this.id = id;
        this.thing = thing;
        this.type = type;
        this.n_gold = n_gold;
        this.n_silver = n_silver;
        this.n_total = n_total;
        this.date = date;
        this.interest = interest;
        this.g_gold = g_gold;
        this.g_silver = g_silver;
        this.rupess = rupess;
        this.description = description;
    }

    public Thing(int id, String thing, String type, int n_gold, int n_silver, int n_total, String date, float interest, float g_gold, float g_silver, int rupess) {
        this.id = id;
        this.thing = thing;
        this.type = type;
        this.n_gold = n_gold;
        this.n_silver = n_silver;
        this.n_total = n_total;
        this.date = date;
        this.interest = interest;
        this.g_gold = g_gold;
        this.g_silver = g_silver;
        this.rupess = rupess;
    }

    public Thing(int id, String thing, String date) {
        this.id = id;
        this.thing = thing;
        this.date = date;
    }

    public Thing(int id) {
        this.id = id;
    }

    public Thing(int id, String thing) {
        this.id = id;
        this.thing = thing;
    }
    
    public Thing(int id , String date,boolean flag)
    {
        this.id = id;
        this.date = date;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getN_gold() {
        return n_gold;
    }

    public void setN_gold(int n_gold) {
        this.n_gold = n_gold;
    }

    public int getN_silver() {
        return n_silver;
    }

    public void setN_silver(int n_silver) {
        this.n_silver = n_silver;
    }

    public int getN_total() {
        return n_total;
    }

    public void setN_total(int n_total) {
        this.n_total = n_total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public float getG_gold() {
        return g_gold;
    }

    public void setG_gold(float g_gold) {
        this.g_gold = g_gold;
    }

    public float getG_silver() {
        return g_silver;
    }

    public void setG_silver(float g_silver) {
        this.g_silver = g_silver;
    }

    public int getRupess() {
        return rupess;
    }

    public void setRupess(int rupess) {
        this.rupess = rupess;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public void validate()throws Exception
    {
        if(id==0)
        {
            throw new RuntimeException("ID cannot be zero or empty");
        }
        
        if(thing.length() == 0)
        {
            throw new RuntimeException("Thing cannot be empty");
        }
        
        if(type.length() == 0)
        {
            throw new RuntimeException("Type cannot be empty");
        }
        
        if(n_total == 0)
        {
            throw new RuntimeException("Total cannot be zero");
        }
        
        if(date.length() == 0)
        {
            throw new RuntimeException("Date cannot be empty");
        }
        
    }
    
    public void searchValidate()throws Exception
    {
        if(id==0)
        {
            throw new RuntimeException("ID cannot be zero or empty");
        }
        
    }
    
    public boolean insertThing(Connect connect , String table , boolean description)
    {
        boolean flag = false;
        
        if(description == false)
        {
            flag = connect.addRecord("insert into " + table + "(id,thing,type,n_gold,n_silver,n_total,date1,interest,g_gold,g_silver,rupess) values"
                + "(" + id + ",'" + thing + "','" + type + "'," + n_gold + "," + n_silver + "," + n_total + ",'" + date + "'," + interest
                + "," + g_gold + "," + g_silver + "," + rupess + ")");
        }
        else if(description == true)
        {
            flag = connect.addRecord("insert into " + table + "values"
                + "(" + id + ",'" + thing + "','" + type + "'," + n_gold + "," + n_silver + "," + n_total + ",'" + date + "'," + interest
                + "," + g_gold + "," + g_silver + "," + rupess + ",'" + this.description + "')");
        }
        return flag;
    }
    
    public ResultSet retriveThing(Connect connect , String table,boolean thing , boolean date)
    {
        ResultSet rs = null;
        
        if(thing == false && date == false)
        {
            rs = connect.getRecord("select * from " + table + " where id = " + id);
        }
        
        else if(thing == true)
        {
            rs = connect.getRecord("select * from " + table + " where id = " + id + " and thing = '" + this.thing + "'");
        }
                
        else if(date == true)
        {
            rs = connect.getRecord("select * from " + table + " where id = " + id + " and date = '" + this.date + "'");
        }
                
        else if(thing == true && date == true)
        {
            rs = connect.getRecord("select * from " + table + " where id = " + id + " and thing = '" + this.thing + "' and date = '" + this.date + "'");
        }
        return rs;
    }
    
    public static boolean removeThing(Connect connect , String table , int id , int rupess , String date)
    {
        boolean flag = connect.deleteRecord(table, id , rupess , date);
        
        return flag;
    }
    
    public boolean modifyDescription(Connect connect,String table, int id , String data)
    {
        boolean flag = false;
        
        flag = connect.updateRecord("update " + table + " set description = '" + data + "' where id = " + id);
        
        return flag;
    }
    
    public boolean modifyThing(Connect connect,String query,int id)
    {
        boolean flag=false;
        
        query += " where id = " + id;
        flag = connect.updateRecord(query);
        
        return flag;
    }
    
    public static String[] dateDifference(String date , float rate , int rupess)
    {
        int total_days_difference , days , months = 0 , years = 0 , start_month , start_year;
        float interest=0,si;
        String date_difference_string = "";
        String data[] = new String[2];
        
        total_days_difference = (int)((new Date().getTime() - new Date(date).getTime())/(1000*60*60*24));
        start_month = Integer.parseInt(date.substring(0, 2));
        start_year = Integer.parseInt(date.substring(6));
        
        while(total_days_difference >= 28)
        {
            if((start_month == 1 || start_month == 3 || start_month == 5 || start_month == 7 || start_month == 8 || start_month == 10 || start_month == 12) && total_days_difference >=31)
            {
                months++;
                total_days_difference -= 31;
            }
            else if((start_month == 4 || start_month == 6 || start_month == 9 || start_month == 11) && total_days_difference >= 30)
            {
                months++;
                total_days_difference -= 30;
            }
            else if(start_month == 2)
            {
                if(start_year % 400 == 0)
                {
                    months++;
                    total_days_difference -= 29;
                }
                else if(start_month % 100 == 0)
                {
                    months++;
                    total_days_difference -= 29;
                }
                else if(start_month % 4 == 0)
                {
                    months++;
                    total_days_difference -= 29;
                }
                else
                {
                    months++;
                    total_days_difference -= 28;
                }
            }
            
            start_month++;
            
            if(start_month == 13)
            {
                start_month = 1;
                start_year++;
            }
        }
        
        days = Math.abs(total_days_difference);
        
        if(months == 0 && days != 0)
        {
            months = 1;
            days = 0;
        }
        
        if(months % 12 == 0 &&  days != 0)
        {
            months++;
            days = 0;
        }
        
        if(months <=12)
        {
            si = (rupess * months * rate)/100;
            interest = Math.round(si);
            date_difference_string = months + " month";
        
        
            if(days != 0)
            {
                si = (((rupess * 1 * rate)/100)/30)*days;
                interest = Math.round(interest + si);
            }
        
            if(months !=0 && days != 0)
            {
                date_difference_string = months + " Month " + days + "day";
            }
        }
        else if(months >12)
        {
            int temp = months;
            int year_month = 0;
            int year_temp = 0;
            
            while(temp > 0)
            {
                if(temp > 12)
                {
                    temp = temp/12;
                    years = temp;
                    year_temp = temp;
                    
                }
                else
                {
                    year_month = months - years*12;
                    temp--;
                }
            }
            date_difference_string = years + " year";
            interest = 0;
            
            while(year_temp > 0)
            {
                si = (rupess * rate * 12)/100;
                rupess = rupess + Math.round(si);
                interest = Math.round(interest + si);
                year_temp--;
            }
            
            if(year_month != 0)
            {
                si = (rupess * rate * year_month)/100;
                interest = Math.round(interest + si);
                date_difference_string = years + " year " + year_month + "month";
            }
            
            if(days != 0)
            {
                si = (((rupess * rate * 1)/100)/30)*days;
                interest = Math.round(interest + si);
                date_difference_string = years + " year " + year_month + "month " + days + "day";
            }
        }
        
        data[0] = date_difference_string;
        data[1] = (int)interest + "";
        
        return data;
    }
}
