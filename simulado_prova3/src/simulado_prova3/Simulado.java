package simulado_prova3;

import java.util.Scanner;

public class Simulado {
	
	public static void main(String[] args) {
		/*
		 * Implemente um sistema para realizar a consulta de contas bancárias de um
		 * determinado banco. Para testar o sistema, pede-se o armazenamento do seguinte
		 * conjunto de contas bancárias. Cada conta bancária possui as informações
		 * abaixo:
		 * 
		 * 
		 * Imprima:
		 * a) Informações do cliente com mais dinheiro no banco
		 * b) Informações do cliente mais antigo de um dado gerente
		 * c) Listar as informações de todos os clientes de um dado gerente
		 * d) Informar quantos clientes um dado gerente tem
		 */

		Scanner sc = new Scanner(System.in);
		
		double maiorValor = Double.MIN_VALUE;
		int menorAno = Integer.MAX_VALUE;
		int numClientes = 0;
		
		Conta c1 = new Conta("Jorge", "Private", 2022, 2500000, "Ana");
		Conta c2 = new Conta("Luís", "Stilo", 2015, 500000, "Ana");
		Conta c3 = new Conta("Cláudio", "Exclusive", 2017, 250000, "Marina");
		Conta c4 = new Conta("Bruna", "Prime", 2005, 5500000, "Paulo");
		Conta c5 = new Conta("Ana", "Exclusive", 2023, 240000, "Paulo");
		Conta c6 = new Conta("Ana", "Exclusive", 2023, 10000, "Paulo");
		Conta cMV = null;
		Conta cMA = null;
		
		
		
		for (Conta c : Conta.clientes) {
			if(c.getSaldo() > maiorValor) {
				maiorValor = c.getSaldo();
				cMV = c;
			}
			
			if(c.getAnoCadastro() < menorAno) {
				menorAno = c.getAnoCadastro();
				cMA = c;
			}
		}
		
		System.out.println("Qual gerente deve ser consultado: ");
		String gerente = sc.next();
		
		System.out.println("-----");
		
		for (Conta c : Conta.clientes) {
			if(c.getGerente().equals(gerente)) {
				numClientes++;
				System.out.println(c.toString());
				
			}
		}
		
		System.out.println("A gerente " + gerente + " tem o total de " + numClientes + " cliente");
		
		
		System.out.println("------------------------------------------");
		System.out.println("Cliente com mais valor: " + cMV.toString());
		System.out.println("Cliente mais antigo: " + cMA.toString());
		
		System.out.println("------------------------------------------");
		
		System.out.println("Nosso rendimento é 30% ao ano");
		System.out.println("Quantos anos deseja deixar rendendo? ");
		int anos = sc.nextInt();
		
		System.out.println(c6.juroSimples(anos));
		System.out.println(c6.juroComposto(anos));
	}
		

}
