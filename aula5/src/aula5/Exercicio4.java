package aula5;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma
		 * dos números ímpares entre 1 e 1000.
		 */
		
		
		int valorPar = 0;
		int valorImpar = 0; 
		
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0) {
				valorPar = valorPar + i;
			}else {
				valorImpar = valorImpar + i;
			}
		}
		System.out.println(valorPar);
		System.out.println(valorImpar);
}
}	