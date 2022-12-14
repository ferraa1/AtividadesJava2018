package Lista03;

import java.util.Scanner;

public class Exercício02 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tipo de combustível G ou A: ");
        char comb = sc.next().charAt(0);
        System.out.print("Informe a capacidade do tanque em litros: ");
        double capa = sc.nextDouble();

        switch (comb) {
            case 'g': {
                double total = capa * 3.34;
                System.out.println("Para encher o tanque, custará: R$" + total);
                break;
            }
            case 'a': {
                double total = capa * 7.79;
                System.out.println("Para encher o tanque, custará: R$" + total);
                break;
            }
            default:
                System.out.println("ERRO!");
                break;
        }

    }
}
