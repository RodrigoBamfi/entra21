package aula10;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu e
		 * por fim printe o vetor.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //ARRAY COM VALOR FIXO
		
		//int[] valores = new int[10]; //ARRAY PARA PEDIR COM SCANNER
		int indice = Integer.MIN_VALUE;
		
		System.out.println("Escolha um indice de 0 a 10");
		indice = sc.nextInt();
	
		valores[indice] = 0;
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
	}

}
