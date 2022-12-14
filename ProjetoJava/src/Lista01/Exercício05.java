package Lista01;

import java.util.Scanner;

public class Exercício05 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a altura do muro: ");
        double am = sc.nextDouble();
        System.out.print("Informe a largura do muro: ");
        double lm = sc.nextDouble();
        System.out.print("Informe a altura do tijolo: ");
        double at = sc.nextDouble();
        System.out.print("Informe a largura do tijolo: ");
        double lt = sc.nextDouble();
        System.out.print("Informe o preço do tijolo: ");
        double p = sc.nextDouble();

        double ts = (am * lm) / (at * lt);
        double tsp = ts * p;

        System.out.println("Será necessário " + ts + " tijolos para completar o muro.");
        System.out.println(ts + " tijolos custarão R$" + tsp);

    }
}
