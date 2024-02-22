package exercicio5;

public class Transatlantico extends Embarcacao {

	private int anoBatismo;
	private int capacidadeBoteSalvaVidas;
	
	public Transatlantico(String id, String modelo, int qtdPessoas, double capacidadeCombustivel,
			double queimaDeCombustivel, int qtdBotesSalvaVidas, int anoBatismo, int capacidadeBoteSalvaVidas) {
		super(id, modelo, qtdPessoas, capacidadeCombustivel, queimaDeCombustivel, qtdBotesSalvaVidas);
		
		setAnoBatismo(anoBatismo);
		setCapacidadeBoteSalvaVidas(capacidadeBoteSalvaVidas);
		
	}

	public int getAnoBatismo() {
		return anoBatismo;
	}

	public void setAnoBatismo(int anoBatismo) {
		this.anoBatismo = anoBatismo;
	}

	public int getCapacidadeBoteSalvaVidas() {
		return capacidadeBoteSalvaVidas;
	}

	public void setCapacidadeBoteSalvaVidas(int capacidadeBoteSalvaVidas) {
		this.capacidadeBoteSalvaVidas = capacidadeBoteSalvaVidas;
	}

	@Override
	public String verificaSeguranca() {
		//caso ela tiver botes
		
		int qntLugares = this.capacidadeBoteSalvaVidas * getQtdBotesSalvaVidas();
		
		if(qntLugares >= getQtdPessoas()) {
			return "Botes ok!";
		}else {
			return "Embarcação necessita de mais botes";
		}
		
		
	}
	
	public void adicionaBotes(int quantidade) {
		
		int novaQuantidade = getQtdBotesSalvaVidas() + quantidade;
		setQtdBotesSalvaVidas(novaQuantidade);
		
	}

	
	
}
