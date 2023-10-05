package aula20_Exercicio5;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Utilizando a classe Mercado.
		 * 
		 * Atribua valores às variáveis da classe Mercado para cada um dos objetos de
		 * Mercado.
		 * 
		 * Sendo que o preço de compra dos produtos foi igual em todos os mercados.
		 * 
		 * Calcule:
		 *  a) Quem teve o maior lucro vendendo maçãs?
		 *  b) Quem teve o maior lucro vendendo laranjas?
		 *  c) Qual das lojas teve o maior lucro nesse ano específico?
		 *  d) Qual das lojas teve o menor lucro?
		 *  e) Qual das lojas ficou no "meio" em termos de lucro?
		 *  f) Juntando as 3 lojas,  a franquia teve um lucro maior vendendo maçãs ou laranjas?
		 */
		
		Mercado unidadeDeBlumenau = new Mercado(50, 1.50, 80, 2.50);
		Mercado unidadeDeJoinville = new Mercado(100, 1.50, 150, 2.50);
		Mercado unidadeDeFlorianopolis = new Mercado(200, 1.50, 350, 2.50);
		
		
		double maiorValorMaca = Double.MIN_VALUE;
		double maiorValorLaranja = Double.MIN_VALUE;
		double maiorLucroTotal = Double.MIN_VALUE;
		double menorLucroTotal = Double.MAX_VALUE;
		double meioLucroTotal = Double.MAX_VALUE;
		double somaMaca = 0;
		double somaLaranja = 0;
		String unidadeMaca = "";
		String unidadeLaranja = "";
		String unidadeMaior = "";
		String unidadeMenor = "";
		String unidadeMeio = "";
		
		
		
		
		if(unidadeDeBlumenau.lucroMaca() > unidadeDeJoinville.lucroMaca() && unidadeDeBlumenau.lucroMaca() > unidadeDeFlorianopolis.lucroMaca()) {
			maiorValorMaca = unidadeDeBlumenau.lucroMaca();
			unidadeMaca = "Blumenau";
		}else if(unidadeDeJoinville.lucroMaca() > unidadeDeFlorianopolis.lucroMaca()) {
			maiorValorMaca = unidadeDeJoinville.lucroMaca();
			unidadeMaca = "Joinville";
		}else {
			maiorValorMaca = unidadeDeFlorianopolis.lucroMaca();
			unidadeMaca = "Florianopolis";
		}
		
		if(unidadeDeBlumenau.lucroLaranja() > unidadeDeJoinville.lucroLaranja() && unidadeDeBlumenau.lucroLaranja() > unidadeDeFlorianopolis.lucroLaranja()) {
			maiorValorLaranja = unidadeDeBlumenau.lucroLaranja();
			unidadeLaranja = "Blumenau";
		}else if(unidadeDeJoinville.lucroLaranja() > unidadeDeFlorianopolis.lucroLaranja()) {
			maiorValorLaranja = unidadeDeJoinville.lucroLaranja();
			unidadeLaranja = "Joinville";
		}else {
			maiorValorLaranja = unidadeDeFlorianopolis.lucroLaranja();
			unidadeLaranja = "Florianopolis";
		}
		
		if(unidadeDeBlumenau.lucroTotal() > unidadeDeJoinville.lucroTotal() && unidadeDeBlumenau.lucroTotal() > unidadeDeFlorianopolis.lucroTotal()) {
			maiorLucroTotal = unidadeDeBlumenau.lucroTotal();
			unidadeMaior = "Blumenau";
		}else if(unidadeDeJoinville.lucroTotal() > unidadeDeFlorianopolis.lucroTotal()) {
			maiorLucroTotal = unidadeDeJoinville.lucroTotal();
			unidadeMaior = "Joinville";
		}else {
			maiorLucroTotal = unidadeDeFlorianopolis.lucroTotal();
			unidadeMaior = "Florianopolis";
		}
		
		
		if(unidadeDeBlumenau.lucroTotal() < unidadeDeJoinville.lucroTotal() && unidadeDeBlumenau.lucroTotal() < unidadeDeFlorianopolis.lucroTotal()) {
			menorLucroTotal = unidadeDeBlumenau.lucroTotal();
			unidadeMenor = "Blumenau";
		}else if(unidadeDeJoinville.lucroTotal() < unidadeDeFlorianopolis.lucroTotal()) {
			menorLucroTotal = unidadeDeJoinville.lucroTotal();
			unidadeMenor = "Joinville";
		}else {
			menorLucroTotal = unidadeDeFlorianopolis.lucroTotal();
			unidadeMenor = "Florianopolis";
		}
		
		if(unidadeDeBlumenau.lucroTotal() > menorLucroTotal && unidadeDeBlumenau.lucroTotal() < maiorLucroTotal) {
			meioLucroTotal = unidadeDeBlumenau.lucroTotal();
			unidadeMeio = "Blumenau";
		}else if(unidadeDeJoinville.lucroTotal() > menorLucroTotal && unidadeDeJoinville.lucroTotal() < maiorLucroTotal) {
			meioLucroTotal = unidadeDeJoinville.lucroTotal();
			unidadeMeio = "Joinville";
		}else {
			meioLucroTotal = unidadeDeFlorianopolis.lucroTotal();
			unidadeMeio = "Florianopolis";
		}
		
		somaMaca = unidadeDeBlumenau.lucroMaca() + unidadeDeJoinville.lucroMaca() + unidadeDeFlorianopolis.lucroMaca();
		somaLaranja = unidadeDeBlumenau.lucroLaranja() + unidadeDeJoinville.lucroLaranja() + unidadeDeFlorianopolis.lucroLaranja();
		
		
		
		
		System.out.println("Unidade que vendeu mais maças: " + unidadeMaca + ", n: " + maiorValorMaca);
		System.out.println("Unidade que vendeu mais laranjas: " + unidadeLaranja + ", n: " + maiorValorLaranja);
		System.out.println("Unidade que teve o maior lucro no ano: " + unidadeMaior + ", n: " + maiorLucroTotal);
		System.out.println("Unidade que teve o menor lucro no ano: " + unidadeMenor + ", n: " + menorLucroTotal);
		System.out.println("Unidade que teve o meio lucro no ano: " + unidadeMeio + ", n: " + meioLucroTotal);
		
		if(somaMaca > somaLaranja) {
			System.out.println("Maça foi a que mais vendeu");
		}else {
			System.out.println("Laranja foi a que mais vendeu");
		}
	}

}
