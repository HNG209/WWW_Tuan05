package com.example.www_tuan05.daos.impl;

import com.example.www_tuan05.daos.DienThoaiDAO;
import com.example.www_tuan05.entities.DienThoai;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class DienThoaiDAOImpl implements DienThoaiDAO {
    EntityManagerFactory emf;

    public DienThoaiDAOImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<DienThoai> getDSDienThoai() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT d FROM DienThoai d", DienThoai.class)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public boolean addDienThoai(DienThoai dienThoai) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(dienThoai);
            tx.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (tx.isActive()) tx.rollback();
        } finally {
            em.close();
        }
        return false;
    }
}
