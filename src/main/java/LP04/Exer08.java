package LP04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer08 {
    public static boolean isPrime(int num) {
        for(int i = num - 1; i > 1; i--) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software confere se um número é primo ou não");

        do {
            System.out.println("\n-----------------------------\n");

            try {
                System.out.print("Digite um número: ");
                int num = input.nextInt();

                System.out.println("\n-----------------------------\n");

                if(isPrime(num)) {
                    System.out.println("O número é primo");
                } else {
                    System.out.println("Este número não é primo");
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
