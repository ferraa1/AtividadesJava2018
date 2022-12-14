package Lista12;

import java.util.Scanner;

public class Exercício07 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[18];
        int matriz[][] = new int[6][3];
        for (int i = 0; i < 18; i++) {
            System.out.print("Informe um valor: ");
            vetor[i] = sc.nextInt();
        }
        blarguevultevulpseshindosinpko(vetor,matriz);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static void blarguevultevulpseshindosinpko(int v[], int m[][]) {
        int cont = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = v[cont];
                cont++;
            }
        }
    }
}
