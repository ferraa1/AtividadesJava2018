package Lista07;

import java.util.Scanner;

public class Exercício09 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        double vetor[] = new double[7];
        double soma = 0;
        double media;
        double melhorTempo = Double.MAX_VALUE;
        int melhorTentativa = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o tempo da " + (i + 1) + "ª volta: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
            if (vetor[i] < melhorTempo) {
                melhorTempo = vetor[i];
                melhorTentativa = i + 1;
            }
        }
        media = soma / vetor.length;
        System.out.println("A média de tempo é: " + media);
        System.out.println("O melhor tempo foi de " + melhorTempo + " na tentativa nº " + melhorTentativa);
        
    }
}
