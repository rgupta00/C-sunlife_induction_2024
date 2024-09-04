package com.bankapp.hello;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;


public class Add_Account {
    public static void main(String[] args) {
        //SessionFactory
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("sunlife");

        EntityManager em=emf.createEntityManager();

        EntityTransaction tx=em.getTransaction();

        try{
            tx.begin();

            Account account=new Account("ekta", BigDecimal.valueOf(20000),"6465656908");
            em.persist(account);

            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }
        em.close();
        emf.close();
    }
}
