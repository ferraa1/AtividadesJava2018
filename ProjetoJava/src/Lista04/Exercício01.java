package Lista04;

public class Exercício01 {

    public static void main(String args[]) {

        System.out.println("Todos os valores múltiplos de 5 entre 1 e 150 são:");

        for (int cont = 1; cont <= 150; cont++) {
            int resto = cont % 5;
            if (resto == 0) {
                System.out.println(cont);
            }
        }

    }
}
