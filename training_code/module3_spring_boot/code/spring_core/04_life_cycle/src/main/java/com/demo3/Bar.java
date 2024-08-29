package com.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Bar {

    private Foo foo;

    public Bar(Foo foo) {
        this.foo = foo;
    }

    public void doWork(){
        foo.doWork();
        System.out.println("dowork of bar is called");
    }
}
