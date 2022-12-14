package Lista02;

import java.util.Scanner;

public class Exercício06 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o lado A do triângulo: ");
        int a = sc.nextInt();
        System.out.print("Informe o lado B do triângulo: ");
        int b = sc.nextInt();
        System.out.print("Informe o lado C do triângulo: ");
        int c = sc.nextInt();

        if (a == b && a == c) {
            System.out.println("O triângulo é do tipo equilátero.");
        } else if (a == b || b == c || a == c) {
            System.out.println("O triângulo é do tipo isósceles.");
        } else {
            System.out.println("O triângulo é do tipo escaleno.");
        }

    }
}
