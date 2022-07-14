package exercicios_set;

import java.util.*;

public class ExercOrdenacaoSet {
    public static void main(String[] args) {

        // Ordenar séries

        Set<Serie> minhasSeries = new HashSet<>(){{
          add(new Serie( "Got", "Fantasia", 60));
          add(new Serie( "Dark", "Drama", 60));
          add(new Serie( "Friends", "Comedia", 25));
        }};

        System.out.println("--- Ordem Aleatória --- ");
        System.out.println(minhasSeries);

        System.out.println();

        System.out.println("--- Ordem Aleatória Formatada --- ");
        for (Serie serie : minhasSeries)
            System.out.println( serie.getNome() + " - " +
                                serie.getGenero() + " - " +
                                serie.getTempo());


        System.out.println();

        System.out.println("Imprima na Ordem de Inserção");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie( "Friends", "Comedia", 60));
            add(new Serie( "Got", "Fantasia", 60));
            add(new Serie( "Dark", "Drama", 60));
        }};

        System.out.println("--- Ordem de Inserção --- ");
        for (Serie serie : minhasSeries1)
            System.out.println( serie.getNome() + " - " +
                    serie.getGenero() + " - " +
                    serie.getTempo());

        System.out.println();

        System.out.println("Exiba a Ordem Natural (Por tempo de episódio)");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2)
            System.out.println( serie.getNome() + " - " +
                    serie.getGenero() + " - " +
                    serie.getTempo());

        System.out.println();

//        System.out.println(" --- Ordem de Nome / Genero / Tempo --- ");
//        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
//        minhasSeries3.addAll(minhasSeries1);
//        for (Serie serie : minhasSeries3)
//            System.out.println( serie.getNome() + " - " +
//                    serie.getGenero() + " - " +
//                    serie.getTempo());

    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempo;

    public Serie(String nome, String genero, Integer tempo) {
        this.nome = nome;
        this.genero = genero;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempo=" + tempo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempo, serie.tempo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempo);
    }

    @Override
    public int compareTo(Serie serie) {

        int nome = this.nome.compareTo(serie.getNome());
        if (nome != 0) return nome;

        int genero = this.getGenero().compareTo(serie.getGenero()); // removido para treinar Comparator
        if (genero != 0) return genero;

        return Integer.compare(this.getTempo(), serie.getTempo());


        //return this.getGenero().compareTo(serie.getGenero());

    }
}

//class ComparatorNomeGeneroTempo implements Comparator<Serie>{
//
//    @Override
//    public int compare(Serie s1, Serie s2) {
//       int nome = s1.getNome().compareTo(s2.getNome());
//       if (nome != 0) return nome;
//
//       int genero = s1.getGenero().compareTo(s2.getGenero());
//       if (genero != 0) return genero;
//
//       return Integer.compare(s1.getTempo(),s2.getTempo());
//    }
//}