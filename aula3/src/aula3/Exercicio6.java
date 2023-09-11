package aula3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// EXERCICIO6 (Faça um programa que verifique (usando if e else) se uma letra
		// digitada
		// é vogal ou consoante.

		// ENTRADA
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String letra = entrada.nextLine();

		// PROCESSO
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("é uma vogal");

		} else {
			System.out.println("é uma consoante");
		}

		entrada.close();

	}

}
