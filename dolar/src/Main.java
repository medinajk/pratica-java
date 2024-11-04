import CotacaoDolar.Valor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Valor v1 = new Valor();

        System.out.println("What is the dollar price? ");
        v1.dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        v1.howManyDollars = sc.nextDouble();

        System.out.println("Amount to be paid in reais: " + v1.amountToBePaid());


    }
}