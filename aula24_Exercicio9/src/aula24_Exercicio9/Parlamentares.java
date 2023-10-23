package aula24_Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Parlamentares {

	private String nome;
	private String partido;
	private int projetoApresentados;
	private int projetoAprovados;
	public static List<Parlamentares> vereadores = new ArrayList<>();
	
	
	public Parlamentares(String nome, String partido, int projetoApresentados, int projetoAprovados) {
	
		setNome(nome);
		setPartido(partido);
		setProjetoApresentados(projetoApresentados);
		setProjetoAprovados(projetoAprovados);
		vereadores.add(this);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPartido() {
		return partido;
	}


	public void setPartido(String partido) {
		this.partido = partido;
	}


	public double getProjetoApresentados() {
		return projetoApresentados;
	}


	public void setProjetoApresentados(int projetoApresentados) {
		this.projetoApresentados = projetoApresentados;
	}


	public double getProjetoAprovados() {
		return projetoAprovados;
	}


	public void setProjetoAprovados(int projetoAprovados) {
		this.projetoAprovados = projetoAprovados;
	}
	
	
	public double desempenho() {
		if(this.getProjetoApresentados() >= 1 && this.getProjetoApresentados() <= 5) {
			return (this.getProjetoApresentados() / this.getProjetoAprovados()) * 0.80;
		}else if(this.getProjetoApresentados() >= 6 && this.getProjetoApresentados() < 11) {
			return (this.getProjetoApresentados() / this.getProjetoAprovados()) * 1.00;
		}else if(this.getProjetoApresentados() >= 11 && this.getProjetoApresentados() < 17) {
			return (this.getProjetoApresentados() / this.getProjetoAprovados()) * 1.08;
		}else if(this.getProjetoApresentados() >= 17) {
			return (this.getProjetoApresentados() / this.getProjetoAprovados()) * 1.22;
		}else {
			return 0;
		}
		

	}
	
	
	@Override
	public String toString() {
		return "Vereador " + this.nome + " do partido " + this.partido + " teve um desempenho nota: " + this.desempenho();
	}
	
}
