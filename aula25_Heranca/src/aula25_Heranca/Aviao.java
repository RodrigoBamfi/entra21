package aula25_Heranca;

public class Aviao extends Veiculo {
	
	private int numMotores;
	private int numAsas;
	
	public Aviao(String modelo, double peso, double comprimento, double velMax, int passageiros, int numMotores, int numAsas) {
		super(modelo, peso, comprimento, velMax, passageiros);
		this.numAsas = numAsas;
		this.numMotores = numMotores;
		
				
	}
	
	
	public int getNumMotores() {
		return numMotores;
	}
	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}
	public int getNumAsas() {
		return numAsas;
	}
	public void setNumAsas(int numAsas) {
		this.numAsas = numAsas;
	}
			

	
	
}
