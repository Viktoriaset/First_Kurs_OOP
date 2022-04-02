package com.yet.spring.loggers;

import com.yet.spring.Event;

public interface EventLogger {
    public void LogEvent(Event event);

    public String getName();

}
