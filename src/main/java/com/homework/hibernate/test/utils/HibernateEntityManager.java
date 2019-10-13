package com.homework.hibernate.test.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateEntityManager {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("model-unit");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

}
