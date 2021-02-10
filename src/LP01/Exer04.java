package LP01;

import java.util.Scanner;

public class Exer04 {
    private static int OPCARO_NAO = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vinde ao software de conversão de temperatura!");
        System.out.println("Esse software converte graus Celsius (C) em gruas Farenheit (F)");

        System.out.println("\n-----------------------------\n");

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            float temperatura = input.nextFloat();
            input.nextLine();

            System.out.printf("A temperatura em graus Farenheit é %.2fF",  ((9 * temperatura + 160) / 5));

            System.out.println("\n-----------------------------\n");

            System.out.println("Deseja converter mais valores?");
            System.out.println("[1] Sim");
            System.out.println("[2] Não");
            System.out.print("Sua resposta: ");
            int resposta = input.nextInt();

            if (resposta == OPCARO_NAO) {
                System.out.println("Até a próxima!");
                return;
            }
        } while(true);
    }
}
