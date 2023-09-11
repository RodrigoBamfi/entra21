package aula6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Crie um programa para ler 3 notas e mostrar a
		 * média delas.
		 */

		Scanner sc = new Scanner(System.in);
		
		double media = 0;
		double nota = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Insira suas tres notas: ");
			nota = sc.nextDouble();
			nota = nota + media;
			media = nota;
			
		}
		
		System.out.println(media);
		
		System.out.println(media / 3);
		
		sc.close();
	}

}