package aula19;

import java.util.Scanner;

public class Exercicio1 {
	
	public static String verifica(int min, int max , int valorInserido) {
		
		
		if(valorInserido > min && valorInserido < max ) {
			return valorInserido + " está nos limites impostos";
		}else {
			return "não está no limite";
			
		}	
		
	}

	public static void main(String[] args) {
		/*
		 * Faça um programa que diz se um número inserido está dentro de um limite
		 * imposto pelo usuário
		 * 
		 * Por exemplo:
		 * 
		 * Usuário inseriu o limite máximo como 100.
		 * Usuário inseriu o limite mínimo como 70.
		 * 
		 * Depois ele inseriu o número 80.
		 * 
		 * A saída deve ser: 80 está nos limites impostos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero inicial");
		int menorLimite = sc.nextInt();
		
		System.out.println("Insira um numero final");
		int maiorLimite = sc.nextInt();
		
		System.out.println("Insira um numero");
		int numero = sc.nextInt();
		
		System.out.println(verifica(menorLimite, maiorLimite, numero));
		
		
	}

}
