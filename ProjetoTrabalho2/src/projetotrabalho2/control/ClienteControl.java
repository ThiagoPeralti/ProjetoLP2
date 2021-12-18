package projetotrabalho2.control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import projetotrabalho2.model.Cliente;

public class ClienteControl {
    
    private EntityManagerFactory emf = null;
    private EntityManager em = null;
    
    public  ClienteControl() {
        emf = Persistence.createEntityManagerFactory("ProjetoTrabalho2PU");
        em = emf.createEntityManager();
    }
    
    public void create(Cliente c) throws Exception {
        boolean transactionOk = false;

        try {
            em.getTransaction().begin();
            em.persist(c);
            transactionOk = true;
        } catch (javax.persistence.PersistenceException pe) {
            throw new Exception("Registro já existe! Falha ao tentar salvar novo cliente!");
        } finally {
            if (transactionOk) {
                em.getTransaction().commit();
            } else {
                em.getTransaction().rollback();
            }
        }
        
    }
    
    public Cliente search(String cpfcnpj) throws Exception{
        Cliente c = null;

        Query q = em.createNamedQuery("Cliente.findByCpfcnpj");
        q.setParameter("cpfcnpj", cpfcnpj);
        List<Cliente> list = (List<Cliente>) q.getResultList();
        if (!list.isEmpty()) {
            c = (Cliente) list.get(0); //pega o primeiro elemento da lista
        }
        return c;
    }
    
    public List<Cliente> retrieveAll() throws Exception {
        List<Cliente> list = null;

        Query q = em.createNamedQuery("Cliente.findAll");
        list = (List<Cliente>) q.getResultList();

        return list;
    }
    
    public void update(Cliente c) throws Exception {
        boolean transactionOk = false;

        try {
            em.getTransaction().begin();
            em.merge(c);
            transactionOk = true;
        } catch (javax.persistence.PersistenceException pe) {
            throw new Exception("Falha ao atualizar Cliente!");
        } finally {
            if (transactionOk) {
                em.getTransaction().commit();
            } else {
                em.getTransaction().rollback();
            }
        }

    }
    
    
    
    public void delete(Cliente c) throws Exception{
        boolean transactionOk = false;

        try {
            em.getTransaction().begin();
            em.remove(c);
            transactionOk = true;
        } catch (javax.persistence.PersistenceException pe) {
            throw new Exception("Falha ao excluir Cliente!");
        } finally {
            if (transactionOk) {
                em.getTransaction().commit();
            } else {
                em.getTransaction().rollback();
            }
        }
    }
}
