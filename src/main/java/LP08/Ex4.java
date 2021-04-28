package LP08;

import java.util.Scanner;

/*
Crie uma classe em Java chamada Data que inclui três informações como variáveis de instância:
• mês (int),
• dia (int)
• e ano (int).
A classe deve ter métodos get e set para cada variável e um construtor que inicializa as variáveis e assume que os valores
fornecidos são corretos. Forneça um método displayData que exibe o dia, o mês e o ano separados por barras normais ( / ).
Escreva um aplicativo de teste chamado DataTeste que demonstra as capacidades da classe Data.

*/

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o dia: ");
        int dia = input.nextInt();
        System.out.println("Insira o mês: ");
        int mes = input.nextInt();
        System.out.println("Insira o ano: ");
        int ano = input.nextInt();

        Data data = new Data(dia, mes, ano);
        data.displayData();
    }
}

public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void displayData()
    {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}
