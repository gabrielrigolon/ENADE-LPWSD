/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielrigolon.enadeapi.dao;

import com.gabrielrigolon.enadeapi.models.Tbquestao;
import java.io.Serializable;

/**
 *
 * @author grsilva1
 */
public class QuestaoDAO extends GenericDAO<Tbquestao, Integer> implements Serializable {
    
    public static QuestaoDAO questaoDAO;
    
    public QuestaoDAO() {
        super(Tbquestao.class);
    }
    
    public static QuestaoDAO getInstance() {
    
        if (questaoDAO == null) {
            questaoDAO = new QuestaoDAO();
        }
        return questaoDAO;
    }
}
