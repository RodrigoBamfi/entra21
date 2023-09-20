package aula11;

import java.util.Arrays;

public class Desafio {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que inverta a ordem de uma array (o primeiro elemento vai
		 * se tornar o último elemento)
		 */

		
		
		int[] vetor = { 1, 2, 3, 4, 5, 6 };

		int tamanho = vetor.length - 1; //percorre metade final
		//e o i percorre a metade inicial
		
		int temp = 0;
		
		for (int i = 0; i < tamanho;) {
			
			
			//Temporaria recebe um valor antes dele ser alterado.
			temp = vetor[i];
			
			//Valor do vetor é alterado
			vetor[i] = vetor[tamanho];
			
			//Valor salvo pela temp passa a ser reatribuido
			vetor[tamanho] = temp;
			
			tamanho--;
			i++;
		}
		
		System.out.println(Arrays.toString(vetor));
		

	}

}
