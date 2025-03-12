package ScreenMatch;

public class Principal {
    public static void main(String[] args) {
        //Instanciação de objetos
        Filme meuFilme = new Filme(); // Criando um novo objeto do tipo filme... "new" = instanciar
        meuFilme.nome = "O Poderoso Chefão"; // Atribuindo um valor ao atributo nome
        meuFilme.anoDeLancamento = 1972; // Atribuindo um valor ao atributo anoDeLancamento
        meuFilme.duracaoEmMinutos = 175; // Atribuindo um valor ao atributo duracaoEmMinutos

       meuFilme.exibeFichaTecnica(); // Chamando o método exibeFichaTecnica
       meuFilme.avalia(8);
       meuFilme.avalia(5);
       meuFilme.avalia(10);
       //System.out.println(meuFilme.somaDasAvaliacoes);
       System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
       System.out.println("Média Avaliação " + meuFilme.mediaDasAvaliacoes());
       
    }
}
