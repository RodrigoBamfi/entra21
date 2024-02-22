package exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Embarcacao: O método planejarViagem deve calcular se a Embarcacao terá
		 * combustível suficiente para chegar ao destino.
		 * 
		 * Transatlantico: O método verificaSegurança deve retornar a String "Botes OK" caso a capacidade dos
		 * botes seja igual ou superior à capacidade de transporte de pessoas do navio,
		 * caso contrário, deve-se retornar a mensagem "ALERTA: embarcação necessitando de mais botes!".
		 * O método adicionaBotes deve adicionar botes de acordo com o parâmetro passado.
		 * 
		 * Lancha: O método verificaSeguranca deve retornar "Botes OK" caso a lancha tenha botes e caso
		 * não tenha, retornar "ALERTA: embarcação necessitando de mais botes!".
		 * O método tempoViagem deve calcular qual o tempo de viagem, assumindo que a
		 * lancha estará sempre em velocidade máxima
		 */

		
		Scanner sc = new Scanner(System.in);
		
		List<Embarcacao> listaEmbarcacao = new ArrayList<>();
		List<Transatlantico> listaTransatlanticos = new ArrayList<>();
		List<Lancha> listaLanchas = new ArrayList<>();
		
		listaTransatlanticos.add(new Transatlantico("Titanic", "Velho", 200, 50, 2, 10, 1900, 6));
		
		System.out.println("Quantos KM deseja percorrer? ");
		double distancia = sc.nextDouble();
		
		listaTransatlanticos.get(0).planejarViagem(distancia);
		
		if(listaTransatlanticos.get(0).planejarViagem(distancia) == false) {
			System.out.println("Vai conseguir chegar");
		}else {
			System.out.println("Não tem combustivel suficiente");
		}
		
		
		
	}

}
