package aula14;

import java.util.Scanner;

public class Revisao_Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Descreva um algoritmo que vá lendo números inteiros até o usuário entrar com
		 * o número 0
		 * 
		 * a) Qual é o menor valor?
		 * 
		 * b) Qual é o maior valor?
		 * 
		 * c) Qual é a média dos valores?
		 */

		Scanner sc = new Scanner(System.in);

		int entrada = Integer.MIN_VALUE;
		int numero = Integer.MIN_VALUE;
		int numMenor = Integer.MAX_VALUE;
		int numMaior = Integer.MIN_VALUE;
		int media = 0;
		int contador = 0;

		while (entrada != 0) {
			System.out.println("Insira um número: ");
			numero = sc.nextInt();
			contador++;
			media = media + numero;

			if (numero < numMenor) {
				numMenor = numero;
			}
			
			if(numero > numMaior) {
				numMaior = numero;
			}
			
			System.out.println("Se deseja PARAR digite 0");
			entrada = sc.nextInt();
			
			
		}
		
		media = media / contador;
		
		
		System.out.println("Menor: " + numMenor);
		System.out.println("Maior: " + numMaior);
		System.out.println("A media dos valores é: " + media);

		System.out.println("Programa encerrado");
	}

}
