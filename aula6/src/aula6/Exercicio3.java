package aula6;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Crie 4 variáveis fora do For onde define se é m(mulher) e h(homem) e faça
		 * dois contador que verifique quantas mulheres e homens são
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe 4 valores, sendo m(mulher) e h(homem)");
		
		int contadorMulheres = 0;
		int contadorHomens = 0;
		
		
		for(int i = 0; i < 4; i++) {
			String val = sc.next();
			if(val.equals("m")) {
				contadorMulheres++;
			}else {
				contadorHomens++;
			}
		}
		
		sc.close();
		
		//saida
		System.out.println("Mulheres: " + contadorMulheres );
		System.out.println("Homens: " + contadorHomens);
		
		
		
		
		
		

		/*int generoH = 0;
		int generoM = 0;

		for (int i = 1; i < 5; i++) {
			System.out.println("Insira (H)homem ou (M)mulher: ");
			String genero = sc.nextLine();

			if (genero.equalsIgnoreCase("h")) {
				generoH = generoH + 1;
			} else if (genero.equalsIgnoreCase("m")) {
				generoM = generoM + 1;
			} else {
				System.out.println("Valor invalido");
			}
		}

		System.out.println("testeH " + generoH);
		System.out.println("testeM " + generoM);*/

	}
}
