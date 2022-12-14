package Lista01;

import java.util.Scanner;

public class Exercício02 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos anos de vida você tem: ");
        int a = sc.nextInt();
        System.out.print("Informe quantos meses de vida você tem: ");
        int m = sc.nextInt();
        System.out.print("Informe quantos dias de vida você tem: ");
        int d = sc.nextInt();

        int td = a * 365 + m * 30 + d;

        System.out.println("Você tem " + td + " dias de vida.");

    }
}
