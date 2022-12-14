package biblioteca;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class DaoEditora {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("BibliotecaPU");
    EntityManager em = emf.createEntityManager();

    public boolean inserir(Editora ed) {
        try {
            em.getTransaction().begin();
            em.persist(ed);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }
    }

    public Editora selecionarCodigo(int codigo) {
        try {
            Query consulta = em.createQuery("select ed from Editora ed where ed.codigo = :c");
            consulta.setParameter("c", codigo);
            return (Editora) consulta.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public void fechar() {
        em.close();
        emf.close();
    }
}
