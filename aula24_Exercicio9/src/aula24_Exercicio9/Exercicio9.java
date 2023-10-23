package aula24_Exercicio9;

public class Exercicio9 {

	public static void main(String[] args) {
		/*
		 * A Câmara Municipal de Vereadores de Blumenau pretende realizar uma
		 * estatística sobre o desempenho dos seus parlamentares. Para cada um dos 15
		 * vereadores, ela possui o nome, partido, quantidade de projetos apresentados,
		 * quantidade de projetos aprovados.
		 * 
		 * O desempenho é calculado da seguinte forma:
		 * (projetos aprovados / projetos apresentados) * índice de trabalho.
		 * Se não apresentou nenhum projeto, o desempenho é 0 (zero).
		 * 
		 * O índice de trabalho é definido pela seguinte tabela:
		 * Projetos apresentados      Índice de trabalho
		 * 01 – 05                      0,80
		 * 06 – 10                      1,00
		 * 11 – 17                      1,08
		 * acima de 17                  1,22
		 * 
		 * Escreva um programa Java que leia os dados disponíveis pela Câmara e imprima
		 * o nome, partido e desempenho do vereador.
		 * 
		 * Imprima:
		 * 
		 * a) o total de projetos apresentados e de aprovados na câmara;
		 *
		 * b) o nome, partido e desempenho do vereador com mais projetos aprovados;
		 * 
		 * c) o nome, partido e desempenho do vereador com menor desempenho;
		 * 
		 * d) o nome, partido e desempenho dos vereadores cujo desempenho seja maior que o desempenho médio de toda a câmara;
		 */
		
		Parlamentares v1 = new Parlamentares("Rodrigo", "BR", 10, 5);
		Parlamentares v2 = new Parlamentares("Daiane", "BR", 6, 6);
		Parlamentares v3 = new Parlamentares("Andre", "BR", 7, 3);
		Parlamentares v4 = new Parlamentares("Vanuza", "BR", 8, 4);
		Parlamentares v5 = new Parlamentares("Isa", "BR", 18, 8);
		Parlamentares aux = null;
		Parlamentares aux1 = null;
		
		
		double totalPApresentados = Double.MIN_VALUE;
		double totalPAprovados = Double.MIN_VALUE;
		double maiorPAprovados = Double.MIN_VALUE;
		double menorDesempenho = Double.MAX_VALUE;
		double mediaDesempenho = Double.MIN_VALUE;
		
		//System.out.println(v1.toString());
		
		for (Parlamentares v : Parlamentares.vereadores) {
			totalPApresentados = totalPApresentados + v.getProjetoApresentados();
			totalPAprovados = totalPAprovados + v.getProjetoAprovados();
			mediaDesempenho = mediaDesempenho + v.desempenho();
			
			if(v.getProjetoAprovados() > maiorPAprovados) {
				maiorPAprovados = v.getProjetoAprovados();
				aux = v;
			}
			
			if(v.desempenho() < menorDesempenho) {
				menorDesempenho = v.desempenho();
				aux1 = v;
			}
		
		}
		
		
		mediaDesempenho = mediaDesempenho / Parlamentares.vereadores.size();
		
		
		
		System.out.println("O total de projetos apresentados é de: " + totalPApresentados);
		System.out.println("O total de projetos aprovados é de: " + totalPAprovados);
		System.out.println("Vereador com mais projetos aprovados: " + aux.toString());
		System.out.println("Vereador com menor desempenho: " + aux1.toString());
		
		System.out.println(mediaDesempenho);

		for (Parlamentares v : Parlamentares.vereadores) {
			if(v.desempenho() > mediaDesempenho) {
				System.out.println(v.toString());
			}
		}
		
		
	}

}
