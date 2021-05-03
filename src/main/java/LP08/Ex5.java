package LP08;

import javax.swing.JOptionPane;

/*
Crie uma classe Animal contendo os atributos tipo e cor. Adicione os métodos set, get, um construtor para classe que inicialize as
variáveis de instância, e um método toString para retornar o tipo e a cor do animal.
• Construa uma classe Cachorro que estenda a classe Animal e tenha os atributos nome e raça do cachorro, construa para classe
os métodos set, get,um construtor e um método toString para classe cachorro.
• Construa uma classe Cocker que estenda a classe Cachorro e tenha os atributos tosa do tipo boolean (falso, verdadeiro),
com um método setTosa e um método precisaTosa que deve retornar apenas se precisa ou não de tosa.
• Escreva um programa de teste (classe CockerTeste) adequado para esta classe testando os métodos da classe e os métodos herdados.
Utilize para entrada e saída de dados a classe JOptionPane.
*/

public class Ex5 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Insira o nome do cachorro: ");
        String raca = JOptionPane.showInputDialog("Insira a raça do cachorro: ");
        String tipo = JOptionPane.showInputDialog("Insira o tipo do cachorro: ");
        String cor = JOptionPane.showInputDialog("Insira a cor do cachorro: ");
        boolean tosa = JOptionPane.showInputDialog("Precisa de tosa: ").toLowerCase() == "sim" ? true : false;

        Cocker cocker = new Cocker(nome, raca, tipo, cor, tosa);
        cocker.precisaTosa();
        JOptionPane.showMessageDialog(null, cocker.toString());
    }
}

public class Cocker extends Cachorro {
    public boolean  tosa;

    public Cocker(String nome, String raca, String tipo, String cor, boolean tosa) {
        super(nome, raca, tipo, cor);
        this.tosa = tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    public void precisaTosa()
    {
        JOptionPane.showMessageDialog(null, this.tosa ? this.nome + " precisa de tosa" : this.nome + " não precisa de tosa");
    }
}

public class Cachorro extends Animal {
    public String nome;
    public String raca;

    public Cachorro(String nome, String raca, String tipo, String cor) {
        super(tipo, cor);
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaça(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNome: " + this.nome + "  raca: " + this.raca;
    }
}

public class Animal {
    public String tipo;
    public String cor;

    public Animal(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.tipo + "  Cor: " + this.cor;
    }
}
