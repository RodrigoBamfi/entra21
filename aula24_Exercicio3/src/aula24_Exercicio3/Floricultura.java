package aula24_Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Floricultura {
	private String nomeFlor;
	private double preco;
	private String nomeCliente;
	private boolean presente;
	public static List<Floricultura> estabelecimento = new ArrayList<>();
	
	
	
	public Floricultura(String nomeFlor, double preco, String nomeCliente, boolean presente) {
		setNomeFlor(nomeFlor);
		setPreco(preco);
		setNomeCliente(nomeCliente);
		setPresente(presente);
		estabelecimento.add(this);
		
	}



	public String getNomeFlor() {
		return nomeFlor;
	}



	public void setNomeFlor(String nomeFlor) {
		this.nomeFlor = nomeFlor;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public boolean isPresente() {
		return presente;
	}



	public void setPresente(boolean presente) {
		this.presente = presente;
	}

@Override
public String toString() {
	return "Quem comprou a flor mais cara foi: " + this.nomeCliente + ", no valor de R$" + this.preco + " a flor é " + this.nomeFlor;
}
	
}
