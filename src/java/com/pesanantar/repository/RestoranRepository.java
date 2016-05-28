/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesanantar.repository;

import com.pesanantar.entity.Restoran;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.PathParam;

/**
 *
 * @author ASUS
 */
@Stateless
public class RestoranRepository {
    @PersistenceContext(unitName = "PesanAntar2PU")
    private EntityManager em;

    public List<Restoran> findAll() {
        TypedQuery<Restoran> query = em.createNamedQuery("Restoran.findAll", Restoran.class);
        return query.getResultList();
    }
    
    public Restoran find(String id){
        TypedQuery<Restoran> query = em.createNamedQuery("Restoran.findByRestoranId", Restoran.class);
        query.setParameter("restoranId", id);
        return query.getSingleResult();
    }
}
