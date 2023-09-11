package aula6;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa, utilizando for, que peça para o usuário inserir um número N
		 * e mostre na tela todos os números ímpares até N.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int numero = sc.nextInt();
		

		for(int i = 1; i <= numero; i += 2) {// i(1) + 2 resultado i=(3), novamente i(3) + 2 resultado i=(5) e assim por diante. 
			System.out.println(i);			 // por isso são todos impares.
		}
		
		
		for (int i = 0; i <= numero; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
				
			}
			
			sc.close();
		}

	}
}
