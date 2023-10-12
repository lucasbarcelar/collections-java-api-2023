package main.java.list.Pesquisa;

public class NumerosInteiros {
    //atributo

    private int numero;

    public NumerosInteiros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "numero: " + numero;
    }
}
