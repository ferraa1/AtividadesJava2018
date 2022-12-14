
import java.util.Scanner;

public class ExercícioEspecial01 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int value;
        //O do seguinte serve para somente aceitar um vetor de tamanho ímpar
        do {
            System.out.print("Informe o tamanho do vetor (precisa ser ímpar): ");
            value = sc.nextInt();
            if (value % 2 == 0) {
                System.out.println("ERRO, o valor deve ser ímpar.");
            }
        } while (value % 2 == 0);
        //Criação e preenchimento do vetor
        int vetor[] = new int[value];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
        }
        // Cálculos começam aqui
        int aux;
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            aux = vetor.length - 1 - i;
            if (vetor[i] == vetor[aux]) {
                cont++;
            }
        }
        if (cont == vetor.length) {
            System.out.println("O vetor é palindrome.");
        } else if (cont < vetor.length) {
            System.out.println("O vetor não é palindrome.");
        }
    }
}
