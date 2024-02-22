package exercGrupo;

public class ExamesMedicos {
	
	private boolean comprovantePCD;
	private boolean raioXOssos;
	private boolean raioXTorax;
	private boolean hemograma;
	private boolean diagPscicologico;
	
	
	public ExamesMedicos(boolean comprovantePCD, boolean raioXOssos, boolean raioXTorax, boolean hemograma,
			boolean diagPscicologico) {
		
		setComprovantePCD(comprovantePCD);
		setRaioXOssos(raioXOssos);
		setRaioXTorax(raioXTorax);
		setHemograma(hemograma);
		setDiagPscicologico(diagPscicologico);
	
	}


	public boolean isComprovantePCD() {
		return comprovantePCD;
	}


	public void setComprovantePCD(boolean comprovantePCD) {
		this.comprovantePCD = comprovantePCD;
	}


	public boolean isRaioXOssos() {
		return raioXOssos;
	}


	public void setRaioXOssos(boolean raioXOssos) {
		this.raioXOssos = raioXOssos;
	}


	public boolean isRaioXTorax() {
		return raioXTorax;
	}


	public void setRaioXTorax(boolean raioXTorax) {
		this.raioXTorax = raioXTorax;
	}


	public boolean isHemograma() {
		return hemograma;
	}


	public void setHemograma(boolean hemograma) {
		this.hemograma = hemograma;
	}


	public boolean isDiagPscicologico() {
		return diagPscicologico;
	}


	public void setDiagPscicologico(boolean diagPscicologico) {
		this.diagPscicologico = diagPscicologico;
	}
	
	
	
	
}
