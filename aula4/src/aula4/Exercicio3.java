package aula4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Escreva um algoritmo que obtém do usuário 3 valores inteiros
		// representando as três cartas deste usuário em uma mão de jogo de truco (1=
		// AS; 2=2; 3=3;
		// 7=7;
		// 11=Valete; 12= Dama; 13= Rei).O algoritmo deve imprimir na tela a
		// palavra
		// “TRUCO” (se APENAS UMA das três cartas for AS, 2 ou 3), “SEIS” (se
		// APENAS DUAS
		// das três cartas for AS, 2 ou 3) ou “NOVE” (se AS TRÊS cartas forem AS,
		// 2 ou 3). Se
		// não houver AS, 2 ou 3 nas três cartas, não é impresso nada

		Scanner entrada = new Scanner(System.in);

		// ENTRADA
		System.out.println("Informe o valor 1");
		int valorUm = entrada.nextInt();
		System.out.println("Informe o valor 2");
		int valorDois = entrada.nextInt();
		System.out.println("Informe o valor 3");
		int valorTres = entrada.nextInt();

		// processo
		if ((valorUm == 1 || valorDois == 1 || valorTres == 1) &&
			(valorUm == 2 || valorDois == 2 || valorTres == 2) &&
			(valorUm == 3 || valorDois == 3 || valorTres == 3)) {
			System.out.println("NOVE");
		}else if ((valorUm < 4 && valorDois < 4) ||
				  (valorUm < 4 && valorTres < 4) ||
				  (valorDois < 4 && valorTres < 4)) {
			System.out.println("SEIS");	
		}else if(valorUm == 1 || valorDois == 1 || valorTres == 1 ||
				 valorUm == 2 || valorDois == 2 || valorTres == 2 ||
				 valorUm == 3 || valorDois == 3 || valorTres == 3) {
			System.out.println("TRUCO");
		}else {
			System.out.println("nada");
		}
		
		entrada.close();
		
	}
}