package Whot;

public class Conta {

    private String cliente;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public Conta() {

    }

    public Conta(String cliente, String numeroConta, String numeroAgencia, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + " Número da Conta: "
                + numeroConta + " Número da Agencia: " + numeroAgencia
                + " Saldo: " + saldo;
    }

    public void sacar(double valorSacado) {
        if (saldo >= valorSacado) {
            saldo -= valorSacado;
        }
    }
    
    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }
}
