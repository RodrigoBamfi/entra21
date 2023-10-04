package aula17;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void verificacao(String palavra) {
		
		if(palavra.length() % 2 == 0) {
			System.out.println(palavra.charAt(0));
		}else {
			System.out.println(palavra.charAt(1));
		}
		
	}

	public static void main(String[] args) {
		/*
		 * Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho
		 * par, printe o primeiro caracter dessa palavra Caso ela tenha tamanho ímpar,
		 * printe o segundo caracter dessa palavra
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = sc.next();
		
		verificacao(palavra);
		
		sc.close();

	}

}
