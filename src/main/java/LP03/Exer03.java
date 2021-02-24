package LP03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer03 {
    private static boolean primo(int num) {
        for(int i = 2; i < num; i++) {
            if(num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software imprime os números primos em um intervalo");

        do {
            System.out.println("\n-----------------------------\n");

            try {
                System.out.print("Digite o primeiro número do intervalo: ");
                int comecoIntervalo = input.nextInt();
                input.nextLine();

                System.out.print("Digite o ultimo número do intervalo: ");
                int fimIntervalo = input.nextInt();
                input.nextLine();

                System.out.println("\n-----------------------------\n");

                for(int i = comecoIntervalo; i <= fimIntervalo; i++) {
                    if(primo(i)) {
                        System.out.printf("%d ", i);
                    }
                }

                System.out.println("\nGostaria de ver um intervalo diferente?");
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
