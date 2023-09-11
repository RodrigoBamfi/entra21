package aula7;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa onde caso o usuário digite a letra 's' peça para informar
		 * um número e caso digite 'n' encerre o programa e por fim
		 * a) escreva o menor valor
		 * 
		 * b) escreva o maior valor
		 */

		Scanner sc = new Scanner(System.in);

		double valor = 0;
		double valorMaximo = 0;
		double valorMinimo = 0;
		boolean armazenar = true;

		System.out.println("Digite S para inserir um número ou N para encerrar: ");
		char letra = sc.next().charAt(0);	

		while (letra == 's' || letra == 'S') {
			System.out.println("Digite um número");
			valor = sc.nextDouble();

			if (armazenar) {
				valorMaximo = valor;
				valorMinimo = valor;
				armazenar = false;
			}

			if (valor > valorMaximo) {
				valorMaximo = valor;
			} else {
				valorMinimo = valor;
			}
			
			System.out.println("Digite S para inserir um número ou N para encerrar: ");
			letra = sc.next().charAt(0);
			
			while(letra != 's' && letra != 'n') {
				System.out.println("Valor invalido");
				System.out.println("Informe de novo");
				letra = sc.next().charAt(0);
			}
			
			}
		


		System.out.println("O menor valor é: " + valorMinimo);
		System.out.println("O maior valor é: " + valorMaximo);
		System.out.println("Programa encerrado fora while");
	}

}