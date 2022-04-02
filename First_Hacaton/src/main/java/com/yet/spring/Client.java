
package com.yet.spring;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {



    String id;
    String fullName;
    String greeting;

    public Client(String id, String fullName){
        this.id = id;
        this.fullName = fullName;
    }

    public String getId(){
        return this.id;
    }

    public String getFullName(){
        return this.fullName + " " + greeting;
    }

    public void setGreeting(String s){
        this.greeting = s;
    }
}

