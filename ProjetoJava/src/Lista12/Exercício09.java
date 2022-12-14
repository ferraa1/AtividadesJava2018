package Lista12;

import java.util.Scanner;

public class Exercício09 {

    public static char conceito(int qtdeVeiculosDia, double mediaLitros) {
        if (qtdeVeiculosDia >= 1850 && mediaLitros >= 20) {
            return 'A';
        } else if (qtdeVeiculosDia >= 1500) {
            if (mediaLitros >= 20.5) {
                return 'A';
            } else if (mediaLitros >= 9.8) {
                return 'B';
            }
        } else if (qtdeVeiculosDia >= 1100) {
            if (mediaLitros >= 20) {
                return 'B';
            } else if (mediaLitros >= 12) {
                return 'C';
            }
        }
        return 'Z';
    }

    public static void armazena(int qtdeVeiculosDia, int postos[]) {
        for (int i = 0; i < 2; i++) {
            if (postos[i] == 0) {
                postos[i] = qtdeVeiculosDia;
                break;
            }
        }
    }

    public static double acimaMediaGeral(int postos[]) {
        double soma = 0;
        for (int i = 0; i < 2; i++) {
            soma = soma + postos[i];
        }
        double media = soma / 2;
        double cont = 0;
        for (int i = 0; i < 2; i++) {
            if (postos[i] > media) {
                cont = cont + 1;
            }
        }
        return cont;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String maiorNome = "x";
        String rua;
        String maiorRua = "x";
        int numero;
        int maiorNumero = 0;
        String bairro;
        String maiorBairro = "x";
        String cidade;
        String maiorCidade = "x";
        String uf;
        String maiorUf = "x";
        int vetor[] = new int[2];
        int veiculos;
        double litros;
        int maior = Integer.MIN_VALUE;
        double somaGas = 0;
        double somaCar = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "º POSTO");
            System.out.print("Informe o nome do posto: ");
            nome = sc.next();
            System.out.print("Informe a rua do posto: ");
            rua = sc.next();
            System.out.print("Informe o número do posto: ");
            numero = sc.nextInt();
            System.out.print("Informe o bairro do posto: ");
            bairro = sc.next();
            System.out.print("Informe a cidade do posto: ");
            cidade = sc.next();
            System.out.print("Informe informe a UF do posto: ");
            uf = sc.next();
            System.out.print("Informe a quantidade de veículos atendidos por dia: ");
            veiculos = sc.nextInt();
            System.out.print("Informe a média de litros de combustível por automóvel: ");
            litros = sc.nextDouble();
            somaGas += litros;
            armazena(veiculos, vetor);
            somaCar += veiculos;
            if (veiculos > maior) {
                maior = veiculos;
                maiorNome = nome;
                maiorRua = rua;
                maiorNumero = numero;
                maiorBairro = bairro;
                maiorCidade = cidade;
                maiorUf = uf;
            }
            System.out.println("Conceito do " + (i + 1) + "º posto: " + conceito(veiculos, litros));
        }
        double media = somaCar / 2;
        System.out.println(acimaMediaGeral(vetor) + " posto(s) estão acima da média geral de veículos (" + media + ")");
        System.out.println("Média geral de litros/dia vendidos: " + (somaGas / 2));
        System.out.println("Informações do posto com melhor desempenho em quantidade de veículos/dia atendidos:");
        System.out.println("Nome: " + maiorNome);
        System.out.println("Rua: " + maiorRua);
        System.out.println("Número: " + maiorNumero);
        System.out.println("Bairro: " + maiorBairro);
        System.out.println("Cidade: " + maiorCidade);
        System.out.println("UF: " + maiorUf);
    }
}
