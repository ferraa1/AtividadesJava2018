package Lista03;

import java.util.Scanner;

public class Exercício04 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a cor: ");
        String cor = sc.next();

        if (cor.equalsIgnoreCase("verde")) {
            System.out.println("O preço do CD será: R$10,00");
        } else if (cor.equalsIgnoreCase("azul")) {
            System.out.println("O preço do CD será: R$20,00");
        } else if (cor.equalsIgnoreCase("amarelo")) {
            System.out.println("O preço do CD será: R$30,00");
        } else if (cor.equalsIgnoreCase("vermelho")) {
            System.out.println("O preço do CD será: R$40,00");
        } else {
            System.out.println("A cor informada é inválida");
        }
    }
}
//switch (cor.toLowerCase()) {}