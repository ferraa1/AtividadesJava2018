package Lista01;

import java.util.Scanner;

public class Exercício09 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tempo gasto na viagem em horas: ");
        double horas = sc.nextDouble();
        System.out.print("Informe a velocidade média durante a viagem em quilômetros por hora: ");
        double kmh = sc.nextDouble();
        System.out.print("Informe o consumo médio do automóvel utilizado na viagem em quilômetros por litro: ");
        double kml = sc.nextDouble();
        System.out.print("Informe o preço do combustível utilizado durante a viagem em R$ por litro: ");
        double preco = sc.nextDouble();

        double fin = horas * kmh / kml * preco;

        System.out.println("O preço da viagem será R$" + fin);

    }
}
