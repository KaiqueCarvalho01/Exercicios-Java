package ContaBancaria;
import java.util.Scanner;

public class Main {
    /*
    public static void main(String[] args) {
        ContaCorrente contacorrente = new ContaCorrente(2000, 500);
        ContaPoupanca contapoupanca = new ContaPoupanca(9000, 0.05);
    
        contacorrente.Sacar(1500);
        System.out.println("Saldo Conta Corrente: " + contacorrente.consultarSaldo()); 
    
        contapoupanca.Rendimento();
        System.out.println("Saldo Conta Poupança: " + contapoupanca.consultarSaldo());     
    }
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        double valor;
        while (op != 3){
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("3 - Sair");
            op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Digite o saldo da conta corrente: ");
                    double saldo = scanner.nextDouble();
                break;
            
                default:
                    break;
            }
        }
    }
}
