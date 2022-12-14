package Whot;

public class Sistema {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setCliente("HELLO");
        c.setNumeroConta("666");
        c.setNumeroAgencia("69");
        c.setSaldo(1000);
        
        Conta c2 = new Conta("Outra", "222", "333", 0);
        
        Conta c3 = new Conta (c2.getCliente(), c2.getNumeroConta(), c2.getNumeroAgencia(), c2.getSaldo());
        
    }
}
