package exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Aluno> listaAlunos = new ArrayList<>();
		List<AlunoEtevi> listaEtevi = new ArrayList<>();
		List<AlunoFURB> listaFURB = new ArrayList<>();
		
		listaAlunos.add(new AlunoEtevi("Rodrigo", 28, 2));
		listaFURB.add(new AlunoFURB("Daiane", 30, 'V', "Pscicologa", "Nenhuma"));
		
		System.out.println(listaFURB.get(0).getCurso());
		
		System.out.println("Deseja trancar o curso? ");
		String tranca = sc.nextLine();
		
		listaFURB.get(0).trancarCurso(tranca);
				
		System.out.println(listaFURB.get(0).getCurso());
	}

}
