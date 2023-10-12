package main.java.Set.Ordenacao.Produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    public Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, quantidade, preco));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos teste = new CadastroProdutos();

        teste.adicionarProduto(345342, "Celular", 1250.0, 1);
        teste.adicionarProduto(35522, "Abacate", 2.50, 1);
        teste.adicionarProduto(6758, "banana", 3.50, 1);
        teste.adicionarProduto(123123, "zoio", 10.50, 1);

        System.out.println(teste.exibirProdutosPorNome());
        System.out.println(teste.exibirProdutosPorPreco());
    }
}
