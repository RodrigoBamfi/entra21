package exercicio5;

public class Lancha extends Embarcacao{
	
	private double velMax;

	public Lancha(String id, String modelo, int qtdPessoas, double capacidadeCombustivel, double queimaDeCombustivel,
			int qtdBotesSalvaVidas, double velMax) {
		super(id, modelo, qtdPessoas, capacidadeCombustivel, queimaDeCombustivel, qtdBotesSalvaVidas);
		
		setVelMax(velMax);
		
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}

	
	
	@Override
	public String verificaSeguranca() {
		//caso ela tiver botes
		
		if(this.getQtdBotesSalvaVidas() > 0) {
			return "Botes ok!";
		}else {
			return "Embarcação necessita de mais botes";
		}
		
		

	}

	
	public double tempoViagem(double distancia) {
		double tempo = distancia / this.velMax;
		
		return tempo;
	}
	
	
}
