package catalogoproduto;

import java.util.Scanner;

public class Sistema {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DaoCategoria daoC = new DaoCategoria();
        DaoProduto daoP = new DaoProduto();
        int opcao = 0;
        
        do {
            System.out.print("Selecione:\n"
                    + "Categoria:(Cadastrar, Editar, Excluir, Listar)\n"
                    + "Produto:(Cadastrar, Editar, Excluir, Listar)");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.print("Nome: ");
                    String nome = sc.next();
                    Categoria c = new Categoria(nome);
                    if (daoC.inserir(c)) {
                        System.out.println("Cadastrado");
                    } else {
                        System.out.println("Erro ao Cadastrar");
                    }
                    break;
                }
                case 2: {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    Categoria c = daoC.selecionar(id);
                    if (c != null) {
                        System.out.print("Novo nome da categoria: ");
                        String nome = sc.next();
                        c.setNome(nome);
                        if (daoC.editar(c)) {
                            System.out.println("Editado com sucesso");
                        } else {
                            System.out.println("Erro ao editar");
                        }
                    } else {
                        System.out.println("Categoria não encontrada");
                    }
                    break;
                }
                case 3: {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    Categoria c = daoC.selecionar(id);
                    if (c != null) {
                        if (daoC.excluir(c)) {
                            System.out.println("Excluido com sucesso");
                        } else {
                            System.out.println("Erro ao excluir a categoria");
                        }
                    } else {
                        System.out.println("Categoria não foi encontrada");
                    }
                    break;
                }
                case 4: {
                    for (Categoria c : daoC.listar()) {
                        System.out.println(c.toString());
                    }
                    break;
                }
                //------------------------------------------------------------------------------------------------------
                case 5: {
                    System.out.print("Código: ");
                    String codigo = sc.next();
                    System.out.print("Descrição: ");
                    String descricao = sc.next();
                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    System.out.print("ID da Categoria: ");
                    int idCategoria = sc.nextInt();
                    Categoria c = daoC.selecionar(idCategoria);
                    Produto p = new Produto(codigo, descricao, valor, c);
                    if (daoP.inserir(p)) {
                        System.out.println("Cadastrado");
                    } else {
                        System.out.println("Erro ao Cadastrar");
                    }
                    break;
                }
                case 6: {
                    System.out.print("Código: ");
                    String codigo = sc.next();
                    Produto p = daoP.selecionarSemFind(codigo);
                    if (p != null) {
                        System.out.print("ID da nova categoria: ");
                        int idCategoria = sc.nextInt();
                        Categoria c = daoC.selecionar(idCategoria);
                        p.setCategoria(c);
                        if (daoP.editar(p)) {
                            System.out.println("Editado com sucesso");
                        } else {
                            System.out.println("Erro ao editar");
                        }
                    } else {
                        System.out.println("Produto não encontrado");
                    }
                    break;
                }
                case 7: {
                    
                    break;
                }
                case 8: {
                    
                    break;
                }
            }
        } while (opcao != 0);
        daoC.fechar();
        daoP.fechar();
        
    }
    
}
