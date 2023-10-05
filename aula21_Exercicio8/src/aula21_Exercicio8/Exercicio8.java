package aula21_Exercicio8;

import java.text.DecimalFormat;

public class Exercicio8 {

	public static void main(String[] args) {
		/*
		 * Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME,
		 * CPF, UF (RS, PR e SC) e RENDA ANUAL. EX: Nome: João da Silva CPF:
		 * 123.456.789-00 UF: PR RendaAnual: R$40.000
		 * 
		 * Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:
		 * 
		 * Nível de Renda Anual Alíquota 0 a 4.000 0% 4.001 a 9.000 5,8% 9.001 a 25.000
		 * 15% 25.001 a 35.000 27,5% acima de 35.000 30%
		 * 
		 * 
		 * Sendo assim, deve-se calcular o imposto a pagar do seguinte modo: Imposto a
		 * pagar = Renda Anual * Alíquota
		 * 
		 * Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.
		 * 
		 * Calcule:
		 * a) Quem mais paga imposto.
		 * b) Quem menos paga imposto.
		 * c) Qual o total de imposto pago entre os 5 contribuintes?
		 */
		
		
		//DecimalFormat formatar = new DecimalFormat("0.0000");
		
		double maisImposto = Double.MIN_VALUE;
		double menosImposto = Double.MAX_VALUE;
		double totalImposto = 0;
		
		String nomeMaior = "";
		String nomeMenor = "";
		
		Contribuinte fulano = new Contribuinte("Henrique", "123.456.789-00", "SC", 200000);
		Contribuinte beltrano = new Contribuinte("Beltrano", "123.456.789-00", "SC", 9000);
		Contribuinte siclano = new Contribuinte("Siclano", "123.456.789-00", "SC", 2000);
		Contribuinte joao = new Contribuinte("João", "123.456.789-00", "SC", 25000);
		Contribuinte maria = new Contribuinte("Maria", "123.456.789-00", "SC", 50000);
		
		Contribuinte[] contribuintes = new Contribuinte[5];
		contribuintes[0] = fulano;
		contribuintes[1] = beltrano;
		contribuintes[2] = siclano;
		contribuintes[3] = joao;
		contribuintes[4] = maria;
		
		for (int i = 0; i < contribuintes.length; i++) {
			System.out.println(contribuintes[i].valorPagar());
			if(contribuintes[i].valorPagar() > maisImposto) {
				maisImposto = contribuintes[i].valorPagar();
				nomeMaior = contribuintes[i].getNome();
			}
			
			if(contribuintes[i].valorPagar() < menosImposto) {
				menosImposto = contribuintes[i].valorPagar();
				nomeMenor = contribuintes[i].getNome();
			}
			
			totalImposto = totalImposto + contribuintes[i].valorPagar();
		}
		
		System.out.println("Quem paga mais imposto é: " + nomeMaior);
		System.out.println("Quem paga menos imposto é: " + nomeMenor);
		System.out.println("Total pago de imposto de todos os contribuintes é: " + totalImposto);
		
		
		

	}

}
