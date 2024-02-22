package aula25_Heranca;

public class Veiculo {

	private String modelo;
	private double peso;
	private double comprimento;
	private double velMax;
	private int passageiros;
	
	
	public Veiculo(String modelo, double peso, double comprimento, double velMax, int passageiros) {
		super();
		this.modelo = modelo;
		this.peso = peso;
		this.comprimento = comprimento;
		this.velMax = velMax;
		this.passageiros = passageiros;
	}

	
	public String verificaLimite(int quantidadeDePassageiro) {
		if(quantidadeDePassageiro > passageiros) {
			return "Passou do limite";
		}else {
			return "Não passou do limite";
		}
	}
	
	

	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getComprimento() {
		return comprimento;
	}


	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}


	public double getVelMax() {
		return velMax;
	}


	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}


	public int getPassageiros() {
		return passageiros;
	}


	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	
	
	
	
}
