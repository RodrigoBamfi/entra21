package aula24_Exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Pizzas {

	private String nome;
	private String ingrediente1;
	private String ingrediente2;
	private String ingrediente3;
	private boolean borda;
	private double diametro;
	private double preco;
	public static List<Pizzas> Cardapio = new ArrayList<>();
	
	
	public Pizzas(String nome, String ingrediente1, String ingrediente2, String ingrediente3, boolean borda,
			double diametro, double preco) {
		
		setNome(nome);
		setIngrediente1(ingrediente1);
		setIngrediente2(ingrediente2);
		setIngrediente3(ingrediente3);
		setBorda(borda);
		setDiametro(diametro);
		setPreco(preco);
		Cardapio.add(this);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIngrediente1() {
		return ingrediente1;
	}


	public void setIngrediente1(String ingrediente1) {
		this.ingrediente1 = ingrediente1;
	}


	public String getIngrediente2() {
		return ingrediente2;
	}


	public void setIngrediente2(String ingrediente2) {
		this.ingrediente2 = ingrediente2;
	}


	public String getIngrediente3() {
		return ingrediente3;
	}


	public void setIngrediente3(String ingrediente3) {
		this.ingrediente3 = ingrediente3;
	}


	public boolean isBorda() {
		return borda;
	}


	public void setBorda(boolean borda) {
		this.borda = borda;
	}


	public double getDiametro() {
		return diametro;
	}


	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public void mudarIngrediente(String ingrediente) {
		
		if(getIngrediente1() == null) {
			setIngrediente1(ingrediente);
		}else if(getIngrediente2() == null) {
			setIngrediente2(ingrediente);
		}else if(getIngrediente3() == null) {
			setIngrediente3(ingrediente);
		}else {
			setIngrediente3(ingrediente);
		}
	}
	
	
	public double barata() {
		return getDiametro() / getPreco();
	}
@Override
	
	public String toString() {
		return "PRIMEIRO INGREDIENTE É: " + this.ingrediente1 + "\nSEGUNDA INGREDIENTE É: " + this.ingrediente2 + "\nTERCEIRO INGREDIENTE É: " + this.ingrediente3;
	}
	
}
