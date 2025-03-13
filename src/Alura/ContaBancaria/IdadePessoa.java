package Alura.ContaBancaria;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void verificarIdade(){
        if(idade >= 18){
            System.out.println("Pessoa maior de idade");
        } else {
            System.out.println("Pessoa menor de idade");
        }
    }
}
