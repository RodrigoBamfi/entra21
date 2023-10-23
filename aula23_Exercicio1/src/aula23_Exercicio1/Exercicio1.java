package aula23_Exercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Faça uma classe chamada Retangulo, com os atributos altura e largura. Faça um
		 * método para descobrir a área e outro para descobrir o perímetro. Crie 10
		 * objetos de Retangulo.
		 * 
		 * Imprima o toString do retângulo com a maior área e o toString do retângulo
		 * com o maior perímetro
		 */
		
		double maiorArea = Double.MIN_VALUE;
		double maiorPerimetro = Double.MIN_VALUE;
		
		
		Retangulo r1 = new Retangulo(5, 2);
		Retangulo r2 = new Retangulo(1, 6);
		Retangulo r3 = new Retangulo(6, 9);
		Retangulo r4 = new Retangulo(5, 2);
		Retangulo r5 = new Retangulo(3, 2);
		Retangulo r6 = new Retangulo(2.5, 6);
		Retangulo r7 = new Retangulo(8, 3);
		Retangulo r8 = new Retangulo(9, 5);
		Retangulo r9 = new Retangulo(1, 16);
		Retangulo r10 = new Retangulo(5, 9);
		Retangulo rMaiorArea = null;
		Retangulo rMaiorPerimetro = null;
		
		
		List<Retangulo> listaRetangulo = new ArrayList<>();
		
		listaRetangulo.add(r1);
		
		
		for (Retangulo r : Retangulo.listaRetangulo) {
			
			if(r.calcArea() > maiorArea) {
				maiorArea = r.calcArea();
				rMaiorArea = r;
			}
			
			if(r.calcPerimetro() > maiorPerimetro) {
				maiorPerimetro = r.calcPerimetro();
				rMaiorPerimetro = r;
			}
		}

		System.out.println(rMaiorArea.toString());
		System.out.println(rMaiorPerimetro.toString());
		//System.out.println(maiorArea);
		//System.out.println(maiorPerimetro);
		
	}

}
