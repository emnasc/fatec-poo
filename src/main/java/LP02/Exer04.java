package LP02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software informa sua classe eleitoral");

        do {
            System.out.println("\n-----------------------------\n");
            try {
                System.out.print("Digite sua idade: ");
                int idade = input.nextInt();
                input.nextLine();

                if(idade < 16) {
                    System.out.println("Você é um não-eleitor");
                } else if((idade >= 16 && idade < 18) || idade > 65) {
                    System.out.println("Você é um eleitor facultativo");
                } else {
                    System.out.println("Você é um eleitor obrigatório");
                }

                System.out.println("\nGostaria de conferir outra idade?");
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
