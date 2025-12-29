package com.skillnext1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure()   // loads hibernate.cfg.xml
                    .buildSessionFactory();
        } catch (Throwable ex) {
            ex.printStackTrace();   // IMPORTANT: shows real error
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
