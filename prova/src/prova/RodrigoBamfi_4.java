package prova;

import java.util.Scanner;

public class RodrigoBamfi_4 {

	public static void main(String[] args) {
		/*
		 * Um aluno se vê com necessidade de ajuda na aula e logo tem a ideia de um
		 * algoritmo, pensando nisso, ele descreve como deve funcionar:
		 *  o usuário seleciona a opção onde
		 * 1) Solicita 3 notas e calcula a média,
		 * 2) Retorna os dados do aluno em questão (informe seu nome e e-mail),
		 * 3) Solicita 5 valores, verifica e retorna qual é o maior e o menor.
		 * A opção 0 encerra o programa e qualquer outra é declarada como inválida, além disso, informe quantas vezes o
		 * usuário escolheu opções válidas antes de encerrar o programa e quantas
		 * inválidas.
		 */

		Scanner sc = new Scanner(System.in);
		
		double valorUm = 0;
		double valorDois = 0;
		double valorTres = 0;
		double valor = 0;
		double valorMaximo = Double.MIN_VALUE;
		double valorMinimo = Double.MAX_VALUE;
		double media = 0;
		String nome = "";
		String email = "";
		int contador = 0;
		
		//int encerra = Integer.MIN_VALUE;
		
		int opcao = Integer.MIN_VALUE;
		int numero = Integer.MIN_VALUE;
		
		System.out.println("Informe seu nome: ");
		nome = sc.next();
		System.out.println("Informe seu e-mail: ");
		email = sc.next();
		
		
		while(numero != 0) {
			System.out.println("Selecione a opcao desejada");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Insira sua primeira nota");
				valorUm = sc.nextDouble();
				System.out.println("Insira sua segunda nota");
				valorDois = sc.nextDouble();
				System.out.println("Insira sua terceira nota");
				valorTres = sc.nextDouble();
				
				media = valorUm + valorDois + valorTres / 3;
				
				System.out.println("media é " + media);
				break;
			case 2:
				System.out.println("Seu nome é: " + nome);
				System.out.println("Seu e-mail é: " + email);
				break;
			case 3:
				for (int i = 0; i < 5; i++) {
				System.out.println("Insira cinco valores:");
				valor = sc.nextDouble();
				
				if(valor > valorMaximo) {
					valorMaximo = valor;
				}
				if (valor < valorMinimo){
					valorMinimo = valor;
				}
				}
				System.out.println("O menor valor é: " + valorMinimo);
				System.out.println("O maior valor é: " + valorMaximo);
				break;

			default:
				System.out.println("Valor invalido");
				break;
			}

			System.out.println("Digite algum numero para reiniciar e 0 para encerra o programa");
			numero = sc.nextInt();
			
		
		}
		
		System.out.println("Programa encerrado");
		
		
	}

}
