package main.java.Map.Pesquisa;

import java.util.Objects;

public class Produto {
    //atributos

    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "| quantidade: " + quantidade + "| preco: " + preco + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Objects.equals(getNome(), produto.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }
}
