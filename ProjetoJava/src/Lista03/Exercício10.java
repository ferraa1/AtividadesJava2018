package Lista03;

import java.util.Scanner;

public class Exercício10 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor a ser sacado: ");
        int saque = sc.nextInt();
        int restoSaque = saque % 5;

        if (restoSaque == 0) {
            int restoCem = saque % 100;
            int restoCinquenta = saque % 50;
            int restoVinte = saque % 20;
            int restoDez = saque % 10;
            System.out.println("O usuário receberá:");
            int notaCem = (saque - restoCem) / 100;
            saque = saque - (notaCem * 100);
            System.out.println(notaCem + " nota(s) de R$100");
            int notaCinquenta = (saque - restoCinquenta) / 50;
            saque = saque - (notaCinquenta * 50);
            System.out.println(notaCinquenta + " nota(s) de R$50");
            int notaVinte = (saque - restoVinte) / 20;
            saque = saque - (notaVinte * 20);
            System.out.println(notaVinte + " notas(s) de R$20");
            int notaDez = (saque - restoDez) / 10;
            saque = saque - (notaDez * 10);
            System.out.println(notaDez + " nota(s) de R$10");
            int notaCinco = saque / 5;
            System.out.println(notaCinco + " nota(s) de R$5");
        } else {
            System.out.println("Erro, o valor do saque deve ser múltiplo por 5.");
        }

    }
}
