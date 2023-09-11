package aula2;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		System.out.println("Digite o valor");
		double valorEmDolares = entrada.nextDouble();
		
		double dolar = 4.97;
		
		
		double troca = valorEmDolares * dolar;
		
		entrada.close();
				
		System.out.println("o total em reais é " + troca);		
	}

}
