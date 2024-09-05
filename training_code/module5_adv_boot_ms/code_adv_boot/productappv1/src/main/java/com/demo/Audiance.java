package com.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audiance {

    @Before("execution( * com.demo..*.do*(..))")
    public void clapping(){
        System.out.println("logging...");
    }

//    @Around("execution(public String doMagic())")
//    public Object clapping(ProceedingJoinPoint proceedingJoinPoint){
//        Object result=null;
//        long start= System.currentTimeMillis();
//        try {
//             result=proceedingJoinPoint.proceed();
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }
//        long end= System.currentTimeMillis();
//        System.out.println("time taken :"+(end-start)+" ms");
//        return result;
//    }


   // @After("execution(public void doMagic())")
//  @AfterThrowing(pointcut = "execution(public void doMagic())", throwing = "ex")
//    public void clapping(DizznessException ex){
//      System.out.println(ex.getMessage());
//        System.out.println("call the dr");
//    }



    //Aspect =advice + pointcut
//    @Pointcut("execution(public void doMagic())")
//    public void foo(){}
//
//    @Before("foo()")
//    public void clapping(){
//        System.out.println("maza aa gaya");
//    }
}
