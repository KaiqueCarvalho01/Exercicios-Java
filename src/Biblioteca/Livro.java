package Biblioteca;

public class Livro {
    /*Só podem ser acessados dentro da propria classe */
    private String titulo;
    private String autor;
    private int anoPublicacao;

    /*
     * O construtor é um método especial que é chamado quando um novo objeto da classe Livro é criado. 
     * Ele inicializa os atributos do objeto com os valores fornecidos como argumentos
    */
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo; //this refere-se ao atributo da instância da classe. Sem this, o compilador não saberia diferenciar entre o parâmetro do construtor e o atributo da classe
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    //um método getter para o atributo titulo. Ele permite acessar o valor do atributo titulo fora da classe Livro.
    public String getTitulo() {
        return titulo;
    }

    //um método setter para o atributo titulo. Ele permite alterar o valor do atributo titulo fora da classe Livro.
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
