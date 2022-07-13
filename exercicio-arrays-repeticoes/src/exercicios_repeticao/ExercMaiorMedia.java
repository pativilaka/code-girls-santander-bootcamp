package exercicios_repeticao;

import java.util.Scanner;

public class ExercMaiorMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int cont = 0;
        int maiorNumero = 0;
        double mediaNumero;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
             if (numero > maiorNumero) maiorNumero = numero;
             soma = soma + numero;
            cont++;
        } while (cont < 5);

        mediaNumero = soma / 5;

        System.out.println("O valor da média é: " + mediaNumero);
        System.out.println("O valor da soma é: " + soma);
        System.out.println("O valor do cont é: " + cont);
        System.out.println("O maior número é: " + maiorNumero);

    }

}
