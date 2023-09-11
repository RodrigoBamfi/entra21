package aula7;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//Escreva um algoritmo que leia um número do teclado até que encontre um número menor ou igual a 1.

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero");
		int numero = sc.nextInt();
		
		while(numero > 1) {
			System.out.println("Insira um numero");
			numero = sc.nextInt();
			
		}
		
		sc.close();
		
		System.out.println("Fim");
		
		
	}

}
