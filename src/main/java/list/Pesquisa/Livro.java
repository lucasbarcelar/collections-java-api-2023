package main.java.list.Pesquisa;

public class Livro {
    //atributos

    private String titulo;
    private String autor;
    private int anopublicacao;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.anopublicacao = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnopublicacao() {
        return anopublicacao;
    }

    @Override
    public String toString() {
        return "| titulo: " + titulo +  "| autor: " + autor + "| ano: " + anopublicacao + '\n';
    }
}
