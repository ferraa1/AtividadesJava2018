package Lista03;

import java.util.Scanner;

public class Exercício01 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o dia: ");
        int dia = sc.nextInt();
        System.out.print("Informe o mês (em números): ");
        int mes = sc.nextInt();
        System.out.print("Informe o ano: ");
        int ano = sc.nextInt();
        int resto = ano % 4;
        dia = dia + 1;
        if (mes == 1 && dia == 32) {
            dia = 1;
            mes = 2;
        }
        if (mes == 2) {
            if (resto == 0) {
                if (dia == 30) {
                    dia = 1;
                    mes = 3;
                }
            } else if (dia == 29) {
                dia = 1;
                mes = 3;
            }
        }
        if (mes == 3 && dia == 32) {
            dia = 1;
            mes = 4;
        }
        if (mes == 4 && dia == 31) {
            dia = 1;
            mes = 5;
        }
        if (mes == 5 && dia == 32) {
            dia = 1;
            mes = 6;
        }
        if (mes == 6 && dia == 31) {
            dia = 1;
            mes = 7;
        }
        if (mes == 7 && dia == 32) {
            dia = 1;
            mes = 8;
        }
        if (mes == 8 && dia == 32) {
            dia = 1;
            mes = 9;
        }
        if (mes == 9 && dia == 31) {
            dia = 1;
            mes = 10;
        }
        if (mes == 10 && dia == 32) {
            dia = 1;
            mes = 11;
        }
        if (mes == 11 && dia == 31) {
            dia = 1;
            mes = 12;
        }
        if (mes == 12 && dia == 32) {
            dia = 1;
            mes = 1;
            ano = ano + 1;
        }
        System.out.println("O dia seguinte será: " + dia + "/" + mes + "/" + ano);
    }
}
