package aula18_Exercicio1;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Em uma classe denominada Pessoa, deseja-se manter o nome, sexo, data de
		 * nascimento e estado civil de uma pessoa. O sexo deve ser definido como um
		 * caracter. A data deve ser definida como String.
		 * 
		 * Crie 2 objetos de Pessoa.
		 */

		Pessoa rodrigo = new Pessoa();

		rodrigo.nome = "Rodrigo";
		rodrigo.sexo = 'M';
		rodrigo.nascimento = "30/11/1994";
		rodrigo.estadoCivil = "Solteiro";

		/*Pessoa moacir = new Pessoa();

		moacir.nome = "Moacir";
		moacir.sexo = 'M';
		moacir.nascimento = "30/11/1994";
		moacir.estadoCivil = "Solteiro";*/
		
		Pessoa moacir = new Pessoa("Moacir", 'M', "30/11/1994", "Solteiro");

		
		System.out.println(moacir.nome);
		
	}

}
