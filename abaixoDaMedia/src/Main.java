import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        double media = 0;
        for (int i=0; i<n; i++) {
            media = vetor[i] += vetor[i] / n;
        }

        System.out.printf("MEDIA DO VETOR: %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i=0; i<n; i++) {
            if(vetor[i] < media) {
                System.out.printf("%.1f\n", vetor[i]);
            }
        }

        sc.close();

    }
}