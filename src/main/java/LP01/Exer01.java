package LP01;

import java.util.Scanner;

public class Exer01 {
    private static final float DESCONTO = 9.0f;
    private static int OPCARO_NAO = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vinde ao software de cálculo de desconto!");
        System.out.printf("Taxa atual de desconto: %.0f%%\n", DESCONTO);

        System.out.println("\n-----------------------------\n");

        do {
            System.out.print("\nInforme o nome do produto: ");
            String produto = input.nextLine();

            System.out.print("Informe o valor original do produto: ");
            float valor = input.nextFloat();
            input.nextLine();

            System.out.printf("\nCom o desconto de %.0f%% aplicado, o valor atual do produto %s seria %.2f\n",
                    DESCONTO,
                    produto,
                    (valor + (valor * 0.09)));

            System.out.println("\n-----------------------------\n");

            System.out.println("\nGostaria de calcular o valor de outro produto?");
            System.out.println("[1] Sim (padrão)");
            System.out.println("[2] Não");
            System.out.print("Sua resposta: ");
            int resposta = input.nextInt();

            if(resposta == OPCARO_NAO) {
                System.out.println("Até a próxima!");
                return;
            }
        } while(true);
    }
}
