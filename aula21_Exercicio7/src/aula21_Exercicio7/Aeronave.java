package aula21_Exercicio7;

public class Aeronave {

	private int passageiros;
	private double velMaxima;
	private double combustivelMaximo;
	private double combustivelMinuto;
	
	public Aeronave(int passageiros, double velMaxima, double combustivelMaximo, double combustivelMinuto) {
		setPassageiros (passageiros);
		setVelMaxima (velMaxima);
		setCombustivelMaximo (combustivelMaximo);
		setCombustivelMinuto (combustivelMinuto);
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public double getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(double velMaxima) {
		this.velMaxima = velMaxima;
	}

	public double getCombustivelMaximo() {
		return combustivelMaximo;
	}

	public void setCombustivelMaximo(double combustivelMaximo) {
		this.combustivelMaximo = combustivelMaximo;
	}

	public double getCombustivelMinuto() {
		return combustivelMinuto;
	}

	public void setCombustivelMinuto(double combustivelMinuto) {
		this.combustivelMinuto = combustivelMinuto;
	}
	
	
	public double tempoAr() {
		return combustivelMaximo / combustivelMinuto;
	}
	
	
	
	
	
}
