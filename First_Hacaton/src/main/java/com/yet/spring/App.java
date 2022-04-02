package com.yet.spring;

import com.yet.spring.loggers.ConsoleEventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yet.spring.loggers.EventLogger;
import com.yet.spring.Event;

public class App {

    Client client;
    EventLogger eventLogger;

    public App(Client client, EventLogger eventLogger){
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args){

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) ctx.getBean("app");

        for (int i = 0; i < 5; i++) {
            Event event = (Event) ctx.getBean("Event");
            event.msgSetter(app.client.getFullName());

            app.eventLogger.LogEvent(event);
        }

        ctx.close();
    }

    private void logEvent(String msg){
        String message = msg + client.getFullName();

    }

}
