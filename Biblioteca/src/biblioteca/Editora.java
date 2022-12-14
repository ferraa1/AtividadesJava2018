package biblioteca;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "editora")
public class Editora implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private int codigo;
    private String nome;

    public Editora() {
    }

    public Editora(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Editora{" + "id=" + id + ", codigo=" + codigo + ", nome=" + nome + '}';
    }

}
