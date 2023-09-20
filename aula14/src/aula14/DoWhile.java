package aula14;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		//

		Scanner sc = new Scanner(System.in);
		/*
		 * Diferente do while normal que temos a necessidade de pedir o dado antes de
		 * entrar no laço de repetição o Do While executara ao menos uma vez e
		 * posteriormente validara se deve continuar repetindo
		 */

		int numero = 0;
		do {
			// Executa ao menos uma vez
			System.out.println("Informe um numero");
			numero = sc.nextInt();
		} while (numero != 0);

	}

}
