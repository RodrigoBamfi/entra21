package aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Descreva um algoritmo que leia 6 valores reais e os coloque em uma Array
		 * List. 
		 * Imprima quais valores desses informados são maiores que a média dos
		 * valores.
		 */
		
		Scanner sc = new Scanner(System.in);

		List<Double> lista = new ArrayList<>();
		
		double valor = 0;
		double soma = 0;
		
		System.out.println("Insira 6 valores: ");
		
		for (int i = 0; i <= 5; i++) {
			valor = sc.nextDouble();
			lista.add(valor);
			soma = soma + valor;
		}
		
		soma = soma / lista.size();
		
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i) > soma) {
				System.out.println(lista.get(i));
			}
			
		}
		
		

		
		System.out.println(lista);
		System.out.println(soma);
	}

}
