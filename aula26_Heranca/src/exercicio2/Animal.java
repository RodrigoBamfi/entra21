package exercicio2;

public abstract class Animal {

	private String raca;
	private String nomeID;
	private String porte;
	private String habitat;
	private String paisOrigem;
	
	
	public Animal(String raca, String nomeID, String porte, String habitat, String paisOrigem) {
		
		setRaca(raca);
		setNomeID(nomeID);
		setPorte(porte);
		setHabitat(habitat);
		setPaisOrigem(paisOrigem);
		
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		if (raca != null && !raca.isBlank()) {
			this.raca = raca;
		} else {
			throw new IllegalArgumentException("Raça invalida");
		}
	}


	public String getNomeID() {
		return nomeID;
	}


	public void setNomeID(String nomeID) {
		this.nomeID = nomeID;
	}


	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getPaisOrigem() {
		return paisOrigem;
	}


	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	
	@Override
	
	public String toString() {
		return "Raça : " + this.raca + " | Nome de Indenfiticação: " + this.nomeID + " | Porte: " + this.porte + " | Habitat: " + this.habitat + " | País de Origem: " + this.paisOrigem;
	}
	
	
}
