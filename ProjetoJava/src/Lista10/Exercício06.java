package Lista10;

import java.util.Scanner;

public class Exercício06 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[2][2];
        int result[][] = new int[2][2];
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Informe o valor da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matriz[i][j] * maior;
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
