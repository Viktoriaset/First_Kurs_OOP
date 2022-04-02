package com.yet.spring.loggers;

import com.yet.spring.Event;

public class ConsoleEventLogger extends AbstractLogger {
    @Override
    public void LogEvent(Event event){
        System.out.println(event.getAllValues());
    }

}
