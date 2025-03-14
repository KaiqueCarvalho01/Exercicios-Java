package Alura.ContaBancaria;

public class Principal {
    public static void main(String[] args) {

        // Testando a classe ContaBancaria
        ContaBancaria conta = new ContaBancaria();
        
        conta.setNumeroConta(123);
        conta.setSaldo(5000);
        conta.titular = "Lucas Oliveira";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(13500);
        System.out.println("Novo Saldo: " + conta.getSaldo());



        // Testando a classe IdadePessoa

        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Carol");
        pessoa1.setIdade(15);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Roger");
        pessoa2.setIdade(20);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();


        // Testando a classe Produto
        Produto produto = new Produto("Celular", 3000.0);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(20);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());
    }
}
