package Lista01;

import java.util.Scanner;

public class Exercício08 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salário-base do funcionário: ");
        double sb = sc.nextDouble();
        System.out.print("Informe a quantidade de dependentes: ");
        double dp = sc.nextDouble();

        double sl = sb * 0.85 + (50 * dp);

        System.out.println("O salário líquido do funcionário é de R$" + sl);

    }
}
