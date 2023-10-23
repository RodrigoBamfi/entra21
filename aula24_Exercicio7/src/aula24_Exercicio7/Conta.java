package aula24_Exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	private String nome;
	private double saldo;
	public static List<Conta> cliente = new ArrayList<>();
	
	
	public Conta(String nome, double saldo) {
		
		setNome(nome);
		setSaldo(saldo);
		cliente.add(this);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if(nome != null && !nome.isBlank()) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Proprietario invalido");
		}
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void sacar(double valor) {
		this.setSaldo(getSaldo() - valor);
	}
	
	public void depositar(double valor) {
		this.setSaldo(getSaldo() + valor);
	}
	
	public void transferir(Conta contaDestino, double valor) {
		if(this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			contaDestino.depositar(valor);
			System.out.println("Valor depositado");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		
	}
	
	
	
}
