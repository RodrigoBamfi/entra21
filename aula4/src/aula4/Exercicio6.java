package aula4;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um
		// algoritmo para ler as idades dos filhos e exibir quem é o mais velho, o
		// irmão do meio e o caçula da família. Suponha que não haja empates.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual é a idade de Marquinhos? ");
		int idadeM = entrada.nextInt();
		System.out.println("Qual é a idade de Zezinho? ");
		int idadeZ = entrada.nextInt();
		System.out.println("Qual é a idade da Luluzinha? ");
		int idadeL = entrada.nextInt();

		if (idadeM > idadeZ && idadeM > idadeL) {
			System.out.println("Marquinhos é o mais velho.");
			if (idadeZ > idadeL) {
				System.out.println("Zezinho é o irmão do meio.");
				System.out.println("Luluzinha é a caçula.");
			} else {
				System.out.println("Luluzinha é o irmã do meio.");
				System.out.println("Zezinho é a caçula.");
			}
		} else if (idadeZ > idadeM && idadeZ > idadeL) {
			System.out.println("Zezinho é o mais velho.");
			if (idadeM > idadeL) {
				System.out.println("Marquinhos é o irmão do meio.");
				System.out.println("Luluzinha é a caçula.");
			} else {
				System.out.println("Luluzinha é o irmã do meio.");
				System.out.println("Marquinhos é a caçula.");
			}
		} else {
			System.out.println("Luluzinha é a mais velha.");
			if (idadeM > idadeZ) {
				System.out.println("Marquinhos é o irmão do meio.");
				System.out.println("Zezinho é a caçula.");
			} else {
				System.out.println("Zezinho é o irmão do meio.");
				System.out.println("Marquinhos é a caçula.");
			}
		}
		entrada.close();

	}

}
