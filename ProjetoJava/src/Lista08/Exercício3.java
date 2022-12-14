package Lista08;

import java.util.Scanner;

public class Exercício3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int confirm;
        char option;
        int valor;
        int valorTwo;
        int exit;
        for (int i = 0; i < vetor.length; i++) {
            confirm = 1;
            do {
                System.out.print("Informe um valor para a " + (i + 1) + "ª posição do vetor: ");
                vetor[i] = sc.nextInt();
                if (vetor[i] < 1) {
                    System.out.println("O valor deve ser maior que zero.");
                } else if (i > 0) {
                    confirm = 2;
                    for (int j = 0; j < i; j++) {
                        if (vetor[j] == vetor[i]) {
                            System.out.println("O valor não pode ser repetido.");
                            confirm = 1;
                            break;
                        }
                    }
                } else if (i == 0) {
                    confirm = 2;
                }
            } while (confirm != 2);
        }
        exit = 1;
        do {
            System.out.println("");
            System.out.println("MENU: ");
            System.out.println("Para inserir um valor, insira I.");
            System.out.println("Para editar um valor, insira E.");
            System.out.println("Para deletar um valor, insira D.");
            System.out.println("Para listar o vetor, insira L.");
            System.out.println("Para sair, insira X.");
            option = sc.next().charAt(0);
            if (option == 'i' || option == 'I') {
                int aux = 10;
                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] == 0) {
                        aux = i;
                    }
                }
                if (aux != 10) {
                    System.out.println("Vetor: ");
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.println(vetor[i]);
                    }
                    System.out.print("Informe a posição do vetor para inserir um valor (a posição deve estar vazia, ou seja, possuir um zero): ");
                    valor = sc.nextInt();
                    valor--;
                    if (valor < 0 || valor > 9) {
                        System.out.println("O valor deve ser entre 1 e 10.");
                    } else if (vetor[valor] != 0){
                        System.out.println("A posição deve estar vazia (possuir um zero).");
                    } else {
                        System.out.println("Informe o valor a ser inserido: ");
                        valorTwo = sc.nextInt();
                        if (valorTwo < 1) {
                            System.out.println("O valor deve ser maior que zero.");
                        } else {
                            for (int i = 0; i < vetor.length; i++) {
                                if (vetor[i] == valorTwo) {
                                    System.out.println("O valor informado é repetido.");
                                    break;
                                } else if (i == (vetor.length - 1)) {
                                    vetor[valor] = valorTwo;
                                }
                            }
                        }
                    }
                }
            } else if (option == 'e' || option == 'E') {
                System.out.println("Vetor: ");
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println(vetor[i]);
                }
                System.out.print("Insira a posição do valor que deve ser editado: ");
                valor = sc.nextInt();
                valor--;
                if (valor < 0 || valor > 9) {
                    System.out.println("O valor deve ser entre 1 e 10.");
                } else if (vetor[valor] == 0) {
                    System.out.println("A posição selecionada não deve estar vazia (ter um zero).");
                } else {
                    System.out.print("Insira o novo valor: ");
                    valorTwo = sc.nextInt();
                    if (valorTwo < 1) {
                        System.out.println("O valor deve ser maior que zero.");
                    } else {
                        for (int i = 0; i < vetor.length; i++) {
                            if (vetor[i] == valorTwo) {
                                System.out.println("O valor informado é repetido.");
                                break;
                            } else if (i == (vetor.length - 1)) {
                                vetor[valor] = valorTwo;
                            }
                        }
                    }
                }
            } else if (option == 'd' || option == 'D') {
                System.out.print("Insira o valor que deve ser excluido: ");
                valor = sc.nextInt();
                if (valor < 1) {
                    System.out.println("O valor deve ser maior que zero.");
                } else {
                    int k = 1;
                    for (int i = 0; i < vetor.length; i++) {
                        if (valor == vetor[i]) {
                            vetor[i] = 0;
                            System.out.println("Valor deletado.");
                            k = 2;
                            break;
                        }
                    }
                    if (k == 1) {
                        System.out.println("Valor não encontrado.");
                    }
                }
            } else if (option == 'l' || option == 'L') {
                System.out.println("Vetor: ");
                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] != 0) {
                        System.out.println(vetor[i]);
                    }
                }
            } else if (option == 'x' || option == 'X') {
                exit = 2;
            } else {
                System.out.println("ERRO: COMANDO NÃO LISTADO, TENTE NOVAMENTE.");
            }
        } while (exit != 2);
        System.out.println("PROGRAMA ENCERRADO.");
    }
}
