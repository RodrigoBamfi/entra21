package aula7;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Faça um programa que receba um nome de uma fruta como entrada.
		 *Faça vários cases para as frutas que você conhece.
		 *Por exemplo:
		 * Case "banana": Eu gosto dessa fruta
		 * Case "pera": Eu não gosto dessa fruta
		 * Caso o usuário entre um valor desconhecido, escreva: Eu não conheço essa
		 * fruta e encerre o programa
		 */

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira o nome de uma fruta: ");
		String fruta = sc.nextLine(); 
		
		while(fruta.equals("banana") || fruta.equals("pera") || fruta.equals("morango") || fruta.equals("abacaxi")) {
			switch(fruta) {
			case "banana":
				System.out.println("Eu gosto dessa fruta");
				break;
			case "pera":
				System.out.println("Eu gosto dessa fruta");
				break;
			case "morango":
				System.out.println("Eu gosto dessa fruta");
				break;
			case "abacaxi":
				System.out.println("Eu gosto dessa fruta");
				break;
			default:

				break;
			}
			System.out.println("Insira o nome de uma fruta: ");
			fruta = sc.nextLine();
		}
		
		System.out.println("Eu não conheço essa fruta");
		
		
	}

}
