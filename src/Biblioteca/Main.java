package Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Listar Livros");
            System.out.println("4. Buscar Livro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de Publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); 
                    biblioteca.adicionarLivro(new Livro(titulo, autor, ano)); //passando um novo objeto Livro para o método adicionarLivro
                    break;
                case 2:
                    System.out.print("Título do livro a remover: ");
                    String tituloRemover = scanner.nextLine();
                    biblioteca.removerLivro(tituloRemover);
                    break;
                case 3:
                    biblioteca.listarLivros();
                    break;
                case 4:
                    System.out.print("Título do livro a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    Livro livro = biblioteca.buscarLivro(tituloBuscar);
                    if (livro != null) {
                        System.out.println("Livro encontrado: " + livro);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}