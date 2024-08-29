package com.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Foo {

    public void doWork(){
        System.out.println("hashcode of Foo: "+this.hashCode());
        System.out.println("dowork method of foo is called");
    }
}
