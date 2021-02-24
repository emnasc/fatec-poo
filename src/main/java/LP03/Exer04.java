package LP03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;
        float PESO_P1 = 0.35f;
        float PESO_P2 = 0.50f;
        float PESO_TRABALHO = 0.15f;

        System.out.println("Bem vinde!");
        System.out.println("Esse software calcula a média para alunes");

        do {
            System.out.println("\n-----------------------------\n");

            try {
                System.out.print("Digite a nota da P1: ");
                float p1 = input.nextFloat();
                input.nextLine();

                System.out.print("Digite a nota da P2: ");
                float p2 = input.nextFloat();
                input.nextLine();

                System.out.print("Digite a nota do trabalho: ");
                float trabalho = input.nextFloat();
                input.nextLine();

                System.out.println("\n-----------------------------\n");

                float notaFinal = ((p1 * PESO_P1) + (p2 * PESO_P2) + (trabalho * PESO_TRABALHO)) / (p1 + p2 + trabalho);

                System.out.printf("A nota final é %.2f", notaFinal);

                System.out.println("\nGostaria de calcular a nota de outre alune?");
                System.out.println("[1] Sim (padrão)");
                System.out.println("[2] Não");
                System.out.print("\nSua resposta: ");
                int resposta = input.nextInt();

                if(resposta == OPCARO_NAO) {
                    System.out.println("Até a próxima!");
                    return;
                }

            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Por favor, tente novamente");
            }
        } while(true);
    }
}
