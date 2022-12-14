package Lista04;

import java.util.Scanner;

public class Exercício022 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.print("Informe um número: ");
        int valor = sc.nextInt();
        int maior = valor;
        int menor = valor;

        do {
            System.out.print("Informe outro número: ");
            valor = sc.nextInt();

            if (valor > maior) {
                maior = valor;
            } else if (valor < menor) {
                menor = valor;
            }

            System.out.print("Deseja informar outro número? ");
            resposta = sc.next();
        } while (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s"));

        System.out.println("Maior número informado: " + maior);
        System.out.println("Menor número informado: " + menor);
    }
}
