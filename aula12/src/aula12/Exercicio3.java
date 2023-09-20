package aula12;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Crie uma matriz 3 linhas e 3 colunas, preencha a mesma de A até I,
		 * posteriormente imprima a matriz.
		 * 
		 * Desafio: imprimir em forma de matriz(lado a lado)
		 * 
		 * 
		 */
		
		char[][] letras = new char[3][3];
		
		letras[0][0] = 'A';
		letras[0][1] = 'B';
		letras[0][2] = 'C';
		letras[1][0] = 'D';
		letras[1][1] = 'E';
		letras[1][2] = 'F';
		letras[2][0] = 'G';
		letras[2][1] = 'H';
		letras[2][2] = 'I';
		
		for(int linha = 0; linha < letras.length; linha++) {
			for(int coluna = 0; coluna < letras[0].length; coluna++) {
				System.out.print(letras[linha][coluna] + " ");
			}
			System.out.println(" ");
		}
	}

}
