package com.sunlife.empapp.dao.factory;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaEMFactory {
    private static EntityManagerFactory emf;
    private JpaEMFactory(){};
    public static EntityManagerFactory entityManagerFactory(){
        emf=
                Persistence.createEntityManagerFactory("sunlife");
        return emf;
    }

}
