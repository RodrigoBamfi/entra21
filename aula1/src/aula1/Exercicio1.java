package aula1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio1 {

	public static void main(String[] args) {

		// Scanner - Entrada de dados que o usuario coloca
		// Scanner entrada = new Scanner(System.in);

		// System.out.print("Digite sua altura: ");
		// int altura = entrada.nextInt();

		// System.out.println(altura);

		// Exercicio 2 (Calcule a área da circunferencia elevando o valor de raio ao
		// quadrado e multiplicando por pi)

		Scanner entradaRaio = new Scanner(System.in);

		DecimalFormat formatar = new DecimalFormat("0.00");

		final double pi = 3.141592;

		System.out.println("Qual é o raio?");
		double raio = entradaRaio.nextDouble();

		double area = pi * (raio * raio);
		
		entradaRaio.close();

		System.out.println("A área da circunferência é : " + formatar.format(area));

		// Exercicio 3 (Leia dois valores de ponto flutuante e calcule a média ponderada
		// sabendo que a nota A tem peso 3.5 e nota B 6.5)

		double pesoA = 3.5;
		double pesoB = 6.5;

		Scanner entradaNota = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double notaC = entradaNota.nextDouble();

		System.out.println("Digite a segunda nota: ");
		double notaD = entradaNota.nextDouble();

		double notaPesoC = (notaC * pesoA);
		double notaPesoD = (notaD * pesoB);

		double peso = (pesoA + pesoB);

		double media = ((notaPesoC + notaPesoD) / peso);
		// double media = (notaC * 6.5 + notaD * 3.5) / 10;

		entradaNota.close();
		
		System.out.println("A média ponderada é : " + media);

		// Exercicio 5 (Leia quatro valores inteiros A B C D a seguir calcule e mostre a
		// diferença do produto A e B pelo produto C e D)

		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		int valorA = entradaValor.nextInt();

		System.out.println("Digite o valor de B: ");
		int valorB = entradaValor.nextInt();

		System.out.println("Digite o valor de C: ");
		int valorC = entradaValor.nextInt();

		System.out.println("Digite o valor de D: ");
		int valorD = entradaValor.nextInt();

		int diferenca = ((valorA * valorB) - (valorC * valorD));
		
		entradaValor.close();

		System.out.println("A diferença dos valores AB para CD é: " + diferenca);

		// Exercicio 6 (Escreva um programa que leia o número de um funcionário, seu
		// número de horas trabalhadas, o valor que recebe por hora e calcule o salário
		// desse funcionário.
		// A seguir, mostre o número e o salário do funcionário, com duas casas
		// decimais.

		Scanner entradaFuncionario = new Scanner(System.in);

		System.out.println("Digite o número de cadastro do funcionário: ");
		int numeroFuncionario = entradaFuncionario.nextInt();

		System.out.println("Digite as horas trabalhadas: ");
		int horasFuncionario = entradaFuncionario.nextInt();

		System.out.println("Informe o valor hora");
		double valorHoraFuncionario = entradaFuncionario.nextDouble();

		double salario = (horasFuncionario * valorHoraFuncionario);
		
		entradaFuncionario.close();

		System.out.println("O salario do funcionario " + numeroFuncionario + " é " + formatar.format(salario));

		// Exercicio 7 (Faça um programa que leia o nome de um vendedor, o seu salário
		// fixo e o total de vendas efetuadas por ele no mês
		// (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas
		// vendas efetuadas, informar o total a receber
		// no final do mês, com duas casas decimais.
		
		
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
		
		entrada.close();
		
		//SAIDA
		
		System.out.println("O salario final a receber com a comissão para " + nomeVendedor + "é :" + formatar.format(salarioFinal));

		// Exercicio 8 ( Uma pessoa foi até uma casa de cambio trocar dolares por reais.
		// Para isto ela entregou um valor em dolares
		// para o atendente. Calcule quantos reais o atendente deve devolver para a
		// pessoa.

			
	}

}
