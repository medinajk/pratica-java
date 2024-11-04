import Conta.CadastroConta;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CadastroConta conta;

        System.out.println("Bem-vindo! Informe o numero da conta: ");
        int numero = sc.nextInt();


        System.out.println("Informe o nome do titular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine();


        System.out.println("Deseja fazer um Depósito inicial? (y/n) ");
        char resposta = sc.next().charAt(0);
        if( resposta == 'y') {
            System.out.println("Insira o valor do Depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new CadastroConta (numero, titular, depositoInicial);
        } else {
            conta = new CadastroConta(numero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Valor do Depósito: ");
        double depositoValor = sc.nextDouble();
        conta.depositar(depositoValor);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Valor do Saque: ");
        double saqueValor = sc.nextDouble();
        conta.saque(saqueValor);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);

        sc.close();

    }


}