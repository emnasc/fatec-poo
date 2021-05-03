package javaapplication2;

import javax.swing.JOptionPane;

/*
Implemente a classe Pessoa possuindo nome, idade, altura e sexo como variáveis de instância. Construa os métodos set e get para
cada variável de instância e um construtor para a classe para inicializar as variáveis de instância. Construa depois uma
classe Empregado que deve ser uma subclasse da classe Pessoa (herança), adicionando um novo construtor e uma variável de
instância salário e os métodos set e get para o novo atributo. Construa um método obterLucros que devolva o lucro (salário)
do empregado. Escreva um programa de teste (classe EmpregadoTeste) adequado para esta classe testando os métodos da classe e
os métodos herdados. Utilize para entrada e saída de dados a classe JOptionPane.
*/

public class Ex6 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Insira o nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura: "));
        String sexo = JOptionPane.showInputDialog("Insira o sexo: ");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário: "));

        Employee employee = new Employee(nome, idade, altura, sexo, salario);
        JOptionPane.showMessageDialog(null, employee.toString());
    }
}

public class Employee extends Pessoa {
    public double salario;

    public Employee(String nome, int idade, double altura, String sexo, double salario) {
        super(nome, idade, altura, sexo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double obterLucro()
    {
        return this.salario;
    }

    @Override
    public String toString() {
        return super.toString() +  "\nSalário = " + obterLucro();
    }
}

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;
    public String sexo;

    public Pessoa(String nome, int idade, double altura, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nome = " + this.nome + " Idade = " + this.idade + "\nAltura = " + this.altura + " Sexo = " + this.sexo;
    }
}
