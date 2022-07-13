package exercicios_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercOrdenacaoList {
    public static void main(String[] args) {
        // Exibir lista de gatos com ordenação

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println(meusGatos); // sem toString na classe Goto, aparece apenas o endereço de memória

        System.out.println("--- Ordem de Inserção ---");
        System.out.println(meusGatos);


        System.out.println();

        System.out.println("--- Na Ordem Aleatótia ---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--- Na Ordem Natural ---");
        Collections.sort(meusGatos); // utiliza collections pois o objeto meusGatos recebe .sort com interface camparator
        System.out.println(meusGatos);

        System.out.println();

        System.out.println("--- Na Ordem Idade ---");
        //Collections.sort(meusGatos, new ComparatorIdade()); //É possível fazer das duas maneiras
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println();

        System.out.println("--- Na Ordem Cor ---");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println();

        System.out.println("--- Ordem Nome / Cor / Idade ---");
        //Comparar pelo nome primeiro se for igual, vai comparar cor, depois idade
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome()); // interface
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{


    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
