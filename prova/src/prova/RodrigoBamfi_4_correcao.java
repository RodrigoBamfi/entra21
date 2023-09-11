package prova;

import java.util.Scanner;

public class RodrigoBamfi_4_correcao {

	public static void main(String[] args) {
		/*
		 * Um aluno se vê com necessidade de ajuda na aula e logo tem a ideia de um
		 * algoritmo, pensando nisso, ele descreve como deve funcionar: o usuário
		 * seleciona a opção onde 1) Solicita 3 notas e calcula a média, 2) Retorna os
		 * dados do aluno em questão (informe seu nome e e-mail), 3) Solicita 5 valores,
		 * verifica e retorna qual é o maior e o menor. A opção 0 encerra o programa e
		 * qualquer outra é declarada como inválida, além disso, informe quantas vezes o
		 * usuário escolheu opções válidas antes de encerrar o programa e quantas
		 * inválidas.
		 */

		Scanner sc = new Scanner(System.in);

		// entrada
		System.out.println("Escolha uma opcao");
		int opcao = sc.nextInt();
		
		//auxiliares
		int contValidas = 0;
		int contInvalidas = 0;
		
		while(opcao != 0) {
			switch (opcao) {
			case 1:
				contValidas++;
				double nota = 0;
				double soma = 0;
				for (int i = 0; i < 3; i++) {
					System.out.println("Informe as notas");
					nota = sc.nextDouble();
					soma = soma + nota;
				}
				
				System.out.println("A media é " + (soma / 3));
				
				break;
			case 2:
				contValidas++;
				System.out.println("Nome: " + "Rodrigo");
				System.out.println("Email: " + "rbamfi@furb.br");
				break;
			case 3:
				contValidas++;
				int maior = Integer.MIN_VALUE;
				int menor = Integer.MAX_VALUE;

				int valor = 0;
				for(int i = 0; i < 5; i++) {
					System.out.println("Informe um valor");
					valor = sc.nextInt();
					
					if (valor > maior) {
						maior = valor;
					}
					if(valor < menor) {
						menor = valor;
					}
				}
				
				System.out.println("O menor valor é: " + menor);
				System.out.println("O maior valor é: " + maior);
				
				break;

			default:
				System.out.println("Invalido");
				contInvalidas++;
				break;
			}
			System.out.println("Escolha uma opcao");
			 opcao = sc.nextInt();
			
		}
		System.out.println("Opcoes invalidas " + contInvalidas);
		System.out.println("Opcaoes validas " + contValidas);
	}

}
