package com.bankapp.hello;

import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.math.BigDecimal;

public class D_Update {
    public static void main(String[] args) {
        SessionFactory sessionFactory=HibernateSessionFactory.getSessionFactory();

        Session session=sessionFactory.openSession();

        //tx mgt
        Transaction tx= session.getTransaction();
        try{
            tx.begin();

            //Write behind
            Account account=session.get(Account.class, 1);
            account.setBalance(account.getBalance().add(BigDecimal.valueOf(2000)));

            account.setBalance(account.getBalance().add(BigDecimal.valueOf(2200)));


            account.setBalance(account.getBalance().add(BigDecimal.valueOf(2500)));

            System.out.println("---------------------");
            session.update(account);

            tx.commit();

        }catch (HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }

        session.close();
        sessionFactory.close();
    }
}
