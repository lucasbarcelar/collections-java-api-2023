package main.java.Set.Pesquisa.Tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //Atributos

    public Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Set<Tarefa> tarefaParaRemover = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
                break;
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t :tarefaSet) {
            if (t.concluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.concluida()) {
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatus(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatus(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas teste = new ListaTarefas();

        teste.adicionarTarefa("Levar o lixo");
        teste.adicionarTarefa("Academia");
        teste.adicionarTarefa("Fazer o almoço");
        teste.adicionarTarefa("Lavar o carro");
        teste.adicionarTarefa("Lavar a louça");
        teste.adicionarTarefa("Dar banho no cachorro");

        teste.exibirTarefas();

        teste.marcarTarefaConcluida("Academia");
        teste.marcarTarefaConcluida("Levar o lixo");
        teste.marcarTarefaConcluida("Lavar a louça");

        System.out.println(teste.obterTarefasConcluidas());

        teste.marcarTarefaPendente("Academia");

        System.out.println(teste.obterTarefasPendentes());
    }
}
