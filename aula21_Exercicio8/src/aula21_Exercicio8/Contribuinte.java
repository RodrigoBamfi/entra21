package aula21_Exercicio8;

public class Contribuinte {
	
	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;
	
	public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
		setNome (nome);
		setCpf (cpf);
		setUf (uf);
		setRendaAnual  (rendaAnual);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.isBlank() || nome.isEmpty() || nome == null ) {
			System.out.println("Erro, nome invalido");
		}else {
			this.nome = nome;
		}
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	/*Nível de Renda Anual Alíquota 0 a 4.000 0% 4.001 a 9.000 5,8% 9.001 a 25.000
	 * 15% 25.001 a 35.000 27,5% acima de 35.000 30%
	 * 
	 * 
	 * Sendo assim, deve-se calcular o imposto a pagar do seguinte modo: Imposto a
	 * pagar = Renda Anual * Alíquota
	 */
	 
	
	public double valorPagar() {
		if(this.getRendaAnual() <= 4000) {
			return 0;
		}else if(this.getRendaAnual() > 4000 && this.getRendaAnual() < 9000) {
			return this.getRendaAnual() * 0.058;
		}else if(this.getRendaAnual() > 9000 && this.getRendaAnual() < 25000) {
			return this.getRendaAnual() * 0.15;
		}else if(this.getRendaAnual() > 25000 && this.getRendaAnual() < 35000) {
			return this.getRendaAnual() * 0.275;
		}
			return this.getRendaAnual() * 0.3;
			
		}
		
	}
	
