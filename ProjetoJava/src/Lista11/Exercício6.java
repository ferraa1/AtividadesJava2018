package Lista11;

import java.util.Random;
import java.util.Scanner;

public class Exercício6 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.print("Informe a quantidade de linhas e colunas: ");
        int linhas = sc.nextInt();
        int colunas = sc.nextInt();
        int matrizA[][] = new int[linhas][colunas];
        int number = linhas * colunas;
        int matrizB[][] = new int[2][number];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int randy = ra.nextInt(10);
                System.out.print(randy + "\t");
            }
            System.out.println("");
        }
        int cont = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                for (int k = 0; k < number; k++) {
                    if (matrizA[i][j] == matrizB[0][k]) {
                        cont = 0;
                        break;
                    } else {
                        cont = 1;
                    }
                }
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println(matrizB[0][i] + " ");
        }
    }
}
