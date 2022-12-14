package Lista03;

import java.util.Scanner;

public class Exercício08 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas trabalhadas pelo empregado: ");
        double horas = sc.nextDouble();
        System.out.print("Informe o valor da hora trabalhada: ");
        double valor = sc.nextDouble();
        double salarioBruto = horas * valor;
        double inss = 0;
        double impostoRenda = 0;

        if (salarioBruto <= 911.7) {
            inss = salarioBruto * 0.08;
        } else if (salarioBruto >= 911.71 && salarioBruto <= 1519.5) {
            inss = salarioBruto * 0.09;
        } else if (salarioBruto >= 1519.51 && salarioBruto <= 3038.99) {
            inss = salarioBruto * 0.11;
        } else {
            inss = 334.29;
        }

        if ((salarioBruto - inss) <= 1372.81) {
            impostoRenda = 0;
        } else if ((salarioBruto - inss) >= 1372.82 && (salarioBruto - inss) <= 2743.25) {
            impostoRenda = (salarioBruto - inss) * 0.15;
        } else {
            impostoRenda = (salarioBruto - inss) * 0.275;
        }

        double salarioLiquido = salarioBruto - inss - impostoRenda;
        System.out.println("O salário líquido do empregado é: R$" + salarioLiquido);

    }
}
