package Lista11;

import java.util.Scanner;

public class Exercício5 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int linhas;
        int colunas;
        System.out.print("Informe a quantidade de linhas da matriz: ");
        linhas = sc.nextInt();
        System.out.print("Informe a quantidade de colunas da matriz: ");
        colunas = sc.nextInt();
        double matriz[][] = new double[linhas][colunas];
        double menor;
        int menorli = 0;
        int menorco = 0;
        int menorCerto;
        int cont = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Informe o valor da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                matriz[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < linhas; i++) {
            menor = Integer.MAX_VALUE;
            menorCerto = 0;
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    menorli = i;
                    menorco = j;
                }
            }
            for (int k = 0; k < linhas; k++) {
                if (k != menorli) {
                    if (menor > matriz[k][menorco]) {
                    menorCerto = 1;
                    } else {
                    menorCerto = 0;
                    break;
                    }
                }
            }
            if (menorCerto == 1) {
                System.out.println("Ponto sela (" + menor + ") localizado na linha: " + (menorli + 1) + ", coluna: " + (menorco + 1));
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("Nenhum ponto sela encontrado.");
        }
    }
}
