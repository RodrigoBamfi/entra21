package aula17;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void generateStarWarsName(String nome, String sobrenome,String sobrenomeMae, String cidadeNasceu) {
		
		System.out.print(sobrenome.charAt(0));
		System.out.print(sobrenome.charAt(1));
		System.out.print(sobrenome.charAt(2));
		System.out.print(nome.charAt(0));
		System.out.print(nome.charAt(1));
		System.out.print(" ");
		System.out.print(sobrenomeMae.charAt(0));
		System.out.print(sobrenomeMae.charAt(1));
		System.out.print(cidadeNasceu.charAt(0));
		System.out.print(cidadeNasceu.charAt(1));
		System.out.print(cidadeNasceu.charAt(2));
		
	
	}

	public static void main(String[] args) {
		/*
		 * George Lucas utiliza uma fórmula para criar os nomes dos personagens em suas
		 * histórias (Jar Jar Binks, ObiWan Kenobi, etc). A fórmula, supostamente, é:
		 * 
		 * Seu primeiro nome na série Star Wars: 
		 * i.Pegue as três primeiras letras de seu sobrenome
		 * ii.Adicione a ele as duas primeiras letras de seu nome
		 * 
		 * Seu sobrenome na série Star Wars:
		 * i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
		 * ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu
		 * 
		 * 
		 * Crie um método chamado generateStarWarsName que gera um nome completo Star
		 * Wars conforme descrito. Printe o seu nome Star Wars
		 * 
		 * As entradas serão os nomes completos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome = sc.next();
		
		System.out.println("Insira seu sobrenome: ");
		String sobrenome = sc.next();
		
		System.out.println("Insira sobre nome de solteira da sua mãe: ");
		String sobrenomeMae = sc.next();
		
		System.out.println("Insira a cidade que nasceu: ");
		String cidadeNasceu = sc.next();
		
		generateStarWarsName(nome, sobrenome, sobrenomeMae, cidadeNasceu);
		
		
		sc.close();

	}

}
