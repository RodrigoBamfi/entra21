package aula24_Exercicio6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Uma pizzaria tem 5 pizzas em seu cardápio.
		 * 
		 * Cada pizza tem um nome, 3 ingredientes, um boolean referente à borda,
		 * diâmetro e preço.
		 * 
		 * Crie 5 objetos de pizza e os coloque em uma Array List.
		 * 
		 * Crie um método para mudar algum dos ingredientes da pizza, caso alguns dos
		 * ingredientes da pizza tenha sido iniciado como null, substitua esse
		 * ingrediente pelo novo, caso contrário, mude o terceiro ingrediente.
		 * 
		 * Qual é a pizza mais barata por área?
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double maisBarata = Double.MAX_VALUE;
		
		
		Pizzas c1 = new Pizzas("3 Queijo", "manjericao", "Parmesão", "Prato", false, 50, 50);
		Pizzas c2 = new Pizzas("Portuguesa", "Mussarela", "Tomate", "Presunto", true, 40, 50);
		Pizzas c3 = new Pizzas("Bacon", "Mussarela", "Bacon", null, false, 30, 50);
		Pizzas c4 = new Pizzas("Milho", "Mussarela", "Milho", null, false, 20, 50);
		Pizzas c5 = new Pizzas("Carne Seca", "Mussarela", "Carne Seca", "Tomate", false, 10, 50);
		Pizzas aux = null;
		
		System.out.println("Qual deseja adicionar um ingrediente? ");
		String adicional = sc.next();
		
		System.out.println(c1.toString());
		
		System.out.println("----------------------------");
		
		c1.mudarIngrediente(adicional);
		
		System.out.println(c1.toString());
		
		for (Pizzas c : Pizzas.Cardapio) {
			if(c.barata() < maisBarata) {
				maisBarata = c.barata();
				aux = c;
			}
		}
		
		System.out.println("----------------------------");
		System.out.println(aux.getNome());
		System.out.println(maisBarata);
		
	}

}
