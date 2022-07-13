package exercicios_repeticao;

import java.util.Scanner;

public class ExercTabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja ver a tabuada: ");
        int tabuadaDesejada = scan.nextInt();

        for (int contTabuada = 1; contTabuada <= 10; contTabuada++){
            System.out.println(tabuadaDesejada + " X "+ contTabuada + " = " + (tabuadaDesejada * contTabuada));
        }

        System.out.println("Fim da operação For");
    }

}
