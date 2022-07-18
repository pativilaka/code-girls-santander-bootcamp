package debbuging;

import java.util.Scanner;

public class CalculadoraMediaTurma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] alunos = {"Pati", "Ale", "Rafa", "Duda"};

        double media = calcularMedia(alunos, scan);

        System.out.printf("A média é: %.2f",  media);

    }

    public static double calcularMedia(String[] alunos, Scanner scanner){

        double soma = 0;

        for (String aluno : alunos){
            System.out.println("Nota do aluno: " + aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma/alunos.length;
    }
}
