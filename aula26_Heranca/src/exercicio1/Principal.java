package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Circulo> listaCirculo = new ArrayList<>();
		List<Cilindro> listaCilindro = new ArrayList<>();

		System.out.println("Insira uma cor: ");
		String corAux = sc.next();
		
		System.out.println("Insira o valor do raio: ");
		double raio = sc.nextDouble();
	
		System.out.println("Insira o valor da altura: ");
		double altura = sc.nextDouble();
		
		listaCirculo.add(new Circulo(corAux, raio));		
		listaCilindro.add(new Cilindro(corAux, raio, altura));

		System.out.println(listaCirculo.get(0).calcularArea());
		System.out.println(listaCilindro.get(0).calcularVolume());
		
		System.out.println(listaCilindro.get(0).toString());
		
	}

}
