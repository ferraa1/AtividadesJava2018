package Lista02;

import java.util.Scanner;

public class Exercício02 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o código de origem do produto: ");
        int cod = sc.nextInt();
        System.out.print("Informe o preço do produto: R$");
        double p = sc.nextDouble();

        switch (cod) {
            case 1: {
                System.out.println("Procedência: Sul");
                break;
            }
            case 2: {
                System.out.println("Procedência: Sudeste");
                break;
            }
            case 3: {
                System.out.println("Procedência: Centro-Oeste");
                break;
            }
            case 4: {
                System.out.println("Procedência: Norte");
                break;
            }
            case 5: {
                System.out.println("Procedência: Nordeste");
                break;
            }
        }

        System.out.println("Preço: R$" + p);

    }
}
