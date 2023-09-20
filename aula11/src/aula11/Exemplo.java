package aula11;

public class Exemplo {

	public static void main(String[] args) {

		String[][] matriz = new String[4][3];

		matriz[0][0] = "5";
		matriz[0][1] = "1";
		matriz[0][2] = "2";
		matriz[1][0] = "10";
		matriz[1][1] = "6";
		matriz[1][2] = "7";
		matriz[2][0] = "15";
		matriz[2][1] = "11";
		matriz[2][2] = "12";
		matriz[3][0] = "20";
		matriz[3][1] = "16";
		matriz[3][2] = "17";

		System.out.println(matriz[2][0]);
		System.out.println(matriz[2][1]);

		int[][] tabela = new int[4][3];

		tabela[0][0] = 5;
		tabela[0][1] = 1;
		tabela[0][2] = 2;
		tabela[1][0] = 10;
		tabela[1][1] = 6;
		tabela[1][2] = 7;
		tabela[2][0] = 15;
		tabela[2][1] = 11;
		tabela[2][2] = 12;
		tabela[3][0] = 20;
		tabela[3][1] = 16;
		tabela[3][2] = 17;

		System.out.println(tabela[1][1]);

		float[][] tabela2 = new float[3][2];

		tabela2[0][0] = (float) 1.80;
		tabela2[0][1] = 7;
		tabela2[1][0] = (float) 1.65;
		tabela2[1][1] = 94;
		tabela2[2][0] = (float) 1.70;
		tabela2[2][1] = 9;
		
		System.out.println((tabela2[0][0] + tabela2[1][0] + tabela2[2][0]) / 3 );
				
		
	}

}
