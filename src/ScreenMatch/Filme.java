package ScreenMatch;

//Quando uma função é criada dentro de uma classe, ela é chamada de método
public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes; //Utilizando modificadores de acesso
    private int totalDeAvaliacoes; //Encapsulando
    int duracaoEmMinutos;

    //Criando um método
    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);  // Imprimindo o valor do atributo nome
        System.out.println("Ano de Lançamento " + anoDeLancamento); // Imprimindo o valor do atributo anoDeLancamento
        System.out.println("Duração: " + duracaoEmMinutos); // Imprimindo o valor do atributo duracaoEmMinutos
    }

    //Criando um método que passa um argumento
    void avalia(double nota){
        somaDasAvaliacoes += nota; // Incrementando a nota ao atributo avaliação
        totalDeAvaliacoes++; // Incrementando o total de avaliações
    }

    double mediaDasAvaliacoes(){ // Criando um método que retorna um valor
        return somaDasAvaliacoes / totalDeAvaliacoes; // Retornando a média das avaliações
    }

    //Criando metodo acessor
    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

}
