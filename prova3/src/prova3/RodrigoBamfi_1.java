package prova3;

import java.util.Scanner;

public class RodrigoBamfi_1 {

	public static void main(String[] args) {
		
		/*Implemente um programa para auxiliar a revendedora QUERYCAR a localizar em seu pátio os 
		carros com características desejadas pelo comprador. No pátio da revendedora existem N carros. Onde, cada 
		qual está em um local específico (identificado por um número). 
		Para testar a classe Carro a partir da classe principal, pede-se o armazenamento do seguinte conjunto de carros. 
		Cada carro possui as informações abaixo:
		
		Ao final, a)você deve imprimir na tela as informações do carro mais caro de um dado ano;
		b)imprimir as informações de todos os carros de uma dada marca com preço entre X e Y;
		c)imprimir as informações do carro mais caro e mais barato de um determinado local da revendedora.
		
		 
		Faça também um método para calcular a depreciação do preço de um carro usando o ano de 2023, carros 
		produzidos antes de 2010 tem uma depreciação de 7% ao ano, carros feitos de 2010 em diante tem uma 
		depreciação de 5% ao ano. 
		*
		*/
		
		Scanner sc = new Scanner(System.in);
		
		double maisCaro = Double.MIN_VALUE;
		double maisBarato = Double.MAX_VALUE;
		
		Carro c1 = new Carro("Gol", "VW", "MMM001", "Preta", 2009, 25000, 1);
		Carro c2 = new Carro("Fox", "VW", "LML002", "Vermelha", 2010, 30000, 2);
		Carro c3 = new Carro("Uno", "Fiat", "MLM003", "Cinza", 2011, 32000, 3);
		Carro c4 = new Carro("Fiesta", "Ford", "LLL004", "Branca", 2009, 29000, 1);
		Carro c5 = new Carro("Palio", "Fiat", "KKK345", "Amarelo", 2011, 26000, 1);
		Carro cMC = null;
		Carro cMB = null;
		
		System.out.println("Qual ano deseja pesquisar o carro mais caro? ");
		int ano = sc.nextInt();
		
		
		//Questão A
		for (Carro c : Carro.listaCarros) {
			if(c.getAno() == ano) {
				if(c.getPreco() > maisCaro) {
					maisCaro = c.getPreco();
					cMC = c;
					
				}
			}
		}
		
		
		System.out.println(cMC.toString());
		
		System.out.println("----------------------------------------------");
		
		//Questão B
		System.out.println("Qual marca deseja pesquisa? ");
		String marca = sc.next();
		
		System.out.println("Qual valor inicial? ");
		double vInicial = sc.nextDouble();
		System.out.println("Qual valor final? ");
		double vFinal = sc.nextDouble();
		
		for (Carro c : Carro.listaCarros) {
			if(c.getMarca().equals(marca)) {
				if(c.getPreco() >= vInicial && c.getPreco() <= vFinal) {
					System.out.println(c.toString());				
				}
			}		
			
		}
		
		
		System.out.println("----------------------------------------------");
		
		//Questão C
		System.out.println("Qual número do patio deseja pesquisar? ");
		int local = sc.nextInt();
		
		for (Carro c : Carro.listaCarros) {
			if(c.getLocal() == local) {
				if(c.getPreco() > maisCaro) {
					maisCaro = c.getPreco();
					cMC = c;
					
				}
				
				if(c.getPreco() < maisBarato) {
					maisBarato = c.getPreco();
					cMB = c;
				}
			}
		}
		
		System.out.println("O carro mais caro do patio de número " + local + "  " + cMC.toString());
		System.out.println("O carro mais barato do patio de número " + local + "  " + cMB.toString());
		
		System.out.println("----------------------------------------------");
		
		
		//Questão D Depreciação
		System.out.println("Depreciação dos carros");
		System.out.println("Insira quantos anos deseja verificar  ");
		int anos = sc.nextInt();
		
		for (Carro c : Carro.listaCarros) {
				
				System.out.println("O carro de ano " + c.getModelo() + " no valor de " + c.getPreco() + " terá um depreciação de " + c.depreciacao(anos) + " em " + anos + " anos");
		
		}
		
			
	}
	
}
