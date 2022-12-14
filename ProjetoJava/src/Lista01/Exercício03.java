package Lista01;

import java.util.Scanner;

public class Exercício03 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos dias de vida você tem: ");
        int dias = sc.nextInt();

        int a = dias / 365;
        int m = (dias - a * 365) / 30;
        int d = (dias - a * 365) - m * 30;

        System.out.println("Sua idade é " + a + " anos, " + m + " meses e " + d + " dias.");

    }
}
/*
int anos = dias / 365;

int resto = (dias % 365);
int meses = resto / 30;
int quanto = resto % 30;
*/
