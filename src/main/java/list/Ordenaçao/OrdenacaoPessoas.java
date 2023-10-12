package main.java.list.Ordenaçao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        Pessoa novaPessoa = new Pessoa(nome, idade, altura);
        this.pessoaList.add(novaPessoa);
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas teste = new OrdenacaoPessoas();
        teste.adicionarPessoa("Lucas", 18, 1.97);
        teste.adicionarPessoa("Sam", 21, 1.95);
        System.out.println(teste.ordenarPorAltura());
        System.out.println(teste.ordenarPorIdade());
    }

}
