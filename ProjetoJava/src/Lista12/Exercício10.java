package Lista12;

import java.util.Scanner;

public class Exercício10 {

    public static int funcao(int a[], int b[]) {
        int cont1 = 0;
        int cont2 = 0;
        int verify = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i] == b[j]) {
                    for (int k = i; k >= 0; k--) {
                        if (a[i] == a[k]) {
                            verify++;
                        }
                    }
                    if (verify == 1) {
                        cont1++;
                        verify = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (b[i] == a[j]) {
                    for (int k = i; k >= 0; k--) {
                        if (b[i] == b[k]) {
                            verify++;
                        }
                    }
                    if (verify == 1) {
                        cont2++;
                        verify = 0;
                        break;
                    }
                }
            }
        }
        if (cont1 > cont2) {
            return cont1;
        } else {
            return cont2;
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int vetor1[] = new int[5];
        int vetor2[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um valor para o 1º vetor, " + (i + 1) + "ª posição: ");
            vetor1[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um valor para o 2º vetor, " + (i + 1) + "ª posição: ");
            vetor2[i] = sc.nextInt();
        }
        System.out.println("Os vetores informados possuem " + funcao(vetor1,vetor2) + " valores em comum.");
    }
}
