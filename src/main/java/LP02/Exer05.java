package LP02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software é uma tabela de preços de planos de saúde");

        do {
            System.out.println("\n-----------------------------\n");
            try {
                System.out.print("Digite seu nome: ");
                String nome = input.nextLine();
                input.nextLine();

                System.out.print("Digite sua idade: ");
                int idade = input.nextInt();
                input.nextLine();

                float preco;
                if(idade <= 10) {
                    preco = 30.0f;
                } else if(idade <= 29) {
                    preco = 60.0f;
                } else if(idade <= 45) {
                    preco = 120.0f;
                } else if(idade <= 59) {
                    preco = 150.0f;
                } else if(idade <= 65){
                    preco = 250.0f;
                } else {
                    preco = 400.0f;
                }

                System.out.printf("%s, o preço de seu plano de saúde será %.2f", nome, preco);

                System.out.println("\nGostaria de o preço para outra pessoa?");
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
