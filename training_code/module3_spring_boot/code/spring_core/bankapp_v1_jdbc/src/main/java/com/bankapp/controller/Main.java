package com.bankapp.controller;

import com.bankapp.config.AppConfig;
import com.bankapp.repo.Account;
import com.bankapp.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService accountService=ctx.getBean("accountService",AccountService.class);
        List<Account> accounts=accountService.getAll();
        accounts.forEach(acc-> System.out.println(acc));
//
//        accountService.transfer(1,2,10);
//
//        accounts=accountService.getAll();
//        accounts.forEach(acc-> System.out.println(acc));

    }
}