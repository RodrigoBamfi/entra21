package exercicio8_corrigido;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gerente extends Funcionario{
	
	private String idGerente;

	public Gerente(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario,
			LocalDate dataIngresso, ArrayList<String> habilidades, String idGerente) {
		super(id, endereco, dataNascimento, nome, salario, dataIngresso, habilidades);
		
		setIdGerente(idGerente);
	}

	public void demitirEmpregado(Empregado aSerDemitido) {
		// para eu demir precisa meu id(gerente) seja iguai ao 
		// do gerente do fucionario
		if(this.idGerente.equals(aSerDemitido.getGerente().getIdGerente())) {
			aSerDemitido.setId("DEMITIDO");
		} else {
			throw new IllegalArgumentException("Não é o mesmo gerente!!");
		}
	}

	public String getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(String idGerente) {
		this.idGerente = idGerente;
	}

	@Override
	public String toString() {
		return super.toString() + "Gerente{" + "idGerente='" + idGerente + '\'' + '}';
	}
}

