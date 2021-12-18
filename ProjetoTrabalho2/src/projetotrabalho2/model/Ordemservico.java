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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author thiag
 */
@Entity
@Table(name = "ordemservico")
@NamedQueries({
    @NamedQuery(name = "Ordemservico.findAll", query = "SELECT o FROM Ordemservico o"),
    @NamedQuery(name = "Ordemservico.findByNroservico", query = "SELECT o FROM Ordemservico o WHERE o.nroservico = :nroservico"),
    @NamedQuery(name = "Ordemservico.findByDataservico", query = "SELECT o FROM Ordemservico o WHERE o.dataservico = :dataservico"),
    @NamedQuery(name = "Ordemservico.findByValorservico", query = "SELECT o FROM Ordemservico o WHERE o.valorservico = :valorservico"),
    @NamedQuery(name = "Ordemservico.findByPlaca", query = "SELECT o FROM Ordemservico o WHERE o.placa = :placa"),
    @NamedQuery(name = "Ordemservico.findByModelo", query = "SELECT o FROM Ordemservico o WHERE o.modelo = :modelo"),
    @NamedQuery(name = "Ordemservico.findByFrota", query = "SELECT o FROM Ordemservico o WHERE o.frota = :frota")})
public class Ordemservico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nroservico")
    private Integer nroservico;
    @Basic(optional = false)
    @Column(name = "dataservico")
    private String dataservico;
    @Basic(optional = false)
    @Column(name = "valorservico")
    private String valorservico;
    @Basic(optional = false)
    @Column(name = "placa")
    private String placa;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "frota")
    private String frota;
    @JoinColumn(name = "cpfcnpj", referencedColumnName = "cpfcnpj")
    @ManyToOne
    private Cliente cpfcnpj;
    
    public Ordemservico() {
    }

    public Ordemservico(Integer nroservico) {
        this.nroservico = nroservico;
    }

    public Ordemservico(Integer nroservico, String dataservico, String valorservico, String placa) {
        this.nroservico = nroservico;
        this.dataservico = dataservico;
        this.valorservico = valorservico;
        this.placa = placa;
    }

    public Integer getNroservico() {
        return nroservico;
    }

    public void setNroservico(Integer nroservico) {
        this.nroservico = nroservico;
    }

    public String getDataservico() {
        return dataservico;
    }

    public void setDataservico(String dataservico) {
        this.dataservico = dataservico;
    }

    public String getValorservico() {
        return valorservico;
    }

    public void setValorservico(String valorservico) {
        this.valorservico = valorservico;
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

    public Cliente getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(Cliente cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nroservico != null ? nroservico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordemservico)) {
            return false;
        }
        Ordemservico other = (Ordemservico) object;
        if ((this.nroservico == null && other.nroservico != null) || (this.nroservico != null && !this.nroservico.equals(other.nroservico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetotrabalho2.model.Ordemservico[ nroservico=" + nroservico + " ]";
    }
    
}