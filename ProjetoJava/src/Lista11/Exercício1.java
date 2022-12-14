package Lista11;

import java.util.Scanner;

public class Exercício1 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        int vetor1[] = new int[5];
        int vetor2[] = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Informe o valor da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                matriz[i][j] = sc.nextInt();
                vetor1[i] += matriz[i][j];
                vetor2[j] += matriz[i][j];
            }
        }
        System.out.println("");
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Vetores:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor1[i]);
            System.out.print(" ");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor2[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
