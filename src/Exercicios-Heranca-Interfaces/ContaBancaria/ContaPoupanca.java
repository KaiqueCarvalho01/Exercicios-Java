package ContaBancaria;

public class ContaPoupanca extends Conta {
    double taxaRendimento;

    public ContaPoupanca(double saldo, double taxaRendimento) {
        super(saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void Rendimento(){
        saldo += saldo * taxaRendimento;
    }
}
