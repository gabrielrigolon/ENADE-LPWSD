/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielrigolon.enadeapi.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author grsilva1
 */
@Entity
@Table(name = "tbtipousuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbtipousuario.findAll", query = "SELECT t FROM Tbtipousuario t"),
    @NamedQuery(name = "Tbtipousuario.findByIdTipoUsuario", query = "SELECT t FROM Tbtipousuario t WHERE t.idTipoUsuario = :idTipoUsuario"),
    @NamedQuery(name = "Tbtipousuario.findByNomeTipoUsuario", query = "SELECT t FROM Tbtipousuario t WHERE t.nomeTipoUsuario = :nomeTipoUsuario")})
public class Tbtipousuario implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "nomeTipoUsuario")
    private String nomeTipoUsuario;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipoUsuario")
    private Integer idTipoUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbTipoUsuarioidTipoUsuario")
    private List<Tbusuario> tbusuarioList;

    public Tbtipousuario() {
    }

    public Tbtipousuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public Tbtipousuario(Integer idTipoUsuario, String nomeTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.nomeTipoUsuario = nomeTipoUsuario;
    }

    public Integer getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }


    @XmlTransient
    public List<Tbusuario> getTbusuarioList() {
        return tbusuarioList;
    }

    public void setTbusuarioList(List<Tbusuario> tbusuarioList) {
        this.tbusuarioList = tbusuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoUsuario != null ? idTipoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbtipousuario)) {
            return false;
        }
        Tbtipousuario other = (Tbtipousuario) object;
        if ((this.idTipoUsuario == null && other.idTipoUsuario != null) || (this.idTipoUsuario != null && !this.idTipoUsuario.equals(other.idTipoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabrielrigolon.enadeapi.models.Tbtipousuario[ idTipoUsuario=" + idTipoUsuario + " ]";
    }

    public String getNomeTipoUsuario() {
        return nomeTipoUsuario;
    }

    public void setNomeTipoUsuario(String nomeTipoUsuario) {
        this.nomeTipoUsuario = nomeTipoUsuario;
    }
    
}
