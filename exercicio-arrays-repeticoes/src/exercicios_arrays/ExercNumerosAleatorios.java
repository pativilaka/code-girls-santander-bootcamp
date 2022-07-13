package exercicios_arrays;

import java.util.Random;
import java.util.Scanner;

public class ExercNumerosAleatorios {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números Aleatórios");
        for (int numero : numerosAleatorios) {
            System.out.println(numero);
        }

        System.out.println();

        System.out.println("Sucessores dos Números Aleatórios");
        for (int numero : numerosAleatorios) {
            System.out.println(numero+1);
        }
    }
}
