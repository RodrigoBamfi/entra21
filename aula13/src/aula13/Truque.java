package aula13;

import java.util.Random;

public class Truque {

	public static void main(String[] args) {
		// TRUQUE

		Random generator = new Random();
		
		int[][] matrizR = new int[2][2];
		
		for(int linha = 0; linha < 2; linha++) {
			for(int coluna = 0; coluna < 2; coluna++) {
				matrizR[linha][coluna] = generator.nextInt(10);
				System.out.println(matrizR[linha][coluna]);
			}
		}
		
		int[][] matriz = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		System.out.println(matriz.length);
		System.out.println(matriz[0].length);
		
		
		
	}

}
