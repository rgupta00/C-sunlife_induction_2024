package com.bankapp.hello2;

import com.bankapp.factory.HibernateSessionFactory;
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

            Account account=new Account("umesh",
                    BigDecimal.valueOf(560065.96575),"5435454556");
            session.save(account);

            Account account2=new Account("anil",
                    BigDecimal.valueOf(760065.96575),"5435454556");
            session.save(account2);

            Account account3=new Account("suman",
                    BigDecimal.valueOf(360065.96575),"5435454556");
            session.save(account3);

            tx.commit();

        }catch (HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }

        session.close();
        sessionFactory.close();
    }
}
