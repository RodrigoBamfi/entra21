package aula2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {


	Scanner entrada = new Scanner(System.in);

	System.out.println("Informe um valor");
	int valor = entrada.nextInt();

	if (valor % 2 != 0){
		System.out.println("O numero é par");
	
	}
	
	entrada.close();

	}
}
