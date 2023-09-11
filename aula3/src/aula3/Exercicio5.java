package aula3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Exercicio 5 (FAÇA UM PROGRAMA QUE RECEBE A NOTA DO ALUNO E RETORNA: A MENSAGEM "APROVADO", SE
		// A MÉDIA ALCANÇADA FOR MAIOR OU IGUAL A SETE;
	    // A MENSAGEM "APROVADO COM DISTINÇÃO", SE A MEDIA FOR IGUAL A DEZ;
		//A MENSAGEM "REPROVADO" SE A MÉDIA FOR MENOR DO QUE SETE.
		
		//ENTRADA
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira sua media: ");
		double nota = entrada.nextDouble();
		System.out.println("Insira sua frequencia: ");
		int frequencia = entrada.nextInt();
		
		
		//PROCESSO
		
		if(nota < 7 || frequencia < 75 || nota > 10 || frequencia > 100) {
			System.out.println("Reprovado");
		} else if (nota == 10 && frequencia >= 100) {
			System.out.println("Aprovado com distincao");
		} else if (nota >= 7 && frequencia >= 75){
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		

	}

}
