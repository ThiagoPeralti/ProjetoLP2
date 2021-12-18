/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetotrabalho2.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author thiag
 */
@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCpfcnpj", query = "SELECT c FROM Cliente c WHERE c.cpfcnpj = :cpfcnpj"),
    @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findByTelefone", query = "SELECT c FROM Cliente c WHERE c.telefone = :telefone")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpfcnpj")
    private String cpfcnpj;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @OneToMany(mappedBy = "cpfcnpj")
    private Collection<Ordemservico> ordemservicoCollection;

    public Cliente() {
    }

    public Cliente(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public Cliente(String cpfcnpj, String nome, String telefone) {
        this.cpfcnpj = cpfcnpj;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Collection<Ordemservico> getOrdemservicoCollection() {
        return ordemservicoCollection;
    }

    public void setOrdemservicoCollection(Collection<Ordemservico> ordemservicoCollection) {
        this.ordemservicoCollection = ordemservicoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpfcnpj != null ? cpfcnpj.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cpfcnpj == null && other.cpfcnpj != null) || (this.cpfcnpj != null && !this.cpfcnpj.equals(other.cpfcnpj))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetotrabalho2.model.Cliente[ cpfcnpj=" + cpfcnpj + " ]";
    }
    
}
