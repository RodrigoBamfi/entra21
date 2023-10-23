package prova2;

import java.util.Scanner;

public class RodrigoBamfi_1 {

	public static void main(String[] args) {
		/*
		 * Crie um programa para encontrar o maior número que pode ser criado
		 * reordenando o vetor. Por exemplo: {1, 2, 3, 0, 4, 6} Deverá ter a saída:
		 * 643210 Proibido usar: Arrays.sort() É o vetor não possui números negativos
		 */

		/*
		 * int[] vetor = {1, 2, 3, 0, 4, 6};
		 * 
		 * 
		 * for (int i = 0; i < vetor.length; i++) {
		 * 
		 * 	for (int j = 0; j < vetor.length; j++) {
		 * 
		 * 		if(vetor[i] > vetor[j]) { 
		 * 		System.out.println(Arrays.toString(vetor));
		 * 		System.out.println("entrou aqui o i = " + vetor[i] + " é maior que j =  " +	vetor[j]);
		 * 		int aux = vetor[i];
		 * 		System.out.println("variavel auxiliar recebeu = " + aux); vetor[i] = vetor[j];
		 * 		System.out.println("vetor i recebeu = " + vetor[i]); vetor[j] =	aux;
		 * 		System.out.println("vetor j recebeu = " + vetor[j]);
		 * 		System.out.println(Arrays.toString(vetor));
		 * 
		 * 			}
		 * 
		 * 		}
		 * 
		 * 
		 * }
		 * 
		 * System.out.println(Arrays.toString(vetor));
		 * 
		 * 		}
		 * }
		 */

		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[6];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira o valor do vetor");
			vetor[i] = sc.nextInt();
		}

		String resultado = " ";
		

		for (int i = 0; i < vetor.length; i++) {
			int maiorValor = Integer.MIN_VALUE;
			int indiceMaior = 0;

			for (int j = 0; j < vetor.length; j++) {
				if (vetor[j] > maiorValor) {
					maiorValor = vetor[j];
					indiceMaior = j;
				}
			}
			resultado += maiorValor + " ";
			vetor[indiceMaior] = -1;
		}

		System.out.println(resultado);
	}

}
