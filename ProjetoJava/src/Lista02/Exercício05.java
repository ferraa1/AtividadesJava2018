package Lista02;

import java.util.Scanner;

public class Exercício05 {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        double resto = num % 2;

        if (resto == 0) {
            System.out.print("O número informado é par ");
        } else {
            System.out.print("O número informado é ímpar ");
        }

        if (num >= 0) {
            System.out.println("e positivo.");
        } else {
            System.out.println("e negativo.");
        }

    }
}
