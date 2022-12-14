package Lista04;

import java.util.Scanner;

public class Exercício09 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int cont = 0;
        double salario;
        int filhos;
        char continuar;
        double somaSalario = 0;
        double mediaSalario;
        int somaFilhos = 0;
        double mediaFilhos;
        double maior = -1;
        double contPercentual = 0;
        double percentual;
        
        do {
            System.out.print("Informe o salário: ");
            salario = sc.nextInt();
            System.out.print("Informe o número de filhos: ");
            filhos = sc.nextInt();
            cont++;
            /*
            1) média do salário da população;
            2) média do número de filhos;
            3) maior salário;
            4) percentual de pessoas com salário até R$2500,00.
            */
            somaSalario = somaSalario + salario;
            somaFilhos = somaFilhos + filhos;
            if (salario > maior) {
                maior = salario;
            }
            if (salario < 2500) {
                contPercentual++;
            }
            System.out.print("Deseja continuar? ");
            continuar = sc.next().charAt(0);
        } while (continuar=='s'||continuar=='S');
        
        mediaSalario = somaSalario / cont;
        System.out.println("A média de salários é: R$" + mediaSalario);
        mediaFilhos = somaFilhos / cont;
        System.out.println("A média de filhos é: " + mediaFilhos);
        System.out.println("O maior salário é: R$" + maior);
        percentual = contPercentual * 100 / cont;
        System.out.println("O percentual de pessoas com salário até 2500 é: " + percentual + "%");
        
    }
}
