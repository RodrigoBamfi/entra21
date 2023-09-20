package aula13;

import java.util.Random;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Crie em Java uma matriz 3x5 de inteiros, preencha a matriz utilizando Randon
		 * e depois:
		 * 
		 * a) Informe quantas vezes a matriz repete o número 0;
		 * 
		 * b) A quantidade de números pares;
		 * 
		 * c) A quantidade de números ímpares
		 */
		
		
		Random generator = new Random();
		
		int[][] matriz = new int[3][5];
		
		int repNumZero = 0;
		int numPares = 0;
		int numImpares = 0;
		
		for (int linhas = 0; linhas < matriz.length; linhas++) {
			for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
				matriz[linhas][colunas] = generator.nextInt(10);
			}
			}
		
		
		for (int linhas = 0; linhas < matriz.length; linhas++) {
			for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
				//matriz[linhas][colunas] = generator.nextInt(10);
				System.out.print(matriz[linhas][colunas]);
				System.out.print(" ");
				
				if(matriz[linhas][colunas] == 0) {
					repNumZero++;
				}
				
				if(matriz[linhas][colunas] % 2 == 0) {
					numPares++;
				}else {
					numImpares++;
				}
				
				
				
			}
			System.out.println(" ");
		}

		System.out.println("Quantos numeros zeros repete: " + repNumZero);
		System.out.println("Quantos numeros pares: " + numPares);
		System.out.println("Quantos numeros impares: " + numImpares);
		
		
	}

}
