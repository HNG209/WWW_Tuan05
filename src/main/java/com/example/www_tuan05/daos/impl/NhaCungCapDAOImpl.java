package com.example.www_tuan05.daos.impl;

import com.example.www_tuan05.daos.NhaCungCapDAO;
import com.example.www_tuan05.entities.DienThoai;
import com.example.www_tuan05.entities.NhaCungCap;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class NhaCungCapDAOImpl implements NhaCungCapDAO {
    EntityManagerFactory emf;
    public NhaCungCapDAOImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }
    @Override
    public List<NhaCungCap> getDSNCC() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT ncc FROM NhaCungCap ncc", NhaCungCap.class)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public NhaCungCap findById(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(NhaCungCap.class, id);
        } finally {
            em.close();
        }
    }
}
