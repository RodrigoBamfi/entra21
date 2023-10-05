package aula19;

import java.util.Scanner;

public class Exercicio3 {
	
	public static Double calcPerimetro(Double base, Double altura) {
		
		 double perimetro = (base + altura) * 2;
		 return perimetro;
		
	}
	
	public static Double calcArea(Double base, Double altura) {
		
		double area = base * altura;
		return area;
		
	}

	public static void main(String[] args) {
		/*
		 * Faça um programa que calcule o perímetro e a área de um retângulo.
		 * 
		 * Separem em duas funções, sendo que cada um deve retornar somente o numero(sem mensagem)
		 * 
		 * Retornar os valores calculados
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor da base");
		double base = sc.nextDouble();
		
		System.out.println("Insira o valor da altura");
		double altura = sc.nextDouble();
		
		System.out.println(calcPerimetro(base, altura));
		System.out.println(calcArea(base, altura));
		

	}

}
