package aula3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//EXERCICIO 4 (FAÇA UM PROGRAMA QUE VERIFIQUE (USANDO IF E ELSE) SE UMA LETRA DIGITADA É "F" OU "M".
		//CONFORME A LETRA ESCREVER: F - Feminino, M - Masculino, Sexo inválido.
		
		//ENTRADA
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite f para feminio e m para masculino");
		String inf = entrada.next();
		inf = inf.toUpperCase();
		
		// maria = MARIA
		
		
		//PROCESSO
		
		if(inf.equals("F")) {
			System.out.println("feminino");
		} else if(inf.equals("M")) {
			System.out.println("masculino");
		} else {
			System.out.println("invalido");
		}
		
		
		
		if(inf.equalsIgnoreCase("f")) {
			System.out.println("feminino");
		} else if(inf.equalsIgnoreCase("m")) {
			System.out.println("masculino");
		} else {
			System.out.println("invalido");
		}
		
	}

}
