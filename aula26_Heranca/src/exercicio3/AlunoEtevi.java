package exercicio3;

public class AlunoEtevi extends Aluno {
	
	private int ano;

	public AlunoEtevi(String nome, int idade, int ano) {
		super(nome, idade);
		setAno(ano);
				
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
