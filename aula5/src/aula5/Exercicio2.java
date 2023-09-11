package aula5;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Escreva um algoritmo printe o número 0, 2, 4, 6 ... até o número 20*/
		
		for(int i = 0; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.println(i);	

			}
		}
		
		for(int i = 0; i < 21; i += 2 ) {	
			System.out.println(i);
		}


}
}
