package LP01;
// VOLUME = 3.14159 * R2 * ALTURA

import java.util.Scanner;

public class Exer05 {
    private static int OPCARO_NAO = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vinde ao software de cálculo de volume!");
        System.out.println("Esse software calcula o volume de latas de óleo, ou outro cilíndros");

        System.out.println("\n-----------------------------\n");

        System.out.print("Informe a altura da lata ou cilindro: ");
        float altura = input.nextFloat();
        input.nextLine();

        System.out.print("Informe o raio da lata ou cilindro: ");
        float raio = input.nextFloat();
        input.nextLine();

        System.out.printf("O volume da lata ou cilindro é de %.2f", (Math.PI * (raio * 2) * altura));

        System.out.println("\n-----------------------------\n");

        do {

            System.out.println("Deseja converter mais valores?");
            System.out.println("[1] Sim");
            System.out.println("[2] Não");
            System.out.print("Sua resposta: ");
            int resposta = input.nextInt();

            if (resposta == OPCARO_NAO) {
                System.out.println("Até a próxima!");
                return;
            }
        } while(true);
    }
}
