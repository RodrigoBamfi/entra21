package exercicio6;

public abstract class Computador {

	private String modelo;
	private double ram;
	private double armazenamento;

	public Computador(String modelo, double ram, double armazenamento) {
		
		setModelo(modelo);
		setRam(ram);
		setArmazenamento(armazenamento);

	}
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	public double getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(double armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	
	
	//Computador: O método ligarOuDesligar deve retornar "Ligando" caso o parâmetro for true e
	 //"Desligando" caso seja false.
	
	public String ligarOuDesligar(boolean estado) {
		if(estado == true) {
			return "Ligando";
		}else {
			return "Desligando";
		}
		
	}
	
	public abstract boolean rodarAplicacao(String valor);
	
	
	@Override
	
	public String toString() {
		return "teste";
	}
	
}
