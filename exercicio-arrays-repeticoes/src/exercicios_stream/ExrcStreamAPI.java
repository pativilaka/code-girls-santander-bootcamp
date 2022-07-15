package exercicios_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExrcStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println();

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5) // imprimiu apenas 4 pois set não coleta duplicidade
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();

//        System.out.println("Transforme essa lista de String em uma lista de números inteiros");
//        numerosAleatorios.stream()
//                .map(Integer::parseInt).toList()
//                .forEach(System.out::println);

        System.out.println();

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listaParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> (integer % 2 == 0 && integer > 2)).toList();
        System.out.println(listaParesMaioresQue2);

        System.out.println();

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println();

        System.out.println("Remova os números ímpares: ");
        List<Integer> numerosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());

        numerosInteger.removeIf(integer -> (integer %2 != 0));
        System.out.println(numerosInteger);


    }
}
