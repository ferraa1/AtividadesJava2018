package Lista03;

import java.util.Scanner;

public class Exercício05 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Informe a primeira nota: ");
        double notaA = sc.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double notaB = sc.nextDouble();
        System.out.print("Informe a terceira nota: ");
        double notaC = sc.nextDouble();
        System.out.print("Informe o número de faltas: ");
        int faltas = sc.nextInt();
        double media = (notaA + notaB + notaC) / 3;

        if (faltas >= 20) {
            System.out.println(nome + " obteve Reprovação por Falta.");
        } else if (media < 7) {
            System.out.println(nome + " obteve Reprovação por Média.");
        } else {
            System.out.println(nome + " foi Aprovado.");
        }

    }
}
//sc.nextLine()
//question = question.replaceAll("\\s","")
