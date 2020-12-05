/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielrigolon.enadeapi.dao;

import com.gabrielrigolon.enadeapi.models.Tbresultado;
import java.io.Serializable;

/**
 *
 * @author grsilva1
 */
public class ResultadoDAO extends GenericDAO<Tbresultado, Integer> implements Serializable {
    
    public static ResultadoDAO resultadoDAO;
    
    public ResultadoDAO() {
        super(Tbresultado.class);
    }
    
    public static ResultadoDAO getInstance() {
    
        if (resultadoDAO == null) {
            resultadoDAO = new ResultadoDAO();
        }
        return resultadoDAO;
    }
    
}