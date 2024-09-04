package com.bankapp.hello;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class GetById {
    public static void main(String[] args) {
        //SessionFactory
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("sunlife");

        EntityManager em=emf.createEntityManager();

        Account account=em.getReference(Account.class, 1);
        em.close();

        System.out.println(account);

        emf.close();
    }
}
