package aula16;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void maiorMenor(double numeroUm, double numeroDois) {
		
		if(numeroUm == numeroDois) {
			System.out.println("os números são iguais");
		}else if(numeroUm > numeroDois) {
			System.out.println(numeroUm + " é maior");
		}else {
			System.out.println(numeroDois + " é maior");
		}
			
		
	}

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba 2 números do usuário. Faça um método que descubra
		 * qual dos números é maior Se os dois números forem iguais, informe: número
		 * iguais
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número");
		double numeroUm = sc.nextDouble();
		System.out.println("Informe o segundo número");
		double numeroDois = sc.nextDouble();
		
		maiorMenor(numeroUm, numeroDois);
		
		sc.close();

	}

}
