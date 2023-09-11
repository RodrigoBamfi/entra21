package aula2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		int valorA = entradaValor.nextInt();

		System.out.println("Digite o valor de B: ");
		int valorB = entradaValor.nextInt();

		System.out.println("Digite o valor de C: ");
		int valorC = entradaValor.nextInt();

		System.out.println("Digite o valor de D: ");
		int valorD = entradaValor.nextInt();

		
		int valorAB = valorA * valorB;
		int valorCD = valorC * valorD;
		
				
		int diferenca = valorCD - valorAB;
		
		if(diferenca <= 0) {
			diferenca = diferenca * 1;
			
		System.out.println("If deu certo.");	
			
			
		}
		
		entradaValor.close();

		System.out.println("A diferença dos valores A B e C D é: " + diferenca);

	}

}
