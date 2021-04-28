package LP08;

import java.util.Scanner;

/*
Escreva uma classe em Java que simule uma calculadora bem simples. Essa classe deve ter como atributos duas variáveis
double e um char. Deve possuir um construtor que recebe como parâmetro dois números e um caracter, correspondente a uma das
operações básicas (+, -, *, /). Deve ter um método para calcular a operação desejada e um para imprimir o resultado.
O programa deve considerar divisões por zero como sendo erros, e imprimir uma mensagem adequada.
*/

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        double operand1 = input.nextDouble();
        System.out.println("Insira o segundo número: ");
        double operand2 = input.nextDouble();
        input.nextLine();
        System.out.println("Insira o operador: ");
        char operator = input.nextLine().charAt(0);

        Calculadora calculadora = new Calculadora(operand1, operand2, operator);
        System.out.println(calculadora.toString());
    }
}

public class Calculadora {
    public double operand1;
    public double operand2;
    public char operator;
    public boolean divisaoPorZero;

    public Calculadora(double operand1, double operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;

        if (this.operator == '/' && operand2 == 0.0) this.divisaoPorZero = true;
    }

    public double fazerConta()
    {
        double resultado;
        switch (this.operator) {
            case '+':
                resultado = this.operand1 + this.operand2;
                break;
            case '-':
                resultado = this.operand1 - this.operand2;
                break;
            case '*':
                resultado = this.operand1 * this.operand2;
                break;
            case '/':
                resultado = this.operand1 / this.operand2;
                break;
            default:
                return 0;
        }

        return resultado;
    }

    @Override
    public String toString() {
        if (this.divisaoPorZero) return "Divisão por zero não é permitida";

        return "Resultado = " + fazerConta();
    }
}
