import java.util.Scanner;

public class Exercicio346 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner opc = new Scanner(System.in);

        String sentence;
        int op, x, size;

        do {
            System.out.println("\nMENU\n");
            System.out.println("1 - IMPRIME O COMPRIMENTO DA FRASE\n");
            System.out.println("2 - IMPRIME OS 2 ULTIMOS E OS 2 PRIMEIROS CARACTERES\n");
            System.out.println("3 - IMPRIME A FRASE ESPELHADA\n");
            System.out.println("4 - TERMINA O ALGORITMO\n");

            op = opc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite uma frase: ");
                    sentence = input.nextLine();
                    System.out.println("O comprimento da frase é de " + sentence.length() + " caracteres.");
                    continue;

                case 2:
                    System.out.print("Digite uma frase: ");
                    sentence = input.nextLine();
                    System.out.println(
                            "Os dois primeiros e os dois ultimos caracteres são: " + sentence.substring(0, 2) + " e " +
                                    sentence.substring(sentence.length() - 2) + ".");
                    continue;

                case 3:
                    System.out.print("Digite uma frase: ");
                    sentence = input.nextLine();
                    System.out.print("Frase espelhada: ");
                    for (int i = sentence.length() - 1; i >= 0; i--) {
                        System.out.print(sentence.charAt(i));
                    }

                    continue;

                case 4:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção invalida.");
                    continue;
            }

        } while (op != 4);
    }
}
