/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielrigolon.enadeapi.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author grsilva1
 */
@Entity
@Table(name = "tbresultado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbresultado.findAll", query = "SELECT t FROM Tbresultado t"),
    @NamedQuery(name = "Tbresultado.findByIdResultado", query = "SELECT t FROM Tbresultado t WHERE t.idResultado = :idResultado"),
    @NamedQuery(name = "Tbresultado.findByValorObtido", query = "SELECT t FROM Tbresultado t WHERE t.valorObtido = :valorObtido")})
public class Tbresultado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idResultado")
    private Integer idResultado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorObtido")
    private double valorObtido;
    @JoinColumn(name = "tbProva_idProva", referencedColumnName = "idProva")
    @ManyToOne(optional = false)
    private Tbprova tbProvaidProva;
    @JoinColumn(name = "tbUsuario_idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Tbusuario tbUsuarioidUsuario;

    public Tbresultado() {
    }

    public Tbresultado(Integer idResultado) {
        this.idResultado = idResultado;
    }

    public Tbresultado(Integer idResultado, double valorObtido) {
        this.idResultado = idResultado;
        this.valorObtido = valorObtido;
    }

    public Integer getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(Integer idResultado) {
        this.idResultado = idResultado;
    }

    public double getValorObtido() {
        return valorObtido;
    }

    public void setValorObtido(double valorObtido) {
        this.valorObtido = valorObtido;
    }

    public Tbprova getTbProvaidProva() {
        return tbProvaidProva;
    }

    public void setTbProvaidProva(Tbprova tbProvaidProva) {
        this.tbProvaidProva = tbProvaidProva;
    }

    public Tbusuario getTbUsuarioidUsuario() {
        return tbUsuarioidUsuario;
    }

    public void setTbUsuarioidUsuario(Tbusuario tbUsuarioidUsuario) {
        this.tbUsuarioidUsuario = tbUsuarioidUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResultado != null ? idResultado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbresultado)) {
            return false;
        }
        Tbresultado other = (Tbresultado) object;
        if ((this.idResultado == null && other.idResultado != null) || (this.idResultado != null && !this.idResultado.equals(other.idResultado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabrielrigolon.enadeapi.models.Tbresultado[ idResultado=" + idResultado + " ]";
    }
    
}
