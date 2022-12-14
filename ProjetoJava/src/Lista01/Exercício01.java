package Lista01;

import java.util.Scanner;

public class Exercício01 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número A: ");
        int a = sc.nextInt();
        System.out.print("Informe o número B: ");
        int b = sc.nextInt();
        System.out.print("Informe o número C: ");
        int c = sc.nextInt();

        int r = (a + b) * (a + b);
        int s = (b + c) * (b + c);
        int d = (r + s) / 2;

        System.out.println("O resultado é: " + d);

    }
}
