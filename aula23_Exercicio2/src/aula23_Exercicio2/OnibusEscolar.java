package aula23_Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class OnibusEscolar {
	
	private int estudantes;
	private int professor;
	public static List<OnibusEscolar> escola = new ArrayList<>(); 
	
	
	public OnibusEscolar(int estudantes, int professor) {
		
		setEstudantes(estudantes);
		setProfessor(professor);
		escola.add(this);
	}


	public int getEstudantes() {
		return estudantes;
	}


	public void setEstudantes(int estudantes) {
		if(estudantes < 0) {
			System.out.println("Erro, quantidade de alunos invalida");
		}else if(estudantes > 40) {
			this.estudantes = 40;
		}else {
			this.estudantes = estudantes;
		}
		
	}


	public int getProfessor() {
		return professor;
	}


	public void setProfessor(int professor) {
		if(professor == 0) {
			this.setEstudantes(0);
		}
		
		this.professor = professor;
		
	}
	
	
	public void removerAlunos(int quantidade) {
		
		setEstudantes(this.estudantes - quantidade);
	}
	

}
