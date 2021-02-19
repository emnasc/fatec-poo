package LP02;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software ordena 3 números");

        do {
            System.out.println("\n-----------------------------\n");
            try {
                System.out.print("Digite o primeiro número: ");
                int num1 = input.nextInt();
                input.nextLine();

                System.out.print("Digite o segundo número: ");
                int num2 = input.nextInt();
                input.nextLine();

                System.out.print("Digite o terceiro número: ");
                int num3 = input.nextInt();
                input.nextLine();

                System.out.println("\n-----------------------------\n");

                int[] numeros = new int[]{num1, num2, num3};
                Arrays.sort(numeros);

                System.out.printf("Os números ordenados são: %d, %d, %d", numeros[0], numeros[1], numeros[2]);

                System.out.println("\nGostaria de ordenar outros números?");
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
