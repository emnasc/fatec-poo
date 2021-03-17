package LP05.ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPCARO_NAO = 2;

        System.out.println("Bem vinde!");
        System.out.println("Esse software realiza o cálculo de uma equação de 2o grau");

        do {
            System.out.println("\n-----------------------------\n");

            try {
                System.out.print("Digite o valor de A: ");
                int a = input.nextInt();

                System.out.print("Digite o valor de B: ");
                int b = input.nextInt();

                System.out.print("Digite o valor de C: ");
                int c = input.nextInt();

                Equacao equacao = new Equacao(a, b, c);

                double delta = equacao.getDelta();

                System.out.println("\n-----------------------------\n");

                System.out.printf("O valor usado para A é %d\n", equacao.getA());
                System.out.printf("O valor usado para B é %d\n", equacao.getB());
                System.out.printf("O valor usado para C é %d\n", equacao.getC());

                System.out.printf("O valor de delta é: %.1f\n", delta);

                if(delta < 0) {
                    System.out.println("Não existem raízes reais para esses valores");
                } else if(delta == 0) {
                    double raiz = equacao.raiz1();
                    System.out.println("Esta equação possui duas raízes iguais.");
                    System.out.printf("O valor de ambas as raízes é %.1f", raiz);
                } else {
                    double raiz1 = equacao.raiz1();
                    double raiz2 = equacao.raiz2();
                    System.out.printf("O valor das as raízes é %.1f e %.1f", raiz1, raiz2);
                }

                System.out.println("\nGostaria calcular outros valores?");
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
            }
        } while(true);
    }
}
