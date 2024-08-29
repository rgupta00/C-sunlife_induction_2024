package com.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bar {

    private Foo foo;

    @Autowired
    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public void doWork(){
        System.out.println("dowork of bar is called");
    }
}
