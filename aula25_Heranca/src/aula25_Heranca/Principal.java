package aula25_Heranca;

public class Principal {

	public static void main(String[] args) {
		
		Bicicleta bicicleta = new Bicicleta("Teste", 5, 5, 10, 1, false);
		
		System.out.println(bicicleta.verificaLimite(1));

	}

}
