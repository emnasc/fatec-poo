package LP04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer07 {
    public static int fatorial(int num) {
        int fatorial = 0;

        for(int i = num; i > 0; i--) {
            fatorial += i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software imprime o fatorial de um número");

        do {
            System.out.println("\n-----------------------------\n");

            try {
                System.out.print("Digite um número: ");
                int num = input.nextInt();

                System.out.println("\n-----------------------------\n");

                System.out.printf("O fatorial de %d é %d", num, fatorial(num));

                System.out.println("\nGostaria de calcular o fatorial de outro número?");
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
