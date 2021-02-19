package LP02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software calcula o valor de venda de um produto");

        do {
            System.out.println("\n-----------------------------\n");
            try {
                System.out.print("Digite o valor do produto: ");
                float valorProduto = input.nextFloat();
                input.nextLine();

                float valorFinal;
                if(valorProduto <= 20.0) {
                    valorFinal = valorProduto + (valorProduto * 0.45f);
                } else {
                    valorFinal = valorProduto + (valorProduto * 0.30f);
                }

                System.out.println("\n-----------------------------\n");

                System.out.printf("O valor de venda do produto é %.2f", valorFinal);

                System.out.println("\nGostaria de calcular valor de outros produtos?");
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
