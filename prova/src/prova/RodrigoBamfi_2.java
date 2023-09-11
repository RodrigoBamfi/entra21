package prova;

import java.util.Scanner;

public class RodrigoBamfi_2 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa onde o usuário informa os dados dos lados de um triangulo
		 * depois verifique e retorne se ele é isóscele, escaleno ou equilátero.
		 */
		
		/*OBS: Não me recordo em relação aos lados do triangulo, nesse caso eu procuraria a formula e a explicação no google
		 e faria o processo, fiz para não deixar em branco.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro lado de um triangulo");
		int ladoUm = sc.nextInt();
		int	ladoDois = sc.nextInt();
		int ladoTres = sc.nextInt();
		
		if (ladoUm == ladoDois && ladoDois == ladoTres) {
			System.out.println("Triangulo equilátero");
		}else if(ladoUm == ladoDois || ladoDois == ladoTres || ladoTres == ladoUm) {
			System.out.println("Triangulo isóceles");
		}else {
			System.out.println("Triangulo escaleno");
		}
		
		sc.close();
	}

}
