package exercicio4;

public class Cachorro extends Animal {

	private String raca;

	public Cachorro(String especie, boolean estimacao, double peso,
			String raca) {
		super(especie, estimacao, peso);
		setRaca(raca);
		
	}

	@Override
	public String som() {
		return "auau";
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		if(raca != null || !raca.isBlank()) {
			this.raca = raca;			
		}
	}
	
}
