package aula8;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
		 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
		 * pedir as informações, caso seja certo, de os parabéns e encerre o programa.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome de usuario: ");
		String usuario = sc.nextLine();
		
		System.out.println("Informe sua senha: ");
		String senha = sc.nextLine();
		
		while(usuario.equals(senha)) {
			System.out.println("usuario e senha iguais");
			System.out.println("Informe seu nome de usuario: ");
			usuario = sc.nextLine();
			
			System.out.println("Informe sua senha: ");
			senha = sc.nextLine();
		}
		
		System.out.println("Parabens, programa encerrado.");
		

	}

}
