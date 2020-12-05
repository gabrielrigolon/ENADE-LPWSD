/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielrigolon.enadeapi.REST.service;

import com.gabrielrigolon.enadeapi.dao.ProvaDAO;
import com.gabrielrigolon.enadeapi.dao.ProvaDAO;
import com.gabrielrigolon.enadeapi.models.Tbprova;
import com.google.gson.Gson;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author grsilva1
 */
@Stateless
@Path("tbprova")
public class TbprovaRest {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Tbprova entity) {
       ProvaDAO.getInstance().persist(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, Tbprova entity) {
        Tbprova objBD =  ProvaDAO.getInstance().find(id);
        objBD = entity;
        ProvaDAO.getInstance().persist(objBD);
            
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        ProvaDAO.getInstance().remove(id);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Gson find(@PathParam("id") Integer id) {
        Gson gson =new Gson();
        gson.toJson(ProvaDAO.getInstance().find(id));
        return gson;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Gson findAll() {
        Gson gson = new Gson();
        gson.toJson(ProvaDAO.getInstance().getList());
        return gson;
    }    
}
