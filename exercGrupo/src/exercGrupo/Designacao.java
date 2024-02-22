package exercGrupo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Designacao extends AlistamentoMilitar {

	private ArrayList<String> listaFormacao = new ArrayList<>();

	public Designacao(String nomeCompleto, long cpf, String comprovanteResidencia, LocalDate dataNascimento,
			ArrayList<String> listaFormacao) {
		super(nomeCompleto, cpf, comprovanteResidencia, dataNascimento);
		
	}




	public ArrayList<String> getListaFormacao() {
		return listaFormacao;
	}




	public void setListaFormacao(ArrayList<String> listaFormacao) {
		this.listaFormacao = listaFormacao;
	}




	@Override
	public boolean verifDoc(String nomeCompleto, double cpf, String comprovanteResidencia) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	public String verifQMS(String formacao) {
		
		if(formacao.equalsIgnoreCase("Mecanico")) {
			return "Você foi designado para o Material Bélico";
		}else if(formacao.equalsIgnoreCase("Informatica")) {
			return "Você foi designado para a Comunicação";
		}else if(formacao.equalsIgnoreCase("Enfermeiro") || formacao.equalsIgnoreCase("Auxiliar de Saude")){
			return "Você foi designado para o Serviço Saúde";
		}else if(formacao.equalsIgnoreCase("Cozinheiro") || formacao.equalsIgnoreCase("Auxiliar de Cozinha") ){
			return "Você foi designado para o Serviço de Intendência";
		}else if(formacao.equalsIgnoreCase("Musico")) {
			return "Você foi designado para a Banda de Sinfônica do Exército";
		}else {
			return "Você foi designado para Infantaria";
		}
					
		
	}

}
	
	
