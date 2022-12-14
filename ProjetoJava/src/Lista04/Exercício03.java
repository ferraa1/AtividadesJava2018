package Lista04;

import java.util.Scanner;

public class Exercício03 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int num = sc.nextInt();
        int total = 1;
        for (int c = num; c > 1; c--) {
            total = c * total;
        }
        System.out.println("O fatorial do número apresentado é: " + total);
    }
}
