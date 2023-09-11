package aula4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//Faça uma calculadora. 
		//O usuário entra com dois números e depois com a operaçao desejada. 
		//Caso o número da operação seja 1: some os dois números. 
		//Caso seja 2: subtraia os dois números. 
		//Caso seja 3: multiplique os dois números. 
		//Caso seja 4: divida os dois números.

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os dois numeros desejado");
		double valorUm = entrada.nextDouble();
		double valorDois = entrada.nextDouble();
		
		System.out.println("Digite o numero da operacao");
		int valorOperacao = entrada.nextInt();
		
		//variavel auxiliar
		double variavelAuxiliar = 0;
		
		if(valorOperacao == 1) {
			 variavelAuxiliar = valorUm + valorDois;
		}else if(valorOperacao == 2) {
			 variavelAuxiliar = valorUm - valorDois;
		}else if(valorOperacao == 3) {
			 variavelAuxiliar = valorUm * valorDois;
		}else if(valorOperacao == 4) {
			 variavelAuxiliar = valorUm / valorDois;
		}else {
			System.out.println("Valor Invalido");
		}
		
		switch (valorOperacao) {
		case 1:
			variavelAuxiliar = valorUm + valorDois;
			break;
		case 2:
			variavelAuxiliar = valorUm - valorDois;
			break;
		case 3:
			variavelAuxiliar = valorUm * valorDois;
			break;
		case 4:
			variavelAuxiliar = valorUm / valorDois;
			break;
		default:
			System.out.println("Valor Invalido");
			break;
		}
		
		System.out.println("O resultado é SWITCH " + variavelAuxiliar);
		
		//saida
		System.out.println("O resultado é " + variavelAuxiliar);
		entrada.close();
	}

}
