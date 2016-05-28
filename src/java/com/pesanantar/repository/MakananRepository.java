/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesanantar.repository;

import com.pesanantar.entity.Makanan;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author ASUS
 */
@Stateless
public class MakananRepository {
    @PersistenceContext(unitName = "PesanAntar2PU")
    private EntityManager em;

    public List<Makanan> findAll() {
        TypedQuery<Makanan> query = em.createNamedQuery("Makanan.findAll", Makanan.class);
        return query.getResultList();
    }
    
    public List<Makanan> findbyRestoran(String id_restoran){
        TypedQuery<Makanan> query = em.createNamedQuery("Makanan.findByRestoranId", Makanan.class);
        query.setParameter("restoranId", id_restoran);
//        query.setParameter("restoranId", id_restoran);
        return query.getResultList();
    }
    
    public Makanan findbyRestoranAndMakanan(String id_restoran, String id_makanan){
        TypedQuery<Makanan> query = em.createNamedQuery("Makanan.findByRestoranIdAndMakananId", Makanan.class);
        query.setParameter("restoranId", id_restoran);
        query.setParameter("makananId", id_makanan);
        return query.getSingleResult();
    }
    
    public void create(Makanan entity) {
        em.persist(entity);
    }
}
