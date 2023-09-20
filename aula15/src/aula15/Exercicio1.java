package aula15;

import java.text.DecimalFormat;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
		 * metros e cresce 3 centímetros por ano.
		 * 
		 * Construa um algoritmo que calcule e imprima quantos anos serão necessários
		 * para que Zé seja maior que Chico.
		 */
		
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		double chico = 1.50;
		double ze = 1.10;
		int anos = 0;

		do {
			
			chico = chico + 0.02;
			ze = ze + 0.03;
			anos++;
			
			
		} while (ze < chico);
		
		
		System.out.println("Chico: " + formatar.format(chico));
		System.out.println("Ze: " + formatar.format(ze));
		System.out.println("Foi necessario " + anos + " anos ");
		
	}

}
