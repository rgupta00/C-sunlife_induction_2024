package com.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Foo implements InitializingBean, DisposableBean {
    private String data;

    public Foo(){
        System.out.println("ctr is called");
    }

    @PostConstruct
    public void initByAnn(){
        System.out.println("annotion  wala method is called");
    }
    public void fooInit(){
        System.out.println("fooInit xml wala method is called");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("fooInit InitializingBean wala method is called");
    }
    public void setData(String data) {
        this.data = data;
        System.out.println("public void setData(String data)");
    }

    public void doWork(){
        System.out.println("dowork method is called");
    }

    public void fooDestory(){
        System.out.println("it is destory xml wala method");
    }

    @PreDestroy
    public void annDestory(){
        System.out.println("it is destory anno wala method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("it is destory DisposableBean wala method");
    }
}
