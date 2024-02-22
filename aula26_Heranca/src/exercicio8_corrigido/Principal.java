package exercicio8_corrigido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> habilidades = new ArrayList<>();
		habilidades.add("Gerenciar");
		habilidades.add("Administrar");
		habilidades.add("Falar");
		
		LocalDate exemplo = LocalDate.of(2020, 02, 28);

		// instacia o objeto que quer adicionar no atributo = endereco
		Endereco endereco = new Endereco("Brasil", "SC", "Blumenau", "Rua Joinville", "150");

		Gerente g1 = new Gerente("02", endereco, LocalDate.of(1999, 10, 20), "Dalton", 5000, LocalDate.of(2018, 05, 15),
				habilidades, "02");

		// eu coloco ele como variavel
		Empregado e1 = new Empregado("01", endereco, LocalDate.of(1988, 11, 06), "Maju", 1000,
				LocalDate.of(2020, 02, 28), habilidades, "02", null);

		//System.out.println(e1.toString());

		e1.adicionarHabilidade("Java");

		//System.out.println(e1.toString());

		//System.out.println(e1.calcularSalarioAnual());

		System.out.println(e1.getIdade());

		System.out.println(e1.calcularAnosDeEmpresa());

		//e1.sairDoSindicato();
		//System.out.println(e1.toString());

		//e1.comissao(100);
		//System.out.println(e1.toString());

		//e1.setGerente(g1);
		//g1.demitirEmpregado(e1);
		
		//System.out.println(e1.toString());

	}

}
