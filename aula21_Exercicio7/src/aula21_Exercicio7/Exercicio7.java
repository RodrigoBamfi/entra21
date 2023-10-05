package aula21_Exercicio7;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Faça uma classe chamada Aeronave. Com os atributos: Passageiros. Velocidade
		 * máxima. Capacidade de combustível. Queima de combustível por minuto.
		 * 
		 * Crie 4 objetos de sua preferência.
		 * 
		 * 
		 * Calcule:
		 * a) Qual das aeronaves pode ficar no ar por mais tempo?
		 * b) Qual aeronave leva o maior número de passageiros?
		 * c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe?
		 */
		
		Aeronave tecoteco = new Aeronave(4, 150, 60, 1);
		Aeronave jato = new Aeronave(1, 800, 200, 2);
		
		Aeronave[] aero = new Aeronave[2];
		aero[0] = tecoteco;
		aero[1] = jato;
		
		
		if(tecoteco.tempoAr() > jato.tempoAr()) {
			System.out.println("Teco Teco fica mais tempo no AR");
		}else {
			System.out.println("Jato fica mais tempo no AR");
		}

		if(tecoteco.getPassageiros() > jato.getPassageiros()) {
			System.out.println("Teco Teco tem mais passageiros");
		}else {
			System.out.println("Jato tem mais passageiros");
		}
		
		if(tecoteco.tempoAr() * tecoteco.getVelMaxima() > jato.tempoAr() * jato.getVelMaxima()) {
			System.out.println("Teco Teco voa mais longe");
		}else {
			System.out.println("Jato voa mais longe");
		}
		
	}

}
