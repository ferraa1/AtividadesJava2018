package banco;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

//DataAccessObject

//Inserir
//Editar
//Remover
//Listar
//Selecionar
//"fechar"

//1 - Ler informações
//2 - Criar objeto
//3 - Gravar objeto
public class DaoConta {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("BancoPU");
    EntityManager em = emf.createEntityManager();
    
    public boolean inserir (Conta c) {
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
    
    public boolean editar(Conta c) {
        
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
    
    public boolean excluir(Conta c) {
        
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
    
    public List<Conta> listar () {
        //Query consulta = em.createQuery("select c from Conta c");
        //return consulta.getResultList();
        return em.createQuery("select c from Conta c").getResultList();
    }
    
    public Conta selecionar (int id) {
        return em.find(Conta.class, id);
    }
    
    public Conta selecionarSemFind (int numero) {
        try {
            Query consulta = em.createQuery("select x from Conta x where x.numero = :n");
            consulta.setParameter("n", numero);
            return (Conta) consulta.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
    public void fechar() {
        em.close();
        emf.close();
    }
    
}
