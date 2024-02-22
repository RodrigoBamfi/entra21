package exercicio5;

public abstract class Embarcacao {

	private String id;
	private	String modelo;
	private	int qtdPessoas;
	private double capacidadeCombustivel;
	private double queimaDeCombustivel;
	private int qtdBotesSalvaVidas;
	
	public Embarcacao(String id, String modelo, int qtdPessoas, double capacidadeCombustivel,
			double queimaDeCombustivel, int qtdBotesSalvaVidas) {
		super();
		
		setId(id);
		setModelo(modelo);
		setQtdPessoas(qtdPessoas);
		setCapacidadeCombustivel(capacidadeCombustivel);
		setQueimaDeCombustivel(queimaDeCombustivel);
		setQtdBotesSalvaVidas(qtdBotesSalvaVidas);
	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	public double getQueimaDeCombustivel() {
		return queimaDeCombustivel;
	}
	public void setQueimaDeCombustivel(double queimaDeCombustivel) {
		this.queimaDeCombustivel = queimaDeCombustivel;
	}
	public int getQtdBotesSalvaVidas() {
		return qtdBotesSalvaVidas;
	}
	public void setQtdBotesSalvaVidas(int qtdBotesSalvaVidas) {
		this.qtdBotesSalvaVidas = qtdBotesSalvaVidas;
	}
	
	
	public boolean planejarViagem(double distancia) {

		double total = this.getCapacidadeCombustivel() * this.getQueimaDeCombustivel();
		
		if(distancia <= total) {
			return true;
		}else {
			return false;	
		}
		
	}
	
	public abstract String verificaSeguranca();
	
	
}
