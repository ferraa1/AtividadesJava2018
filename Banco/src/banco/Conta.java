package banco;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contas")
public class Conta implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String agencia;
    private int numero;
    private double saldo;
    @ManyToOne
    @JoinColumn(name = "id_clientes")
    private Cliente cliente;

    public Conta() {
    }

    public Conta(String agencia, int numero, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + '}';
    }
    
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque efetuado.");
        } else {
            System.out.println("Valor solicitado muito alto.");
        }
    }
    
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito efetuado.");
    }
}
