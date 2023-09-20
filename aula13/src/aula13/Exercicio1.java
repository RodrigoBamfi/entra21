package aula13;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Crie uma matriz 3 linhas e 3 colunas, preencha a mesma de A até I,
		 * posteriormente imprima a matriz.
		 * 
		 * Desafio: imprimir em forma de matriz(lado a lado)
		 * 
		 * 
		 */
		
		char[][] matriz = new char[4][4];


		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				matriz[linha][coluna] = '*';
			}
		
		}
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if(coluna > linha) {
				
				matriz[linha][coluna] = ' ';
				}else {
				matriz[linha][coluna] = '*';
				}
				
			}
		
		}
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}
	}
}