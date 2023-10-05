package aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler os valores de duas Array Lists.
		 * Crie uma terceira Array List em que cada elemento é a soma dos valores contidos nas posições
		 * respectivas das Array Lists originais.
		 * Por exemplo,
		 * Array List1 = [1,2,3]
		 * Array List2 = [1,5,6]
		 * Array List3 = [2,7,9].
		 * Exiba, ao final, as três Array Lists na tela.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> lista1 = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		List<Integer> lista3 = new ArrayList<>();
		
		System.out.println("Insira 3 numeros: ");
		
		
		for (int i = 0; i < 3; i++) {
			int valor1 = sc.nextInt();
			lista1.add(valor1);
		}
		
		System.out.println("Insira mais 3 numeros: ");
		
		
		for (int i = 0; i < 3; i++) {
			int valor2 = sc.nextInt();
			lista2.add(valor2);
		}
		
		for (int i = 0; i < 3; i++) {
			int valor3 = lista1.get(i) + lista2.get(i);
			lista3.add(valor3);
		}
		
		System.out.println(lista1);
		System.out.println(lista2);
		System.out.println(lista3);

	}

}
