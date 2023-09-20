package aula13;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Crie uma matriz 3x3 do tipo, onde o usuário irá preencher os valores
		 * utilizando o scanner, ao fim imprima a matriz
		 */
		

		Scanner sc = new Scanner(System.in);

		int qntLinhas = 3;
		int qntColunas = 3;

		String[][] matriz = new String[qntLinhas][qntColunas];

		
		for (int linhas = 0; linhas < matriz.length; linhas++) {
			for (int colunas = 0; colunas < matriz[0].length; colunas++) {
				System.out.println("Informe valores");
				matriz[linhas][colunas] = sc.next();
			}
		}
		
		for (int linhas = 0; linhas < matriz.length; linhas++) {
			for (int colunas = 0; colunas < matriz[0].length; colunas++) {
				System.out.print(matriz[linhas][colunas]);
				
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
	}
	
}
