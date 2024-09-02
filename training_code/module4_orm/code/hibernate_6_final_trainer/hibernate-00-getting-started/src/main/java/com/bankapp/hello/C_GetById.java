package com.bankapp.hello;

import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class C_GetById {
    public static void main(String[] args) {
        SessionFactory sessionFactory=HibernateSessionFactory.getSessionFactory();

        Session session=sessionFactory.openSession();

        //if we wnat to get by id : we dont have to write HQl
        //get                           vs                                            load
        //Eager                         vs                                             Lazy
        //if rec is not found it will give null                                 ObjectNotFoundException
        //                                 vs                                   LazyInitializationException

        //Session is acting as first level cache, u can not disable it
        Account account=session.get(Account.class, 1);
        System.out.println("-----------------------");
        System.out.println(account);

       // session.evict(account);

        Account accountCopy=session.get(Account.class, 1);
        System.out.println(accountCopy);

        session.close();
        sessionFactory.close();
    }
}
