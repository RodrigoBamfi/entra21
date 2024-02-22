package exercGrupo;

import java.time.LocalDate;

public abstract class AlistamentoMilitar {

	private String nomeCompleto;
	private long cpf;
	private	String comprovanteResidencia;
	private LocalDate dataNascimento;
	
	
	public AlistamentoMilitar(String nomeCompleto, long cpf, String comprovanteResidencia, LocalDate dataNascimento) {
		
		setNomeCompleto(nomeCompleto);
		setCpf(cpf);
		setComprovanteResidencia(comprovanteResidencia);
		setDataNascimento(dataNascimento);
		
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		if (nomeCompleto == null || nomeCompleto.isBlank()) {
			throw new IllegalArgumentException("Nome Invalido");
		}
		this.nomeCompleto = nomeCompleto;
	}


	public double getCpf() {
		return cpf;
	}


	public void setCpf(long cpf) {
		if (cpf < 0) {
			throw new IllegalArgumentException("CPF invalido");
		}
		this.cpf = cpf;
	}

	public String getComprovanteResidencia() {
		return comprovanteResidencia;
	}


	public void setComprovanteResidencia(String comprovanteResidencia) {
		if (comprovanteResidencia == null || comprovanteResidencia.isBlank() || !comprovanteResidencia.equalsIgnoreCase("sim") && !comprovanteResidencia.equalsIgnoreCase("nao")) {
			throw new IllegalArgumentException("Comprovante Invalido");
		}
		this.comprovanteResidencia = comprovanteResidencia;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public abstract boolean verifDoc(String nomeCompleto, double cpf, String comprovanteResidencia);
	
	public int verifIdade() { 

		LocalDate hoje = LocalDate.now();
		return hoje.compareTo(this.dataNascimento);
		
	}
	
	public boolean voluntario(String valor) {  
		if(valor.equalsIgnoreCase("sim")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
		@Override
		public String toString() {
			
			
			return "O Conscrito "+nomeCompleto+" de CPF número "+cpf+" com data de nascimento em "+dataNascimento;
	}
	
}


	
	
	