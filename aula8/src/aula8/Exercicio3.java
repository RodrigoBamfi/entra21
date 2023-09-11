package aula8;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Faça um programa com sistema de menu interativo para o usuário, onde o
		 * usuário escolhe a opção desejada:
		 * 
		 * Solicita dois valores e os multiplica
		 * 
		 * Solicita três notas e calcula a média ponderada, considerando que a primeira
		 * nota equivale a 20%, a segunda 30% e a terceira 50%.
		 * 
		 * Solicita dado de 5 pessoas e verifica quantos homens e mulheres são.
		 * 
		 * Retorna uma mensagem bonita
		 * 
		 * O usuário pode executar quantas vezes quiser estas opções e caso informe o
		 * valor 0(zero) deve ser encerrado o programa.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double valorUm = Double.MIN_VALUE;
		double valorDois = Double.MIN_VALUE;
		double total = Double.MIN_VALUE;
		int continua = Integer.MIN_VALUE;
		
		int operacao = Integer.MIN_VALUE;
		
		
		while(continua != 0)
		switch (operacao) {
		case 1:
			System.out.println("Insira o primeiro valor: ");
			valorUm = sc.nextDouble();
			System.out.println("Insira o segundo valor: ");
			valorDois = sc.nextDouble();
			
			total = valorUm * valorDois;
			
			
			System.out.println("Qualquer tecla para continuar, para encerrar digite '0' ");
			
			break;

		default:
			break;
		}
		
		sc.close();

	}

}
