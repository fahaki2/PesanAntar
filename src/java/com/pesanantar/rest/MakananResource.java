/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesanantar.rest;

import com.pesanantar.entity.Makanan;
import com.pesanantar.repository.MakananRepository;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author ASUS
 */
@Stateless
@Path("makanan")
public class MakananResource {
    
    @EJB
    private MakananRepository makananRepository;
    
    @GET
    @Produces({"application/xml", "application/json"})
    public List<Makanan> findAll() {
        return makananRepository.findAll();
    }
    
    @GET
    @Path("{id_restoran}")
    @Produces({"application/xml", "application/json"})
    public List<Makanan> findbyRestoran(@PathParam("id_restoran") String id_restoran) {
        return makananRepository.findbyRestoran(id_restoran);
    }
     
    @GET
    @Path("{id_restoran}/{id_makanan}")
    @Produces({"application/xml", "application/json"})
    public Makanan findbyRestoranAndMakanan(@PathParam("id_restoran") String id_restoran, @PathParam("id_makanan") String id_makanan) {
        return makananRepository.findbyRestoranAndMakanan(id_restoran, id_makanan);
    }
    
    @POST
    @Consumes({"application/xml", "application/json"})
    public void create(Makanan entity) {
        makananRepository.create(entity);
    }
}
