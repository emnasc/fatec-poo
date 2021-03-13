package LP04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer04 {
    public static double grausParaRadianos(double graus) {
        return (graus * Math.PI) / 180;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software converte graus para radianos");

        do {
            System.out.println("\n-----------------------------\n");

            try {
                System.out.print("Digite o número: ");
                double graus = input.nextDouble();

                System.out.println("\n-----------------------------\n");

                System.out.printf("O valor em radiano é : %.2f", grausParaRadianos(graus));

                System.out.println("\nGostaria de ver outro número?");
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
