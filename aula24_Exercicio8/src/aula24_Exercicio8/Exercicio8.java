package aula24_Exercicio8;

public class Exercicio8 {

	public static void main(String[] args) {
		/*
		 * Deseja-se criar uma classe para controlar a velocidade do carro.
		 * 
		 * Implemente os métodos: acelerar(double): void, que deve modificar o conteúdo
		 * do atributo velocidade para velocidade + parâmetro recebido (usar
		 * setVelocidade), mas desde que o valor do parâmetro seja maior ou igual a zero
		 * e menor que 20. Senão, imprime a mensagem “Não foi possível acelerar” e
		 * mantém o valor atual do atributo velocidade.
		 * 
		 * reduzir(double): void, que modifica o conteúdo do atributo velocidade para
		 * velocidade - parâmetro recebido (usar setVelocidade), mas desde que o valor
		 * do parâmetro seja maior ou igual a zero e menor que 30. Senão, imprime a
		 * mensagem “Não foi possível reduzir” e mantém o valor atual do atributo
		 * velocidade.
		 */
		
		Controle c1 = new Controle(50);
		
		System.out.println(c1.getVelocidade());
		
		c1.acelerar(10);
		
		System.out.println(c1.getVelocidade());
		
		c1.reduzir(30);
		
		System.out.println(c1.getVelocidade());

	}

}
