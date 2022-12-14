package Lista10;

import java.util.Scanner;

public class Exercício04 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Informe o valor da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.print("Informe um valor para ser encontrado na matriz: ");
        int value = sc.nextInt();
        int result = 0;
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (value == matriz[i][j]) {
                    result = 1;
                    linha = i + 1;
                    coluna = j + 1;
                    break;
                }
            }
            if (result == 1) {
                break;
            }
        }
        System.out.println("");
        if (result == 1) {
            System.out.println("O valor informado foi encontrado na matriz na " + linha + "ª linha, " + coluna + "ª coluna.");
        } else {
            System.out.println("O valor informado não foi encontrado na matriz.");
        }
        System.out.println("");
    }
}
