package aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu

		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			lista.add(i);
		}
		
		System.out.println(lista);
		
		System.out.println("Insira o número do indice que deseja: ");
		int indice = sc.nextInt();
		
		lista.set(indice, 0);

		System.out.println(lista);
		
	}

}
