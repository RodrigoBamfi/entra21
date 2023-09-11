package aula7;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
		 * com o número 0
		 * 
		 * Calcule a média de altura das mesmas.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a altura de alguma pessoa: ");
		double altura = sc.nextDouble();
		double soma = 0;
		double media = 0;
		int vezes = 0;
		
		while(altura != 0) {
			soma = soma + altura;
			vezes++;
			
			System.out.println("Insira a altura de alguma pessoa: ");
			altura = sc.nextDouble();
		}

		media = soma /vezes;
		System.out.println("A media é: " + media);
	}

}
