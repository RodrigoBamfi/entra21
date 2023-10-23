package prova3;

import java.util.ArrayList;
import java.util.List;

public class Carro {

	private String modelo;
	private String marca;
	private String placa;
	private String cor;
	private int ano;
	private double preco;
	private int local;
	public static List<Carro> listaCarros = new ArrayList<>();
	
	
	public Carro(String modelo, String marca, String placa, String cor, int ano, double preco, int local) {
		
		setModelo(modelo);
		setMarca(marca);
		setPlaca(placa);
		setCor(cor);
		setAno(ano);
		setPreco(preco);
		setLocal(local);
		listaCarros.add(this);
		
		
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		} else {
			throw new IllegalArgumentException("Modelo invalido");
		}
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		} else {
			throw new IllegalArgumentException("Marca invalido");
		}
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		if (placa != null && !placa.isBlank()) {
			this.placa = placa;
		} else {
			throw new IllegalArgumentException("Placa invalido");
		}
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		if (cor != null && !cor.isBlank()) {
			this.cor = cor;
		} else {
			throw new IllegalArgumentException("Cor invalido");
		}
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		String verifica = String.valueOf(ano);
		
		if(ano < 0) {
			throw new IllegalArgumentException("Ano de Cadastro invalido");
		}
		
		if (verifica.length() == 4) {
			this.ano = ano;
		} else {
			throw new IllegalArgumentException("Ano de Cadastro invalido");
		}
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("Preço invalido");
		} 
		
		this.preco = preco;
	}


	public int getLocal() {
		return local;
	}


	public void setLocal(int local) {
		if (local < 0) {
			throw new IllegalArgumentException("Local invalido");
		} 
		this.local = local;
	}
	
	/*Faça também um método para calcular a depreciação do preço de um carro usando o ano de 2023, carros 
		produzidos antes de 2010 tem uma depreciação de 7% ao ano, carros feitos de 2010 em diante tem uma 
		depreciação de 5% ao ano.*/
	
	//Questão D Depreciação
	
	public double depreciacao(int anos) {
		double principal = this.getPreco();
		double txAntes2010 = 0.07; // Taxa anual fixa
		double txDepois2010 = 0.05; // Taxa anual fixa
		
		if(this.getAno() <= 2009) {
			
			for (int i = 0; i < anos; i++) {
				principal = principal - principal * txAntes2010;
			}
		}
		
		if(this.getAno() >= 2010) {
			
			for (int i = 0; i < anos; i++) {
				principal = principal - principal * txDepois2010;
			}
		}

		return principal;
	}
	
	@Override
	
	public String toString() {
		return "Carro : " + this.modelo + " da marca " + this.marca + " de ano " + this.ano
				+ " na cor " + this.cor + " placa " + this.placa + " no valor de " + this.preco + " está localizado no patio número " + this.local;
	}
	
}
