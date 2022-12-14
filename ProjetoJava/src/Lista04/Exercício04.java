package Lista04;

public class Exercício04 {

    public static void main(String args[]) {
        
        int total;
        for (int num = 1; num <= 10; num++) {
            total = 1;
            for (int cont = num; cont > 1; cont--) {
                total = cont * total;
            }
            System.out.println("O fatorial de " + num + " é " + total);
        }
        
    }
}
