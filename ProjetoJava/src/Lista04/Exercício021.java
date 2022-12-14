package Lista04;

public class Exercício021 {

    public static void main(String args[]) {

        int resto;

        System.out.println("Os números pares entre 100 e 200 são:");

        for (int cont = 100; cont <= 200; cont++) {

            resto = cont % 2;

            if (resto == 0) {
                System.out.println(cont);
            }

        }

    }
}
