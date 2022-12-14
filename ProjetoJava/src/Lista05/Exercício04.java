package Lista05;

import java.util.Scanner;

public class Exercício04 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String continuar;
        int paes;
        int broas;
        double total = 0;

        for (int i = 1; i <= 6; i++) {

            switch (i) {
                case 1: {
                    System.out.println("Segunda:");
                    break;
                }
                case 2: {
                    System.out.println("Terça:");
                    break;
                }
                case 3: {
                    System.out.println("Quarta:");
                    break;
                }
                case 4: {
                    System.out.println("Quinta");
                    break;
                }
                case 5: {
                    System.out.println("Sexta:");
                    break;
                }
                case 6: {
                    System.out.println("Sábado:");
                    break;
                }
            }

            do {
                System.out.println("Informe os produtos que foram comprados pelo cliente:");
                System.out.print("Pães: ");
                paes = sc.nextInt();
                System.out.print("Broas: ");
                broas = sc.nextInt();
                total += (paes * 0.12) + (broas * 1.5);
                System.out.print("Deseja informar os produtos de outro cliente? ");
                continuar = sc.next();
            } while (continuar.equalsIgnoreCase("sim"));

        }
        
        System.out.println("O total de dinheiro arrecadado com as vendas dessa semana foi: R$" + total + ".");
        System.out.println("R$" + (total * 0.1) + " deve ser destinado à poupança.");

    }
}
