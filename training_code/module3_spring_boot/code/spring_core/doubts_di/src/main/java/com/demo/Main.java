package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=
                new AnnotationConfigApplicationContext(AppConfig.class);
        Foo f=ctx.getBean("foo",Foo.class);
        f.doWork();
    }
}