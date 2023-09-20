//PADRÃO DE CRIAÇÃO DE ARQUIVO - JAVA
// 1- PACKAGE
package aula15;

// 2- CLASSE (NOME DO ARQUIVO)
public class Metodo {
	// 3- SEMPRE CRIAR OS NOSSOS METODOS APOS A CLASSE
	public static void mediaNumeros() {
		int numero = 100;
		int numeroDois = 10;
	
		
		int soma = (numero + numeroDois) / 2;
		
		System.out.println(soma);
	}
	
	// 4- CRIA O METODO MAIN 
	public static void main(String[] args) {
		
		//PARA CHAMAR UM METODO: VOU ESCREVER O NOME DELE, SEM ESQUECER DOS PARENTESES()
		mediaNumeros();
		
		
	}

	
	
	
}
