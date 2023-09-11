package aula9;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do
		 * seu índice e printe o vetor.
		 * 
		 * Ex:
		 * 
		 * [0] = 0
		 * 
		 * [1] = 1
		 * 
		 * [2] = 4
		 * 
		 * [3] = 9
		 */
		
		
		int tamanhoVetor = 10;
		int[] vetor = new int[tamanhoVetor];
		
		//vetor[0] = 0;
		//vetor[1] = 1;
		//vetor[2] = 4;
		//vetor[3] = 9;
		
		for(int i = 0; i < 10; i++) {
			vetor[i] = i * i;
		
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(vetor[i]);
		}

	
	}

}
