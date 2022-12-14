package Lista12;

import java.util.Scanner;

public class Exercício02 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe os anos: ");
        int anos = sc.nextInt();
        System.out.print("Informe os meses: ");
        int meses = sc.nextInt();
        System.out.print("Informe os dias: ");
        int dias = sc.nextInt();
        System.out.println("Sua idade em dias é: " + calculo(anos,meses,dias));
    }
    
    public static int calculo(int a, int m, int d) {
        return (a * 365) + (m * 30) + d;
    }
}
