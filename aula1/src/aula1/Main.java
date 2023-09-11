package aula1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		int idade = sc.nextInt();
		
		System.out.println("Hello World " + nome);
		
		sc.close();
		
	}

}
