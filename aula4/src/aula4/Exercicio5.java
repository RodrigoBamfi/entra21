package aula4;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres
		// (considere que a idade entre homens e mulheres sempre serão
		// diferentes). Calcule e escreva a soma das idades do homem mais velho
		// com a mulher mais nova, e o produto das idades
		// do homem mais novo com a mulher mais velha.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira a idade dos dois homens");
		int idadeHomemUm = entrada.nextInt();
		int idadeHomemDois = entrada.nextInt();

		System.out.println("Insira a idade das duas mulheres");
		int idadeMulherUm = entrada.nextInt();
		int idadeMulherDois = entrada.nextInt();

		if (idadeHomemUm > idadeHomemDois && idadeMulherUm > idadeMulherDois) {
			int somaIdadeHM = idadeHomemUm + idadeMulherDois;
			int multIdadeMH = idadeMulherUm * idadeHomemDois;
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é : if1 " + somaIdadeHM);
			System.out.println("A multiplicação da idade da mulher mais velha com o homem mais novo é: if1 " + multIdadeMH);
		} else if (idadeHomemUm > idadeHomemDois && idadeMulherDois > idadeMulherUm) {
			int somaIdadeHM = idadeHomemUm + idadeMulherUm;
			int multIdadeMH = idadeMulherDois * idadeHomemDois;
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é : if2 " + somaIdadeHM);
			System.out.println("A multiplicação da idade da mulher mais velha com o homem mais novo é: if2 " + multIdadeMH);
		} else if (idadeHomemDois > idadeHomemUm && idadeMulherUm > idadeMulherDois) {
			int somaIdadeHM = idadeHomemDois + idadeMulherDois;
			int multIdadeMH = idadeHomemUm * idadeMulherUm;
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é : if3 " + somaIdadeHM);
			System.out.println("A multiplicação da idade da mulher mais velha com o homem mais novo é: if3 " + multIdadeMH);
		} else {
			int somaIdadeHM = idadeHomemDois + idadeMulherUm;
			int multIdadeMH = idadeHomemUm * idadeMulherDois;
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é : else " + somaIdadeHM);
			System.out.println("A multiplicação da idade da mulher mais velha com o homem mais novo é: else " + multIdadeMH);
		}

		entrada.close();

	}

}
