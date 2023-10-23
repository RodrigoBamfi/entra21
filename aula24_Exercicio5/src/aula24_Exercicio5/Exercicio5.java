package aula24_Exercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Crie um sistema para uma loja de materiais de construção Os objetos terão os
		 * atributos: Nome, descrição, preço, peso e estoque
		 * 
		 * Crie um método para adicionar mais unidades da peça ao estoque.
		 * Crie um método para a venda desse produto, podendo ser vendidos até o mesmo número de peças que tem no estoque.
		 * Crie um método para colocar o produto em promoção, o parâmetro do método deve ser a porcentagem do desconto.
		 * 
		 * Calcule:
		 * a) Qual o nome do material mais caro
		 * b) Qual o nome do material mais leve
		 * c) Quanto que pesa a quantidade total do produto mais caro, ou seja, a quantidade multiplicado pelo peso
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double maisCaro = Double.MIN_VALUE;
		double maisLeve = Double.MAX_VALUE;
		double maisPesado = Double.MIN_VALUE;
		
		Material m1 = new Material("Cimento", "Concreto", 10, 5.00, 50);
		Material m2 = new Material("Argamassa", "Massa", 6, 3.00, 20);
		Material m3 = new Material("Tijolo", "Tijolo Furado", 2, 5.00, 500);
		Material m4 = new Material("Telha", "Telha Lisa", 4, 2.00, 250);
		Material m5 = new Material("Piso", "Porcelanato", 15, 10.00, 50);
		Material resultado = null;
		Material resultado2 = null;
		
		System.out.println("Quanto deseja adicionar ao estoque? ");
		int adicionarEstoque = sc.nextInt();
		
		m1.adicionarEstoque(adicionarEstoque);
		
		System.out.println("Qual a quantidade que deseja comprar? ");
		int quantidade = sc.nextInt();
				
		m1.vendaProduto(quantidade);
		
		System.out.println("Qual a porcentagem para a promoção? ");
		double promocao = sc.nextDouble();
		
		m1.promocao(promocao);

		for (Material m : Material.listaMaterial) {
			if(m.getPreco() > maisCaro) {
				maisCaro = m.getPreco();
				resultado = m;
			}
			
			if(m.getPeso() < maisLeve) {
				maisLeve = m.getPeso();
				resultado2 = m;
			}
		}
		
		maisPesado = resultado.getEstoque() * resultado.getPeso(); // FAZER ESSE CALCULO COMO METODO PARA REAPROVEITAMENTO CORRIGIR.
		
		
		System.out.println("O produto mais caro é: " + resultado.getNome());
		System.out.println("O material mais level é: " + resultado2.getPeso());
		System.out.println("O produto mais caro pesa no total: "+ maisPesado);
		
		System.out.println(m1.getEstoque());
		//System.out.println(m1.getPreco());

	}

}
