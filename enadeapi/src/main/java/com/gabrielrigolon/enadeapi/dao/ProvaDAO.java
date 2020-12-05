/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielrigolon.enadeapi.dao;

import com.gabrielrigolon.enadeapi.models.Tbprova;
import com.gabrielrigolon.enadeapi.models.Tbquestao;
import java.io.Serializable;

/**
 *
 * @author grsilva1
 */
public class ProvaDAO extends GenericDAO<Tbprova, Integer> implements Serializable {
    
    public static ProvaDAO provaDAO;
    
    public ProvaDAO() {
        super(Tbprova.class);
    }
    
    public static ProvaDAO getInstance() {
    
        if (provaDAO == null) {
            provaDAO = new ProvaDAO();
        }
        return provaDAO;
    }
}

