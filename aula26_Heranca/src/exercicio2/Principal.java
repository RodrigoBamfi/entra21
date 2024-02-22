package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* 
		 * Você foi convidado para fazer um sistema que facilite a catalogação dos animais do zoológico.
		 * 
		 * Inicialmente, o sistema será testado com somente 3 tipos de animais, sendo eles: gatos selvagens, aves e primatas.
		 * 
		 * Todos os animais, independentemente de seu tipo, possuem: raça, nome de identificação, porte (pequeno, médio e grande),
		 * habitat e país de origem.
		 * 
		 * Os gatos selvagens possuem ainda a característica cor da pelagem, que pode ser: pardo ou preto e tipos de manchas,
		 * que pode ser: ausente de manchas, pintado, listrado.
		 * 
		 * As aves possuem cor das penas, sendo que fica registrado a cor predominante e tipo de alimentação.
		 * 
		 * Já os primatas, não possuem informações extras.
		 * 
		 * Permita que o zoológico catalogue esses animais, indicando o que se pede.
		 */

		Scanner sc = new Scanner(System.in);
		
		List<Gato_Selvagem> listaGato = new ArrayList<>();
		List<Aves> listaAve = new ArrayList<>();
		List<Primatas> listaPrimata = new ArrayList<>();
		
		System.out.println("Gostaria de catalogar: Gatos Selvagens, Aves ou Primatas?");
		String tipo = sc.nextLine();
		
		
		if(tipo.equalsIgnoreCase("Gatos Selvagens")) {
			
			System.out.println("Insira a raça, nome de indentificação, porte, habitat, país de origem, cor da pelagem, tipos de manchas : ");
			String racaGS = sc.nextLine();
			String nomeIDGS = sc.nextLine();
			String porteGS = sc.nextLine();
			String habitatGS = sc.nextLine();
			String paisOrigemGS = sc.nextLine();
			String corPelagem = sc.nextLine();
			String tipoMancha = sc.nextLine();
			
			listaGato.add(new Gato_Selvagem(racaGS, nomeIDGS, porteGS, habitatGS, paisOrigemGS, corPelagem, tipoMancha));
			System.out.println("Gato " + listaGato.get(0).toString());
			
		}
		
		
		if(tipo.equals("Aves")) {
			
			System.out.println("Insira a raça, nome de indentificação, porte, habitat, país de origem, cor das penas, tipo de alimentação : ");
			String racaAV = sc.nextLine();
			String nomeIDAV = sc.nextLine();
			String porteAV = sc.nextLine();
			String habitatAV = sc.nextLine();
			String paisOrigemAV = sc.nextLine();
			String corPenas = sc.nextLine();
			String tipoAlimentacao = sc.nextLine();
			
			listaAve.add(new Aves(racaAV, nomeIDAV, porteAV, habitatAV, paisOrigemAV, corPenas, tipoAlimentacao));
			System.out.println("Aves " + listaAve.get(0).toString());
		}
		
		
		if(tipo.equals("Primatas")) {
			
			System.out.println("Insira a raça, nome de indentificação, porte, habitat, país de origem, cor das penas, tipo de alimentação : ");
			String racaPM = sc.nextLine();
			String nomeIDPM = sc.nextLine();
			String portePM = sc.nextLine();
			String habitatPM = sc.nextLine();
			String paisOrigemPM = sc.nextLine();
			
			listaPrimata.add(new Primatas(racaPM, nomeIDPM, portePM, habitatPM, paisOrigemPM));
			System.out.println("Primata "+ listaPrimata.get(0).toString());
		}
		

		
	}

}
