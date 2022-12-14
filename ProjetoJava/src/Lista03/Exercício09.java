package Lista03;

import java.util.Scanner;

public class Exercício09 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double notaA = sc.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double notaB = sc.nextDouble();
        System.out.print("Informe a terceira nota: ");
        double notaC = sc.nextDouble();
        System.out.print("Informe a média dos exercícios: ");
        double ME = sc.nextDouble();
        double MA = (notaA + notaB * 2 + notaC * 3 + ME) / 7;
        char conceito;

        if (MA <= 4) {
            conceito = 'E';
        } else if (MA > 4 && MA <= 6) {
            conceito = 'D';
        } else if (MA > 6 && MA <= 7.5) {
            conceito = 'C';
        } else if (MA > 7.5 && MA <= 9) {
            conceito = 'B';
        } else {
            conceito = 'A';
        }

        System.out.println("Média de Aproveitamento: " + MA);
        System.out.println("Conceito: " + conceito);

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

    }
}
