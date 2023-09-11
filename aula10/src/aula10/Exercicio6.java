package aula10;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler os valores de dois vetores de inteiros, cada um
		 * contendo 10 elementos.
		 * 
		 * Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas
		 * posições respectivas dos vetores originais.
		 * 
		 * Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao
		 * final, os três vetores na tela.
		 */
		
		int[] vetorUm = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] vetorDois = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] vetorTres = {0, 0, 0 ,0 ,0 ,0 ,0 ,0, 0, 0};
		
		for (int i = 0; i < vetorUm.length; i++) {
			vetorTres[i] = vetorUm[i] + vetorDois[i]; 
		}

		for (int i = 0; i < vetorTres.length; i++) {
			System.out.println(vetorTres[i]);
		}
		

	}

}
