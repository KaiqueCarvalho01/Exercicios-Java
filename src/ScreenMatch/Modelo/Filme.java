package ScreenMatch.Modelo;

import ScreenMatch.Calculos.Classificavel;

//Quando uma função é criada dentro de uma classe, ela é chamada de método
//Herança é um conceito que permite a criação de uma nova classe a partir de uma classe já existente
//A palavra reservada extends é utilizada para indicar que uma classe está herdando de outra
//A classe Filme está herdando da classe Titulo
public class Filme extends Titulo implements Classificavel{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao(){
        return (int) mediaDasAvaliacoes() /2 ; 
    }
}
