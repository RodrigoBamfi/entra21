package aula6;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa, utilizando for, em que o usuário tenha a opção de inserir
		 * dois valores e ocorra a subtração deles, deve ocorrer por 3 vezes.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Insira um valor");
			int valorUm = sc.nextInt();
			int valorDois = sc.nextInt();
			
			int subtracao = valorUm - valorDois;
			
			System.out.println(subtracao);
			
		}
	
		sc.close();	

	}

}
