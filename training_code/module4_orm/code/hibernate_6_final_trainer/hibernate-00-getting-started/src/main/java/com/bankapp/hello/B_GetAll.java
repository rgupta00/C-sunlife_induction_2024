package com.bankapp.hello;

import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class B_GetAll {
    public static void main(String[] args) {
        SessionFactory sessionFactory=HibernateSessionFactory.getSessionFactory();

        Session session=sessionFactory.openSession();
        //No need to start tx mgt
        //SQL(Protablity problem) vs HQL(Hibernate Query language) vs JPQL
//        List<Account> accounts=session
//                .createQuery("select a from Account a", Account.class).list();
//
//        accounts.forEach(a-> System.out.println(a));

//        List<Object[]> accountHolderData=session
//                .createQuery("select a.name, a.balance from Account a", Object[].class).list();
//
//      for(Object[]arr: accountHolderData){
//          System.out.println(arr[0]+": "+ arr[1]);
//      }

//        List<Object[]> accountHolderData=session
//                .createQuery("select a.name, a.balance from Account a", Object[].class).list();
//
//        for(Object[]arr: accountHolderData){
//            System.out.println(arr[0]+": "+ arr[1]);
//        }

        List<AccountDto> accountHolderData=session
       .createQuery("select new com.bankapp.hello.AccountDto(a.name, a.balance) from Account a", AccountDto.class).list();

        for(AccountDto accountDto: accountHolderData){
            System.out.println(accountDto);
        }

        session.close();
        sessionFactory.close();
    }
}
