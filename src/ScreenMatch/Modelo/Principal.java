package ScreenMatch.Modelo;

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
       
    }
}
