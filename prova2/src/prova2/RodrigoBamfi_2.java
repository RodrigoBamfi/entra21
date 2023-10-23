package prova2;

import java.util.Arrays;
import java.util.Scanner;

public class RodrigoBamfi_2 {

	public static void main(String[] args) {
		/*
		 * Crie um programa Java para encontrar a maior sequência de números seguidos em
		 * um vetor. Por exemplo, o vetor {6, 0, 1, 5, 4, 3, 4, 5, 6, 1, 6} tem a maior
		 * sequência sendo {3, 4, 5, 6}.
		 * 
		 * Exiba essa sequência. Peça para o usuário inserir os valores do vetor
		 */

		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[10];

		int contador = 0;
		int maiorContador = 0;
		int posicaoInicial = 0;

		System.out.println("Insira os valores do vetor");
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (i < vetor.length - 1) {
				if (vetor[i] == vetor[i + 1] - 1) {
					contador++;
					if (contador > maiorContador) {
						maiorContador = contador;
						posicaoInicial = i - contador;
					}
				} else {
					contador = 0;
				}
			}
		}

		System.out.println("A maior sequência é: ");
		
		for (int i = posicaoInicial + 1; i <= posicaoInicial + maiorContador + 1; i++) {
			System.out.print(vetor[i] + " ");
		}
		

		/*int[] vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira o valor no vetor");
			vetor[i] = sc.nextInt();
		}
		
		int possivelInicio = 0;
		int inicioSequencia = 0;
		int tamanhoSequencia = 1;
		int tamanhoFinal = 1;
		
		for (int i = 1; i < vetor.length; i++) {
			if(vetor[i] - 1 == vetor[i - 1]) {
				tamanhoSequencia++;
			}else {
				tamanhoSequencia = 1;
				possivelInicio = i;
				
			}
			
			if(tamanhoSequencia > tamanhoFinal) {
				tamanhoFinal = tamanhoSequencia;
				inicioSequencia = possivelInicio;
			}
		}
		
		for (int i = 0; i < tamanhoFinal; i++) {
			System.out.println(vetor[inicioSequencia + i]);
		}*/
		

	}

}
