import java.util.Scanner;

public class Exercicio351 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            nomes[i] = input.nextLine();
        }

        ordenar(nomes);
        System.out.println("\nLista ordenada\n\n");

        for (int i = 0; i < 5; i++)
            System.out.println(nomes[i]);

        System.out.println("Digite um numero de 1 a 5 para ver o nome da pessoa.");
        int i = input.nextInt();
        System.out.println(nomes[i - 1]);
        input.close();
    }

    public static void ordenar(String[] dados) {

        for (int i = 0; i < dados.length - 1; i++) {
            for (int j = 0; j < dados.length - 1 - i; j++) {
                if (dados[j].charAt(0) > dados[j + 1].charAt(0)) {
                    String temp = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = temp;
                }
            }
        }
    }
}
