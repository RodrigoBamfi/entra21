package aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Faça um algoritmo que descubra se uma Array List possui o número que o usuário entrou.
		//Imprima também o seu índice
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(7);
		lista.add(1);
		lista.add(6);
		lista.add(-6);
		lista.add(10);
		lista.add(7000);
		lista.add(4);
		
		System.out.println("Insira o número");
		int numero = sc.nextInt();
		
		int indice = lista.indexOf(numero);
		
		if(indice != -1) {
			System.out.println("Numero " + numero + " foi encontrado no índice " + indice);
		}else {
			System.out.println("Numero " + numero + " não foi encontrado na lista");
		}
		
	}

}
