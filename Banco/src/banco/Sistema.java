package banco;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DaoConta daoCo = new DaoConta();
        DaoCliente daoCl = new DaoCliente();
        int opcao = 0;

        do {
            System.out.println("----------------------------------------------\n"
                    + "Selecione uma opção:\n"
                    + "1 - Cadastrar cliente.\n"
                    + "2 - Editar cliente.\n"
                    + "3 - Excluir cliente.\n"
                    + "4 - Criar conta.\n"
                    + "5 - Editar conta.\n"
                    + "6 - Excluir conta\n"
                    + "7 - Listar clientes.\n"
                    + "8 - Selecionar cliente.\n"
                    + "9 - Listar contas\n"
                    + "10 - Selecionar contas\n"
                    + "11 - Depositar.\n"
                    + "12 - Sacar.\n"
                    + "13 - Sair.");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.print("Nome: ");
                    String nome = sc.next();
                    System.out.print("CPF: ");
                    int cpf = sc.nextInt();
                    System.out.print("Email: ");
                    String email = sc.next();
                    System.out.print("Fone: ");
                    String fone = sc.next();
                    Cliente cl = new Cliente(nome, cpf, email, fone);
                    if (daoCl.inserir(cl)) {
                        System.out.println("Cliente cadastrado com sucesso.");
                    } else {
                        System.out.println("Erro ao cadastrar cliente.");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Selecione o CPF do cliente: ");
                    int cpf = sc.nextInt();
                    Cliente cl = daoCl.selecionarSemFind(cpf);
                    if (cl != null) {
                        System.out.print("Informe o novo nome: ");
                        String nome = sc.next();
                        cl.setNome(nome);
                        if (daoCl.editar(cl)) {
                            System.out.println("Cliente editado com sucesso.");
                        } else {
                            System.out.println("Erro ao editar cliente.");
                        }
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Selecione o CPF do cliente: ");
                    int cpf = sc.nextInt();
                    Cliente cl = daoCl.selecionarSemFind(cpf);
                    if (cl != null) {
                        if (daoCl.excluir(cl)) {
                            System.out.println("Excluido com sucesso.");
                        } else {
                            System.out.println("Erro ao excluir o cliente.");
                        }
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Agência: ");
                    String agencia = sc.next();
                    System.out.print("Número: ");
                    int numero = sc.nextInt();
                    System.out.print("CPF do cliente: ");
                    int cpf = sc.nextInt();
                    Cliente cl = daoCl.selecionarSemFind(cpf);
                    Conta co = new Conta(agencia, numero, cl);
                    if (daoCo.inserir(co)) {
                        System.out.println("Conta cadastrada com sucesso.");
                    } else {
                        System.out.println("Erro ao cadastrar conta.");
                    }
                    break;
                }
                case 5: {
                    System.out.print("Informe o número da conta: ");
                    int numero = sc.nextInt();
                    Conta co = daoCo.selecionarSemFind(numero);
                    if (co != null) {
                        System.out.print("Informe a nova agência: ");
                        String agencia = sc.next();
                        co.setAgencia(agencia);
                        if (daoCo.editar(co)) {
                            System.out.println("Conta editada com sucesso.");
                        } else {
                            System.out.println("Erro ao editar conta.");
                        }
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                }
                case 6: {
                    System.out.print("Selecione o número da conta: ");
                    int numero = sc.nextInt();
                    Conta co = daoCo.selecionarSemFind(numero);
                    if (co != null) {
                        if (daoCo.excluir(co)) {
                            System.out.println("Excluido com sucesso.");
                        } else {
                            System.out.println("Erro ao excluir o cliente.");
                        }
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                }
                case 7: {
                    for (Cliente c : daoCl.listar()) {
                        System.out.println(c.toString());
                    }
                    break;
                }
                case 8: {
                    System.out.print("Informe o CPF do cliente: ");
                    int cpf = sc.nextInt();
                    Cliente cl = daoCl.selecionarSemFind(cpf);
                    if (cl != null) {
                        System.out.println(cl.toString());
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                }
                case 9: {
                    for (Conta c : daoCo.listar()) {
                        System.out.println(c.toString());
                    }
                    break;
                }
                case 10: {
                    System.out.print("Informe o número da conta: ");
                    int numero = sc.nextInt();
                    Conta co = daoCo.selecionarSemFind(numero);
                    if (co != null) {
                        System.out.println(co.toString());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                }
                case 11: {
                    System.out.print("Informe o número da conta: ");
                    int numero = sc.nextInt();
                    Conta co = daoCo.selecionarSemFind(numero);
                    if (true) {
                        System.out.print("Informe o valor para depositar: ");
                        double valor = sc.nextDouble();
                        co.depositar(valor);
                        if (daoCo.editar(co)) {
                            System.out.println("Conta editada com sucesso.");
                        } else {
                            System.out.println("Erro ao editar conta.");
                        }
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                }
                case 12: {
                    System.out.print("Informe o número da conta: ");
                    int numero = sc.nextInt();
                    Conta co = daoCo.selecionarSemFind(numero);
                    if (true) {
                        System.out.print("Informe o valor para sacar: ");
                        double valor = sc.nextDouble();
                        co.sacar(valor);
                        if (daoCo.editar(co)) {
                            System.out.println("Conta editada com sucesso.");
                        } else {
                            System.out.println("Erro ao editar conta.");
                        }
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                }
                case 13: {
                    System.out.println("Bye.");
                    break;
                }
            }
        } while (opcao != 13);
        daoCo.fechar();
        daoCl.fechar();

    }
}
