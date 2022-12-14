package Lista12;

import java.util.Scanner;

public class Exercício05 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor = sc.nextInt();
        int vetor[] = new int [valor];
        for (int i = 0; i < valor; i++) {
            System.out.print("Informe um valor para a " + (i + 1) + "ª posição do vetor: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Quantidade de números negativos informados: " + checagem(valor,vetor));
        System.out.println("Novo vetor:");
        for (int i = 0; i < valor; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
    
    public static int checagem(int valor,int[] v) {
        int cont = 0;
        for (int i = 0; i < valor; i++) {
            if (v[i] < 0) {
                cont++;
                v[i] = 0;
            }
        }
        return cont;
    }
}
