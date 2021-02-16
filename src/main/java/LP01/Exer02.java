package LP01;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vinde à calculadora de salários!");

        System.out.println("\n-----------------------------\n");

        float salarioMinimo = 0f;

        int resposta = 1;

        do {
            if(salarioMinimo == 0 || resposta == 2) {
                System.out.print("Informe o valor do salário mínimo: ");
                salarioMinimo = input.nextFloat();
                input.nextLine();
            }

            System.out.print("Informe o salário a ser cálculado: ");
            float salario = input.nextFloat();
            input.nextLine();

            System.out.printf("\nUm salário de %.2f representa %.1f salários mínimos\n", salario, (salario / salarioMinimo));

            System.out.println("\n-----------------------------\n");

            System.out.println("O que deseja fazer?");
            System.out.println("[1] Calcular outro salário");
            System.out.println("[2] Inserir um novo salário mínimo e calcular outro salário");
            System.out.println("[3] Sair");
            System.out.print("Sua resposta: ");
            resposta = input.nextInt();
        } while(resposta != 3);
    }
}
