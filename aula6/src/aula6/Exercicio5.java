package aula6;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a
		 * tabuada de 1 a 10 do valor lido.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero de 1 a 10");
		int numero = sc.nextInt();
		
		if(numero < 1 || numero > 10) {
			System.out.println("Valor Invalido");
		}else {
			int tabuada = 0;
			for(int i = 1; i <= 10; i++) {
					tabuada = numero * i;
					System.out.println(tabuada);
				}
			sc.close();
		}
	}
}
