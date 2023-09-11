package aula3;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Faça um programa que pergunte o preço de três produtos e informe qual
		// produto você deve comprar, sabendo que a decisão é sempre o mais
		// barato.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual valor da maça?");
		double maca = entrada.nextDouble();
		System.out.println("Qual valor da banana?");
		double banana = entrada.nextDouble();
		System.out.println("Qual valor da laranja?");
		double laranja = entrada.nextDouble();
		
		if(maca == banana || banana == laranja || laranja == maca) {
			System.out.println("Valores invalidos");
		} else {
			if (maca < banana && maca < laranja) {
				System.out.println("A maça é a mais barata");
			} else if (banana < laranja) {
				System.out.println("A banana é a mais barata");
			} else {
				System.out.println("A laranja é a mais barata");
			}

		}
		entrada.close();

	}

}
