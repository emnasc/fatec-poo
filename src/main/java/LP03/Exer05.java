package LP03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software imprime números em incremento até um limite");

        do {
            System.out.println("\n-----------------------------\n");

            try {
                System.out.print("Digite o limite do intervalo: ");
                int limite = input.nextInt();
                input.nextLine();

                System.out.print("Digite o valor de incremento do intervalo: ");
                int incremento = input.nextInt();
                input.nextLine();

                System.out.println("\n-----------------------------\n");

                for(int i = 0; i <= limite; i += incremento) {
                    System.out.printf("%d ", i);
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
