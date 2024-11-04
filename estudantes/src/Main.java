import Notas.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Nome do Aluno: ");
        aluno.nome = sc.nextLine();

        System.out.println("Digite a primeira nota: ");
        aluno.n1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        aluno.n2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        aluno.n3 = sc.nextDouble();

        if(aluno.notaFinal() < 60) {
            System.out.println("Reprovado");
            System.out.println("Pontos Faltantes: " + aluno.missingPoints());
        } else {
            System.out.println("Aprovado");
        }

        System.out.println("Nota Final: " + aluno.notaFinal());

    }
}