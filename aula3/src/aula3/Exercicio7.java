package aula3;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Para doar sangue é necessário ter entre 18 e 67 anos. Faça um
				// aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar
				// sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).
				
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Insira sua idade: ");
				int idade = entrada.nextInt();
				
				
				if(idade <= 17 || idade >= 68) {
					System.out.println("Não pode doar sangue");
				}else {
					System.out.println("Pode doar sangue");
				}
				
				entrada.close();

	}

}
