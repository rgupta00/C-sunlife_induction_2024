package com.demo1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component(value = "foo")
public class Foo {
    private String data;

    public Foo(){
        System.out.println("ctr is called");
    }

    @PostConstruct
    public void initByAnn(){
        System.out.println("annotion  wala method is called");
    }

    public void setData(String data) {
        this.data = data;
        System.out.println("public void setData(String data)");
    }

    public void doWork(){
        System.out.println("dowork method is called");
    }

    @PreDestroy
    public void annDestory(){
        System.out.println("it is destory anno wala method");
    }


}
