package Lista13;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBanco {
    
    public static void main(String[] args) {
        int choice = 0;
        int encerrar = 0;
        ArrayList<Conta> contas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 = Inserir Conta");
            System.out.println("2 = Excluir Conta");
            System.out.println("3 = Efetuar Depósito");
            System.out.println("4 = Efetuar Saque");
            System.out.println("5 = Listar Contas");
            System.out.println("6 = Encerrar");
            System.out.println("Selecione um dos itens: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Informe os dados da conta: Cliente / Agência / Número: ");
                String cliente = sc.next();
                String agencia = sc.next();
                String numero = sc.next();
                Conta ata = new Conta(cliente,agencia,numero,0);
                contas.add(ata);
            } else if (choice == 2) {
                System.out.print("Informe o número da conta: ");
                String num = sc.next();
                for (Conta a: contas) {
                    if (a.getNumero().equals(num)) {
                        contas.remove(a);
                        break;
                    }
                }
            } else if (choice == 3) {
                System.out.print("Informe o número da conta: ");
                String num = sc.next();
                for (Conta a: contas) {
                    if (a.getNumero().equals(num)) {
                        System.out.print("Informe o valor para depositar: ");
                        double quantia = sc.nextDouble();
                        a.depositar(quantia);
                        break;
                    }
                }
            } else if (choice == 4) {
                System.out.print("Informe o número da conta: ");
                String num = sc.next();
                for (Conta a: contas) {
                    if (a.getNumero().equals(num)) {
                        System.out.print("Informe o valor para sacar: ");
                        double quantia = sc.nextDouble();
                        a.sacar(quantia);
                        break;
                    }
                }
            } else if (choice == 5) {
                for (Conta a: contas) {
                    System.out.println(a.toString());
                }
            } else if (choice == 6) {
                encerrar = 1;
            } else {
                System.out.println("Erro, valor não existente.");
            }
        } while (encerrar == 0);
        
    }
}
