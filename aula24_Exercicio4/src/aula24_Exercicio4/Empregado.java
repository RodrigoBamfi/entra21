package aula24_Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Empregado {

	private int identificacao;
	private String nome;
	private String sobrenome;
	private double salario;
	public static List<Empregado> listaEmpregados = new ArrayList<>();
	

	public Empregado(int identificacao, String nome, String sobrenome, double salario) {
		
		setIdentificacao(identificacao);
		setNome(nome);
		setSobrenome(sobrenome);
		setSalario(salario);
		listaEmpregados.add(this);
	}
	
	
	public int getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {		
		this.salario = salario;
	}
	
	
	public double rendaAnual() {
		return this.getSalario() * 12;
	}
	
	public String nomeCompleto() {
		return this.nome + " " + this.sobrenome;
	}
	
	public void aumentoSalario(double porcentagem) {
		setSalario(getSalario() + (getSalario() * (porcentagem / 100)));
	}
	
@Override

public String toString() {	
	return "O funcionario " + this.nomeCompleto() + " anualmente recebe R$" + this.rendaAnual();
}
	
}
