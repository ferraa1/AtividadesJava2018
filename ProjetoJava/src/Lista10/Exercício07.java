package Lista10;

import java.util.Scanner;

public class Exercício07 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int matriz1[][] = new int[3][2];
        int matriz2[][] = new int[3][2];
        int matriz3[][] = new int[3][2];
        int matriz4[][] = new int[3][2];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Na 1ª Matriz, informe o valor da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                matriz1[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Na 2ª matriz, informe o valor da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                matriz2[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Matriz 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz1[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz 3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(matriz3[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz 4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz4[i][j] = matriz1[i][j] - matriz2[i][j];
                System.out.print(matriz4[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
