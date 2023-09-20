package aula14;

import java.util.Random;

public class Revisao_Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Crie uma array de 5 elementos e descubra:
		 * 
		 * a) Qual o maior elemento
		 * 
		 * b) Qual o menor elemento
		 * 
		 * c) A média dos elementos
		 */
		
		Random generator = new Random();
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		double media = 0;
		
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = generator.nextInt(10);
			media = media + array[i];
			
			if(array[i] < menor ) {
				menor = array[i];
			}
			
			if(array[i] > maior ) {
				maior = array[i];
			}
		}
		
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		media = media / array.length;
		
		System.out.println("Menor: " + menor);
		System.out.println("Maior: " + maior);
		System.out.println("A media dos valores é: " + media);
	}

}
