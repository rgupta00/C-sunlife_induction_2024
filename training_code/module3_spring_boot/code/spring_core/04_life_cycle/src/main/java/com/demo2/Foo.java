package com.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Foo {

    private Bar bar;

    @Autowired
    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public void doWork(){
        System.out.println("dowork method of foo is called");
    }
}
