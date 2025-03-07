package ContaBancaria;

public class Conta {
    double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    public void Depositar(double valor) {
        saldo += valor;
    }
    public void Sacar(double valor) {
        saldo -= valor;
    }
    public double consultarSaldo(){
        return saldo;
    }
}
