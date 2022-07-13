package exercicios_arrays;

public class ExercOrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {1, 5, 6, 8, 50, 60};

        System.out.println("Vetor impresso");

        int count = 0;
        while (count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor inverso");

       for (int i = vetor.length - 1; i >= 0; i--){
           System.out.print(vetor[i] + " ");
       }
    }
}
