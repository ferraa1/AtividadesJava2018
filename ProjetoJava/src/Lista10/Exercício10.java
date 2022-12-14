package Lista10;

import java.util.Scanner;

public class Exercício10 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int linhas;
        int colunas;
        System.out.print("Informe a quantidade de linhas da matriz: ");
        linhas = sc.nextInt();
        System.out.print("Informe a quantidade de colunas da matriz: ");
        colunas = sc.nextInt();
        
        int maior[] = new int[linhas];
        for (int i = 0; i < linhas; i++) {
            maior[i] = Integer.MIN_VALUE;
        }
        
        int matriz[][] = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Informe o valor da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > maior[i]) {
                    maior[i] = matriz[i][j];
                }
            }
        }
        
        System.out.println("");
        System.out.println("Matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] * maior[i]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
}
//estudar