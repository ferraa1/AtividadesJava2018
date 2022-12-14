package Lista03;

import java.util.Scanner;

public class Exercício03 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número A: ");
        int a = sc.nextInt();
        System.out.print("Informe o número B: ");
        int b = sc.nextInt();
        int resto = a % b;

        if (resto == 0) {
            System.out.println("O número A é divisível por B.");
        } else {
            System.out.println("O número A não é divisível por B.");
        }

    }
}
