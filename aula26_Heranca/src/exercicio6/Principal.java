package exercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Computador: O método ligarOuDesligar deve retornar "Ligando" caso o parâmetro for true e
		 * "Desligando" caso seja false.
		 * 
		 *  
		 * Notebook: O método aumentarRam deve aumentar a quantidade de memória a partir do parâmetro passado no método. 
		 * O método rodarAplicacao deve retornar true caso o aplicativo termine em .exe
		 * 
		 * 
		 * Smartphone: O método tirarSelfie deve retornar true caso o atributo camera
		 * Frontal seja true e falso caso cameraFrontal for false 
		 * 
		 * O método ligar deve retornar true caso o primeiro número do parâmetro for igual ao número do
		 * atributo da operadora e false caso não seja.
		 * 
		 * O método rodarAplicacao deve retornar true caso o aplicativo termine em .apk
		 */

		
		Scanner sc = new Scanner(System.in);
		
		List<Notebook> listaNotebooks = new ArrayList<>();
		List<Smartphone> listaSmartphones = new ArrayList<>();
		
		listaSmartphones.add(new Smartphone("Iphone 2", 4, 32, 15, true));
		listaNotebooks.add(new Notebook("HP", 8, 500, 5.0));
		
		
		System.out.println("Quanto de memoria ram deseja aumentar?");
		double quantidade = sc.nextDouble();
		
		System.out.println(listaNotebooks.get(0).getRam());
		
		listaNotebooks.get(0).aumentarRam(quantidade);
		
		System.out.println(listaNotebooks.get(0).getRam());
		
		System.out.println("Insira o nome do seu aplicativo com extensão: ");
		String aplicativo = sc.next();
		
		if(listaNotebooks.get(0).rodarAplicacao(aplicativo)) {
			System.out.println("Aplicativo correto");
		}else {
			System.out.println("Erro na extensão do aplicativo");
		}
		
		System.out.println("Deseja tirar uma selfie? ");
		String valor = sc.next();
		
		if(valor.equalsIgnoreCase("sim")) {
			if(listaSmartphones.get(0).tirarSelfie() == true) {
				System.out.println("Sorria " + listaSmartphones.get(0).isCameraFrontal());
			}else {
				System.out.println("Não tem um camera frontal: " + listaSmartphones.get(0).isCameraFrontal());
			}
		}else{
			System.out.println("Programa encerrado");
		}
		
		
		System.out.println("Digite a ligação com o código da sua OPERADORA");
		int operadora = sc.nextInt();
		
		if(listaSmartphones.get(0).ligar(operadora)) {
			System.out.println("Ligação efetuada");
		}else {
			System.out.println("Erro código da operadora");
		}
		
		System.out.println("Insira o nome do seu aplicativo com sua extensão: ");
		String aplicativoAPK = sc.next();
		
		if(listaSmartphones.get(0).rodarAplicacao(aplicativoAPK)) {
			System.out.println("Aplicativo correto");
		}else {
			System.out.println("Erro na extensão do aplicativo");
		}
		
		
	}

}
