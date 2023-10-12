package main.java.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos Teste = new AgendaContatos();

        // Adicionar contatos
        Teste.adicionarContato("Camila", 123456);
        Teste.adicionarContato("João", 5665);
        Teste.adicionarContato("Carlos", 1111111);
        Teste.adicionarContato("Ana", 654987);
        Teste.adicionarContato("Maria", 1111111);
        Teste.adicionarContato("Camila", 44444);

        Teste.exibirContatos();

        System.out.println(Teste.pesquisarPorNome("Carlos"));
    }

}
