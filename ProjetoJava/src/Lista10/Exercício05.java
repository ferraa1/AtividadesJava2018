package Lista10;

import java.util.Scanner;

public class Exercício05 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int somaLinha3 = 0; 
        int somaColuna2 = 0; 
        int somaTodos = 0; 
        double media; 
        int maior = Integer.MIN_VALUE; 
        int maiorLinha = 0; 
        int maiorColuna = 0; 
        int menor = Integer.MAX_VALUE; 
        int menorLinha = 0; 
        int menorColuna = 0; 
        int somaDiagonal = 0;
        int somaMaiorMedia = 0;
        
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
                somaTodos += matriz[i][j];
                if (i == 2) {
                    somaLinha3 += matriz[i][j];
                }
                if (j == 1) {
                    somaColuna2 += matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    menorLinha = i + 1;
                    menorColuna = j + 1;
                }
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    maiorLinha = i + 1;
                    maiorColuna = j + 1;
                }
            }
            System.out.println("");
        }
        media = somaTodos / 16;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > media) {
                    somaMaiorMedia += matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                    break;
                }
            }
        }
        System.out.println("A soma da linha 3 é: " + somaLinha3);
        System.out.println("A soma da coluna 2 é: " + somaColuna2);
        System.out.println("A média dos elementos da matriz é: " + media);
        System.out.println("O maior elemento da matriz é: " + maior + " (linha " + maiorLinha + ", coluna " + maiorColuna + ")");
        System.out.println("O menor elemento da matriz e: " + menor + " (linha " + menorLinha + ", coluna " + menorColuna + ")");
        System.out.println("A soma da diagonal principal é: " + somaDiagonal);
        System.out.println("A soma dos elementos maiores que a média é: " + somaMaiorMedia);
        System.out.println("A soma de todos os elementos da matriz é: " + somaTodos);
    }
}
