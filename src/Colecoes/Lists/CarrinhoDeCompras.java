package Colecoes.Lists;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        listaItens = new ArrayList<>();
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void adicionaItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        listaItens.add(item);
    }

    public void removeItem(String nomeItem){
        List<Item> itensARemover = new ArrayList<>();

        if(!listaItens.isEmpty()){
            for (Item item: listaItens){

                if(item.getNome().equalsIgnoreCase(nomeItem)){
                    itensARemover.add(item);
                }
            }
        }

        listaItens.removeAll(itensARemover);
    }

    public double calculaValorTotal(){
        double valorTotal = 0.0;
        for (Item item: listaItens){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public String exibeItens(){
        String texto = "Lista Carrinho: \n";
        for (Item item: listaItens){
            texto += item.toString() + "\n";
        }
        return texto;
    }

}
