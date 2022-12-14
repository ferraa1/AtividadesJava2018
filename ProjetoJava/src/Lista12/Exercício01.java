package Lista12;

import java.util.Scanner;

public class Exercício01 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de maçãs: ");
        int num = sc.nextInt();
        System.out.println("Preço: R$" + calculo(num));
    }
    
    public static double calculo(int a) {
        if (a >= 12) {
            return a * 0.25;
        }
        return a * 0.3;
    }
}
