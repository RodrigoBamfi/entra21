package aula23_Exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Faça uma classe chamada OnibusEscolar, com os atributos estudantes e
		 * professor
		 * 
		 * Faça uma exceção no método setAlunos que se o número de alunos for maior do
		 * que 40, faça com que o número de alunos seja 40
		 * 
		 * Caso o número de professores for 0, o número de alunos também deve ser zerado
		 * 
		 * Faça também um método chamado remover alunos, que deverá remover os alunos de
		 * acordo com o valor passado como parâmetro
		 */
		
		Scanner sc = new Scanner(System.in);
		
		OnibusEscolar escola = new OnibusEscolar(40, 1);
		
		
		System.out.println("Insira a quantidade de alunos que deseja remover: ");
		int quantidade = sc.nextInt();
		
		escola.removerAlunos(quantidade);
		
		
		System.out.println(escola.getEstudantes());
		

	}

}
