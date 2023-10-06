package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemlist;

    public CarrinhoDeCompras() {
        this.itemlist = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemlist.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemlist) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        itemlist.removeAll(itensParaRemover);
    }

    public void calcularValorTotal() {
        double valorTotal = 0;
        for (Item i : itemlist) {
            valorTotal += (i.getPreco() * i.getQuantidade());
        }
        System.out.println("Valor Total: " + valorTotal);
    }

    public void exibirItens() {
        System.out.println(itemlist);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras teste = new CarrinhoDeCompras();

        teste.adicionarItem("Leite", 4.50, 2);
        teste.adicionarItem("creme Nivea", 7.90, 1);
        teste.adicionarItem("papel Higienico", 2.30, 16);
        teste.exibirItens();
        teste.calcularValorTotal();
        teste.removerItem("papel Higienico");
        teste.exibirItens();
        teste.calcularValorTotal();
    }
}
