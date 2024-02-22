package aula25_Heranca;

public class Bicicleta extends Veiculo{

	private boolean freio;
	
	public Bicicleta(String modelo, double peso, double comprimento, double velMax, int passageiros, boolean freio) {
		super(modelo, peso, comprimento, velMax, passageiros);
		this.freio = freio;
	}


	public boolean isFreio() {
		return freio;
	}

	public void setFreio(boolean freio) {
		this.freio = freio;
	}
	
	
}
