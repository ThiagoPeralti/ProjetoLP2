/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetotrabalho2.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author thiag
 */
@Entity
@Table(name = "caminhao")
@NamedQueries({
    @NamedQuery(name = "Caminhao.findAll", query = "SELECT c FROM Caminhao c"),
    @NamedQuery(name = "Caminhao.findByPlaca", query = "SELECT c FROM Caminhao c WHERE c.placa = :placa"),
    @NamedQuery(name = "Caminhao.findByModelo", query = "SELECT c FROM Caminhao c WHERE c.modelo = :modelo"),
    @NamedQuery(name = "Caminhao.findByFrota", query = "SELECT c FROM Caminhao c WHERE c.frota = :frota")})
public class Caminhao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "placa")
    private String placa;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "frota")
    private String frota;

    public Caminhao() {
    }

    public Caminhao(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFrota() {
        return frota;
    }

    public void setFrota(String frota) {
        this.frota = frota;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placa != null ? placa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caminhao)) {
            return false;
        }
        Caminhao other = (Caminhao) object;
        if ((this.placa == null && other.placa != null) || (this.placa != null && !this.placa.equals(other.placa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetotrabalho2.model.Caminhao[ placa=" + placa + " ]";
    }
    
}
