package aula23_Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Retangulo {

	private double altura;
	private double largura;
	public static List<Retangulo> listaRetangulo = new ArrayList<>();
	
	
	public Retangulo(double altura, double largura) {
		setAltura(altura);
		setLargura(largura);
		listaRetangulo.add(this);
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		if(altura <= 0) {
			System.out.println("Erro, Altura invalido");
		}else {
			this.altura = altura;
		}
	}


	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		if(largura <= 0) {
			System.out.println("Erro, Largura invalido");
		}else {
			this.largura = largura;
		}
	}
	
	
	public double calcArea() {
		return this.getAltura() * this.getLargura();
	}
	
	public double calcPerimetro() {
		return (this.getAltura() + this.getLargura() * 2);
	}
	
	@Override
	public String toString() {
		return "Altura é: " + this.altura + " e a Largura é: " + this.largura + ", o calculo da Area é: " + calcArea() + " e o calculo do Perimetro é: " + calcPerimetro();
	}
	
	
}
