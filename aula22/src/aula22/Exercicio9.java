package aula22;

import java.util.ArrayList;
import java.util.List;

public class Exercicio9 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que remova o valor do meio da ArrayList.
		 * Caso a array list tenha tamanho par, remova o valor da segunda metade.
		 * Por exemplo: Em uma ArrayList de tamanho 6, remova o valor no índice 4
		 */
		
		List<Integer> lista = new ArrayList<>();
		
		int metade = 0;
		
		for (int i = 0; i <= 5; i++) {
			lista.add(i);
		}
		
		if(lista.size() % 2 == 0) {
			 metade = (lista.size() / 2);
			 lista.remove(metade);
		}
			
		
		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println(metade);
	}

}
