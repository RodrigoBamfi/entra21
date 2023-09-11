package aula2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome do vendedor");
		String nome = entrada.nextLine();
		System.out.println("Salario fixo");		
		double salarioFixo = entrada.nextDouble();
		System.out.println("Total de vendas");
		double totalVendas = entrada.nextDouble();
		
		//PROCESSO - GANHA 15 DE COMISSÃO SOBRE SUAS VENDAS EFETUADAS
		double comissao = 0.15 * totalVendas;
		
		entrada.close();
		
		//SAIDA
		System.out.println("O funcionario " + nome + " e o salario total é " + comissao + salarioFixo);
		
		
		
	}

}
