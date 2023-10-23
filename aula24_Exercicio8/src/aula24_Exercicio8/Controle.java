package aula24_Exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Controle {

	private double velocidade;
	public static List<Controle> carro = new ArrayList<>();

	public Controle(double velocidade) {

		setVelocidade(velocidade);
		carro.add(this);
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	/*
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

	public void acelerar(double valor) {
		
		if(valor >= 0 && valor <= 20) {
			this.setVelocidade(this.getVelocidade() + valor);
		}else {
			System.out.println("Não foi possivel acelerar");
			this.setVelocidade(this.getVelocidade());
		}
	}

	public void reduzir(double valor) {
		if(valor >= 0 && valor <= 30) {
			this.setVelocidade(this.getVelocidade() - valor);
		}else {
			System.out.println("Não foi possivel reduzir");
			this.setVelocidade(this.getVelocidade());
		}
	}
	
}
