package aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Exercicio 8 ( Uma pessoa foi até uma casa de cambio trocar dolares por reais.
				// Para isto ela entregou um valor em dolares
				// para o atendente. Calcule quantos reais o atendente deve devolver para a
				// pessoa.


				//ENTRADA
				
				DecimalFormat formatar = new DecimalFormat("0.00");
				Scanner entrada = new Scanner(System.in);
				
				double cotacaoDolar = 4.97;
				
				System.out.println("Insira o valor em dolares: ");
				double valorDolar = entrada.nextDouble();
				
				//PROCESSO

				double valorReais = valorDolar * cotacaoDolar;
				
				//SAIDA
				
				System.out.println("A atendente retornou: R$" + formatar.format(valorReais) + " Reais");
			}


	}

