package aula17;

import java.util.Scanner;

public class Revisao_Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de
		 * seus clientes. Trinta deles foram ouvidos e para cada um perguntou-se o sexo
		 * (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor
		 * inteiro) e a idade.
		 * 
		 * Baseado nisto faça um programa que informe:
		 *  
		 * qual a nota média recebida pelo cinema;
		 * 
		 * qual a nota média atribuída pelos homens;
		 * 
		 * qual a nota atribuída pela mulher mais jovem;
		 * 
		 * quantas das mulheres com mais de 50 anos deram nota superior a média recebida
		 * pelo cinema.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String sexo = "";
		int nota = Integer.MIN_VALUE;
		int idade = 0;
		
		int[][] matriz = new int[1][3];
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.println("Insira seu sexo (feminino ou masculino) : ");
				matriz[linha][coluna] = sc.next();
				//sexo = sc.next();
				System.out.println("De 0 a 10 qual nota da para o cinema?: ");
				nota = sc.nextInt();
				System.out.println("Inform sua idade: ");
				idade = sc.nextInt();
			}
		}
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.println(matriz[linha][coluna]);
			}
		}
		

	}

}
