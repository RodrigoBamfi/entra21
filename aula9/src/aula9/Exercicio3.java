package aula9;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Crie uma array de 5 elementos e no momento de imprimir, comece pelo último
		 * elemento até o primeiro elemento.
		 */

		Scanner sc = new Scanner(System.in);
		
		int[] elementos = new int[5];
		
		for(int i = 0; i < 5; i++) {
			elementos[i] = sc.nextInt();
			
			//DESCOBRIR COMO IMPRIMIR DE TRAS PARA FRENTE.
		}
		
		for(int i = 4; i >= 0; i--) {
			System.out.println(elementos[i]);
		}
	}

}
