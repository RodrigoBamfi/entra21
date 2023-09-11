package aula2;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro numero");
		int numeroUm = entrada.nextInt();

		System.out.println("Inform o segundo numero: ");
		int numeroDois = entrada.nextInt();
		
		if(numeroUm > numeroDois) {
			
			System.out.println("Numero 1 é maior");
		} else if (numeroUm < numeroDois) {
			System.out.println("Numero 2 é maior");
		} else {
			System.out.println("São iguais");
		}
		
		entrada.close();

	}

}
