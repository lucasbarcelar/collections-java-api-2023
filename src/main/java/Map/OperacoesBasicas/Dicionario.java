package main.java.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atribuuutos

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada = null;
        if (!dicionarioMap.isEmpty()) {
            palavraPesquisada = dicionarioMap.get(palavra);
        }
        return palavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario minidicionario = new Dicionario();

        minidicionario.adicionarPalavra("Casa", "Um edifício ou estrutura onde as pessoas vivem, geralmente projetado para proporcionar abrigo e conforto.\n");
        minidicionario.adicionarPalavra("Cachorro", "Um mamífero doméstico de quatro patas, muitas vezes mantido como animal de estimação, conhecido por sua lealdade e variedade de raças.\n");
        minidicionario.adicionarPalavra("Comida", "Substâncias ingeridas para fornecer nutrição e energia ao corpo humano, geralmente preparadas por cozimento ou outro método de preparação.\n");
        minidicionario.adicionarPalavra("sol", "A estrela central do nosso sistema solar, que emite luz e calor, permitindo a vida na Terra.\n");
        minidicionario.adicionarPalavra("Bicicleta", "Um veículo de transporte de duas rodas movido pelo esforço humano, geralmente pedalar, com um guidão para direção.\n");

        //minidicionario.exibirPalavras();

        minidicionario.removerPalavra("sol");

        System.out.println(minidicionario.pesquisarPorPalavra("sol"));

    }
}
