import java.util.Scanner;

public class Exercicio360 {
    public static void main(String[] args) {
        int[] ultdia = new int[12];
        int data, dia, mes;
        String[] signo = new String[12];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            System.out.println("Digite o signo");
            signo[i] = input.nextLine();

            System.out.println("Digite o ultimo dia");
            ultdia[i] = input.nextInt();
        }

        System.out.println("Digite a data no formato ddmm ou 9999 para terminar");

        data = input.nextInt();

        while (data != 9999) {
            dia = data / 100;
            mes = data % 100;
            mes--;

            if (dia > ultdia[mes]) {
                mes = (mes + 1) % 12;

                System.out.println("signo:" + signo[mes] + "\n");
            }
            System.out.println("Digite a data no formato ddmm ou 9999 para terminar");

            data = input.nextInt();
        }
    }
}
