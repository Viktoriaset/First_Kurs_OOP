package com.yet.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Event {

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);

    public static void setAutoId(int id){
        AUTO_ID.set(id);
    }


    private int id;
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    public void Event(int id, String msg, Date date){
        this.id = id;
        this.msg = msg;
        this.date = date;
    }

    public Event(Date date, DateFormat df){
        this.id = AUTO_ID.getAndIncrement();
        this.date = date;
        this.dateFormat = df;

    }

    public void msgSetter(String msg){
        this.msg = msg;
    }

    public String msgGetter(){return this.msg;}


    public String getAllValues(){
        return "Id: " + id + ", msg: " + msg + ", date" + dateFormat.format(date);
    }
}
