/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielrigolon.enadeapi.dao;

import com.gabrielrigolon.enadeapi.models.Tbusuario;
import java.io.Serializable;

/**
 *
 * @author grsilva1
 */
public class UsuarioDAO extends GenericDAO<Tbusuario, Integer> implements Serializable {
    
    public static UsuarioDAO usuarioDAO;
    
    public UsuarioDAO() {
        super(Tbusuario.class);
    }
    
    public static UsuarioDAO getInstance() {
    
        if (usuarioDAO == null) {
            usuarioDAO = new UsuarioDAO();
        }
        return usuarioDAO;
    }
    
}
