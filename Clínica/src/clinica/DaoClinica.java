package clinica;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class DaoClinica {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaPU");
    EntityManager em = emf.createEntityManager();
    
    public boolean inserir (Clinica c) {
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
    
    public boolean editar(Clinica c) {
        
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
    
    public boolean excluir(Clinica c) {
        
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
    
    public List<Clinica> listar () {
        return em.createQuery("select c from Clinica c").getResultList();
    }
    
    public Clinica selecionarSemFind (String cpf) {
        try {
            Query consulta = em.createQuery("select c from Clinica c where c.cpf = :cpf");
            consulta.setParameter("cpf", cpf);
            return (Clinica) consulta.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
    public void fechar() {
        em.close();
        emf.close();
    }
    
}
