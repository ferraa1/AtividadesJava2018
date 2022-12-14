package Lista10;

import java.util.Scanner;

public class Exercício09 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int linhas;
        int colunas;
        System.out.print("Informe a quantidade de linhas da matriz: ");
        linhas = sc.nextInt();
        System.out.print("Informe a quantidade de colunas da matriz: ");
        colunas = sc.nextInt();
        int matriz[][] = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Informe o valor da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Matriz:");
        int error = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
                if (matriz[i][j] != matriz[j][i]) {
                    error = 1;
                }
            }
            System.out.println("");
        }
        System.out.println("");
        if (error == 1) {
            System.out.println("A matriz não é simétrica!");
        } else {
            System.out.println("A matriz é simétrica!");
        }
        
    }
}
//boolean nome = true;