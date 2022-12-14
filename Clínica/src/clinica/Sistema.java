package clinica;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DaoClinica dao = new DaoClinica();
        int opcao = 0;

        do {

            System.out.println("----------------------------------------------\n"
                    + "Selecione uma opção:\n"
                    + "1 - Cadastrar paciente.\n"
                    + "2 - Editar paciente.\n"
                    + "3 - Excluir paciente.\n"
                    + "4 - Listar contas.\n"
                    + "5 - Listar pacientes com IMC abaixo de 20 (Magro).\n"
                    + "6 - Listar pacientes com IMC acima de 30 (Obesidade).\n"
                    + "7 - Listar pacientes com IMC entre 20 e 25 (Peso ideal).\n"
                    + "8 - Listar pacientes onde a diferença entre o peso real e o peso ideal seja maior que 10.\n"
                    + "9 - Selecionar conta.\n"
                    + "0 - Sair.");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("----------------------------------------------");
                    System.out.print("Informe o CPF: ");
                    String cpf = sc.next();
                    System.out.print("Informe o nome: ");
                    String nome = sc.next();
                    System.out.print("Informe o sexo (f/m): ");
                    char sexo = sc.next().charAt(0);
                    System.out.print("Informe o peso: ");
                    double peso = sc.nextDouble();
                    System.out.print("Informe a altura: ");
                    double altura = sc.nextDouble();
                    Clinica c = new Clinica(cpf, nome, sexo, peso, altura);
                    if (dao.inserir(c)) {
                        System.out.println("Paciente cadastrado.");
                    } else {
                        System.out.println("Erro ao cadastrar paciente.");
                    }
                    break;
                }
                case 2: {
                    System.out.println("----------------------------------------------");
                    System.out.print("Informe o CPF do paciente: ");
                    String cpf = sc.next();
                    Clinica c = dao.selecionarSemFind(cpf);
                    if (c != null) {
                        System.out.println("Selecione o que mudar:\n"
                                + "1 - Nome.\n"
                                + "2 - Peso.\n"
                                + "3 - Altura.");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1: {
                                System.out.print("Informe o novo nome: ");
                                String nome = sc.next();
                                c.setNome(nome);
                                break;
                            }
                            case 2: {
                                System.out.print("Informe o novo peso: ");
                                double peso = sc.nextDouble();
                                c.setPeso(peso);
                                break;
                            }
                            case 3: {
                                System.out.print("Informe a nova altura: ");
                                double altura = sc.nextDouble();
                                c.getAltura();
                                break;
                            }
                        }
                        if (true) {

                        }
                    } else {
                        System.out.println("Paciente não encontrado.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("----------------------------------------------");
                    System.out.print("Informe o CPF do paciente: ");
                    String cpf = sc.next();
                    Clinica c = dao.selecionarSemFind(cpf);
                    if (c != null) {
                        if (dao.excluir(c)) {
                            System.out.println("Paciente excluido com sucesso.");
                        } else {
                            System.out.println("Erro ao excluir o paciente.");
                        }
                    } else {
                        System.out.println("Paciente não encontrado.");
                    }
                    break;
                }
                case 4: {
                    for (Clinica c : dao.listar()) {
                        System.out.println("----------------------------------------------");
                        System.out.println(c.toString()
                                + "\nIMC: " + c.calcularImc() + "\n"
                                + "Peso Ideal: " + c.calcularPesoIdeal());
                    }
                    break;
                }
                case 5: {
                    System.out.println("----------------------------------------------");
                    for (Clinica c : dao.listar()) {
                        if (c.calcularImc() < 20) {
                            System.out.println(c.toString()
                                    + "\nIMC: " + c.calcularImc() + "\n"
                                    + "Peso Ideal: " + c.calcularPesoIdeal());
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("----------------------------------------------");
                    for (Clinica c : dao.listar()) {
                        if (c.calcularImc() > 30) {
                            System.out.println(c.toString()
                                    + "\nIMC: " + c.calcularImc() + "\n"
                                    + "Peso Ideal: " + c.calcularPesoIdeal());
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("----------------------------------------------");
                    for (Clinica c : dao.listar()) {
                        if (c.calcularImc() > 20 && c.calcularImc() < 25) {
                            System.out.println(c.toString()
                                    + "\nIMC: " + c.calcularImc() + "\n"
                                    + "Peso Ideal: " + c.calcularPesoIdeal());
                        }
                    }
                    break;
                }
                case 8: {
                    System.out.println("----------------------------------------------");
                    for (Clinica c : dao.listar()) {//diferença entre o peso real e o peso ideal seja maior que 10
                        double valor = c.getPeso() - c.calcularPesoIdeal();
                        if (valor < 0) {
                            valor *= -1;
                        }
                        if (valor > 10) {
                            System.out.println(c.toString()
                                    + "\nIMC: " + c.calcularImc() + "\n"
                                    + "Peso Ideal: " + c.calcularPesoIdeal());
                        }
                    }
                    break;
                }
                case 9: {
                    System.out.println("----------------------------------------------");
                    System.out.print("Informe o CPF da conta: ");
                    String cpf = sc.next();
                    Clinica c = dao.selecionarSemFind(cpf);
                    if (c != null) {
                        System.out.println(c.toString()
                                + "\nIMC: " + c.calcularImc() + "\n"
                                + "Peso Ideal: " + c.calcularPesoIdeal());
                    } else {
                        System.out.println("Paciente não encontrado.");
                    }
                    break;
                }
                case 0: {
                    System.out.println("----------------------------------------------\n"
                            + "Bye.");
                    break;
                }
            }

        } while (opcao != 0);
        dao.fechar();

    }

}
