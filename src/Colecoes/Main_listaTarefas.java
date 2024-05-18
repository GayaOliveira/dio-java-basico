package Colecoes;

public class Main_listaTarefas {

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionaTarefa("Estudar");
        listaTarefas.adicionaTarefa("Trabalhar");
        listaTarefas.adicionaTarefa("Treinar");
        listaTarefas.adicionaTarefa("Trabalhar");
        listaTarefas.adicionaTarefa("Comer");
        listaTarefas.adicionaTarefa("Estudar");

        System.out.println(listaTarefas.getListaTarefas());

        listaTarefas.removeTarefa("Trabalhar");

        System.out.println(listaTarefas.getListaTarefas());

        listaTarefas.obterDescricaoTarefas();

    }

}
