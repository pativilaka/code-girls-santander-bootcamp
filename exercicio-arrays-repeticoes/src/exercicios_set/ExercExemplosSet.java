package exercicios_set;

import java.util.*;

public class ExercExemplosSet {

    public static void main(String[] args) {

        // Formas de inicialização do Set
        // Set notas = new HashSet(); // Antes do Java 5
        //Set<Double> notas = new HashSet<>(); // Generico (JDK 5) - Diamont Operator (JDK 7)
        //HashSet<Double> notas = new HashSet<>();
        //Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d,7d, 0d, 3.6));
        //Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d,7d, 0d, 3.6);
        //notas.add(1d);
        //notas.remove(5d);
        //System.out.println(notas);

        System.out.println("Crie um conjunto e adicione as notas: ");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d,7d, 0d, 3.6));

        System.out.println(notas); // não entrou valor duplicado - não ficou na ordem

        // System.out.println("Exiba a posição da nota 5: "); - não temos o método indexOf para buscar position

        // System.out.println("Adicione na lista a nota 8 na posição 4: "); - não conseguimos trabalhar com posição no set

        // System.out.println("Substitua a nota 5 pela nota 6: "); // - não temos o método set, não conseguimos fazer tbm

        System.out.println("Confira se a nota 5 está no conjunto:" + notas.contains(5d));

        //System.out.println("Exiba a terceira nota adicionada"); // - não tenho o método get para passar o indice, não conseguimos fazer tbm

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println(" --- Soma dos valores --- ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + soma/ notas.size());
        System.out.println(notas.size());

        System.out.println("Remova a nota 0 " + notas.remove(0d));
        System.out.println(notas);

        //System.out.println("Remova a nota na posição 0 "); // não temos como identificar index no set

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas");
        Set<Double> notas1 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d,7d, 0d)); //não inseriu o 7 duplicado
        System.out.println(notas1);
        notas1.add(3.6);
        System.out.println(notas1);
        notas1.add(7d); // compila, não mostra erro mas não insere.
        System.out.println(notas1);

        System.out.println("Exiba todas as notas no ordem crescente:");
        Set<Double> notas2 = new TreeSet<>(notas1);
        System.out.println(notas2); // Só conseguimos fazer isso pois Double possui implementação do Comparable

        System.out.println("Apague todo o conjunto");
        notas2.clear();
        System.out.println(notas2);

        System.out.println("Confira se SetList está vazio: " + notas.isEmpty());
        System.out.println("Confira se SetList está vazio: " + notas1.isEmpty());
        System.out.println("Confira se SetList está vazio: " + notas2.isEmpty());
    }
}
