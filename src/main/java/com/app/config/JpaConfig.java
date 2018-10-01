package com.app.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaConfig {
    private static final String PERSISTENCE_UNIT_NAME = "employee";
    private static EntityManagerFactory factory =  Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public EntityManager createEntityManager(){
        EntityManager em = factory.createEntityManager();
        return em;
    }
}
