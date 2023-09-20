package aula14;

import java.util.Scanner;

public class Revisao_Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Descreva um algoritmo que leia 12 valores decimais e os coloque em um vetor
		 * de 12 posições.
		 * 
		 * Em seguida, modifique o vetor de modo que os valores das POSIÇÕES ímpares
		 * sejam aumentados em 5% e os das posições pares sejam aumentados em 2%.
		 * 
		 * Imprima o vetor resultante
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double[] vetor = new double[12];
		double numero = 0;
		
		System.out.println("Digite 12 numeros decimais: ");
		
		for(int i = 0; i < 12; i++) {
			numero = sc.nextDouble();
			
			if(numero % 2 == 0) {
				numero = numero + (numero * 0.02);
				vetor[i] = numero;
			}else {
				numero = numero + (numero * 0.05);
				vetor[i] = numero;
			}
			
		}

		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		sc.close();
	}

}
