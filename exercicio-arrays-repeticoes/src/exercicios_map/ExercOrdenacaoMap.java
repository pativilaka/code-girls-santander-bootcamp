package exercicios_map;

import java.util.*;

public class ExercOrdenacaoMap {
    public static void main(String[] args) {

        Map<String, Livro> meusLivrosFavoritos = new HashMap<>(){{
           put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 435));
           put("Duhingg, Charles", new Livro("O Poder do Hábito", 408));
           put("Harari, Yuval Naah", new Livro("21 Lições Para o Sec 21", 232));
        }};

        System.out.println(" --- Imprima na ordem aleatória ---");
        for (Map.Entry<String, Livro> livro : meusLivrosFavoritos.entrySet() ) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println();

        System.out.println(" --- Imprima na Ordem Inserção --- ");
        Map<String, Livro> meusLivrosFavoritos2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhingg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Naah", new Livro("21 Lições Para o Sec 21", 432));
        }};
        for (Map.Entry<String, Livro> livro1 : meusLivrosFavoritos2.entrySet()){
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());
        }

        System.out.println();

        System.out.println(" --- Ordem Alfabética (Autores) --- ");
        Map<String, Livro> meusLivrosFavoritos3 = new TreeMap<>(meusLivrosFavoritos2);
        for (Map.Entry<String, Livro> livro1 : meusLivrosFavoritos3.entrySet()){
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());
        }

        System.out.println();

        System.out.println("--- Ordem Alfabética dos Livros --- "); // Quando quero os valores preciso do TreeSet
        Set<Map.Entry<String,Livro>> meusLivrosPorNome = new TreeSet<>(new ComparatorNome());
        meusLivrosPorNome.addAll(meusLivrosFavoritos.entrySet());
        for (Map.Entry<String, Livro> livro2 : meusLivrosPorNome){
            System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());
        }

        System.out.println();

        System.out.println("--- Ordene por nùmero de página ---");
        Set<Map.Entry<String,Livro>> meusLivrosPorPagina = new TreeSet<>(new ComparatorPagina());
        meusLivrosPorPagina.addAll(meusLivrosFavoritos.entrySet());
        for (Map.Entry<String, Livro> livro2 : meusLivrosPorPagina){
            System.out.println(livro2.getKey() + " - " + livro2.getValue().getPagina());
        }

    }
}

class Livro{
    private String nome;
    private Integer pagina;

    public Livro(String nome, Integer pagina) {
        this.nome = nome;
        this.pagina = pagina;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPagina() {
        return pagina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && pagina.equals(livro.pagina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, pagina);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", pagina=" + pagina +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());


    }
}

class ComparatorPagina implements Comparator<Map.Entry<String,Livro>>{


    @Override
    public int compare(Map.Entry<String, Livro> p1, Map.Entry<String, Livro> p2) {
        return p1.getValue().getPagina().compareTo(p2.getValue().getPagina());
    }
}