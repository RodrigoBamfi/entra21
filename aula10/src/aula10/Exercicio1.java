package aula10;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Crie uma array de 5 elementos e descubra:
		 * 
		 * a) Qual o maior elemento
		 * 
		 * b) Qual o menor elemento
		 * 
		 * c) A média dos elementos
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double[] valores = new double[5];
		double valorMaximo = Double.MIN_VALUE;
		double valorMinimo = Double.MAX_VALUE;
		double media = 0;
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Insira um valor");
			valores[i] = sc.nextDouble();
			
			media = media + valores[i];
			
			if (valores[i] > valorMaximo) {
				valorMaximo = valores[i];
			}
			
			if (valores[i] < valorMinimo) {
				valorMinimo = valores[i];
			}
		}
		
		System.out.println("A media é: " + (media / valores.length));
		System.out.println("Valor minimo: " + valorMinimo);
		System.out.println("Valor maximo: " + valorMaximo);
		
	}

}
