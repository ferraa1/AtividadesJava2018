package catalogoproduto;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class DaoProduto {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CatalogoProdutoPU");
    EntityManager em = emf.createEntityManager();

    public boolean inserir(Produto produto) {

        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }

    }

    public boolean editar(Produto produto) {

        try {
            em.getTransaction().begin();
            em.merge(produto);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }

    }

    public boolean excluir(Produto produto) {

        try {
            em.getTransaction().begin();
            em.remove(produto);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }

    }

    public List<Produto> listar() {
        return em.createQuery("select p from Produto p").getResultList();
    }

    public Produto selecionar(int id) {
        return em.find(Produto.class, id);
    }

    public Produto selecionarSemFind(String codigo) {
        try {
            Query consulta = em.createQuery("select p from Produto p where p.codigo = :codigo");
            consulta.setParameter("codigo", codigo);
            return (Produto) consulta.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public void fechar() {
        em.close();
        emf.close();
    }

}
