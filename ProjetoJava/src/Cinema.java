
import java.util.Scanner;

public class Cinema {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int cinema[][] = new int[10][11];
        int option;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                if (j == 5) {
                    cinema[i][j] = 2;
                }
            }
        }

        do {
            int linhaSelect = 0;
            int colunaSelect = 0;
            int continuar;
            System.out.println("");
            System.out.println("Informe a operação:");
            System.out.println("1 = Registrar compra.");
            System.out.println("2 = Liberar cadeira.");
            System.out.println("3 = Mostrar relatório.");
            System.out.println("4 = Sair.");
            option = sc.nextInt();
            if (option == 1) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 11; j++) {
                        if (cinema[i][j] == 2) {
                            System.out.print((char) 27 + "[31m" + "X" + (char) 27 + "[0m");
                            System.out.print(" ");
                        } else if (cinema[i][j] == 1) {
                            System.out.print((char) 27 + "[31m" + "1" + (char) 27 + "[0m");
                            System.out.print(" ");
                        } else {
                            System.out.print("0");
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                do {
                    continuar = 1;
                    System.out.println("");
                    System.out.print("Informe a linha e coluna da cadeira: ");
                    linhaSelect = sc.nextInt();
                    colunaSelect = sc.nextInt();
                    linhaSelect = linhaSelect - 1;
                    colunaSelect = colunaSelect - 1;
                    if (colunaSelect == 5) {
                        colunaSelect = colunaSelect + 1;
                    }
                    if (cinema[linhaSelect][colunaSelect] == 1) {
                        System.err.println("Cadeira ocupada, informe outra.");
                    } else {
                        cinema[linhaSelect][colunaSelect] = 1;
                        System.out.println((char) 27 + "[32m" + "Cadeira reservada." + (char) 27 + "[0m");
                        continuar = 0;
                    }
                } while (continuar == 1);
            } else if (option == 2) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 11; j++) {
                        if (cinema[i][j] == 2) {
                            System.out.print((char) 27 + "[31m" + "X" + (char) 27 + "[0m");
                            System.out.print(" ");
                        } else if (cinema[i][j] == 1) {
                            System.out.print((char) 27 + "[31m" + "1" + (char) 27 + "[0m");
                            System.out.print(" ");
                        } else {
                            System.out.print("0");
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.print("Informe a linha e coluna da cadeira: ");
                linhaSelect = sc.nextInt();
                colunaSelect = sc.nextInt();
                linhaSelect = linhaSelect - 1;
                colunaSelect = colunaSelect - 1;
                if (colunaSelect == 5) {
                    colunaSelect = colunaSelect + 1;
                }
                if (cinema[linhaSelect][colunaSelect] == 0) {
                    System.err.println("Cadeira livre, informe outra.");
                } else {
                    cinema[linhaSelect][colunaSelect] = 0;
                    System.out.println((char) 27 + "[32m" + "Cadeira liberada." + (char) 27 + "[0m");
                }
            } else if (option == 3) {
                System.out.println("Legenda:");
                System.out.println("0 = Livre.");
                System.out.println((char) 27 + "[31m" + "1" + (char) 27 + "[0m" + " = Ocupado.");
                System.out.println((char) 27 + "[31m" + "X" + (char) 27 + "[0m" + " = Corredor.");
                System.out.println("");
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 11; j++) {
                        if (cinema[i][j] == 2) {
                            System.out.print((char) 27 + "[31m" + "X" + (char) 27 + "[0m");
                            System.out.print(" ");
                        } else if (cinema[i][j] == 1) {
                            System.out.print((char) 27 + "[31m" + "1" + (char) 27 + "[0m");
                            System.out.print(" ");
                        } else {
                            System.out.print("0");
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
            } else if (option == 4) {
                System.out.println("");
                System.out.println("Tchau.");
            } else if (option < 1 || option > 4) {
                System.err.println("ERRO, Valor inválido.");
            }

        } while (option != 4);

    }
}
//System.out.println((char)27 + "[31m" + "ERROR MESSAGE IN RED" + (char)27 + "[0m");
// USE \t OU \n