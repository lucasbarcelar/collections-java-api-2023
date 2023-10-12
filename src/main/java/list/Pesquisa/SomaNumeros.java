package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SomaNumeros {
    //atributo

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int somaTotal = 0;
        for (Integer num : numeros) {
            somaTotal += num;
        }
        return somaTotal;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer n : numeros) {
                if (n > maiorNumero) {
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE; //É possivel usar o atributo encontrarMaiorNumero() no Lugar do Integer.MAX_VALUE
        if (!numeros.isEmpty()) {
            for (Integer n : numeros) {
                if (n < menorNumero) {
                    menorNumero = n;
                }
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return numeros;
    }

    public static void main(String[] args) {
        SomaNumeros teste = new SomaNumeros();

        teste.adicionarNumero(23);
        teste.adicionarNumero(8452);
        teste.adicionarNumero(234);
        teste.adicionarNumero(6);
        teste.adicionarNumero(12);
        teste.adicionarNumero(8);
        teste.adicionarNumero(9);

        System.out.println("A soma dos numeros é: " + teste.calcularSoma());
        System.out.println("O Maior Numero é: " + teste.encontrarMaiorNumero());
        System.out.println("O Menor numero é: " + teste.encontrarMenorNumero());
        System.out.println(teste.exibirNumeros());
    }
}
