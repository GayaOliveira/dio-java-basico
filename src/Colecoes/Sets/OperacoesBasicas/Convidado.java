package Colecoes.Sets.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    // Por padrão, duas instâncias de uma classe são objetos distintos, mesmo que todos os valores de seus atributos sejam iguais.
    // Mas isso pode ser alterado:
    // Os métodos equals e hashcode podem ser usados para estabelecer que um atributo será usado para definir se duas instâncias da classe se referem à mesma coisa.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;   // comparar o objeto com ele mesmo, deve sempre retornar true
        if (!(o instanceof Convidado)) return false;   // se o outro objeto não for instância da classe, nem prossegue a comparação
        Convidado convidado = (Convidado) o;
        return getCodigoConvite() == convidado.getCodigoConvite();  // o critério de comparação aqui é o valor do atributo "codigoConvite"
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }

}
