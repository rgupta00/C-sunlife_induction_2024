package com.demo;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//Proxy dp: AOP
@Component(value = "magician")
 public class Magician {

    public void doMagic(int x){
        System.out.println("public void doMagic()");
    }
    public void doEat(Object food){
        System.out.println(" public void doEat()");
    }
    public Kid getKidsFromSchool(){
        System.out.println(" are let me take kids from school");
        return new Kid();
    }
}
