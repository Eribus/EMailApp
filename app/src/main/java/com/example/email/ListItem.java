package com.example.email;

import java.util.Calendar;

// Modellklasse
public class ListItem {
    private String sender;
    private String betreff;
    private String nachricht;
    private static int nummer=1;
    private int count;
    private Calendar calendar;

    public ListItem(String sender, String betreff,String nachricht, Calendar calendar) {
        this.sender = sender;
        this.betreff = betreff;
        this.calendar = calendar;
        this.nachricht = nachricht;
        this.count = nummer ++;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getBetreff() {
        return betreff;
    }

    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }

    public String getNachricht() {
        return nachricht;
    }

    public void setNachricht(String nachricht) {
        this.nachricht = nachricht;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
