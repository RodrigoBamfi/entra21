package aula3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//EXERCICIO 3 (FAÇA UM PROGRAMA QUE PERGUNTE EM QUE TURNO VOCE ESTUDA, PEÇA PARA DIGITAR
		//M-MATUTINO OU V-VESPERTINO OU N-NOTURNO.
		//IMPRIMA A MENSAGEM "BOM DIA", "BOA TARDE", "BOA NOITE" OU "VALOR INVALIDO", CONFORME O CASO
		
		//ENTRADA
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Em qual turno voce estuda?");
		System.out.println("Digite M para Matutino, V para Vespertino ou N para Noturno");
		String turno = entrada.next();
		
		
		if(turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia");
		} else if(turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde");
		} else if(turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Valor invalido");
		}
		
	}

}
