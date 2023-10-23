package aula24_Exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Material {

	private String nome;
	private String descricao;
	private double preco;
	private double peso;
	private int estoque;
	public static List<Material> listaMaterial = new ArrayList<>();
	
	public Material(String nome, String descricao, double preco, double peso, int estoque) {
		
		setNome(nome);
		setDescricao(descricao);
		setPreco(preco);
		setPeso(peso);
		setEstoque(estoque);
		listaMaterial.add(this);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		
		if(estoque < 0) {
			throw new IllegalArgumentException("Erro, estoque abaixo de zero");
		}else {
			this.estoque = estoque;
		}
		
		
	}
	
	public void adicionarEstoque(int addQuantidade) {
		setEstoque(getEstoque() + addQuantidade);
	}
	
	public void vendaProduto(int quantidade) {
		
		if(quantidade > estoque) {
			throw new IllegalArgumentException("Erro, estoque abaixo de zero venda");
		}else {
			setEstoque(getEstoque() - quantidade);
			
		}
		
	}
	
	public void promocao(double porcentagem) {
		setPreco(getPreco() - (getPreco() * (porcentagem / 100)));
	}
	
	
	@Override
	
	public String toString() {
		return "O produto mais caro é " + this.nome + " o material mais level é " + this.peso + " o produto mais pesado é ";
	}
	
}
