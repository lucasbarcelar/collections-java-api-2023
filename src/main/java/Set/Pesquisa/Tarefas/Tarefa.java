package main.java.Set.Pesquisa.Tarefas;

public class Tarefa {
    //Atributos

    private String descricao;
    private Boolean status;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.status = false;
    }

    public boolean concluida() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa: " + descricao + " status= " + status + '\n';
    }
}
