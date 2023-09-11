package aula4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Dada a idade de um nadador descreva um algoritmo que o classifique
		// em uma das seguintes categorias:
		// pré-mirim 5 - 7 anos
		// mirim 8 - 10 anos
		// infantil 11 - 13 anos
		// infanto-juvenil 14 - 17 anos
		// juvenil 18 - 20 anos
		// adulto maiores de 21 anos
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		if(idade <= 4) {
			System.out.println("Valor invalido");
		}else {
			if(idade >= 5 && idade <= 7) {
				System.out.println("Nadador pré-mirim");
			}else if(idade >= 8 && idade <= 10) {
				System.out.println("Nadador mirim");
			}else if(idade >= 11 && idade <= 13) {
				System.out.println("Nadador infantil");
			}else if(idade >= 14 && idade <= 17) {
				System.out.println("Nadador infanto-juvenil");
			}else if(idade >= 18 && idade <= 20) {
				System.out.println("Nadador juvenil");
			}else {
				System.out.println("Nadador Adulto");
			}
		}
		
		entrada.close();
	}

}
