package Lista02;

import java.util.Scanner;

public class Exercício03 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int id = sc.nextInt();

        if (id >= 5 && id <= 7) {
            System.out.println("Categoria: Infantil");
        } else if (id >= 11 && id <= 13) {
            System.out.println("Categoria: Juvenil");
        } else if (id >= 18 && id <= 25) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Categoria: Nenhuma");
        }

    }
}
