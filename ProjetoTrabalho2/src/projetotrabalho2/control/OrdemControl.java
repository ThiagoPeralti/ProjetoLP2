/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetotrabalho2.control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import projetotrabalho2.model.Ordemservico;

public class OrdemControl {
    private EntityManagerFactory emf = null;
    private EntityManager em = null;
    
    public OrdemControl() {
        emf = Persistence.createEntityManagerFactory("ProjetoTrabalho2PU");
        em = emf.createEntityManager();
    }
    
    public void create(Ordemservico o) throws Exception {
        boolean transactionOk = false;

        try {
            em.getTransaction().begin();
            em.persist(o);
            transactionOk = true;
        } catch (javax.persistence.PersistenceException pe) {
            throw new Exception("Registro já existe! Falha ao tentar salvar nova ordem!");
        } finally {
            if (transactionOk) {
                em.getTransaction().commit();
            } else {
                em.getTransaction().rollback();
            }
        }
        
    }
    
    public Ordemservico search(Integer nroservico) throws Exception{
        Ordemservico o = null;

        Query q = em.createNamedQuery("Ordemservico.findByNroservico");
        q.setParameter("nroservico", nroservico);
        List<Ordemservico> list = (List<Ordemservico>) q.getResultList();
        if (!list.isEmpty()) {
            o = (Ordemservico) list.get(0); //pega o primeiro elemento da lista
        }
        return o;
    }
    
    public List<Ordemservico> retrieveAll() throws Exception {
        List<Ordemservico> list = null;

        Query q = em.createNamedQuery("Ordemservico.findAll");
        list = (List<Ordemservico>) q.getResultList();

        return list;
    }
    
    public void update(Ordemservico o) throws Exception {
        boolean transactionOk = false;

        try {
            em.getTransaction().begin();
            em.merge(o);
            transactionOk = true;
        } catch (javax.persistence.PersistenceException pe) {
            throw new Exception("Falha ao atualizar Ordem de Serviço!");
        } finally {
            if (transactionOk) {
                em.getTransaction().commit();
            } else {
                em.getTransaction().rollback();
            }
        }

    }
    
    
    
    public void delete(Ordemservico o) throws Exception{
        boolean transactionOk = false;

        try {
            em.getTransaction().begin();
            em.remove(o);
            transactionOk = true;
        } catch (javax.persistence.PersistenceException pe) {
            throw new Exception("Falha ao excluir Ordem de Serviço!");
        } finally {
            if (transactionOk) {
                em.getTransaction().commit();
            } else {
                em.getTransaction().rollback();
            }
        }
    }
    
    
    
    
    
}
