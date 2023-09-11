package aula9;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		double[] notas = new double[3];
		
		System.out.println("Informe sua nota");
		
		for(int i = 0; i < 3; i++) {
			notas[i] = sc.nextDouble();
			
			soma = soma + notas[i];
			
		}
		
		System.out.println(soma / 3);
		
		
	}

}
