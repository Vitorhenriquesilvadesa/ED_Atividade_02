import java.util.Scanner;

public class Exercicio356 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] notas1 = new float[15];
        float[] notas2 = new float[15];
        int medias[] = new int[15];
        String situacoes[] = new String[15];

        int numero = 5;

        for (int i = 0; i < numero; i++) {

            System.out.println("Digite as duas notas do aluno " + i);
            notas1[i] = input.nextFloat();
            notas2[i] = input.nextFloat();
            medias[i] = Math.round((notas1[i] + notas2[i]) / 2);

            if (medias[i] >= 5) {
                situacoes[i] = "AP";
            } else {
                situacoes[i] = "RP";
            }
        }

        System.out.println("Aluno\tNota 1\tNota 2\tMedia\tSituacao");

        for (int i = 0; i < numero; i++) {
            System.out.println(i + "\t" + notas1[i] + "\t" + notas2[i] + "\t" + medias[i] + "\t" + situacoes[i]);
        }

        input.close();
    }
}
