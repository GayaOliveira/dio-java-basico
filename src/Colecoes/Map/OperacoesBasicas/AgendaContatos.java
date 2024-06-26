package Colecoes.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {   // não preciso de uma classe Contato neste caso

    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    // não precisamos indicar aqui critérios de unicidade, pq num Map a chave é única

    public void adicionarContato(String nome, Integer telefone){
        agendaContatos.put(nome, telefone);   // serve tanto para adicionar quanto para atualizar (então, uma chave repetida vai sobrescrever uma pré-existente)
    }

    public void removerContato(String nome){
        if (!agendaContatos.isEmpty()){
            agendaContatos.remove(nome);
        }
        else {
            System.out.println("Não há contatos na agenda");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatos);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatos.isEmpty()){
            numeroPorNome = agendaContatos.get(nome);

        }
        else {
            System.out.println("Não há contatos na agenda.");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }


}
