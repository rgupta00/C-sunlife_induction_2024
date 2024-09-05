package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx=new AnnotationConfigApplicationContext
                (AppConfig.class);
        Magician magician= (Magician) ctx.getBean("magician");

        magician.doMagic(2);

    }
}
