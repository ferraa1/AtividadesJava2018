
import java.util.Scanner;


public class ExemploParametrizacao3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int [10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um número: ");
            vetor[i] = sc.nextInt();
        }
        ordenacao(vetor);
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void ordenacao(int[] v) {
        for (int i = 0; i < 9; i++) {
            int menor = v[i];
            int indiceMenor = i;
            for (int j = i + 1; j < 10; j++) {
                if (v[j] < menor) {
                    menor = v[j];
                    indiceMenor = j;
                }
            }
            v[indiceMenor] = v[i];
            v[i] = menor;
        }
    }
}
