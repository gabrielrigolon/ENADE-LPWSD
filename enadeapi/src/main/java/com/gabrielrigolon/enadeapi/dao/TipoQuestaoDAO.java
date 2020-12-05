/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielrigolon.enadeapi.dao;

import com.gabrielrigolon.enadeapi.models.Tbtipoquestao;
import java.io.Serializable;

/**
 *
 * @author grsilva1
 */
public class TipoQuestaoDAO extends GenericDAO<Tbtipoquestao, Integer> implements Serializable {
    
    public static TipoQuestaoDAO tipoQuestaoDAO;
    
    public TipoQuestaoDAO() {
        super(Tbtipoquestao.class);
    }
    
    public static TipoQuestaoDAO getInstance() {
    
        if (tipoQuestaoDAO == null) {
            tipoQuestaoDAO = new TipoQuestaoDAO();
        }
        return tipoQuestaoDAO;
    }
    
}