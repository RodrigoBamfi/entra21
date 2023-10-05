package aula22;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {
		// Coloque 5 elementos em uma Array List e ordene-os
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Rodrigo");
		lista.add("Daiane");
		lista.add("André");
		lista.add("Vanuza");
		lista.add("Isa");
		
		lista.sort(null);
		
		System.out.println(lista);

	}

}
