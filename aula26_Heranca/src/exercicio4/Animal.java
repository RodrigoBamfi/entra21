package exercicio4;

public abstract class Animal {

	private String especie;
	private boolean estimacao;
	private double peso;
	
	
	public Animal(String especie, boolean estimacao, double peso) {
		
		this.especie = especie;
		this.estimacao = estimacao;
		this.peso = peso;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public boolean isEstimacao() {
		return estimacao;
	}


	public void setEstimacao(boolean estimacao) {
		if(especie != null || !especie.isBlank()) {			
			this.especie = especie;
		}
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		if(peso > 1) {
			this.peso = peso;
		}
	}
	
	// Tudo que está em italico é abstrato
		// Metodo abstrato -> Não tem corpo (;)
		// Ele não tem chaves e encerra com ponto e virgula
		// public abstract Tipo nomeDoMetodo() 
		public abstract String som();
	
}
