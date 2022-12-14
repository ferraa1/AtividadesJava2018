
import java.util.Scanner;

public class Subprogramas0 {

    static int a, b;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Informe o segundo valor: ");
        b = sc.nextInt();
        int resultado = soma();
        System.out.println("A soma dos dois valores informados é: " + resultado);
        //Ou só sout("blá" + soma() );

    }

    public static int soma() {

        int soma = a + b;
        return soma;
        //Ou só: return (a + b);

    }
}
