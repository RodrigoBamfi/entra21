package aula4;

import java.util.Scanner;

public class Exercicio5correcao {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que
		 * a idade entre homens e mulheres sempre serão diferentes). Calcule e escreva a
		 * soma das idades do homem mais velho com a mulher mais nova, e o produto das
		 * idades do homem mais novo com a mulher mais velha.
		 */

		Scanner entrada = new Scanner(System.in);

		//ENTRADA
		System.out.println("Escreva a idade de dois homens");
		int homemUm = entrada.nextInt();
		int homemDois = entrada.nextInt();
		
		System.out.println("Escreva a idade de duas mulheres");
		int mulherUm = entrada.nextInt();
		int mulherDois = entrada.nextInt();
		
		
		//VARIAVEL AUXILIAR
		int soma = 0;
		int produto = 0;
		
		//PROCESSO
		if(homemUm > homemDois && mulherUm > mulherDois) {
			soma = homemUm + mulherDois;
			produto = homemDois * mulherUm;
		}else {
			soma = homemDois + mulherUm;
			produto = homemUm * mulherDois;
		}
		
		entrada.close();
		
		System.out.println("A soma " + soma);
		System.out.println("O produto " + produto);
	}

}
