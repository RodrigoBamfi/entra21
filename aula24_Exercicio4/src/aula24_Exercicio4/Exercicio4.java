package aula24_Exercicio4;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Crie uma classe Empregado que terá como atributos:
		 * Identificação
		 * Nome
		 * Sobrenome
		 * Salário
		 * 
		 * Crie métodos para: 
		 * 
		 * Saber o salário anual do empregado
		 * Saber o nome completo do empregado
		 * Modificar o salário, o parâmetro do método deve ser o percentual de aumento
		 * Imprima o toString do usuário que após o aumento ficou com o maior do salário
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double maiorSalario = Double.MIN_VALUE;
		
		
		
		Empregado f1 = new Empregado(1, "Rodrigo Alex", "Bamfi", 3000);
		Empregado f2 = new Empregado(2, "Daiane Aline", "Bamfi", 4000);
		Empregado f3 = new Empregado(3, "André Otavio", "Bamfi", 5000);
		Empregado f4 = new Empregado(4, "Vanuza Aparecida", "Bamfi", 6000);
		Empregado f5 = new Empregado(5, "Isa Miesbach", "Bamfi", 7000);
		Empregado aux = null;
	
	
		System.out.println("Insira a porcetagem que deseja aumentar para o funcionario: ");
		double porcentagem = sc.nextDouble();
		
		
		for (Empregado f : Empregado.listaEmpregados) {
			f.aumentoSalario(porcentagem);
			
			
			if(f.getSalario() > maiorSalario) {
				maiorSalario = f.getSalario();
				aux = f;
				
			}
			
		}
		
		System.out.println(aux.toString());
	}
}
