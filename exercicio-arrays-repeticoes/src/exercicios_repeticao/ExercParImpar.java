package exercicios_repeticao;

import java.util.Scanner;

public class ExercParImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int quantidadeRepeticoes;
        int contPar = 0;
        int contImpar = 0;
        int contNumero = 0;

        System.out.println("Digite o número de repetições: ");
        quantidadeRepeticoes = scan.nextInt();

        do {
            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) contPar++;
            else contImpar++;

            contNumero++;
        } while (contNumero < quantidadeRepeticoes);

        System.out.println("O valor total de números pares é: " + contPar);
        System.out.println("O valor total de números ímpares é: " + contImpar);
    }

}
