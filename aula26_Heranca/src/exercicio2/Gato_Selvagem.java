package exercicio2;

public class Gato_Selvagem extends Animal {

	private String corPelagem;
	private String tiposManchas;
	
	public Gato_Selvagem(String raca, String nomeID, String porte, String habitat, String paisOrigem, String corPelagem, String tiposManchas) {
		super(raca, nomeID, porte, habitat, paisOrigem);
		
		setCorPelagem(corPelagem);
		setTiposManchas(tiposManchas);
		
	}

	public String getCorPelagem() {
		return corPelagem;
	}

	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}
	
	public String getTiposManchas() {
		return tiposManchas;
	}

	public void setTiposManchas(String tiposManchas) {
		this.tiposManchas = tiposManchas;
	}

	@Override
	
	public String toString() {
		return super.toString() + " | Cor da Pelagem: " + this.corPelagem + " | Tipos de Manchas: " + this.tiposManchas;
	}
	
}
