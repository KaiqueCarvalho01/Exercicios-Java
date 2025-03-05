public class CartaoCredito implements Pagavel {
    @Override
    public void pagar() {
        System.out.println("Pagamento realizado com Cartão de Crédito");
    }
}
