/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesanantar.repository;

import com.pesanantar.entity.Pesanan;
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
public class PesananRepository {
    @PersistenceContext(unitName = "PesanAntar2PU")
    private EntityManager em;
    
    public List<Pesanan> findAll() {
        TypedQuery<Pesanan> query = em.createNamedQuery("Pesanan.findAll", Pesanan.class);
        return query.getResultList();
    }
    
    public void create(Pesanan entity) {
        em.persist(entity);
    }
}
