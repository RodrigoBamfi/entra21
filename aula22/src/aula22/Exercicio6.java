package aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Faça um algoritmo em que o usuário insere um número em um índice específico que ele mesmo informou
		
		Scanner sc = new Scanner(System.in);
		
		
		List<Double> lista = new ArrayList<>();
		
		for (double i = 0; i < 5; i++) {
			lista.add(i);
		}
		
		System.out.println("Insira o indice: ");
		int indice = sc.nextInt();
		
		System.out.println("Insira o número: ");
		double valor = sc.nextDouble();
		
		lista.set(indice, valor);
		
		System.out.println(lista);

	}

}
