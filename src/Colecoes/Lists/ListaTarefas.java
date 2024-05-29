package Colecoes.Lists;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void adicionaTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao){

        // o método .remove() age sobre objetos ou índices. Não sobre atributos do objeto.

        List<Tarefa> tarefasParaRemover = new ArrayList<>(); // para remover todas as ocorrências de uma tarefa

        for (Tarefa t: listaTarefas){
            if(t.getDescricao().equals(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listaTarefas.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(listaTarefas);
    }

}
