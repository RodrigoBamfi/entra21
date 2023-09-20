package aula13;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Crie um programa onde o usuário define quantas linhas e colunas deve ter uma
		 * matriz, e posteriormente imprima o total de elementos(posições) que está
		 * matriz tem
		 */

		Scanner sc = new Scanner(System.in);

		int qntLinhas = 0;
		int qntColunas = 0;
		int total = 0;

		System.out.println("Informe a quantidade de Linhas");
		qntLinhas = sc.nextInt();
		System.out.println("Informe a quantidade de Colunas ");
		qntColunas = sc.nextInt();

		char[][] matriz = new char[qntLinhas][qntColunas];		
		
		total = matriz.length * matriz[0].length;
		System.out.println("total de elementos: " + total);
		
	
		
		
		
	}

}
