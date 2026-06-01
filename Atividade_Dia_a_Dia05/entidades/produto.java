package Atividade_Dia_a_Dia05.entidades;

public class produto {
    private String nome;
    private double preco;

    public produto(String nome,double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
}
