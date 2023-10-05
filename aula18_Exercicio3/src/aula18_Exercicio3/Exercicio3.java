package aula18_Exercicio3;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * A partir das representações abaixo dos objetos de uma classe Produto. Escreva
		 * o código necessário para suportar tais objetos. Ou seja, o código necessário
		 * para criar a classe e instanciar os objetos de modo que fiquem com o estado
		 * apresentado.
		 * 
		 * produto1: Produto nome = “Caderno” descricao = “Caderno em espiral tamanho
		 * médio” precoUnitario = 4,50 desconto = 15
		 * 
		 * 
		 * produto2: Produto nome = “Caneta ESF” descricao = “Caneta esferográfica 5mm”
		 * precoUnitario = 1,20 desconto = 2
		 * 
		 * 
		 * produto3: Produto nome = “Esquadro” descricao = “Esquadro de acrílico 20 cm”
		 * precoUnitario = 2,35 desconto = 10
		 */
		
		Produto caderno = new Produto();
		
		caderno.produtoNome = "Caderno";
		caderno.descricao = "Caderno em espiral tamanho médio";
		caderno.precoUnitario = 4.50;
		caderno.desconto = 15;
		
		Produto caneta = new Produto();
		
		caneta.produtoNome = "Caneta ESF";
		caneta.descricao = "Caneta esferográfica 5mm";
		caneta.precoUnitario = 1.20;
		caneta.desconto = 2;
		
		Produto esquadro = new Produto();
		
		esquadro.produtoNome = "Esquadro";
		esquadro.descricao = "Esquadro de acrílico 20 cm";
		esquadro.precoUnitario = 2.35;
		esquadro.desconto = 10;
				
		

	}

}
