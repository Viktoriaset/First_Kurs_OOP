package com.yet.spring.loggers;

import com.yet.spring.Event;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class CashFielEvetnLogger extends AbstractLogger{

    private int CashSize;
    private List<Event> EventList = new LinkedList<Event>();
    private String filename;
    File file;

    public CashFielEvetnLogger(String filename, int CashSize){
        this.filename = filename;
        this.CashSize = CashSize - 1;
        /*this.file = new File(this.filename);*/

    }

    public void init() throws IOException{
        file = new File(filename);
        if (file.exists() && !file.canWrite()) {
            throw new IllegalArgumentException("Can't write to file " + filename);
        } else if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public void LogEvent(Event event){
        System.out.println(EventList.size());
        if (EventList.size() < CashSize){
            EventList.add(event);
        }else{
            EventList.add(event);
            WriteCashtoFile();
        }
    }

    public void WriteCashtoFile(){

        String temp = "";
        for (Event i : EventList){
            temp = temp + i.getAllValues() + "\n";
        }
        try {
            FileUtils.writeStringToFile(file, temp, true);
            EventList.clear();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void destroy(){
        if (!EventList.isEmpty()){
            WriteCashtoFile();
        }
    }

}
