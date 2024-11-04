import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos serao alugados?");
        int n = sc.nextInt();

        Quarto[] quartos = new Quarto[10];

        for (int i=0; i<n; i++) {
            System.out.println("Aluguel #" + (i+1) + ":\n");
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.println("Quarto: ");
            int numero = sc.nextInt();
            quartos[numero] = new Quarto(nome, email);

        }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i=0; i<10; i++) {
            if(quartos[i] != null) {
                System.out.println(i+ ":" + quartos[i]);
            }
        }


        sc.close();

    }
}