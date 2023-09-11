package aula10;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Crie um array de 10 elementos e depois peça ao usuário para informar um
		 * índice, imprima o valor que está no vetor conforme indice informado pelo
		 * usuario
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] valores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Informe um indice");
		int indice = sc.nextInt();
		System.out.println(valores[indice]);
		
	}

}
