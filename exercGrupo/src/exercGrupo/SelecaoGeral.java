package exercGrupo;

import java.time.LocalDate;

public class SelecaoGeral extends AlistamentoMilitar{
	
	private ExamesMedicos comprovanteDefic;
	private double peso;
	private double altura;

	public SelecaoGeral(String nomeCompleto, long cpf, String comprovanteResidencia, LocalDate dataNascimento,
			ExamesMedicos comprovanteDefic, double peso, double altura) {
		
		super(nomeCompleto, cpf, comprovanteResidencia, dataNascimento);
	
		setComprovanteDefic(comprovanteDefic);
		setPeso(peso);
		setAltura(altura);
		
	}

	public ExamesMedicos getComprovanteDefic() {
		return comprovanteDefic;
	}

	public void setComprovanteDefic(ExamesMedicos comprovanteDefic) {
		this.comprovanteDefic = comprovanteDefic;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso < 0) {
			throw new IllegalArgumentException("Peso invalido");
		}
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura < 0 || altura > 3 ) {//altura de 3 metros é a maior registrada até o momento.
			throw new IllegalArgumentException("Altura invalida");
		}
		this.altura = altura;
	}

	@Override
	public boolean verifDoc(String nomeCompleto, double cpf, String comprovanteResidencia) {
		
		if(getNomeCompleto().equalsIgnoreCase(nomeCompleto) && getCpf() == cpf && getComprovanteResidencia().equalsIgnoreCase("sim")) {
			
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean verifExameMedico() {
		if(comprovanteDefic.isComprovantePCD() == true ||comprovanteDefic.isDiagPscicologico() == true ||
				comprovanteDefic.isHemograma() == true || comprovanteDefic.isRaioXOssos() || comprovanteDefic.isRaioXTorax() == true) {
				return true;
			}else {
				return false;
			}
		
	}

	public boolean testeFisico(double peso, double altura) {
		double imc = peso / (altura * altura);
		
		if(imc < 18.5 || imc > 35.0) {
			return false;
		}
		return true;
	}


}
