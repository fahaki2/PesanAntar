/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesanantar.rest;

import com.pesanantar.entity.Pesanan;
import com.pesanantar.entity.Restoran;
import com.pesanantar.repository.PesananRepository;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author ASUS
 */
@Stateless
@Path("pesanan")
public class PesananResource {
    @EJB
    private PesananRepository pesananRepository;
    
    
    @GET
    @Produces("application/json")
    public List<Pesanan> findAll() {
        return pesananRepository.findAll();
    }
    
    @POST
    @Consumes("application/json")
    public void create(Pesanan entity) {
        pesananRepository.create(entity);
    }
}
