package prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RodrigoBamfi_1 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa onde o usuário informa um valor e a opção desejada do que
		 * deve ser feito com o valor, sendo as opções
		 * 1-converter de dólar para real e
		 * 2-converter de real para dólar,
		 *  qualquer outra opção é considerada entrada
		 * inválida.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		System.out.println("Informe um valor: ");
		double valor = sc.nextDouble();
		
		double total = 0;
		
		System.out.println("Informe a opcao desejada, 1: Dolar para Real, 2:Real para Dolar");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			total = valor * 4.97;
			System.out.println("O total de dolar para reais é: " + formatar.format(total));
			break;
		case 2:
			total = valor / 4.97;
			System.out.println("O total de reais para dolar é: " + formatar.format(total));
			break;
		default:
			System.out.println("Entrada invalida");
			break;
		}
		sc.close();
	}

}
