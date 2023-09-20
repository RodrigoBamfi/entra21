package aula12;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Criar uma matriz com 1 linha e 10 colunas, na mesma verifique quantos valores
		 * são par e quantos valores são impar e calcule a média dos valores
		 * 
		 * Agora criem uma segunda linha e novamente somem todas as colunas, por fim
		 * somem os valores da linho 0 e da linha 1
		 */

		int[][] matriz = new int[2][10];

		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		matriz[0][4] = 5;
		matriz[0][5] = 6;
		matriz[0][6] = 7;
		matriz[0][7] = 8;
		matriz[0][8] = 9;
		matriz[0][9] = 10;
		matriz[1][0] = 1;
		matriz[1][1] = 2;
		matriz[1][2] = 3;
		matriz[1][3] = 4;
		matriz[1][4] = 5;
		matriz[1][5] = 6;
		matriz[1][6] = 7;
		matriz[1][7] = 8;
		matriz[1][8] = 9;
		matriz[1][9] = 10;

		int par = 0;
		int impar = 0;
		int mediaPar = 0;
		int mediaImpar = 0;
		double soma = 0;
		double total = 0;

		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			soma = soma + matriz[0][coluna];

			if (matriz[0][coluna] % 2 == 0) {
				mediaPar++;
				par = par + matriz[0][coluna];
			} else {
				mediaImpar++;
				impar = impar + matriz[0][coluna];
			}
		}

		
		for(int linha = 0; linha < 2; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				total = total + matriz[linha][coluna];
}
}
		
		
		
		//for(int coluna = 0; coluna < matriz[0].length; coluna++) {
			//total = total + matriz[0][coluna];
			//total = total + matriz[1][coluna];
		//}
		
		System.out.println("a media par é " + par / mediaPar);
		System.out.println("a media impar é " + impar / mediaImpar);
		System.out.println("a media total : " + (soma / matriz[0].length));
		System.out.println("o total das linhas é: " + total);

	}

}
