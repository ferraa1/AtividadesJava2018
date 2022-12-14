package Lista03;

import java.util.Scanner;

public class Exercício07 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o código do produto: ");
        int codigo = sc.nextInt();

        if (codigo == 1) {
            System.out.println("Classificação do produto: Alimento não perecível.");
        } else if (codigo >= 2 && codigo <= 4) {
            System.out.println("Classificação do produto: Alimento perecível.");
        } else if (codigo == 5 || codigo == 6) {
            System.out.println("Classificação do produto: Vestuário.");
        } else if (codigo == 7) {
            System.out.println("Classificação do produto: Higiene pessoal.");
        } else if (codigo == 8 || codigo == 9) {
            System.out.println("Classificação do produto: Limpeza e utensílios domésticos.");
        } else {
            System.out.println("Código inválido.");
        }

    }
}
