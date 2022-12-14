package Lista07;

import java.util.Scanner;

public class Exercício01 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um número para a posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Valores informados:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
    }
}
