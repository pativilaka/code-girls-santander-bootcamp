package exercicios;

import java.util.Scanner;

public class ExercFatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int resultMultiplicacao = 1;

        System.out.println("Forneça um valor para calcular o fatorial: ");
        int numeroDesejado = scan.nextInt();

        for (int i = numeroDesejado; i >=1; i--){
            resultMultiplicacao *= i;
        }

        System.out.println("O resultado do !" + numeroDesejado + " (fatorial) é: " + resultMultiplicacao);
    }

}
