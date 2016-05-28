/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesanantar.rest;

import com.pesanantar.entity.Restoran;
import com.pesanantar.repository.RestoranRepository;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author ASUS
 */
@Stateless
@Path("restoran")
public class RestoranResource {
    @EJB
    private RestoranRepository restoranRepository;
    
    @GET
    @Produces({"application/xml", "application/json"})
    public List<Restoran> findAll() {
        return restoranRepository.findAll();
    }
    
    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Restoran find(@PathParam("id") String id) {
        return restoranRepository.find(id);
    }
    
//    @POST
//    @Consumes({"application/xml", "application/json"})
//    public void create(Restoran entity) {
//        super.create(entity);
//    }
    
}
