package aula3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// EXERCICIO 2 (FAÇA UM PROGRAMA QUE PEÇA UM VALOR E MOSTRE SE ELE É PAR OU IMPAR
		
		//ENTRADA
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		int valor = entrada.nextInt();
		
		//PROCESSO
		
		if(valor % 2 == 0) {
			System.out.println("O numero é par");
		} else {
			System.out.println("O numero é impar");
		}

		entrada.close();
	}

}
