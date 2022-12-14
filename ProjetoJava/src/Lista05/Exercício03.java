package Lista05;

import java.util.Scanner;

public class Exercício03 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char cod;
        double valor;
        double valorVista = 0;
        double valorPrazo = 0;
        double valorTotal = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Informe o código: ");
            cod = sc.next().charAt(0);
            System.out.print("Informe o valor: ");
            valor = sc.nextDouble();
            valorTotal += valor;
            if (Character.toUpperCase(cod) == 'V') {
                valorVista += valor;
            } else {
                valorPrazo += valor;
            }
        }
        System.out.println("O valor da prestação das compras a prazo é: " + (valorPrazo / 3));
        System.out.println("O valor total das compras a vista é: " + valorVista);
        System.out.println("O valor total das compras a prazo é: " + valorPrazo);
        System.out.println("O valor total das compras efetuadas é: " + valorTotal);
    }
}
