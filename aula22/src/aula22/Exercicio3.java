package aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Crie uma Array List
		 * O usuário vai colocando valores decimais até ele colocar o número 0.
		 * Calcular:
		 * a) Qual o menor número
		 * b) Qual o maior número
		 * c) Calcular a média
		 */

		Scanner sc = new Scanner(System.in);
		
		double menorValor = Double.MAX_VALUE;
		double maiorValor = Double.MIN_VALUE;
		double soma = 0;

		List<Double> lista = new ArrayList<>();
		
		System.out.println("Insira numeros decimais: ");
		double valor = sc.nextDouble();

		while(valor != 0) {
			lista.add(valor);
			
			System.out.println("Insira numeros decimais: ");
			valor = sc.nextDouble();
		 }
		
		for (int i = 0; i < lista.size() ; i++) {
			soma += lista.get(i);
			
			if(lista.get(i) < menorValor) {
				menorValor = lista.get(i);
			}
			
			if(lista.get(i) > maiorValor) {
				maiorValor = lista.get(i);
			}
		}
		
		

		System.out.println(lista);
		System.out.println("menor valor é: " + menorValor);
		System.out.println("maior valor é: " + maiorValor);
		System.out.println("media dos valores é: " + soma / lista.size());
		
		lista.remove(0);
		
		System.out.println(lista);

	}

}
