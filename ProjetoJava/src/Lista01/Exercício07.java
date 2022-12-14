package Lista01;

import java.util.Scanner;

public class Exercício07 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a altura da parede em metros: ");
        double ap = sc.nextDouble();
        System.out.print("Informe a largura da parede em metros: ");
        double lp = sc.nextDouble();
        System.out.print("Informe o rendimento da tinta em metros quadrados por litro: ");
        double rt = sc.nextDouble();
        System.out.print("Informe o tamanho da lata de tinta em litros: ");
        double lt = sc.nextDouble();
        System.out.print("Informe o preço da lata de tinta: ");
        double pl = sc.nextDouble();

        double area = ap * lp;
        double quanti = area / rt / lt;
        double pf = quanti * pl;

        System.out.println("A área da parede é " + area + " metros quadrados.");
        System.out.println("Serão necessárias " + quanti + " latas de tinta.");
        System.out.println("Custará R$" + pf);

    }
}
