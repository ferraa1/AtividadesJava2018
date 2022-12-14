package biblioteca;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String titulo;
    private int quantidadePaginas;
    private String autores;
    @ManyToOne
    @JoinColumn(name = "id_editora")
    private Editora editora;

    public Livro() {
    }

    public Livro(String titulo, int quantidadePaginas, String autores, Editora editora) {
        this.titulo = titulo;
        this.quantidadePaginas = quantidadePaginas;
        this.autores = autores;
        this.editora = editora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", titulo=" + titulo + ", quantidadePaginas=" + quantidadePaginas + ", autores=" + autores + ", editora=" + editora.getNome() + '}';
    }

}
