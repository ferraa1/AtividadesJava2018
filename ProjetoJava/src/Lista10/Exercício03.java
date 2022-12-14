package Lista10;

import java.util.Scanner;

public class Exercício03 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int linhas;
        int colunas;
        double soma = 0;
        
        System.out.print("Informe a quantidade de linhas da matriz: ");
        linhas = sc.nextInt();
        System.out.print("Informe a quantidade de colunas da matriz: ");
        colunas = sc.nextInt();
        
        double matriz[][] = new double[linhas][colunas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Informe um valor: ");
                matriz[i][j] = sc.nextDouble();
            }
        }
        
        System.out.println("Matriz:");
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
                if ((i + 1) % 2 == 0) {
                    soma += matriz[i][j];
                }
            }
            System.out.println("");
        }
        
        System.out.println("A média dos valores informados nas linhas pares é " + (soma / colunas));
        
    }
}
