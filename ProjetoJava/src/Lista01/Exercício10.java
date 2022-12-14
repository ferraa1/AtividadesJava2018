package Lista01;

import java.util.Scanner;

public class Exercício10 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas trabalhadas pelo pedreiro: ");
        double hpe = sc.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas pelo pintor: ");
        double hpi = sc.nextDouble();

        double total = hpe * 10 + hpi * 8;

        System.out.println("A obra custará R$" + total);

    }
}
