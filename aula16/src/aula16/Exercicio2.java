package aula16;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void estacaoAno(int escolha) {
		
		
		switch (escolha) {
		case 1:
			System.out.println("é verão e o tempo está quente");
			break;
		case 2:
			System.out.println("é outono e o tempo está morno");
			break;
		case 3:
			System.out.println("é inverno e o tempo está frio");
			break;
		case 4:
			System.out.println("é primavera e o tempo está morno");
			break;

		default:
			System.out.println("Opção invalida");
			break;
		}
	}

	public static void main(String[] args) {
		/*
		 * Faça um programa em que o usuário entre com um número de 1 a 4 Com o número 1
		 * sendo verão, 2 sendo outono... Dependendo de o que o usuário informa, printe:
		 * 
		 * É verão E o tempo está quente
		 * 
		 * Ou
		 * 
		 * É inverno E está frio
		 */

		Scanner sc = new Scanner(System.in);
		int numero = 0; 
		
		System.out.println("Digite numero de 1 a 4");
		numero = sc.nextInt();
		
		estacaoAno(numero);//Parametro não necessariamente precisa ser o mesmo nome do metodo
		
		sc.close();
	}

}
