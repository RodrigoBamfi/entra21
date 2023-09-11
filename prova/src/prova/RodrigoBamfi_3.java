package prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RodrigoBamfi_3 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa onde o usuário leia altura de 10 pessoas diferentes e
		 * depois calcule a média.
		 */

		Scanner sc = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");

		double altura = 0;
		double soma = 0;
		double media = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Insira a altura de 10 pessoas");
			altura = sc.nextDouble();

			soma = soma + altura;
		}

		sc.close();

		media = soma / 10;

		System.out.println("A media da altura das 10 pessoas é " + formatar.format(media) + " de altura.");

	}
}
