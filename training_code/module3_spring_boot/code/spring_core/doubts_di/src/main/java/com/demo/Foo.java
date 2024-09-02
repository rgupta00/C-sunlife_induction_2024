package com.demo;

import org.springframework.stereotype.Component;

@Component(value = "foo")
public class Foo {
    public void doWork(){
        System.out.println("do work...");
    }
}
