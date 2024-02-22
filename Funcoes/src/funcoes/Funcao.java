package funcoes;

public class Funcao {
	// Fórmula: p. s. tipo nome() {}
	public static String imprimirNome() {
		// dentro do nosso escopo, a gente passa a ter o return
		// sempre criem uma variavel
		
		String nome = "Maju";
		return nome;
	}
	
	public static double soma(double numUm, double numDois) {
		
		// fiz o processo, ou melhor, a função
		double soma = numUm + numDois;
		
		return soma;
	}

	
	
	// metodo main por ultimo
	public static void main(String[] args) {
		System.out.println(imprimirNome());

		System.out.println(soma(10.5, 25.5));
		
	}

}
