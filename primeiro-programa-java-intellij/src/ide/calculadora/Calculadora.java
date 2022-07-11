package ide.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro número: ");
        a = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a,b);
        int multiplicar = multiplicar(a,b);
        int dividir = dividir(a,b);

        System.out.println("O valor da soma é: " + somar);
        System.out.println("O valor da subtração é: " + subtrair);
        System.out.println("O valor da multiplicação é: " + multiplicar);
        System.out.println("O valor da divisão é: " + dividir);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}

