import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdhomens, qtdmulheres;
        double maiorAltura, menorAltura, alturafemMedia, alturafemTotal;

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();


        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i=0; i<n; i++)    {
                System.out.println("Altura da " + (i+1) + "a pessoa");
            altura[i] = sc.nextDouble();
            System.out.println("Genero da " + (i+1) + "a pessoa");
            genero[i] = sc.next().charAt(0);
        }

        menorAltura = altura[0];
        maiorAltura = altura[0];

        for (int i=1; i<n; i++) {
            if(altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        qtdhomens = 0;
        qtdmulheres = 0;
        alturafemTotal = 0;

        for (int i=1; i<n; i++) {
            if(genero[i] == 'M') {
                qtdhomens++;
            } else {
                qtdmulheres++;
                alturafemTotal = alturafemTotal += altura[i];
            }
        }

        alturafemMedia = alturafemTotal / qtdmulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
        System.out.printf("Numero de homens = %d\n", qtdhomens);


        sc.close();
    }
}