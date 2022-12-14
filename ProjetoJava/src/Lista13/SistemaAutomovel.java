package Lista13;

import java.util.Scanner;

public class SistemaAutomovel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Automovel a1 = new Automovel("Gol","ABC","Azul",2004,0,0);
        Automovel a2 = new Automovel("Celta","DEF","Vermelho",2006,0,0);
        a1.setCombustivel(30);
        a2.setCombustivel(10);
        System.out.print("Acelerar o gol em: ");
        double acel1 = sc.nextDouble();
        a1.acelerar(acel1);
        System.out.println(a1.toString());
        System.out.print("Acelerar o celta em: ");
        double acel2 = sc.nextDouble();
        a2.acelerar(acel2);
        System.out.println(a2.toString());
        System.out.print("Frear o gol em: ");
        double fre1 = sc.nextDouble();
        a1.frear(fre1);
        System.out.println(a1.toString());
        System.out.print("Frear o celta em: ");
        double fre2 = sc.nextDouble();
        a2.frear(fre2);
        System.out.println(a2.toString());
    }
}
