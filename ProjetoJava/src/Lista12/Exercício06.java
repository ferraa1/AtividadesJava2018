package Lista12;

import java.util.Scanner;

public class Exercício06 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de linhas e colunas: ");
        int lc = sc.nextInt();
        int matriz[][] = new int[lc][lc];
        for (int i = 0; i < lc; i++) {
            for (int j = 0; j < lc; j++) {
                System.out.print("Informe o valor da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("A soma da diagonal principal é: " + transposta(lc, matriz));
        System.out.println("Matriz transposta:");
        for (int i = 0; i < lc; i++) {
            for (int j = 0; j < lc; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static int transposta(int lc, int[][] m) {
        int aux;
        int soma = 0;
        for (int i = 0; i < lc; i++) {
            for (int j = 0; j < lc; j++) {
                if (i == j) {
                    soma += m[i][j];
                }
                if (j > i) {
                    aux = m[i][j];
                    m[i][j] = m[j][i];
                    m[j][i] = aux;
                }
            }
        }
        return soma;
    }
}
