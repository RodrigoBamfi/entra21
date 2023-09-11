package aula7;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa
		 * digitar um número diferente, mostrar a mensagem "entrada inválida" e
		 * solicitar o número novamente. Se digitar correto mostrar o número digitado.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira um numero entre 12 e 20: ");
		int numero = sc.nextInt();
		
		
		while(numero < 12 || numero > 20) {
			System.out.println("entrada invalida");
			numero = sc.nextInt();
		}
		
		System.out.println(numero);
		
		}
	}
