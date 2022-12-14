package Lista01;

import java.util.Scanner;

public class Exercício06 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de cabeças de gado: ");
        int g = sc.nextInt();
        System.out.print("Informe a quantidade de herdeiros: ");
        int h = sc.nextInt();

        double f = g * 0.85 / h;

        System.out.println("Vão ser divididas " + f + " cabeças de gado para cada herdeiro.");

    }
}
