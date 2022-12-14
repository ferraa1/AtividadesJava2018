package Lista07;

import java.util.Scanner;

public class Exercício03 {

    public static void main(String args[]) {
        
        Scanner julio = new Scanner(System.in);
        int vetor[] = new int[20];
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int maxPosition = 0;
        int minPosition = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um número: ");
            vetor[i] = julio.nextInt();
            if (vetor[i] > maxValue) {
                maxValue = vetor[i];
                maxPosition = i;
            }
            if (vetor[i] < minValue) {
                minValue = vetor[i];
                minPosition = i;
            }
        }
        System.out.println("O maior valor é " + maxValue + ", da posição " + maxPosition);
        System.out.println("O menor valor é " + minValue + ", da posição " + minPosition);
        
    }
}
