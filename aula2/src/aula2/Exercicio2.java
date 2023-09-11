package aula2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// EXERCICIO 2 (DADOS DOIS VALORES INTEIROS, ESCREVA UM ALGORITIMO QUE INFORME
		// SE ELES SãO MULTIPLOS OU NÃO)

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro numero");
		int numeroUm = entrada.nextInt();

		System.out.println("Inform o segundo numero: ");
		int numeroDois = entrada.nextInt();

		if (numeroUm % numeroDois == 0) {

			System.out.println("Os números são multiplos");
		} else {
			System.out.println("Os números não são multiplos");
		}

		// "DESCUBRA SE O NÚMERO É PAR
		// Scanner entrada = new Scanner(System.in);
		// System.out.println("Informe um valor");
		// int valor = entrada.nextInt();
		// if(valor % 2 != 0) {
		// System.out.println("O numero é par");
		
		entrada.close();
	}

}
