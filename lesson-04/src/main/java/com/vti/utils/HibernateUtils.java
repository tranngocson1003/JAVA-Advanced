package com.vti.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static SessionFactory sessionFactory;

    public static Session openSession() {
        if (sessionFactory == null || sessionFactory.isClosed()) {
            Configuration configuration = new Configuration().configure();
            configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory.openSession();
    }

    public static void closeFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}
