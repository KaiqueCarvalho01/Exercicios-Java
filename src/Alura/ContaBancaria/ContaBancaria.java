package Alura.ContaBancaria;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public double getsaldo(){
        return this.saldo;
    }
    public void setsaldo(double saldo){
        this.saldo = saldo;
    }
    public int getnumeroConta(){
        return this.numeroConta;
    }
    public void setnumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public String gettitular(){
        return this.titular;
    }
    public void settitular(String titular){
        this.titular = titular;
    }
}
