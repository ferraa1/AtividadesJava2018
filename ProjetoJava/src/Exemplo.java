
import java.util.Scanner;

public class Exemplo {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        double valor = 5.5;

        System.out.print("Informe um valor: ");
        double valor1 = entrada.nextDouble();
        System.out.print("Informe outro valor: ");
        double valor2 = entrada.nextDouble();

        System.out.println("A média é: " + ((valor1 + valor2) / 2));

    }
}
