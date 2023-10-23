package simulado_prova3;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	private String nome;
	private String categoria;
	private int anoCadastro;
	private double saldo;
	private String gerente;
	public static List<Conta> clientes = new ArrayList<>();

	public Conta(String nome, String categoria, int anoCadastro, double saldo, String gerente) {

		setNome(nome);
		setCategoria(categoria);
		setAnoCadastro(anoCadastro);
		setSaldo(saldo);
		setGerente(gerente);
		clientes.add(this);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Nome invalido");
		}
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		if (categoria != null && !categoria.isBlank()) {
			this.categoria = categoria;
		} else {
			throw new IllegalArgumentException("Categoria invalido");
		}
	}

	public int getAnoCadastro() {
		return anoCadastro;
	}

	public void setAnoCadastro(int anoCadastro) {
		String verifica = String.valueOf(anoCadastro);
		
		if(anoCadastro < 0) {
			throw new IllegalArgumentException("Ano de Cadastro invalido");
		}
		
		if (verifica.length() == 4) {
			this.anoCadastro = anoCadastro;
		} else {
			throw new IllegalArgumentException("Ano de Cadastro invalido");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
			this.saldo = saldo;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		if (gerente != null && !gerente.isBlank()) {
			this.gerente = gerente;
		} else {
			throw new IllegalArgumentException("Gerente invalido");
		}
	}

	public double juroSimples(int anos) {
		return ((this.getSaldo() * 0.01) * (anos * 12));
	}

	public double juroComposto(int anos) {
		double principal = this.getSaldo();
		double taxaAnual = 0.3; // Taxa anual fixa

		for (int i = 0; i < anos; i++) {
			principal = principal + principal * taxaAnual;
		}

		return principal;
	}

	@Override

	public String toString() {
		return "Cliente: " + this.nome + " da categoria " + this.categoria + " cadastro ano de " + this.anoCadastro
				+ " gerente responsavel " + this.gerente;
	}

}
