package com.bankapp.hello3;

import com.bankapp.factory.HibernateSessionFactory;
import com.bankapp.hello.Account;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.math.BigDecimal;

public class A_Insert {
    public static void main(String[] args) {
        SessionFactory sessionFactory=HibernateSessionFactory.getSessionFactory();

        Session session=sessionFactory.openSession();

        //tx mgt
        Transaction tx= session.getTransaction();
        try{
            tx.begin();
            Address address=new Address("banglore");
            Customer customer=new Customer("umesh");
            Object o=session.save(address);
            System.out.println(o);
            session.save(customer);

            System.out.println("------------------------------");
            tx.commit();

        }catch (HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }

        session.close();
        sessionFactory.close();
    }
}
