package Lista03;

import java.util.Scanner;

public class Exercício06 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o código do produto: ");
        int codigo = sc.nextInt();
        System.out.print("Informe a quantidade comprada: ");
        int quanti = sc.nextInt();
        double total = 0;

        switch (codigo) {
            case 1: {
                System.out.println("Descrição do produto: Informática para Concursos.");
                total = quanti * 125.48;
                break;
            }
            case 2: {
                System.out.println("Descrição do produto: Java como Programador.");
                total = quanti * 108.36;
                break;
            }
            case 3: {
                System.out.println("Descrição do produto: Lógica de Programação.");
                total = quanti * 99.99;
                break;
            }
            case 4: {
                System.out.println("Descrição do produto: Fundamentos de Programação.");
                total = quanti * 215.67;
                break;
            }
            default: {
                System.out.println("Código informado é inválido.");
                break;
            }
        }

        System.out.println("Preço: R$" + total);

    }
}
