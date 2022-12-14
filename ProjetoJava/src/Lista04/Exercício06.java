package Lista04;

import java.util.Scanner;

public class Exercício06 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int total = 1;
        System.out.print("Informe o número X: ");
        int x = sc.nextInt();
        System.out.print("Informe o número Y: ");
        int y = sc.nextInt();
        for (int cont = 1; cont <= y; cont++) {
            total = x * total;
        }
        System.out.println("Resultado: " + total);
        
    }
}
