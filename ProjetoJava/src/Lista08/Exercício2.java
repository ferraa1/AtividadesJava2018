package Lista08;

import java.util.Scanner;

public class Exercício2 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int multiDois[];
        multiDois = new int[10];
        int multiTres[];
        multiTres = new int[10];
        int multiDoisTres[];
        multiDoisTres = new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um valor: ");
            vetor[i] = sc.nextInt();
        }
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                multiDois[i] = vetor[i];
            }
            if (vetor[i] % 3 == 0) {
                multiTres[i] = vetor[i];
            }
            if ((vetor[i] % 2 == 0) && (vetor[i] % 3 == 0)) {
                multiDoisTres[i] = vetor[i];
            }
        }
        
        System.out.println("Normal:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("Múltiplos de 2:");
        for (int i = 0; i < multiDois.length; i++) {
            if (multiDois[i] != 0) {
                System.out.println(multiDois[i]);
            }
        }
        System.out.println("Múltiplos de 3:");
        for (int i = 0; i < multiTres.length; i++) {
            if (multiTres[i] != 0) {
                System.out.println(multiTres[i]);
            }
        }
        System.out.println("Múltiplos de 2 e 3:");
        for (int i = 0; i < multiDoisTres.length; i++) {
            if (multiDoisTres[i] != 0) {
                System.out.println(multiDoisTres[i]);   
            }
        }
        
    }
}
