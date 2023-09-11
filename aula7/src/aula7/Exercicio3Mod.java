package aula7;

import java.util.Scanner;

public class Exercicio3Mod {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa
		 * digitar um número diferente, mostrar a mensagem "entrada inválida" e
		 * solicitar o número novamente. Se digitar correto mostrar o número digitado.
		 * Conforme a questão 3, construa um contador que comece com 0 onde ele precisa
		 * chegar ao numero 10, para o contador contar precisa-se que o valor seja
		 * valido
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um numero entre 12 e 20: ");
		int numero = sc.nextInt();
		
		int contador = 0;

		while (numero < 12 || numero > 20) {
			System.out.println("entrada invalida");
			numero = sc.nextInt();
			contador++;
			}

	if(contador == 10) {
		System.out.println("Final");
	}
	
	}
}


