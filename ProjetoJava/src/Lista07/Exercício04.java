package Lista07;

import java.util.Scanner;

public class Exercício04 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double notas[] = new double[10];
        double soma = 0;
        double media = 0;
        int cont = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota do aluno: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        media = soma / 10;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                cont++;
            }
        }

        System.out.println("A média da turma é: " + media);
        System.out.println(cont + " alunos obtiveram nota maior que a média da turma");
    }
}
