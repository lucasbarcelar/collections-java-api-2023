package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnopublicacao() >= anoInicial && l.getAnopublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros lojaLivros = new CatalogoLivros();

        lojaLivros.adicionarLivro("Biblia Sagrada", "Deus", 200);
        lojaLivros.adicionarLivro("Vida Do Lucas", "Lucas Mendes", 2005);
        lojaLivros.adicionarLivro("Pilares da programação", "Lucas Mendes", 2021);
        lojaLivros.adicionarLivro("pequeno Principe", "Xiaomi", 1994);
        System.out.println(lojaLivros.pesquisarPorAutor("Lucas Mendes"));
        System.out.println(lojaLivros.pesquisarPorTitulo("Biblia Sagrada"));
        System.out.println(lojaLivros.pesquisarPorIntervaloAnos(1990, 2022));
    }
}
