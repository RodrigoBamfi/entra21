package aula8;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. Faça uma calculadora. O usuário entra com dois números e depois com a
		 * operação desejada.
		 * Caso o número da operação seja 1: some os dois números.
		 * Caso seja 2: subtraia os dois números.
		 * Caso seja 3: multiplique os dois números.
		 * Caso seja 4: divida os dois números.
		 *  
		 * Após realizada a operação, solicite ao usuário se deseja continuar realizando
		 * operações (sempre com dois novos valores) digite qualquer tecla e caso queira
		 * encerrar informe a letra ‘n’.
		 */

		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Insira o primeiro número: ");
		double numeroUm = Double.MIN_VALUE;
		
		//System.out.println("Insira o segundo número: ");
		double numeroDois = Double.MIN_VALUE;
		
		//System.out.println("Insira o número da operacao: ");
		int operacao = Integer.MIN_VALUE;
		
		double resultado = 0;
		char letra = Character.MAX_VALUE;
		
		while(letra != 'n') {
			System.out.println("Insira o primeiro número: ");
			numeroUm = sc.nextDouble();
			
			System.out.println("Insira o segundo número: ");
			numeroDois = sc.nextDouble();
			
			System.out.println("Insira o número da operacao: ");
			operacao = sc.nextInt();
		switch (operacao) { // == se for string seria .equals por traz desse ()
		case 1:
			System.out.println("CAiu aqui soma");
			resultado = numeroUm + numeroDois;	
			break;
		case 2:
			resultado = numeroUm - numeroDois;
			break;
		case 3:
			resultado = numeroUm * numeroDois;
			break;
		case 4:	
			resultado = numeroUm / numeroDois;
	
			break;
		default:
			System.out.println("Opcao invalida");
			break;
		}
		System.out.println(resultado);
		System.out.println("Digite qualquer letra ou N para encerrar: ");
		letra = sc.next().charAt(0);
		}
		System.out.println("Programa Encerrado");
	}

}
