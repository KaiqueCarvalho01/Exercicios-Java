public class Boleto implements Pagavel {
    @Override
    public void pagar() {
        System.out.println("Pagamento realizado via Boleto");
    }
}
