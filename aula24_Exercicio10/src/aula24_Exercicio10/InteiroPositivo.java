package aula24_Exercicio10;

public class InteiroPositivo {
	
	private int x;

	public InteiroPositivo(int x) {
		setX(x);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void setValor() {		
		if(this.getX() < 0) {
			this.setX(1);
		}
	}
	
	public double multiplica() {
		return 
	}
	
}
