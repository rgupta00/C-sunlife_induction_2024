package com.bankapp.hello;

import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.math.BigDecimal;

public class E_Delete {
    public static void main(String[] args) {
        SessionFactory sessionFactory=HibernateSessionFactory.getSessionFactory();

        Session session=sessionFactory.openSession();

        //tx mgt
        Transaction tx= session.getTransaction();
        try{
            tx.begin();

            //Write behind
            Account account=session.get(Account.class, 1);
            if(account!=null)
                session.delete(account);
            tx.commit();

        }catch (HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }

        session.close();
        sessionFactory.close();
    }
}
