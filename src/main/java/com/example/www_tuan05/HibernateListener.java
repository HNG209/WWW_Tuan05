package com.example.www_tuan05;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class HibernateListener implements ServletContextListener {
    private EntityManagerFactory emf;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        emf = Persistence.createEntityManagerFactory("default");
        sce.getServletContext().setAttribute("emf", emf);
        System.out.println("emf initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        if(emf != null && emf.isOpen()) {
            emf.close();
            System.out.println("emf closed");
        }
    }
}
