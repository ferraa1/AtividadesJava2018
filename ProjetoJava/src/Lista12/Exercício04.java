package Lista12;

import java.util.Scanner;

public class Exercício04 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a altura: ");
        double altura = sc.nextDouble();
        System.out.print("Informe o peso: ");
        double peso = sc.nextDouble();
        System.out.println("IMC: " + calculo(altura, peso));
        System.out.println("Situação: " + resultado(calculo(altura, peso)));
    }

    public static double calculo(double a, double p) {
        return p / (Math.pow(a, 2));
    }

    public static String resultado(double valor) {
        if (valor < 20) {
            return "Magro";
        } else if (valor < 24) {
            return "Normal";
        } else if (valor < 29) {
            return "Acima do Peso";
        } else if (valor < 34) {
            return "Obeso";
        } else {
            return "Muito Obeso";
        }
    }
}
