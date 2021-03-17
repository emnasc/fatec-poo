package LP05.ex01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exer01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software imprime o dobro de um número inteiro");

        do {
            System.out.println("\n-----------------------------\n");

            try {
                System.out.print("Digite o valor da base: ");
                double base = input.nextDouble();

                System.out.print("Digite o valor da altura: ");
                double altura = input.nextDouble();

                Triangulo triangulo = new Triangulo(base, altura);

                System.out.println("\n-----------------------------\n");

                System.out.printf("O valor da base do triângulo é: %.1f\n", triangulo.getBase());
                System.out.printf("O valor da altura do triângulo é: %.1f\n", triangulo.getAltura());

                System.out.printf("O valor da area do triângulo é: %.1f\n", triangulo.getArea());

                System.out.println("\nGostaria calcular a base de outro triângulo?");
                System.out.println("[1] Sim (padrão)");
                System.out.println("[2] Não");
                System.out.print("\nSua resposta: ");
                int resposta = input.nextInt();

                if(resposta == OPCARO_NAO) {
                    System.out.println("Até a próxima!");
                    return;
                }

            } catch (InputMismatchException ime) {
                System.out.println("Valor inválido. Por favor, tente novamente");
            } catch(Exception e) {
                System.out.printf("Exceção lançada pela aplicação: %s", e.getMessage());
            }
        } while(true);
    }
}
