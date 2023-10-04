package aula18_Exercicio2;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Crie uma classe denominada Mercado.
		 * 
		 * Essa classe terá 4 atributos, as informações que deverão ser guardadas são:
		 * Número de maçãs vendidas por ano. Preço de venda das maçãs. Número de
		 * laranjas vendidas por ano. Preço de venda das laranjas.
		 * 
		 * Crie 3 objetos da classe Mercado chamados:
		 * 
		 * unidadeDeBlumenau unidadeDeJoinville unidadeDeFlorianopolis
		 */
		
		
		Mercado unidadeDeBlumenau = new Mercado();
		
		unidadeDeBlumenau.nMacaVenAno = 50;
		unidadeDeBlumenau.precoVenMaca = 1.50;
		unidadeDeBlumenau.nLaranjaVenAno = 80;
		unidadeDeBlumenau.precoVenLaranja = 2.50;
		
		Mercado unidadeDeJoinville = new Mercado();
		
		unidadeDeJoinville.nMacaVenAno = 100;
		unidadeDeJoinville.precoVenMaca = 1.50;
		unidadeDeJoinville.nLaranjaVenAno = 150;
		unidadeDeJoinville.precoVenLaranja = 2.50;
		
		Mercado unidadeDeFlorianopolis = new Mercado();
		
		unidadeDeFlorianopolis.nMacaVenAno = 200;
		unidadeDeFlorianopolis.precoVenMaca = 1.50;
		unidadeDeFlorianopolis.nLaranjaVenAno = 350;
		unidadeDeFlorianopolis.precoVenLaranja = 2.50;
		
		
		
	}
}
