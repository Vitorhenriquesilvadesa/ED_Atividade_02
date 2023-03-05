import java.util.Scanner;

public class Exercicio358 {
    public static void main(String[] args) {
        int x = 5;
        int lucro1 = 0, lucro2 = 0, lucro3 = 0;

        float compra, venda;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < x; i++) {
            System.out.print("Digite o valor de compra dessa mercadoria: ");
            compra = input.nextFloat();
            System.out.print("Digite o valor de venda dessa mercadoria: ");
            venda = input.nextFloat();

            if (venda < compra * 1.1) {
                lucro1 += 1;
            } else if (venda <= compra * 1.2) {
                lucro2 += 1;
            } else {
                lucro3 += 1;
            }
        }

        input.close();

        System.out.println("Pecas com menos de 10% de lucro: " + lucro1);
        System.out.println("Pecas com menos de 20% de lucro: " + lucro2);
        System.out.println("Pecas com mais  de 20% de lucro: " + lucro3);
    }
}

/*
 * lucro < 10 %
 * 10 % <= lucro <= 20 %
 * m lucro > 20 %
 */