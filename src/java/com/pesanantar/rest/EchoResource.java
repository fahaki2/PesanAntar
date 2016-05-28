/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesanantar.rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author ASUS
 */
@Path("echo")
public class EchoResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EchoResource
     */
    public EchoResource() {
    }

    /**
     * Retrieves representation of an instance of com.pesanantar.rest.EchoResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
//        throw new UnsupportedOperationException();
        return "Hello World";
    }

    /**
     * PUT method for updating or creating an instance of EchoResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
