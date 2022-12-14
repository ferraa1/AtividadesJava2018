package Lista11;

import java.util.Scanner;

public class Exercício3 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[18];
        int matriz[][] = new int[3][6];
        int cont = 0;
        for (int i = 0; i < 18; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor do vetor: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = vetor[cont];
                cont++;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
