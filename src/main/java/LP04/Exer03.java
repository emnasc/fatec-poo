package LP04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer03 {
    public static float produto(float num1, float num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software calcula o produto entre dois números");

        do {
            System.out.println("\n-----------------------------\n");

            try {
                System.out.print("Digite o primeiro número: ");
                float num1 = input.nextFloat();

                System.out.print("Digite o segundo número: ");
                float num2 = input.nextFloat();

                System.out.println("\n-----------------------------\n");

                System.out.printf("O produto é: %.2f", produto(num1, num2));

                System.out.println("\nGostaria de calcular outro produto?");
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
