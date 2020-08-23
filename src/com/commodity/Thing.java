package com.commodity;

public class Thing 
{
    private int id;
    private String thing;
    private String type;
    private int n_gold;
    private int n_silver;
    private int n_total;
    private String date;
    private int interest;
    private int g_gold;
    private int g_silver;
    private int rupess;
    private String description;

    public Thing(int id, String thing, String type, int n_gold, int n_silver, int n_total, String date, int interest, int g_gold, int g_silver, int rupess, String description) {
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

    public Thing(int id, String thing, String type, int n_gold, int n_silver, int n_total, String date, int interest, int g_gold, int g_silver, int rupess) {
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

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public int getG_gold() {
        return g_gold;
    }

    public void setG_gold(int g_gold) {
        this.g_gold = g_gold;
    }

    public int getG_silver() {
        return g_silver;
    }

    public void setG_silver(int g_silver) {
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
        
        if(date.length() == 0)
        {
            throw new RuntimeException("Date cannot be empty");
        }
        
    }
    
}
