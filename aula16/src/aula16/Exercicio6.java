package aula16;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void calcRetangulo(double altura, double largura) {
		
		System.out.println("O perimetro do retangulo é: " + (2 * (altura + largura)));
		System.out.println("A área de um retangulo é: " + (largura * altura));
		
	}

	public static void main(String[] args) {
		/*
		 * Faça um programa que calcule o perímetro e a área de um retângulo
		 * 
		 * (Passe a altura e a largura como parâmetros da função)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a altura");
		double altura = sc.nextDouble();
		System.out.println("Informe a largura");
		double largura = sc.nextDouble();
		
		calcRetangulo(altura, largura);
		

	}

}
