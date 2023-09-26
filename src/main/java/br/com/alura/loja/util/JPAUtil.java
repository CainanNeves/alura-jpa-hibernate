package br.com.alura.loja.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    public static final EntityManagerFactory FACTORY =
            Persistence.createEntityManagerFactory("loja-jpa");
    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }
}
