package Lista02;

import java.util.Scanner;

public class Exercício01 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu sexo (M ou F): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Informe sua altura: ");
        double altura = sc.nextDouble();

        if (Character.toUpperCase(sexo) == 'M') {
            System.out.println("Seu peso ideal é " + (72.7 * altura - 58) + " quilos.");
        } else {
            System.out.println("Seu peso ideal é " + (62.1 * altura - 44.72) + " quilos.");
        }

    }
}
//double pesoIdeal; (declarando variável para ela existir fora do if{})
//if(Character.toUpperCase(sexo) == 'M'){}
//if(!Character.toUpperCase(sexo) == 'F'){} (! = nope)
