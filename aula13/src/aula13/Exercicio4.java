package aula13;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Dada a seguinte matriz, calcule:
		 *  
		 * 1 2 3 4
		 * 
		 * 5 6 7 8
		 * 
		 * 9 10 11 12
		 * 
		 * 13 14 15 16
		 * 
		 * a) A soma dos elementos de primeira coluna;
		 * 
		 * b) O produto dos elementos da primeira linha;
		 * 
		 * c) A soma de todos os elementos;
		 * 
		 * d) O produto da diagonal principal.
		 */
		
		int[][] matriz = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		
		int somaPrimeiraColuna = 0;
		int produtoPrimeiraLinha = 1;
		int somaTotal = 0;
		int produtoDiagonal = 1;
		
		//MAJU EXPLICACAO
		int soma = 0;
		int produto = 1;
		int somaTotal2 = 0;
		int produtoDiagonal2 = 1;
		
		
		//LETRA A OK
		for (int linha = 0; linha < matriz.length; linha++) {
			soma = soma + matriz[linha][0];
		}
		
		//LETRA B
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			produto = produto * matriz[0][coluna];
		}
		
		//LETRA C
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				somaTotal2 = somaTotal2 + matriz[linha][coluna];
			}
		}
		
		//LETRA D
		for (int linha = 0; linha < matriz.length; linha++) {
			produtoDiagonal2 = produtoDiagonal2 * matriz[linha][linha];
			
		}
		
		
		
		System.out.println(soma);
		System.out.println(produto);
		System.out.println(somaTotal2);
		System.out.println(produtoDiagonal2);
		
		
		for (int linha = 0; linha < matriz.length; linha++) {
			produtoDiagonal = produtoDiagonal * matriz[linha][linha];
		    for (int coluna = 0; coluna < matriz[0].length; coluna++) {
		        somaTotal = somaTotal + matriz[linha][coluna];
		        

		        if (linha == 0) {
		            produtoPrimeiraLinha = produtoPrimeiraLinha * matriz[linha][coluna];
		        }

		        //if (linha == coluna) {
		        //    produtoDiagonal = produtoDiagonal * matriz[linha][coluna];
		        //}

		        if (coluna == 0) {
		            somaPrimeiraColuna = somaPrimeiraColuna + matriz[linha][coluna];
		        }
		    }
		}

		System.out.println("A soma primeira coluna é: " + somaPrimeiraColuna);
		System.out.println("O produto primeira linha é: " + produtoPrimeiraLinha);
		System.out.println("A soma todos elementos é: " + somaTotal);
		System.out.println("O produto diagonal principal é: " + produtoDiagonal);
		
		
	}

}
