package main.java.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public Double calculaValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoQuantidadeValor = null;
        double valorQuantidadeProduto = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutoMap.entrySet()) {
                double valorEstoqueProduto = entry.getValue().getQuantidade() * entry.getValue().getPreco();
                if (valorEstoqueProduto > valorQuantidadeProduto) {
                    valorQuantidadeProduto = valorEstoqueProduto;
                    produtoQuantidadeValor = entry.getValue();
                }
            }
        }
        return produtoQuantidadeValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos teste = new EstoqueProdutos();

        teste.adicionarProduto(12344, "caixa", 1, 2.50);
        teste.adicionarProduto(12345, "tenis", 1, 12.50);
        teste.adicionarProduto(23421, "bola", 1, 3.50);

        teste.exibirProdutos();
    }
}
