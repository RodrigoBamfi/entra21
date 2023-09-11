package aula9;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int soma = 0; 
		double media = 0;
		
		int[] idades = new int[4];
		
		idades[0] = 18;
		idades[1] = 24;
		idades[2] = 28;
		idades[3] = 33;
		
		soma = idades[0] + idades[1] + idades[2] + idades[3];
		media = soma / 4;
		
		
		System.out.println(soma);
		System.out.println(media);
		System.out.println(idades[3]);
		System.out.println("");
		
		for(int i = 0; i < 4; i++) {
			System.out.println(idades[i]);
		}
		
		//criar vetor de String
		
		String[] alunos = new String[21];
		for(int i = 0; i < 21; i++) {
			System.out.println("Informe o nome");
			alunos[i] = sc.next();
		}
		
		for(int i = 0; i < 21; i++) {
			System.out.println(alunos[i]);
		}
		
		

	}
	

}
