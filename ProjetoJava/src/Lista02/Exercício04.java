package Lista02;

import java.util.Scanner;

public class Exercício04 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número A: ");
        int a = sc.nextInt();
        System.out.print("Informe o número B: ");
        int b = sc.nextInt();
        System.out.print("Informe o número C: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("O número A (" + a + ") é o maior.");
        } else if (b > a && b > c) {
            System.out.println("O número B (" + b + ") é o maior.");
        } else {
            System.out.println("O número C (" + c + ") é o maior.");
        }

    }
}
