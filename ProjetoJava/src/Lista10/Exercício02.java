package Lista10;

import java.util.Scanner;

public class Exercício02 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int linhas;
        int colunas;
        int cont = 0;
        
        System.out.print("Informe a quantidade de linhas da matriz: ");
        linhas = sc.nextInt();
        System.out.print("Informe a quantidade de colunas da matriz: ");
        colunas = sc.nextInt();
        
        int matriz[][] = new int[linhas][colunas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Informe um valor: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matriz:");
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
                if (matriz[i][j] > 15 && matriz[i][j] < 20) {
                    cont++;
                }
            }
            System.out.println("");
        }
        
        System.out.println("Foram informados " + cont + " valores entre 15 e 20.");
        
    }
}
