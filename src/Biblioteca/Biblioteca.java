package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }
    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }
    public void removerLivro(String titulo) {
        livros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(titulo));
    }
    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
}
