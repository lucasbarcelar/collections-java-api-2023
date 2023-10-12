package main.java.Set.OperacoesBasicas.ConjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributos

    public Set<PalavrasUnicas> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra) {
        PalavrasUnicas PalavraRemover = null;
        for (PalavrasUnicas p : palavrasUnicasSet) {
            if (p.getPalavra() == palavra) {
                PalavraRemover = p;
                break;
            }
        }
        palavrasUnicasSet.remove(PalavraRemover);
    }

    public void verificarPalavra(String palavra) {
        for (PalavrasUnicas p : palavrasUnicasSet) {
            if (p.getPalavra() == palavra) {
                System.out.println(palavra + " está no conjunto.");
                break;
            }

        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas teste = new ConjuntoPalavrasUnicas();

        teste.adicionarPalavra("Perfume");
        teste.adicionarPalavra("celular");
        teste.adicionarPalavra("roupa");
        teste.adicionarPalavra("Monitor");
        teste.adicionarPalavra("panela");
        teste.adicionarPalavra("creme");

        teste.exibirPalavrasUnicas();

        teste.removerPalavra("Perfume");

        teste.exibirPalavrasUnicas();

        teste.verificarPalavra("Monitor");

    }
}
