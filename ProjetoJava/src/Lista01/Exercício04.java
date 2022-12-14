package Lista01;

import java.util.Scanner;

public class Exercício04 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o custo de fábrica do carro: ");
        double c = sc.nextDouble();

        double t = c * 1.73;

        System.out.println("O preço do carro para o consumidor será: R$" + t);

    }
}
