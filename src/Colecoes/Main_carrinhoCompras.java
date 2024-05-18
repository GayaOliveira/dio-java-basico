package Colecoes;

public class Main_carrinhoCompras {
    public static void main(String[] args) {

        CarrinhoDeCompras ccomp = new CarrinhoDeCompras();
        ccomp.adicionaItem("Arroz", 6.0, 2);
        ccomp.adicionaItem("Feijão", 8.0, 2);
        ccomp.adicionaItem("Arroz", 8.5, 1);
        ccomp.adicionaItem("Manteiga", 15.0, 2);
        ccomp.adicionaItem("Alho", 3.0, 5);

        System.out.println(ccomp.exibeItens());
        System.out.println("Valor Total: R$ " + String.format("%.2f", ccomp.calculaValorTotal()));

        ccomp.removeItem("Arroz");
        System.out.println(ccomp.exibeItens());

        System.out.println("Valor Total: R$ " + String.format("%.2f", ccomp.calculaValorTotal()));

    }

}
