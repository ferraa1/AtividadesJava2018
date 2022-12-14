package biblioteca;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class DaoLivro {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("BibliotecaPU");
    EntityManager em = emf.createEntityManager();

    public boolean inserir(Livro li) {
        try {
            em.getTransaction().begin();
            em.persist(li);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }
    }

    public List<Livro> listar() {
        return em.createQuery("select l from Livro l").getResultList();
    }

    public void fechar() {
        em.close();
        emf.close();
    }
}
