package exercicio6;

public class Notebook extends Computador {
	
	private double peso;

	public Notebook(String modelo, double ram, double armazenamento, double peso) {
		super(modelo, ram, armazenamento);
		// TODO Auto-generated constructor stub
	}


	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	
	// O método rodarAplicacao deve retornar true caso o aplicativo termine em .exe
	@Override
	public boolean rodarAplicacao(String valor) {
		if(valor.toLowerCase().endsWith(".exe")) {
			return true;
		}else {
			return false;
		}

	}
	
	
	//Notebook: O método aumentarRam deve aumentar a quantidade de memória a partir do parâmetro passado no método. 
	 
	public void aumentarRam(double quantidade) {
		this.setRam(getRam() + quantidade);
	}
	
	@Override
	
	public String toString() {
		return super.toString() + "teste2";
	}
	
}
