import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                soma = soma += numeros[i];
                soma++;
            }
        }

        if(soma == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double mediaAritmetica = soma / n;

            System.out.printf("MEDIA DOS PARES: %.1f%n", mediaAritmetica);
        }

        sc.close();
    }
}
