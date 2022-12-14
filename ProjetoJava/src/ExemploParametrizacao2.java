
import java.util.Scanner;

public class ExemploParametrizacao2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma nota: ");
        double a = sc.nextInt();
        System.out.print("Informe uma nota: ");
        double b = sc.nextInt();
        System.out.print("Informe uma nota: ");
        double c = sc.nextInt();
        boolean aprovado = retornaAprovacao(retornaConceito(calcMedia(a, b, c)));
        System.out.println("Média: " + calcMedia(a, b, c));
        System.out.println("Conceito: " + retornaConceito(calcMedia(a, b, c)));
        if (aprovado == true) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
    }

    public static double calcMedia(double x, double y, double z) {
        return (x + y + z) / 3;
        //Isso é uma função porque retorna um valor
    }

    public static char retornaConceito(double valor) {
        if (valor <= 3) {
            return 'E';
        } else if (valor <= 5) {
            return 'D';
        } else if (valor <= 7) {
            return 'C';
        } else if (valor <= 8.5) {
            return 'B';
        }
        return 'A';
    }

    public static boolean retornaAprovacao(char conceito) {
        if (conceito == 'A' || conceito == 'B') {
            return true;
        } else {
            return false;
        }
    }
}
