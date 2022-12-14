package Lista13;

public class Conta {
    private String cliente;
    private String agencia;
    private String numero;
    private double saldo;
    
    public Conta() {
        
    }
    
    public Conta(String cliente, String agencia, String numero, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getAgencia() {
        return agencia;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return "Cliente: " + cliente + " /Agência: " + agencia + " /Número: "
                + numero + " /Saldo: " + saldo;
    }
    
    public void depositar(double deposito) {
        saldo += deposito;
    }
    
    public void sacar(double saque) {
        if ((saldo - saque) < 0 ) {
            System.out.println("Não há dinheiro suficiente na conta para efetuar este saque.");
        } else {
            saldo -= saque;
        }
    }
}
