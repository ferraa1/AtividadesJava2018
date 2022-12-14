package catalogoproduto;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class DaoCategoria {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CatalogoProdutoPU");
    EntityManager em = emf.createEntityManager();

    public boolean inserir(Categoria categoria) {

        try {
            em.getTransaction().begin();
            em.persist(categoria);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }

    }

    public boolean editar(Categoria categoria) {

        try {
            em.getTransaction().begin();
            em.merge(categoria);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }

    }

    public boolean excluir(Categoria categoria) {

        try {
            em.getTransaction().begin();
            em.remove(categoria);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }

    }

    public List<Categoria> listar() {
        return em.createQuery("select c from Categoria c").getResultList();
    }

    public Categoria selecionar(int id) {
        return em.find(Categoria.class, id);
    }

    public Categoria selecionarSemFind(int id) {
        try {
            Query consulta = em.createQuery("select c from Categoria c where c.id = :id");
            consulta.setParameter("id", id);
            return (Categoria) consulta.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public Categoria selecionarCategoriaNome(String nome) {
        try {
            Query consulta = em.createQuery("select c from Categoria c where c.nome = :nome");
            consulta.setParameter("nome", nome);
            return (Categoria) consulta.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public void fechar() {
        em.close();
        emf.close();
    }

}
