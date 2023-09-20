package aula13;

import java.util.Random;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Crie uma matriz com 7 linhas e 8 colunas do tipo inteiro, para preencher a
		 * mesma utilize o Random de java.util.Random, posteriormente imprima esta
		 * matriz;
		 */
		
		Random generator = new Random();
		
		int[][] matriz = new int[7][8];
		
		for(int linhas = 0; linhas < matriz.length; linhas++) {
			for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
				matriz[linhas][colunas] = generator.nextInt(10);
				System.out.print(matriz[linhas][colunas]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
	}

}
