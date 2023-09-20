package aula12;

public class matriz {

	public static void main(String[] args) {
		// MATRIZ
		
		int quantidadeDeLinhas = 2;
		int quantidadeDeColunas = 5;
		int[][] matriz = new int[quantidadeDeLinhas][quantidadeDeColunas];
		
		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[0][3] = 40;
		matriz[0][4] = 50;
		matriz[1][0] = 60;
		matriz[1][1] = 70;
		matriz[1][2] = 80;
		matriz[1][3] = 90;
		matriz[1][4] = 100;
		
		
		for (int linha = 0; linha < quantidadeDeLinhas; linha++) {
			
			
			for (int coluna = 0; coluna < quantidadeDeColunas; coluna++) {
				System.out.println(matriz[linha][coluna]);
				
			}
		}

	}

}
