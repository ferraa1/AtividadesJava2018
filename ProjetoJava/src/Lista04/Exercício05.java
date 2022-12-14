package Lista04;

import java.util.Scanner;

public class Exercício05 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int resto;
        for (int cont1 = 1; cont1 <= 5; cont1++) {
            System.out.print("Informe o par " + cont1 + ": ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Os número pares dentro desse par são:");
            for (int cont2 = a; cont2 <= b; cont2++) {
                resto = cont2 % 2;
                if (resto == 0) {
                    System.out.println(cont2);
                }
            }
        }
    }
}
