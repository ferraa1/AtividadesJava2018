package Lista04;

import java.util.Scanner;

public class Exercício10 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int number;
        int maiorNumber = 0;
        int menorNumber = 0;
        int height;
        int maiorHeight = 0;
        int menorHeight = 9999;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o número do aluno: ");
            number = sc.nextInt();
            System.out.print("Informe a altura do aluno em centímetros: ");
            height = sc.nextInt();
            if (height > maiorHeight) {
                maiorNumber = number;
                maiorHeight = height;
            }
            if (height < menorHeight) {
                menorNumber = number;
                menorHeight = height;
            }
        }

        System.out.println("O maior aluno é o número " + maiorNumber + " com " + maiorHeight + " centímetros.");
        System.out.println("O menor aluno é o número " + menorNumber + " com " + menorHeight + " centímetros.");

    }
}
