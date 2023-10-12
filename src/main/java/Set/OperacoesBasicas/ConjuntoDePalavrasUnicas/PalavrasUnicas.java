package main.java.Set.OperacoesBasicas.ConjuntoDePalavrasUnicas;

public class PalavrasUnicas {
    //atributos

    private String palavra;

    public PalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public String toString() {
        return "palavra: " + palavra + '\n';
    }
}
