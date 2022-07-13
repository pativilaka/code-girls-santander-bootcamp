package exercicios_arrays;

import java.util.Random;

public class ExercArrayMultidimensional {

    public static void main(String[] args) {

        String[] nomes = {"Camila", "Pa", "Ra"};
        System.out.println(nomes.length);

        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int x = 0; x < M[i].length; x++){
                M[i][x] = random.nextInt(9);
            }
        }

        for (int[] linha : M ) {
            for ( int elementoColuna : linha ) {

                System.out.print(elementoColuna + " ");
            }
            System.out.println();
        }
    }
}
