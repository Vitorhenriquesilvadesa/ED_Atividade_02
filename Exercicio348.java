import java.util.Scanner;

public class Exercicio348 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        double[] nota1 = new double[5], nota2 = new double[5], media = new double[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome, a nota 1 e 2 de cada aluno\n");
            System.out.println("Aluno " + (i + 1) + ":");
            nomes[i] = input.next();
            nota1[i] = input.nextDouble();
            nota2[i] = input.nextDouble();
            media[i] = (nota1[i] + nota1[i]) / 2;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(
                    "Aluno " + (i + 1) + "\nnome: " + nomes[i] + "\nnota 1: " + nota1[i] + "\nnota 2: " + nota2[i]
                            + "\nmedia: " + media[i]);
        }

    }
}
