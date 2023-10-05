package aula19;

import java.util.Scanner;

public class Exercicio2 {
	
	public static String cubo(double valorUm, double valorDois) {
		
		if(valorUm == 5 || valorDois == 5) {
			return (valorUm * valorUm * valorUm) + " " + (valorDois * valorDois * valorDois) + " algum numero é 5";
		}else if(valorUm + valorDois == 5) {
			return (valorUm * valorUm * valorUm) + " " + (valorDois * valorDois * valorDois) + " a soma é 5";
		}else if(valorUm - valorDois == 5 || valorDois - valorUm == 5) {
			return (valorUm * valorUm * valorUm) + " " + (valorDois * valorDois * valorDois) + " a diferença deles é 5";
		}else {
			return (valorUm * valorUm) + " " + ( valorDois * valorDois) + " nenhuma condição atendida";
		}
		
		
	}

	public static void main(String[] args) {
		/*
		 * Faça um código que receba duas entradas do usuário
		 * 
		 * Printe cada entrada ao cubo se:
		 * Algum dos dois números for 5
		 * A soma deles é 5
		 * A diferença deles é 5
		 * 
		 * Se nenhuma dessas condições forem satisfeitas, printe cada entrada ao
		 * quadrado
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor");
		double valorUm = sc.nextDouble();
		
		System.out.println("Insira o segundo valor");
		double valorDois = sc.nextDouble();
		
		
		System.out.println(cubo(valorUm, valorDois));
		
		
	}

}
