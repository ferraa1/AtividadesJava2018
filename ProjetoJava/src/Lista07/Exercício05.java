package Lista07;

import java.util.Scanner;

public class Exercício05 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        double money[] = new double[10];
        
        for (int i = 0; i < money.length; i++) {
            System.out.print("Informe o salário do funcionário: ");
            money[i] = sc.nextDouble();
        }
        
        System.out.print("Informe a porcentagem do reajuste: ");
        double percent = sc.nextDouble();
        percent = percent / 100 + 1;
        System.out.println("Os salários após o reajuste serão:");
        
        for (int i = 0; i < money.length; i++) {
            System.out.println(money[i] + " = " + (money[i] * percent));
        }
    }
}
