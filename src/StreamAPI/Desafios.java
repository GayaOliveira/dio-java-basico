package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafios {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 1: Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
        List<Integer> listaOrdenada = numeros.stream().sorted().collect(Collectors.toList());
        System.out.println(listaOrdenada);

        // Desafio 2: Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
        int somaPares = numeros.stream().filter(x -> x % 2 == 0).reduce(0, (x, y) -> x + y);
        System.out.println("Soma dos números pares = " + somaPares);

        // Desafio 3: Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
        boolean todosPositivos = numeros.stream().allMatch(num -> num >= 0);
        System.out.println("Todos os elementos são positivos? " + todosPositivos);

        // Desafio 4: Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
        numeros = numeros.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(numeros);

        // Desafio 5: Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
        numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream().filter(x -> x > 5).mapToInt(Integer::intValue).average().ifPresent(System.out::println);

        // Desafio 6: Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
        boolean temNumMaiorQue10 = numeros.stream().anyMatch(x -> x > 10);
        System.out.println("Há números maiores que 10 -> " + temNumMaiorQue10);

        // Desafio 7: Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // Remove duplicatas
                .sorted((a, b) -> b - a) // Ordena em ordem decrescente
                .skip(1) // Pula o primeiro maior elemento
                .findFirst(); // Obtém o segundo maior elemento
        System.out.print("O segundo maior número da lista é " + segundoMaior.get());

        // Desafio 8: Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.



    }

}
