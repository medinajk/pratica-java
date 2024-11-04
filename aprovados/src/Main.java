import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media = 0;

        System.out.println("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno");
            nomes[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }


        System.out.println("ALUNOS APROVADOS:");

        for (int i=0; i<n; i++) {
            media = nota1[i] + nota2[i] / 2;
            if(media >= 6) {
                System.out.printf("%s\n", nomes[i]);
            }
        }



        sc.close();

    }
}