package com.bankapp.hello;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;
import java.util.List;


public class GetAll {
    public static void main(String[] args) {
        //SessionFactory
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("sunlife");

        EntityManager em=emf.createEntityManager();

        EntityTransaction tx=em.getTransaction();

        List<Account> accounts=em
                .createQuery("select a from Account a", Account.class).getResultList();
       accounts.forEach(System.out::println);
        em.close();
        emf.close();
    }
}
