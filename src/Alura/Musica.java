package Alura;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;

    void exibeFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de avaliações: " + numAvaliacao);
    }

    
    double mediaDasAvaliacoes(){
        return avaliacao / numAvaliacao;
    }
}
