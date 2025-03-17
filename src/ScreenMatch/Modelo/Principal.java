package ScreenMatch.Modelo;

import ScreenMatch.Calculos.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
        //Instanciação de objetos
        Filme meuFilme = new Filme(); // Criando um novo objeto do tipo filme... "new" = instanciar
        meuFilme.setNome("O Poderoso Chefão"); // Atribuindo um valor ao atributo nome
        meuFilme.setAnodeLancamento(1972);  // Atribuindo um valor ao atributo anoDeLancamento
        meuFilme.setDuracaoEmMinutos(175);// Atribuindo um valor ao atributo duracaoEmMinutos

       meuFilme.exibeFichaTecnica(); // Chamando o método exibeFichaTecnica
       meuFilme.avalia(8);
       meuFilme.avalia(5);
       meuFilme.avalia(10);
       //System.out.println(meuFilme.somaDasAvaliacoes);
       System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
       System.out.println("Média Avaliação " + meuFilme.mediaDasAvaliacoes());
       System.out.println("Ano de Lançamento: " + meuFilme.getAnoDeLancamento());


       System.out.println("-------------------------------------------------");
       System.out.println("-------------------------------------------------");
       Serie lost = new Serie();
       lost.setNome("Lost");
       lost.setAnodeLancamento(2004);
       lost.setTemporadas(10);
       lost.setEpisodiosPorTemporada(20);
       lost.setMinutosPorEpisodio(45);
       System.out.println("Duração da série: " + lost.getDuracaoEmMinutos());
        lost.setFinalizada(false);
       lost.exibeFichaTecnica();

       
       System.out.println("-------------------------------------------------");
       System.out.println("-------------------------------------------------");

       Filme novoFilme = new Filme();
       novoFilme.setNome("Avatar");
       novoFilme.setAnodeLancamento(2023);
       novoFilme.setDuracaoEmMinutos(180);

       CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
       calculadora.inclui(meuFilme);
       calculadora.inclui(novoFilme);
       calculadora.inclui(lost);
       System.out.println("Tempo filme: " + calculadora.getTempoTotal());
       
    }
}
