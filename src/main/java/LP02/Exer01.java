package LP02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software diferencia múltiplos de 3");

        do {
            System.out.println("\n-----------------------------\n");
            System.out.print("Digite um número: ");
            try {
                int num = input.nextInt();
                input.nextLine();

                System.out.println("\n-----------------------------\n");

                if(num % 3 == 0) {
                    System.out.println("O valor é multiplo de 3");
                } else {
                    System.out.println("O valor não é multiplo de 3");
                }

                System.out.println("\nGostaria de conferir outro número?");
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
