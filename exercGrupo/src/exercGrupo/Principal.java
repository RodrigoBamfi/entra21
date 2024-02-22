package exercGrupo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int contador = 0;
	int verifOK = 0;
	
	ArrayList<String> listaFormacao = new ArrayList<>();
		
	ExamesMedicos exames1 = new ExamesMedicos(false, false, false, false, false);
	
	SelecaoGeral conscrito1 = new SelecaoGeral("Pelé", 1234567890, "sim", LocalDate.of(2005, 11, 7), exames1, 94, 1.80);
	
	
	System.out.println("================================================");
	System.out.println("|              ALISTAMENTO MILITAR             |");
	System.out.println("================================================");
	System.out.println("");
	System.out.println("Olá, vamos confirmar seus dados cadastrados online com seus documentos");
	System.out.println("---");
	while(verifOK == 0) {
		
	if(contador >= 3) {
		System.out.println("As informações que você me passou não coincidem com seus dados, Aguarde para Verificação");
		System.out.println("");
		System.out.println("PROXIMO!!!");
		System.exit(0);
	}else {
		System.out.println("Me informe seu nome? ");
		String nome = sc.nextLine();
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Agora me informe o número do CPF? ");
		double cpf = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Está acompanhado do seu comprovante de residencia? ");
		String comprovanteR = sc.nextLine();
		
		System.out.println("------------------------------------------------");
			
			
			if(conscrito1.verifDoc(nome, cpf, comprovanteR) == true) {
				System.out.println("Seus dados estão corretos");
				System.out.println("");
				verifOK++;
			}else {
				System.out.println("Informação incorretas");
				System.out.println("---");
				System.out.println("");
				System.out.println("Novamente...");
				contador++;
		}
	}
			
	}
	
	System.out.println("Vou verificar sua data de nascimento no documento...");
	
	if(conscrito1.verifIdade() >= 18) {
		System.out.println("Tudo certo, já tem idade para se alistar...");
	}else {
		System.out.println("Você não tem idade para se alistar, retorne quando completar 18 anos.");
		System.exit(0);
	}
	
	System.out.println("------------------------------------------------");
	
	System.out.println("Deseja servir o exercito? ");
	String servir = sc.nextLine();
	
	System.out.println("------------------------------------------------");
	
	if(conscrito1.voluntario(servir) == true) {
		System.out.println("Se apresente na sala de Seleção Geral agora mesmo...");
	}else {
		System.out.println("Está dispensado do alistamento militar");
		System.exit(0);
	}
	
	System.out.println("------------------------------------------------");
	
	System.out.println("================================================");
	System.out.println("|                 SELEÇÃO GERAL                |");
	System.out.println("================================================");
	System.out.println("");
		
	
	System.out.println("Está acompanhado de algum laudo medico para apresentar? ");
	String valor = sc.nextLine();
	
	if(valor.equalsIgnoreCase("sim")) {
		if(conscrito1.verifExameMedico() == true) {
			System.out.println("Você está dispensado"); 
			System.out.println("PROXIMO!!!");
			System.exit(0);
		}else {
			System.out.println("");
			System.out.println("Acredito que você se enganou, não identifiquei nenhum laudo medico");
			System.out.println("------------------------------------------------");
			System.out.println("Vamos fazer o Teste de Aptidão Física.");
		}
	}else {
		System.out.println("------------------------------------------------");
		System.out.println("Vamos fazer o Teste de Aptidão Física.");
	}
	
	System.out.println("---");
	
	System.out.println("Tente fazer o maximo de força ao puxar");
	System.out.println(".....");
	
	if(conscrito1.testeFisico(conscrito1.getPeso(), conscrito1.getAltura()) == true) {
		System.out.println("Parabens voce está Apto, siga para a Designação");
		System.out.println("------------------------------------------------");
	}else {
		System.out.println("Dispensado voce é Inapto");
		System.out.println("PROXIMO!!!");
		System.exit(0);
	}

	System.out.println("");
	System.out.println("================================================");
	System.out.println("|                   DESIGNAÇÃO                 |");
	System.out.println("================================================");
	System.out.println("");
	
	Designacao conscrito1D = new Designacao("Pelé", 1234567890, "sim", LocalDate.of(2005, 11, 7), listaFormacao);
	
	System.out.println("Possui alguma especialização técnica, se sim qual?");
	String fmcUsuario = sc.nextLine();
	System.out.println("");
	
	System.out.println("------------------------------------------------");
	
	listaFormacao.add(fmcUsuario);
	
	System.out.println(conscrito1D.verifQMS(fmcUsuario));
	
	System.out.println("------------------------------------------------");
	System.out.println("");
	
	System.out.println(conscrito1D.toString() + " Deve se apresentar no dia 01 de Março as 08:00 da manhã");
	System.out.println("");
	
	System.out.println("================================================");
	System.out.println("|                   PROXIMO!!!                 |");
	System.out.println("================================================");
	
	sc.close();
	
	}

}
