package aula14;

public class Revisao_Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do
		 * seu índice 20 elementos
		 * 
		 * Ex:
		 * 
		 * [0] = 0
		 * 
		 * [1] = 1
		 * 
		 * [2] = 4
		 * 
		 * [3] = 9.
		 */
		
		int[] array = new int[20];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i * i;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
