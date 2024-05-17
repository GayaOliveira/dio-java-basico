package Colecoes;

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

        List<Tarefa> tarefasParaRemover = new ArrayList<>();

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


//    @Override
//    public String toString(){
//        String texto = "Tarefas: \n";
//        for (Tarefa t: listaTarefas){
//            texto += "- " + t.getDescricao() + "\n";
//        }
//        return texto;
//    }

}
