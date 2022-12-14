package Lista05;

import java.util.Scanner;

public class Exercício01 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int continuar;
        int cont = 0;
        int num;
        int totalPar = 0;
        int totalImpar = 0;
        double media;
        for (int i = 0; i < 10; i++) {
            continuar = 0;
            do {
                System.out.print("Informe um número positivo: ");
                num = sc.nextInt();
                if (num > 0) {
                    continuar = 1;
                } else {
                    System.out.println("Erro, o número deve ser positivo.");
                }
            } while (continuar == 0);
            if (num % 2 == 0) {
                cont++;
                totalPar = totalPar + num;
            } else {
                totalImpar = totalImpar + num;
            }
        }
        media = totalPar / cont;
        System.out.println("A soma dos números ímpares é: " + totalImpar);
        System.out.println("A media dos números pares é: " + media);
    }
}
//somaSal += salario;
