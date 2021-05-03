package LP08;

import java.util.Scanner;

/*
Crie uma classe chamada Faturar que possa ser utilizado por uma loja de suprimentos de informática para representar uma fatura de um item
vendido na loja. Uma fatura deve incluir as seguintes informações como atributos:
• o número do item faturado,
• a descrição do item,
• a quantidade comprada do item e
• o preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela deve ser configurada como 0.
Se o preço por item não for positivo ele deve ser configurado como 0. Forneça um método set e um método get para cada variável de instância.
Além disso, forneça um método chamado getFaturarTotal que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por item)
e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as capacidades da classe Faturar.
*/

public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número de identificação: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Insira a descrição: ");
        String descricao = input.nextLine();

        System.out.println("Insira a quantidade: ");
        int quantidade = input.nextInt();

        System.out.println("Insira o preço unitário: ");
        double precoUnitario = input.nextDouble();

        Faturar faturar = new Faturar(id, descricao, quantidade, precoUnitario);
        System.out.println(faturar.toString());
    }

}

public class Faturar {
    private int id;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Faturar(int id, String descricao, int quantidade, double precoUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade >= 0 ? quantidade : 0;
        this.precoUnitario = precoUnitario >= 0 ? precoUnitario : 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getFaturaTotal()
    {
        return precoUnitario * quantidade;
    }

    @Override
    public String toString()
    {
        return "Id: " + this.id + "\nDescrição: " + this.descricao +"\nQuantidade: " + this.quantidade
               +"\nPreço unitário: " + this.precoUnitario + "\nPreço total: " + getFaturaTotal();
    }
}
