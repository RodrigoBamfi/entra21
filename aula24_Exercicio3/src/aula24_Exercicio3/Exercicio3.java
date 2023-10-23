package aula24_Exercicio3;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Em um sistema de uma floricultura deve se guardar o nome da flor, o preço,
		 * nome do cliente que comprou a flor e se a flor é para presente ou não.
		 * 
		 * Crie 5 objetos de flor e as coloque em uma Array List
		 * 
		 * Responda:
		 * a) Quem comprou a flor mais cara?
		 * b) Qual o nome da flor mais cara?
		 */
		
		double maisCara = Double.MIN_VALUE;
		
		Floricultura e1 = new Floricultura("Margarita", 2, "Rodrigo", false);
		Floricultura e2 = new Floricultura("Rosa", 3, "Daiane", true);
		Floricultura e3 = new Floricultura("Hibisco", 40, "Andre", false);
		Floricultura e4 = new Floricultura("Ixora", 5, "Vanuza", true);
		Floricultura e5 = new Floricultura("Rosa do Deserto", 6, "Isa", false);
		Floricultura resultado = null;

		
		for(Floricultura e : Floricultura.estabelecimento) {
			if(e.getPreco() > maisCara) {
				maisCara = e.getPreco();
				resultado = e;
				
				
			}
		}
		
		System.out.println(resultado);
		
	}

}
