/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielrigolon.enadeapi.dao;

import com.gabrielrigolon.enadeapi.models.Tbtipousuario;
import java.io.Serializable;

/**
 *
 * @author grsilva1
 */
public class TipoUsuarioDAO extends GenericDAO<Tbtipousuario, Integer> implements Serializable {
    
    public static TipoUsuarioDAO tipoUsuarioDAO;
    
    public TipoUsuarioDAO() {
        super(Tbtipousuario.class);
    }
    
    public static TipoUsuarioDAO getInstance() {
    
        if (tipoUsuarioDAO == null) {
            tipoUsuarioDAO = new TipoUsuarioDAO();
        }
        return tipoUsuarioDAO;
    }
    
}
