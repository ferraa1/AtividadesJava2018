package Lista11;

import java.util.Random;
import java.util.Scanner;

public class Exercício7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int contin = 0;
        do {
            System.out.print("Informe a quantidade de linhas/colunas (A matriz será quadrada e você deve informar um número ímpar): ");
            number = sc.nextInt();
            if (number % 2 != 0) {
                contin++;
            } else {
                System.out.println("Erro, informe um número ímpar!");
            }
        } while (contin == 0);
        int matriz[][] = new int [number][number];
        Random ra = new Random();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                int num = ra.nextInt(2);
                matriz[i][j] = num;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.print("Resultado da imagem 1: ");
        int soma = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i % 2 == 0) {
                    soma += matriz[i][j];
                } else {
                    break;
                }
            }
        }
        System.out.println(soma);
        soma = 0;
        double metade = number / 2 - 0.5;
        int cont = 1;
        System.out.print("Resultado da imagem 2: ");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j == 0 || j == (number - 1)) {
                    soma += matriz[i][j];
                } else if (j == metade && i == metade) {
                    soma += matriz[i][j];
                } else if (j < metade && i > (cont - 1) && i < (number - cont)) {
                    soma += matriz[i][j];
                } else if (j > metade && i > (cont - 1) && i < (number - cont)) {
                    soma += matriz[i][j];
                }
                if (j < metade && j > 0) {
                    cont++;
                }
                if (j > metade && j < (number - 1)) {
                    cont--;
                }
            }
            cont = 1;
        }
        System.out.println(soma);
    }
}
