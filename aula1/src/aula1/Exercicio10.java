package aula1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		//EXERCICIO 10 (DOIS CARROS (X E Y) PARTEM EM UMA MESMA DIREÇÃO.
		//O CARRO X SAI COM VELOCIDADE CONSTANTE DE 60KM/H E O CARRO Y SAI COM VELOCIDADE CONSTANTE DE 90KM/H
		//EM UMA HORA O CARRO Y CONSEGUE SE DISTANCIAR 30 QUILOMETROS DO CARRO X, OU SEJA, CONSEGUE SE AFASTAR UM
		// QUILOMETRO A CADA 2 MINUTOS.
		//LEIA A DISTANCIA (EM KM) E CALCULE QUANTO TEMPO LEVA (EM MINUTOS) PARA O CARRO Y TOMAR ESSA DISTANCIA DO OUTRO CARRO.

		Scanner entrada = new Scanner(System.in);
		
		
		//ENTRADA
		
		final int carroX = 60;
		final int carroY = 90;
		
		System.out.println("Qual a distancia em KM?");
		int km = entrada.nextInt();
		
		//PROCESSO
		
		int minutos = km * 120 / 60;
		
		//SAIDA
		System.out.println("Leva " + minutos + " minutos para o carro Y tomar distancia do outro carro X");
		
		
	}

}
