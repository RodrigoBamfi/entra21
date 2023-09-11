package aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		// Exercicio 7 (Faça um programa que leia o nome de um vendedor, o seu salário
				// fixo e o total de vendas efetuadas por ele no mês
				// (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas
				// vendas efetuadas, informar o total a receber
				// no final do mês, com duas casas decimais.
				

				DecimalFormat formatar = new DecimalFormat("0.00");
				
				//ENTRADA
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Insira o nome do vendedor: ");
				String nomeVendedor = entrada.next();
				
				System.out.println("Insira o valor do seu salario fixo: ");
				double salarioFixo = entrada.nextDouble();
				
				System.out.println("Insira o total de vendas no mês em dinheiro: ");
				double vendasMes = entrada.nextDouble();
				
				//PROCESSO
				
				double salarioComissao = vendasMes + (vendasMes * (15.0 / 100.0));
				double salarioFinal = salarioFixo + salarioComissao;
				
				//SAIDA
				
				System.out.println("O salario final a receber com a comissão é : " + formatar.format(salarioFinal));

			}

	}

