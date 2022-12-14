package biblioteca;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DaoEditora daoEd = new DaoEditora();
        DaoLivro daoLi = new DaoLivro();
        int opcao = 0;
        
        do {
            System.out.println("----------------------------------------\n"
                    + "1 - Cadastrar Editora.\n"
                    + "2 - Cadastrar Livro.\n"
                    + "3 - Listar livros.\n"
                    + "0 - Sair.");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("----------------------------------------");
                    System.out.print("Informe o código da editora: ");
                    int codigo = sc.nextInt();
                    System.out.print("Informe o nome da eitora: ");
                    String nome = sc.next();
                    Editora ed = new Editora(codigo, nome);
                    if (daoEd.inserir(ed)) {
                        System.out.println("Editora cadastrada com sucesso.");
                    } else {
                        System.out.println("Erro ao cadastrar editora.");
                    }
                    break;
                }
                case 2: {
                    System.out.println("----------------------------------------");
                    System.out.print("Informe o titulo do livro: ");
                    String titulo = sc.next();
                    System.out.print("Informe a quantidade de páginas do livro: ");
                    int quantidadePaginas = sc.nextInt();
                    System.out.print("Informe os autores do livro: ");
                    String autores = sc.next();
                    System.out.print("Informe o código da editora do livro: ");
                    int codigoEditora = sc.nextInt();
                    Editora ed = daoEd.selecionarCodigo(codigoEditora);
                    if (ed != null) {
                        Livro li = new Livro(titulo, quantidadePaginas, autores, ed);
                        if (daoLi.inserir(li)) {
                            System.out.println("Livro cadastrado com sucesso.");
                        } else {
                            System.out.println("Erro ao cadastrar livro.");
                        }
                    } else {
                        System.out.println("Código da editora não foi encontrado.");
                    }
                    break;
                }
                case 3: {
                    for (Livro l: daoLi.listar()) {
                        System.out.println("----------------------------------------");
                        System.out.println(l.toString());
                    }
                    break;
                }
                case 0: {
                    System.out.println("Bye");
                }
            }
        } while (opcao != 0);
        daoLi.fechar();
        daoEd.fechar();
        
    }
}
