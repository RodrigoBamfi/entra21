package exercicio1;

public class Cilindro extends Circulo{
	
	private double altura;

	public Cilindro(String cor, double raio, double altura) {
		super(cor, raio);
		
		setAltura(altura);
		
	}

		
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularVolume() {
		return this.calcularArea() * altura;
	}
	
	@Override
	
	public String toString() {
		return super.toString() + "o valor do cilindro é " + this.calcularVolume();
	}
	
}
