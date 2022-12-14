package Lista08;

import java.util.Scanner;

public class Exercício1 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um valor: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Valores informados:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.print("Qual deles você deseja excluir? ");
        int excluir = sc.nextInt();
        int posi = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (excluir == vetor[i]) {
                posi = i;
            }
        }
        vetor[posi] = 0;
        for (int i = posi; i < (vetor.length - 1); i++) {
            vetor[i] = vetor[(i + 1)];
        }
        vetor[9] = 0;
        System.out.println("Valores finais:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
