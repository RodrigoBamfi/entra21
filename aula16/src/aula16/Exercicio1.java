package aula16;

public class Exercicio1 {

	public static void dados() {
		String nome = "Rodrigo";
		int idade = 28;
		String corFav = "Azul Marinho";
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Cor Favorita: " + corFav);
	}
	
	public static void numeros() {
		int valorUm = 10;
		int valorDois = 100;
		
		int soma = 0;
		int multiplicacao = 0;
		
		soma = valorUm + valorDois;
		multiplicacao = valorUm * valorDois;
		
		System.out.println(soma);
		System.out.println(multiplicacao);
		
	}
	
	public static void soma(int valorUm, int valorDois) {
		//int valorUm = 10;
		//int valorDois = 100;
		//int soma = 0;
		
		
		//soma = valorUm + valorDois;
		System.out.println("Soma: " + (valorUm + valorDois));
		
	}
	
	public static void multiplicacao() {
		int valorUm = 10;
		int valorDois = 100;
		
		int multiplicacao = 0;
		
		multiplicacao = valorUm * valorDois;
		System.out.println(multiplicacao);
	}
	
	public static void alturas() {
		double altSamuel = 1.80;
		double altJonathan = 1.87;
		
		double media = ((altSamuel + altJonathan) / 2);
		
		System.out.println("A altura do Samuel é : " + altSamuel);
		System.out.println("A altura do Jonathan é : " + altJonathan);
		System.out.println("A media é : " + media);
	}
	
	public static void metodoComParametro(String nome) {
		System.out.println("Meu nome: " + nome);
	}
	
	public static void metodoComMaisParametros(int idadeUm, int idadeDois, String texto) {
		
		System.out.println("A soma das idades: " + (idadeUm + idadeDois));
		System.out.println("E o texto " + texto);
	}
	
	public static void main(String[] args) {
		/* Crie um metodo para imprimir seu nome, sua idade e cor favorita
		 * 
		 * Crie um metodo com duas variaveis com os valores com os valores 10 e 10, imprima a multiplica e soma
		 * MESMA CLASSE, DOIS METODOS
		 * 
		 * Utilize o metodo numeros(), já criado, quebre o mesmo em dois metodos - soma() e multiplicacao(), sendo que
		 * os nomes das variaveis deve ser igual
		 * 
		 * Crie mais um metodo, utilize o dados de altura de dois amigos e imprima a media e os nomes
		 * 
		 */
		
		//dados();
		//numeros();
		//System.out.println("----------");
		//soma();
		//multiplicacao();
		//alturas();
		
		//String nome = "Rodrigo";
		//metodoComParametro(nome);
		//metodoComParametro("Maria");
		//metodoComMaisParametros(15, 20, "oi");
		
		soma(20, 30);
		
	}

}
