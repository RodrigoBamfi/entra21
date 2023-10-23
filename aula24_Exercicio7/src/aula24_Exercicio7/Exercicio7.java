package aula24_Exercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Faça uma classe chamada Conta, com os atributos nome e saldo.
		 * 
		 * Faça um método para sacar dinheiro
		 * Outro método para depositar dinheiro
		 * outro método para transferir dinheiro de uma conta para outra
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// para criar um objeto na classe main
		// Um objeto ele tem os atributos da entidade, mas os valores dos atributos mudam
		Conta c1 = new Conta("Rodrigo", 100);
		Conta c2 = new Conta("Daiane", 200);
		
		List<Conta> conta = new ArrayList<>();
		
		conta.add(c1);
		conta.add(c2);
		
		
		Conta contaOrigem = null;
		Conta contaDestino = null;
		
		//System.out.println("Qual valor deseja sacar? ");
		//double sacar = sc.nextDouble();
		
		//System.out.println(c1.getSaldo());
		
		//c1.sacar(sacar);
		
		//System.out.println(c1.getSaldo());
		
		//System.out.println("Qual valor deseja depositar? ");
		//double depositar = sc.nextDouble();
		
		//c1.depositar(depositar);
		
		//System.out.println(c1.getSaldo());
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		
		System.out.println("Quem vai transferir? ");
		String transferir = sc.next();
		
		System.out.println("Quem vai receber? ");
		String receber = sc.next();
		
		System.out.println("Qual valor?");
		double valor = sc.nextDouble();
		
		
		for (Conta c : Conta.cliente) {
			if(c.getNome().equals(transferir)) {
				contaOrigem = c;
			}
			
			if(c.getNome().equals(receber)) {
				contaDestino = c;
			}
		}	
		
		if(contaOrigem != null && contaDestino != null) {
			contaOrigem.transferir(contaDestino, valor);
		}else {
			System.out.println("Dados invalidos");
		}
		
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		
		
		
		

	}

}
