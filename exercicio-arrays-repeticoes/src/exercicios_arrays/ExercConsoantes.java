package exercicios_arrays;

import java.util.Scanner;

public class ExercConsoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                   letra.equalsIgnoreCase("e") |
                   letra.equalsIgnoreCase("i") |
                   letra.equalsIgnoreCase("o") |
                   letra.equalsIgnoreCase("u"))) {

                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        for (String soConsoante : consoantes){
            if (soConsoante != null){
                System.out.println(soConsoante + " ");
            }
        }

        System.out.println("A quantidade de consoates é: " + quantidadeConsoantes);
    }
}
