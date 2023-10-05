package aula22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		//Crie uma Array List e imprima os últimos elementos por primeiro

		List<String> lista = new ArrayList<>();
		
		lista.add("Rodrigo");
		lista.add("Daiane");
		lista.add("André");
		lista.add("Vanuza");
		lista.add("Isa");
		
		for (int i = lista.size() - 1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
		
	}

}
