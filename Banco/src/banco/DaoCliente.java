package banco;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;


public class DaoCliente {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("BancoPU");
    EntityManager em = emf.createEntityManager();
    
    public boolean inserir (Cliente c) {
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }
    }
    
    public boolean editar(Cliente c) {
        
        try {
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }
        
    }
    
    public boolean excluir(Cliente c) {
        
        try {
            em.getTransaction().begin();
            em.remove(c);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }
        
    }
    
    public List<Cliente> listar () {
        return em.createQuery("select c from Cliente c").getResultList();
    }
    
    public Cliente selecionar (int id) {
        return em.find(Cliente.class, id);
    }
    
    public Cliente selecionarSemFind (int cpf) {
        try {
            Query consulta = em.createQuery("select x from Cliente x where x.cpf = :n");
            consulta.setParameter("n", cpf);
            return (Cliente) consulta.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
    public void fechar() {
        em.close();
        emf.close();
    }
    
}
