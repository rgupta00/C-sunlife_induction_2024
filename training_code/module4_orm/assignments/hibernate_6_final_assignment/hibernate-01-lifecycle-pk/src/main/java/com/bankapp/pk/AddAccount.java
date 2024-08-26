package com.bankapp.pk;

import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.util.Date;

public class AddAccount {
    public static void main(String[] args) {

        SessionFactory factory=null;
      try{
           factory= HibernateSessionFactory.getSessionFactory();

          Session session=factory.openSession();


          Transaction tx= session.getTransaction();
          try{
              tx.begin();
              Account account=new Account("b",new BigDecimal(4440));
              Address address=new Address("delhi","A31 KN");

              //TODO write code to add accounts object to the database

          }catch (HibernateException ex){
              tx.rollback();
              ex.printStackTrace();
          }


          session.close();

      }finally {
          factory.close();
      }
    }

}