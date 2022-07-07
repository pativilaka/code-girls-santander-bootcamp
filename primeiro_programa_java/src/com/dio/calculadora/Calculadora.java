package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("O resultado da soma é: " + soma);
		System.out.println("O resultado da subtração é: " + subtracao);
		System.out.println("O resultado da multiplicação é: " + multicacao);
		System.out.println("O resultado da divisão é: " + divisao);
		
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static float divisao(float a, float b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
}
