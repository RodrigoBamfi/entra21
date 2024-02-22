package exercicio1;

public class Circulo {

	private String cor;
	private double raio;
	
	
	public Circulo(String cor, Double raio) {
		super();
		setCor(cor);
		setRaio(raio);
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


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		if(this.raio < 0) {
			throw new IllegalArgumentException("Raio invalido");
		}else {
			this.raio = raio;
		}
	
		
	}
	
	public double calcularArea() {
		return Math.PI * (raio * raio);
	}
	
	@Override
	
	public String toString() {
		return "O valor da area é: " + this.calcularArea();
	}
	
	
}
