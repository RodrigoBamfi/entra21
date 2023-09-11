package prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RodrigoBamfi_5 {

	public static void main(String[] args) {
		/*
		 * Uma grande loja de departamentos paga aos vendedores um salário base com base
		 * nas vendas efetuadas durante o mês, que é igual a 30% de comissão sobre o
		 * preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n
		 * produtos, onde para cada produto tem-se o preço unitário e a quantidade
		 * vendida.
		 * 
		 * O departamento de pessoal deseja obter um relatório com: nome, total
		 * de vendas (em R$ e somente duas casas decimais após a vírgula) e salário de
		 * cada vendedor. 
		 * 
		 * Descreva um algoritmo que gere o relatório desejado. Para
		 * prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte
		 * mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)”.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		
		double totalDeVendas = 0;
		
		System.out.println("Informe uma opção");
		char op = sc.next().charAt(0);
		while(op == 's') {
			
			System.out.println("informe seu nome");
			String nome = sc.next();
			
			System.out.println("Deseja informar um produto?");
			char addProduto = sc.next().charAt(0);
			
			while(addProduto == 's') {
				System.out.println("Informe o valor do produto");
				double valor = sc.nextDouble();
				System.out.println("E a quantidade");
				int quantidade = sc.nextInt();
				
				totalDeVendas = totalDeVendas + (valor * quantidade);
				System.out.println("Deseja informar um produto?");
				addProduto = sc.next().charAt(0);
						
			}
			
			double salario = totalDeVendas * 0.30;
			
			System.out.println("Nome: " + nome);
			System.out.println("total de vendas " + totalDeVendas);
			System.out.println("Salario: " + salario);
			
			
			
			
			System.out.println("teste");
			System.out.println("Informe uma opção");
			op = sc.next().charAt(0);
			
			while(op != 's' && op != 'n') {
				System.out.println("Invalido");
				System.out.println("Informe uma opção");
				op = sc.next().charAt(0);
			}
		}
		System.out.println("Programa encerrado");

	}

}
