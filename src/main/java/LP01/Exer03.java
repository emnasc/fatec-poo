package LP01;

import java.util.Scanner;

public class Exer03 {
    private static int OPCARO_NAO = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vinde ao software de cálculo de média!");

        System.out.println("\n-----------------------------\n");

        do {
            System.out.print("Informe o primeiro valor: ");
            float num1 = input.nextFloat();
            input.nextLine();

            System.out.print("Informe o segundo valor: ");
            float num2 = input.nextFloat();
            input.nextLine();

            System.out.printf("A média entre os números é %.2f\n", ((num1 + num2) / 2));

            System.out.println("\n-----------------------------\n");

            System.out.println("Deseja calcular a mais médias?");
            System.out.println("[1] Sim");
            System.out.println("[2] Não");
            System.out.print("Sua resposta: ");
            int resposta = input.nextInt();

            if (resposta == OPCARO_NAO) {
                System.out.println("Até a próxima!");
                return;
            }
        } while (true);
    }
}
