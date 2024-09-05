package com.productapp.service.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Aspect

public class PerformanceAspect {
    private Logger logger= LoggerFactory.getLogger(PerformanceAspect.class);
    @Around("@annotation(com.productapp.service.annotations.CalPerformance)")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long  start=System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        long end=System.currentTimeMillis();
        String methodName=proceedingJoinPoint.getSignature().getName();

        logger.info("time taken to execute {} method call is {} ms", methodName,(end-start));
        return result;
    }
}
