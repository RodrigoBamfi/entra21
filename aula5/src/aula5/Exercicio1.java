package aula5;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo em que o usuário entra com um número. Depois ele escolhe
		 * a operação que vai ser feita com esse número Caso ele escolha a operação 1
		 * Modifique a variável do número entrado e some 10 ao número original Caso ele
		 * escolha a operação 2 Modifique a variável do número entrado e subtraia 10 do
		 * número original Caso ele escolha a operação 3 Modifique a variável do número
		 * entrado e multiplique 10 ao número original Caso ele escolha a operação 4
		 * Modifique a variável do número entrado e divida 10 do número original
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		double numero = entrada.nextDouble();
		
		System.out.println("Insira o numero da operacao: ");
		int operacao = entrada.nextInt();
		
		double numeroOperacao = 0;
		double variavelAuxiliar = numero;
		
		
		switch (operacao) {
		case 1:
			numeroOperacao = variavelAuxiliar  + 10;
			break;
		case 2:
			numeroOperacao = variavelAuxiliar - 10;
			break;
		case 3:
			numeroOperacao = variavelAuxiliar * 10;
			break;
		case 4:
			numeroOperacao = variavelAuxiliar / 10;
			break;
		default:
			System.out.println("Valor Invalido");
			break;
		}
		
		System.out.println("O resulto é: " + numeroOperacao);
		entrada.close();
	}

}
