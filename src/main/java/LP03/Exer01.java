package LP03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software imprime os números pares de um intervalo");

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
                    if(i % 2 == 0) {
                        System.out.print(i);
                    }
                }

                System.out.println("\nGostaria de ver outro intervalo?");
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
