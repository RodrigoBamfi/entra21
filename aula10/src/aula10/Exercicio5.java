package aula10;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
		 * 12 posições do tipo real.
		 * 
		 * Imprima quais valores desses informados são maiores que a média dos valores.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double[] valores = new double[12];
		double soma = 0;
		double media = 0;
		System.out.println("Digite 12 valores: ");
		
		for(int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextDouble();
			
			soma = soma + valores[i];
			media = soma / 12;
		}
		
		for (int i = 0; i < valores.length; i++) {
			if(valores[i] > media) {
				System.out.println(valores[i]);
			}
		}
		
		sc.close();
		
		System.out.println(media);

		
		

	}

}
