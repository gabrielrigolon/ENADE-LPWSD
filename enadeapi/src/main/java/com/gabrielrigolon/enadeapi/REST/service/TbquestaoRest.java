/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielrigolon.enadeapi.REST.service;

import com.gabrielrigolon.enadeapi.dao.QuestaoDAO;
import com.gabrielrigolon.enadeapi.dao.QuestaoDAO;
import com.gabrielrigolon.enadeapi.models.Tbquestao;
import com.gabrielrigolon.enadeapi.models.Tbquestao;
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
@Path("com.gabrielrigolon.enadeapi.models.tbquestao")
public class TbquestaoRest {

      @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Tbquestao entity) {
       QuestaoDAO.getInstance().persist(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, Tbquestao entity) {
        Tbquestao objBD =  QuestaoDAO.getInstance().find(id);
        objBD = entity;
        QuestaoDAO.getInstance().persist(objBD);
            
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        QuestaoDAO.getInstance().remove(id);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Gson find(@PathParam("id") Integer id) {
        Gson gson =new Gson();
        gson.toJson(QuestaoDAO.getInstance().find(id));
        return gson;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Gson findAll() {
        Gson gson = new Gson();
        gson.toJson(QuestaoDAO.getInstance().getList());
        return gson;
    }    
}
