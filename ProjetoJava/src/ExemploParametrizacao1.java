
import java.util.Scanner;

public class ExemploParametrizacao1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        double a = sc.nextInt();
        System.out.print("Informe a operação (1 = soma, 2 = subtração, 3 = divisão ou 4 = multiplicação): ");
        int operacao = sc.nextInt();
        System.out.print("Informe outro valor: ");
        double b = sc.nextInt();
        switch (operacao) {
            case 1: {
                System.out.println("A soma dos dois valores resulta em: " + soma(a, b));
                break;
            }
            case 2: {
                System.out.println("A subtracao dos dois valores resulta em: " + subtracao(a, b));
                break;
            }
            case 3: {
                System.out.println("A divisao dos dois valores resulta em: " + divisao(a, b));
                break;
            }
            case 4: {
                System.out.println("A multiplicação dos dois valores resulta em: " + multiplicacao(a, b));
                break;
            }
        }
    }

    public static double soma(double c, double d) {
        return c + d;
    }

    public static double subtracao(double c, double d) {
        return c - d;
    }

    public static double divisao(double c, double d) {
        return c / d;
    }

    public static double multiplicacao(double c, double d) {
        return c * d;
    }
}
