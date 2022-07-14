package exercicios_map;

import java.util.*;

public class ExercExemplosMap {
    public static void main(String[] args) {

        // Formas de inicializar Map

        //Map carrosPopulares2020 = new HashMap(); // Antes do Java 5
        //Map<String, Double> carrosPopulares = new HashMap<>(); // Generico (JDK 5) - Diamont Operator (JDK 7)
        //HashMap<String,Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("Gol", 14.4,
//                                                         "Uno", 15.6,
//                                                         "Mobi", 16.1,
//                                                         "HB20", 14.5,
//                                                         "KWID", 15.6);

        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("KWID", 15.6);
        }};

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        System.out.println(carrosPopulares);

        System.out.println();

        System.out.println("Substitua o consumo do Gol por 15.2 Km/l: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println();

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        System.out.println();

        System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("Uno"));

        System.out.println();

        //System.out.println("Exiba o terceiro modelo adicionado: "); // não temos index

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        //Collection<String> modelos = carrosPopulares.keySet(); tbm dá certo
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        //Set<Double> consumo = (Set<Double>) carrosPopulares.values(); .values precisa devolver collection
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        System.out.println();

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelos mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println();

        System.out.println("Exiba o modelo menos economico:");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente é: " + modeloMenosEficiente + " - " + consumoMenosEficiente.longValue());
            }
        }

        System.out.println();

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("O valor da soma é: " + soma);

        System.out.println();

        System.out.println("Exiba a médio do consumo destes dicionários: " + soma/carrosPopulares.size());

        System.out.println();

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println();

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("KWID", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println();

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        System.out.println();

        System.out.println("Apague o conjunto de carros: ");
        carrosPopulares1.clear();
        System.out.println(carrosPopulares1);

        System.out.println();

        System.out.println("Confirme se conjunto carros populares 1 está vazio: " + carrosPopulares1.isEmpty());

    }
}