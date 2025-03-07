package ContaBancaria;

public class ContaCorrente extends Conta {
    double limite;

    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    public void Sacar(double valor) {
        if (valor <= saldo + limite){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
