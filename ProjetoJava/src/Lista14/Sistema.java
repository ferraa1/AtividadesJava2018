package Lista14;

import java.util.ArrayList;
import java.util.Scanner;
//Math.pow (valor, 2);
//Math.abs (va - vu);

public class Sistema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Paciente> pacientes = new ArrayList<>();
        /*
        HashMap<String, Paciente> pacientesMapa = new HashMap<>();
        (chave tipo string e objeto tipo paciente)
        */
        boolean exit = false;
        do {
            System.out.println("MENU:\n"
                    + "1 - Cadastrar paciente.\n"
                    + "2 - Editar paciente.\n"
                    + "3 - Excluir paciente.\n"
                    + "4 - Buscar paciente.\n"
                    + "5 - Listagem dos pacientes com IMC abaixo de 20.\n"
                    + "6 - Listagem dos pacientes com IMC acima de 30.\n"
                    + "7 - Listagem dos pacientes com IMC entre 20 e 25.\n"
                    + "8 - Listagem dos pacientes onde a diferença entre o peso real e o peso ideal seja maior que 10.\n"
                    + "9 - Listagem de todos os pacientes.\n"
                    + "10 - Sair.");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
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
                    Paciente p = new Paciente(cpf, nome, sexo, peso, altura);
                    pacientes.add(p);
                    //pacientesMapa.put(cpf, p);
                    break;
                }
                case 2: {
                    System.out.print("Informe o CPF do paciente: ");
                    String cpf = sc.next();
                    /*
                    Paciente p = pacientesMapa.get(cpf);
                    if (p != null) {
                        sout("Novo peso: ");
                        double peso = s.nextDouble();
                        sout("Nova altura: ");
                        double altura = s.nextDouble();
                        p.setPeso(peso);
                        p.setAltura(altura);
                    }
                    */
                    for (Paciente p : pacientes) {
                        if (p.getCpf().equals(cpf)) {
                            System.out.println("Selecione qual você deseja editar:\n"
                                    + "1 - Peso.\n"
                                    + "2 - Altura.");
                            int choiceEdit = sc.nextInt();
                            switch (choiceEdit) {
                                case 1: {
                                    System.out.print("Informe o novo peso: ");
                                    p.setPeso(sc.nextDouble());
                                }
                                case 2: {
                                    System.out.print("Informe a nova altura: ");
                                    p.setAltura(sc.nextDouble());
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.print("Informe o CPF do paciente: ");
                    String cpf = sc.next();
                    /*
                    if (pacientesMapa.remove(cpf) == null) {
                        sout("Paciente não encontrado");
                    } else {
                        sout("Excluído com sucesso")
                    }
                    */
                    for (Paciente p : pacientes) {
                        if (p.getCpf().equals(cpf)) {
                            pacientes.remove(p);
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.print("Informe o CPF do paciente: ");
                    String cpf = sc.next();
                    /*
                    sout(pacientesMapa.get(cpf).toString());
                    sout(pacientesMapa.get(cpf).calcularImc());
                    sout(pacientesMapa.get(cpf).calcularPesoIdeal());
                    */
                    for (Paciente p : pacientes) {
                        if (p.getCpf().equals(cpf)) {
                            System.out.println(p.toString());
                            System.out.println("IMC: " + p.calcularImc());
                            System.out.println("Peso ideal: " + p.calcularPesoIdeal());
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    /*
                    for (String cpf : pacientesMapa.keySet()) {
                        Paciente p = pacientesMapa.get(cpf);
                        sout(p.toString());
                    }
                    */
                    for (Paciente p : pacientes) {
                        if (p.calcularImc() < 20) {
                            System.out.println(p.toString());
                        }
                    }
                    break;
                }
                case 6: {
                    for (Paciente p : pacientes) {
                        if (p.calcularImc() > 30) {
                            System.out.println(p.toString());
                        }
                    }
                    break;
                }
                case 7: {
                    for (Paciente p : pacientes) {
                        if (p.calcularImc() > 20 && p.calcularImc() < 25) {
                            System.out.println(p.toString());
                        }
                    }
                    break;
                }
                case 8: {
                    for (Paciente p : pacientes) {
                        double valor = p.getPeso() - p.calcularPesoIdeal();
                        if (valor < 0) {
                            valor *= -1;
                        }
                        if (valor > 10) {
                            System.out.println(p.toString());
                        }
                    }
                    break;
                }
                case 9: {
                    for (Paciente p : pacientes) {
                        System.out.println(p.toString());
                    }
                    break;
                }
                case 10: {
                    exit = true;
                    break;
                }
            }
        } while (exit != true);

    }

}
