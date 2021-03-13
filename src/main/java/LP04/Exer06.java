package LP04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer06 {
    public static void mostrarMes(int mes) {
        switch(mes) {
            case 1:
                System.out.println("Este é o mês de janeiro");
                break;
            case 2:
                System.out.println("Este é o mês de fevereiro");
                break;
            case 3:
                System.out.println("Este é o mês de março");
                break;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("O mês em questão não está no primeiro semetre do ano");
                break;
            default:
                System.out.println("O número informado não corresponde a um mês do ano");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software imprime um dos meses no primeiro trimestre do ano");

        do {
            System.out.println("\n-----------------------------\n");

            try {
                System.out.print("Digite o mês: ");
                int mes = input.nextInt();

                System.out.println("\n-----------------------------\n");

                mostrarMes(mes);

                System.out.println("\nGostaria de ver outro mês?");
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
