package LP08;

import java.util.Scanner;

/*
A fim de representar empregados em uma firma, crie uma classe chamada Empregado que inclui as três informações a seguir como atributos:
• um primeiro nome,
• um sobrenome, e
• um salário mensal.
Sua classe deve ter um construtor que inicializa os três atributos. Forneça um método set e get para cada atributo.
Se o salário mensal não for positivo, configure-o como 0. Escreva um aplicativo de teste que demonstra as capacidades da classe.
Crie duas instâncias da classe e exiba o salário anual de cada instância. Então dê a cada empregado um aumento de 10% e exiba
novamente o salário anual de cada empregado.
*/

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro nome do primeiro funcionário: ");
        String primeiroNome1 = input.nextLine();
        System.out.println("Insira o primeiro nome  do segundo funcionário: ");
        String primeiroNome2 = input.nextLine();

        System.out.println("Insira o sobrenome nome do primeiro funcionário: ");
        String sobrenome1 = input.nextLine();
        System.out.println("Insira o sobrenome nome do segundo funcionário: ");
        String sobrenome2 = input.nextLine();

        System.out.println("Insira salário mensal do primeiro funcionário: ");
        double salarioMensal1 = input.nextDouble();
        System.out.println("Insira salário mensal do segundo funcionário: ");
        double salarioMensal2 = input.nextDouble();

        Empregado empregado1 =  new Empregado(primeiroNome1, sobrenome1, salarioMensal1);
        Empregado empregado2 =  new Empregado(primeiroNome2, sobrenome2, salarioMensal2);

        System.out.println(empregado1.toString());
        System.out.println(empregado2.toString());

        empregado1.setSalarioMensal(empregado1.getSalarioMensal() * 1.1);
        empregado2.setSalarioMensal(empregado2.getSalarioMensal() * 1.1);

        System.out.println(empregado1.toString());
        System.out.println(empregado2.toString());
    }
}


public class Empregado {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal >= 0 ? salarioMensal : 0;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal >= 0 ? salarioMensal : 0;
    }

    public double getSalarioAnual()
    {
        return this.salarioMensal * 12;
    }

    @Override
    public String toString() {
        return "O salário anual do(a) " + this.primeiroNome +" é: " + getSalarioAnual();
    }
}
