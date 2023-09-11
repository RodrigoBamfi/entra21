package aula2;

import java.util.Scanner;

public class Exercicio1 {
	
	//EXERCICIO 1 (DADOS DOIS NÚMEROS INTEIROS DESCREVA UM ALGORITIMO PARA INFORMAR O MAIOR VALOR ENTRE ELES)

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero");
		int numeroUm = entrada.nextInt();
		
		System.out.println("Inform o segundo numero: ");
		int numeroDois = entrada.nextInt();
		
		
		if(numeroUm > numeroDois ) {
			
		System.out.println("O primeiro número é maior");
		} else {
			System.out.println("O segundo número é maior");			
		
		}
		
		entrada.close();
	}

}
