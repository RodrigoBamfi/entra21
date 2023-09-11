package aula7;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Crie um programa que leia um número do teclado até que encontre um número
		// igual a zero. No final, mostre a soma dos números digitados.

		Scanner sc = new Scanner(System.in);
		
		double numero = 1;
		int soma = 0;

		while (numero != 0) {
			System.out.println("Insira um numero: ");
			numero = sc.nextDouble();
			soma += numero;
		}
		sc.close();
		System.out.println(soma);
		System.out.println("fim");
	}

}
