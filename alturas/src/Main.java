import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for(int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double soma = 0;
        for(int i=0; i<n; i++) {
            soma = soma + alturas[i];
        }

        double mediaAlturas = soma / n;

        System.out.println();
        System.out.printf("Altura Média: %.2f%n", mediaAlturas);

        int cont = 0;
        for(int i=0; i<n; i++) {
            if(idades[i] < 16) {
                cont = cont + 1;
            }
        }

        double porcentagem = cont * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);


            sc.close();

    }
}