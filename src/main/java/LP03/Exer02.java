package LP03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer02 {
    private static int fibonacci(int valor) {
        if (valor < 2) {
            return valor;
        } else {
            return fibonacci(valor - 1) + fibonacci(valor - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software imprime sequencia de fibonacci");

        do {
            System.out.println("\n-----------------------------\n");

            try {
                System.out.print("Digite quantos números deseja ver: ");
                int quantidade = input.nextInt();
                input.nextLine();

                System.out.println("\n-----------------------------\n");

                for(int i = 0; i <= quantidade; i++) {
                    System.out.printf("%d ", fibonacci(i));
                }

                System.out.println("\nGostaria de ver uma quantidade diferente?");
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
