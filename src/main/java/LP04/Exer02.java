package LP04;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Exer02 {
    public static float media(float[] notas) {
        float sum = 0;

        for(float item: notas) {
            sum += item;
        }

        return sum / notas.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software calcula a média aritimética de 4 números");

        do {
            System.out.println("\n-----------------------------\n");

            float[] notas = new float[4];

            try {
                System.out.print("Digite a primeira nota: ");
                notas[0] = input.nextFloat();

                System.out.print("Digite a segunda nota: ");
                notas[1] = input.nextFloat();

                System.out.print("Digite a terceira nota: ");
                notas[2] = input.nextFloat();

                System.out.print("Digite a quarta nota: ");
                notas[3] = input.nextFloat();

                System.out.println("\n-----------------------------\n");

                System.out.printf("A média final é: %.1f", media(notas));

                System.out.println("\nGostaria de calcular outras médias?");
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
