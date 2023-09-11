package aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		//ESCREVA UM PROGRAMA QUE LEIA TRES VALORES COM PONTO FLUTUANTE DE DUPLCA PRECISAO: A, B E C
		//EM SEGUIDA, CALCULE E MOSTRE:
		//A) A AREA DO TRIANGULO RETANGULO QUE TEM A POR BASE E C POR ALTURA
		//B) A AREA DO CIRCULO DE RAIO C. (PI =  3.14159)
		//C) A AREA DO TRAPEZIO QUE TEM A E B POR BASES E C POR ALTURA
		//D) A AREA DO QUADRADO QUE TEM LADO B.
		//E) A AREA DO RETANGULO QUE TEM LADOS A E B
		
		
		//ENTRADA
		Scanner entrada = new Scanner(System.in);
		
		final double pi = 3.14159;
		
		System.out.println("Escreva o valor de A: ");
		float valorA = entrada.nextFloat();
		
		System.out.println("Escreva o valor de B: ");
		float valorB = entrada.nextFloat();
		
		System.out.println("Escreva o valor de C: ");
		float valorC = entrada.nextFloat();

		//PROCESSO
		//SAIDA
		System.out.printf("A area do triangulo é: %.2f%n", valorA * valorC / 2);
		System.out.printf("A area do circulo é: %.2f%n", pi * (valorC * valorC));
		System.out.printf("A area do trapezio é: %.2f%n", ((valorA + valorB) * valorC) / 2);
		System.out.printf("A area do quadrado é: %.2f%n", valorB * valorB);
		System.out.printf("A area do retangulo é: %.2f%n", valorA * valorB);
		
		
	}

}
