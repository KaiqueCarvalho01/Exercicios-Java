package ScreenMatch.Modelo;

public class Titulo {
    private String nome; //String é uma classe
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes; //Utilizando modificadores de acesso
    private int totalDeAvaliacoes; //Encapsulando
    private int duracaoEmMinutos;

    //Criando setters
    public void setNome(String nome){
        this.nome = nome; //Este filme recebe o nome que foi passado como argumento
    }
    public void setAnodeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void setincluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    //Criando metodo acessor
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }
    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }
    //Criando um método
    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);  // Imprimindo o valor do atributo nome
        System.out.println("Ano de Lançamento " + anoDeLancamento); // Imprimindo o valor do atributo anoDeLancamento
        System.out.println("Duração: " + duracaoEmMinutos); // Imprimindo o valor do atributo duracaoEmMinutos
    }

    //Criando um método que passa um argumento
    public void avalia(double nota){
        somaDasAvaliacoes += nota; // Incrementando a nota ao atributo avaliação
        totalDeAvaliacoes++; // Incrementando o total de avaliações
    }

    public double mediaDasAvaliacoes(){ // Criando um método que retorna um valor
        return somaDasAvaliacoes / totalDeAvaliacoes; // Retornando a média das avaliações
    }
}
