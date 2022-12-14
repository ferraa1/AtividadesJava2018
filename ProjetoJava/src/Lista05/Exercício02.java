package Lista05;

import java.util.Scanner;

public class Exercício02 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Informe um número: ");
            number = sc.nextInt();
        } while (number < 1 || number > 9);
        System.out.println("Tabuada do " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + i * number);
        }
    }
}
