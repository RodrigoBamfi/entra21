package aula10;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo em que quem preenche os valores do vetor é o usuário, por
		 * fim printe o vetor (vetor de 5 posições).
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double[] vetor = new double[5];
		
		
		System.out.println("Insira 5 valores");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		sc.close();
		

	}

}
