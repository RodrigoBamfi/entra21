package aula14;

public class Revisao_Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Crie essa matriz:
		 * 
		 * 
		 * 
		 * 2104 3 399900
		 * 
		 * 1600 3 329900
		 * 
		 * 2400 3 369000
		 * 
		 * 1416 2 232000
		 * 
		 * 3000 4 539900
		 * 
		 * 1985 4 299900
		 * 
		 * 1534 3 314900
		 * 
		 * 1427 3 199000
		 * 
		 * 1380 3 212000
		 * 
		 * 1494 3 242500
		 * 
		 * 1940 4 240000
		 * 
		 * 2000 3 347000
		 * 
		 * 1890 3 330000
		 * 
		 * 4478 5 699900
		 * 
		 * 1268 3 259900
		 * 
		 * 
		 * 
		 * A primeira coluna é o tamanho da casa
		 * 
		 * A segunda coluna é a quantidade de quartos
		 * 
		 * A terceira coluna é o preço
		 * 
		 * 
		 * 
		 * Determinar:
		 * 
		 * a) Qual é a média dos preços das casas?
		 * 
		 * b) Quanto custa a menor casa? E quantos quartos tem a casa mais cara?
		 * 
		 * c) Qual a diferença de tamanho da casa com o maior número de quartos para a
		 * casa com o menor número de quartos?
		 */
		
		int[][] matriz = {
				{2104, 3, 399900},
				{1600, 3, 329900},
				{2400, 3, 369000},
				{1416, 2, 232000},
				{3000, 4, 539900},
				{1985, 4, 299900},
				{1534, 3, 314900},
				{1427, 3, 199000},
				{1380, 3, 212000},
				{1494, 3, 242500},
				{1940, 4, 240000},
				{2000, 3, 347000},
				{1890, 3, 330000},
				{4478, 5, 699900},
				{1268, 3, 259900}
				
		};
		
		int media = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int menorCasa = Integer.MAX_VALUE;
		int aux = 0;
		int maiorQuartos = Integer.MIN_VALUE;
		int menorQuartos = Integer.MAX_VALUE;
		int quartos = 0;
		int tamanhoMaior = 0;
		int tamanhoMenor = 0;
		
		//A
		for (int linha = 0; linha < matriz.length; linha++) {
			media = media + matriz[linha][2];
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				
			}
		}
		
		//B
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if(matriz[linha][0] < menor) {
					menor = matriz[linha][0];
					menorCasa = matriz[linha][2]; // DA CERTO PORQUE A CONDIÇÃO IF puxa apenas a [linha] que deu certo.
					
					
				}	

			}
			
			}
		//B1	
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if(matriz[linha][2] > maior) {
					maior = matriz[linha][2];
					aux = matriz[linha][1];
				}
			}
		}
		
		//C
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if(matriz[linha][1] > maiorQuartos) {
					maiorQuartos = matriz[linha][1];
					tamanhoMaior = matriz[linha][0];
				}
				
				if(matriz[linha][1] < menorQuartos){
					menorQuartos = matriz[linha][1];
					tamanhoMenor = matriz[linha][0];
				}
			}
		}
		
		quartos = tamanhoMaior - tamanhoMenor;

		System.out.println("A media dos precos é : " + (media / matriz.length));
		System.out.println("A menor casa custa: " + menorCasa);
		System.out.println("A casa mais cara tem : " + aux + " quartos");
		System.out.println("A diferenca de tamanho é : " + quartos);
		//System.out.println(matriz.length);
		//System.out.println(matriz[0].length);

	}

}
