package exercicios_list;

import java.util.*;

public class ExercExemploList {

    public static void main(String[] args) {

        // Formas para inicializar um ArrayList
        // List notas = new ArrayList(); // Antes do Java 5
        // List<Double> notas = new ArrayList<Double>(); // Generics (JDK 5) // Diamond Operator (JDK 7)
        // ArrayList<Double> notas = new ArrayList<>(); // ****** não é recomendado implementação
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); // passar como argumento
        // List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        // notas.add(10d);
        // System.out.println(notas);
        // List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        // notas.add(1d);
        // notas.remove(5d);
        // System.out.println(notas);

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println(notas.toString()); // não deve ser usual

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(7d)); // apareceu apenas a posição do primeiro elemento

        System.out.println("Adicione na posição 4 a nota 8.0: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5 pela nota 6: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println("Confira se a nota 5 está na lista: " + notas.contains(5d) ); // retorna boolean

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        // Aqui poderemos apenas imprimir
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menos nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das nota: " + (soma/notas.size()));

        System.out.println("Remova a nota 0.0: " + notas.remove(0d));
        System.out.println(notas);
        System.out.println(notas.contains(0d));
        System.out.println("Remova a nota 0.0: " + notas.remove(0d));
        //tomar cuidado quanto ao tipo, se for inteiro remove a posição

        System.out.println("Remova a nota da posição 0: " + notas.remove(0));
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next1 = iterator1.next();
            if (next1 < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        System.out.println();



    }
}
