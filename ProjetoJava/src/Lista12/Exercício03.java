package Lista12;

import java.util.Scanner;

public class Exercício03 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int continuar;
        int um;
        int dois;
        int tres;
        do {
            continuar = 1;
            System.out.print("Informe o primeiro ângulo: ");
            um = sc.nextInt();
            System.out.print("Informe o segundo ângulo: ");
            dois = sc.nextInt();
            System.out.print("Informe o terceiro ângulo: ");
            tres = sc.nextInt();
            if ((um + dois + tres) > 180) {
                System.out.println("Erro, a soma dos ângulos informados excede 180°");
                continuar = 0;
            }
        } while (continuar == 0);
        System.out.println("Os ângulos informados formam um " + calculo(um,dois,tres));
        
    }
    
    public static String calculo(int a, int b, int c) {
        if (a > 90 || b > 90 || c > 90) {
            return "Triângulo Obtusângulo";
        }
        if (a < 90 && b < 90 && c < 90) {
            return "Triângulo Acutângulo";
        }
        return "Triângulo Retângulo";
    }
}
