
import java.util.Scanner;

public class ExemploIf {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        switch (num) {// BREAKS
            case 1: {
                System.out.println("O número é 1.");
            }
            case 2: {
                System.out.println("O número é 2.");
            }
        }

        if (num > 0) {
            System.out.println("O número informado é positivo.");
        }

        if (num < 0) {
            System.out.println("O número informado é negativo.");
        }
    }
}
