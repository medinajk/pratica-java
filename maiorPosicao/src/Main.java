import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       double maior;
       int posmaior;

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite um numero");
            numeros[i] = sc.nextInt();
        }

        maior = numeros[0];
        posmaior = 0;

        for (int i=1; i<n; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
                posmaior = i;
            }
        }

        System.out.printf("Maior valor: %.1f\n", maior);
        System.out.printf("Posicao do maior valor: %d\n", posmaior);

        sc.close();



    }
}