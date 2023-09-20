package aula12;

public class Exercicio2 {

	public static void main(String[] args) {
		/* Criem uma matriz de 5 linhas e 1 coluna, somem todos os valores
		 * 
		 *Posteriormente verifique a média e imprima somente os valores que estão acima dela
		 *  
		 */
		
		int[][] matriz = new int[5][1];

		System.out.println("matriz.length: " + matriz.length); // ACESSA SOMENTE A LINHA
		System.out.println("matriz[0].length: " + matriz[0].length); // ACESSA SOMENTE A COLUNA
		
		matriz[0][0] = 1;
		matriz[1][0] = 2;
		matriz[2][0] = 3;
		matriz[3][0] = 4;
		matriz[4][0] = 5;

		double total = 0;
		double media = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			total = total + matriz[linha][0];
			
			media = total / matriz.length;
			
		}
		
		for(int linha = 0; linha < 5; linha++)
		if(matriz[linha][0] > media) {
			System.out.println(matriz[linha][0]);
		}
		
		
		System.out.println(media);
		System.out.println(total);
	}

}
