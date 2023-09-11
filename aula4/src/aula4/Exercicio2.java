package aula4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler o ano de nascimento de 3 irmãos,
		// escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS
		// IRMÃOS.
		// Considere que eles são GÊMEOS se dois deles possuem a mesma
		// idade e o outro diferente dos demais, e apenas irmãos se todas as idades
		// forem diferentes.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual é o ano de nascimento do primeiro irmao");
		int primeiroIrmao = entrada.nextInt();
		System.out.println("Qual é o ano de nascimento do segundo irmao");
		int segundoIrmao = entrada.nextInt();
		System.out.println("Qual é o ano de nascimento do terceiro irmao");
		int terceiroIrmao = entrada.nextInt();

		int idadePrimeiroIrmao = primeiroIrmao - 2023;
		int idadeSegundoIrmao = segundoIrmao - 2023;
		int idadeTerceiroIrmao = terceiroIrmao - 2023;

		if (idadePrimeiroIrmao == idadeSegundoIrmao && idadePrimeiroIrmao == idadeTerceiroIrmao) {
			System.out.println("São Trigemeos");
		} else if (idadePrimeiroIrmao == idadeSegundoIrmao || idadePrimeiroIrmao == idadeTerceiroIrmao
				|| idadeSegundoIrmao == idadeTerceiroIrmao) {
			System.out.println("São Gemeos");
		} else {
			System.out.println("São apenas irmaos");
		}
		entrada.close();
	}

}
