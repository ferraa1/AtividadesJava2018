
import java.util.Scanner;

public class Subprogramas1 {

    static int number;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        number = sc.nextInt();
        System.out.println("O fatorial do número informado é: " + fatorial());
    }

    public static int fatorial() {
        int result = 1;
        for (int i = number; i > 1; i--) {
            result = result * i;
        }
        return result;
    }
}
