package Lista11;

import java.util.Scanner;

public class Exercício4 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int linhas;
        int colunas;
        System.out.print("Informe a quantidade de linhas da matriz: ");
        linhas = sc.nextInt();
        System.out.print("Informe a quantidade de colunas da matriz: ");
        colunas = sc.nextInt();
        int matriz1[][] = new int[linhas][colunas];
        int matriz2[][] = new int[colunas][linhas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Informe o valor da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                matriz1[i][j] = sc.nextInt();
                matriz2[j][i] = matriz1[i][j];
            }
        }
        System.out.println("");
        System.out.println("Matriz informada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz1[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz resultante:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matriz2[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
