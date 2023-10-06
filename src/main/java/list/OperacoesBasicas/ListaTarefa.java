package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa T : tarefaList) {
            if(T.getdescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(T);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return  tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa teste = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é : " + teste.obterNumeroTotalTarefas());

        teste.adicionarTarefa("acordar");
        teste.adicionarTarefa("tomar café");
        teste.adicionarTarefa("ler");
        System.out.println("O numero total de elementos na lista é : " + teste.obterNumeroTotalTarefas());


        teste.obterDescricaoTarefas();
    }
}
