package aula9;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo em que quem preenche os valores do vetor é o usuário, por
		 * fim printe o vetor (vetor de 5 posições).
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira cinco nomes: ");
		String[] nomes = new String[5];
		
		for(int i = 0; i < nomes.length; i++) {
			nomes[i] = sc.next();
			
		}
		
		for(int i = (nomes.length - 1); i >= 0; i--) {
			System.out.println(nomes[i]);
		}
		
		//System.out.println(nomes[0] + " " + nomes[1] + " " + nomes[2] + " " + nomes[3] + " " + nomes[4]);


	}

}
