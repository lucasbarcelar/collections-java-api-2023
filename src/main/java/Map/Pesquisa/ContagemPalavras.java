package main.java.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributos

    private Map<String, Integer> contagemDePalavrasmap;

    public ContagemPalavras() {
        this.contagemDePalavrasmap = new HashMap<>();
    }


    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemDePalavrasmap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemDePalavrasmap.isEmpty()) {
            contagemDePalavrasmap.remove(palavra);
        }
        else {
            System.out.println("Esse map está vazio.");
        }
    }

    public void exibirPalavras() {
        System.out.println(contagemDePalavrasmap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        Integer contagemDeFrequencia = 0;
        if (!contagemDePalavrasmap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemDePalavrasmap.entrySet()) {
                if (entry.getValue() > contagemDeFrequencia) {
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras teste = new ContagemPalavras();

        teste.adicionarPalavra("free", 7);
        teste.adicionarPalavra("café", 2);
        teste.adicionarPalavra("arvore", 8);

        teste.exibirPalavras();

        teste.removerPalavra("café");

        teste.exibirPalavras();

        System.out.println(teste.encontrarPalavraMaisFrequente());
    }
}
