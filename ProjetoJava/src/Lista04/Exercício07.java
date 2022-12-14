package Lista04;

import java.util.Scanner;

public class Exercício07 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String continuar;
        int menor = 1;
        int maior = 1;
        int mesesMenor = Integer.MAX_VALUE;
        int mesesMaior = Integer.MIN_VALUE;
        int num;
        int meses;
        do {
            System.out.print("Informe o número do empregado: ");
            num = sc.nextInt();
            System.out.print("Informe o número de meses de trabalho desse empregado: ");
            meses = sc.nextInt();
            if (meses > mesesMaior) {
                mesesMaior = meses;
                maior = num;
            }
            if (meses < mesesMenor) {
                mesesMenor = meses;
                menor = num;
            }
            System.out.print("Deseja informar outro número? ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("sim"));
        System.out.println("O empregado mais antigo é o número: " + maior + " com " + mesesMaior + " meses.");
        System.out.println("O empregado mais recente é o número: " + menor + " com " + mesesMenor + " meses.");
    }
}
