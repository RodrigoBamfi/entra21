package aula18_Exercicio4;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Crie uma classe chamada Circulo que tenha o atributo raio
		 * 
		 * Calcule a área de 5 objetos diferentes de Circulo
		 * 
		 * Para obter o valor de PI, use a função Math.PI do Java
		 */

		Circulo c1 = new Circulo();

		c1.raio = 10;

		System.out.println(c1.area());

		Circulo c2 = new Circulo();

		c2.raio = 20;

		System.out.println(c2.area());
		
		Circulo c3 = new Circulo();

		c3.raio = 30;

		System.out.println(c3.area());
		
		Circulo c4 = new Circulo();

		c4.raio = 40;

		System.out.println(c4.area());
		
		Circulo c5 = new Circulo();

		c5.raio = 50;

		System.out.println(c5.area());

	}

}
