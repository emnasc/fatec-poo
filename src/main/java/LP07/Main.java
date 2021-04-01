package LP07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software calcula a média de notas para cursos técnico e superior");

        do {
            System.out.println("\n-----------------------------\n");

            try {
                System.out.print("Digite o valor da primeira nota: ");
                double n1 = input.nextDouble();

                System.out.print("Digite o valor da segunda nota: ");
                double n2 = input.nextDouble();

                System.out.print("Digite o valor da terceira nota: ");
                double n3 = input.nextDouble();

                System.out.println();

                Superior superior = new Superior(n1, n2, n3);
                Tecnico tecnico = new Tecnico(n1, n2, n3);

                System.out.println(superior.toString());
                System.out.printf("A média é %.2f\n\n", superior.calculaMédia());

                System.out.println(tecnico.toString());
                System.out.printf("A média é %.2f", tecnico.calculaMédia());

                System.out.println("\n-----------------------------\n");


                System.out.println("\nGostaria calcular outra média?");
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
