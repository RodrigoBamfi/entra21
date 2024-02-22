package exercicio3;

public class AlunoFURB extends Aluno{

	private char formaIngresso;
	private String curso;
	private String atletica;
	
	public AlunoFURB(String nome, int idade, char formaIngresso, String curso, String atletica) {
		super(nome, idade);
		setFormaIngresso(formaIngresso);
		setCurso(curso);
		setAtletica(atletica);
		
	}

	public char getFormaIngresso() {
		return formaIngresso;
	}

	public void setFormaIngresso(char formaIngresso) {
		this.formaIngresso = formaIngresso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getAtletica() {
		return atletica;
	}

	public void setAtletica(String atletica) {
		this.atletica = atletica;
	}

	
	public void trancarCurso(String trancarCurso) {
		if(trancarCurso.equals("sim")) {
			this.setCurso(null);
		
	}
	
	
	}
}
