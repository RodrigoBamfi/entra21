package aula2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// EXERCICIO 3 (FAÇA UM ALGORITIMO QUE IMPRIMA "NOME CORRETO" CASO O NOME
		// INSERIDO SEJA O SEU

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro nome: ");
		String primeiroNome = entrada.nextLine();

		System.out.println("Inform o segundo nome");
		String segundoNome = entrada.next();

		if (primeiroNome.equalsIgnoreCase(segundoNome)) {
			System.out.println("NOME CORRETO");
		}

		if (!primeiroNome.equalsIgnoreCase(segundoNome)) {
			System.out.println("NOME DIFERENTES");

		}
		
		entrada.close();

	}

}
