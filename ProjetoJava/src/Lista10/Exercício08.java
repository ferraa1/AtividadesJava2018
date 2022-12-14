package Lista10;

import java.util.Scanner;

public class Exercício08 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Informe o valor da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.print("Informe um valor para multiplicar os valores da diagonal principal da matriz: ");
        int valor = sc.nextInt();
        System.out.println("");
        System.out.println("Matriz resultante:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] * valor);
                    System.out.print(" ");
                } else {
                    System.out.print(matriz[i][j]);
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
}
