package main.java.list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getdescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
