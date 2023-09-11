package aula3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		//Exercicio1 ( FAÇA UM PROGRAMA QUE PEÇA UM VALOR E MOSTRE NA TELA SE O VALOR É POSITIVO OU NEGATIVO
		
		//ENTRADA		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		double valor = entrada.nextDouble();
		
		//PROCESSO e SAIDA
		
		if(valor > 0 ) {
			System.out.printf("O valor é positivo");
			
		} else {
			System.out.printf("O valor é negativo");
		}
		
		entrada.close();

	}

}
