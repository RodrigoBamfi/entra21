package aula20_Exercicio5;

public class Mercado {

	private int nMacaVenAno;
	private double precoVenMaca;
	private int nLaranjaVenAno;
	private double precoVenLaranja;

	public Mercado(int nMacaVenAno, double precoVenMaca, int nLaranjaVenAno, double precoVenLaranja) {
		setnLaranjaVenAno(nMacaVenAno);
		setPrecoVenMaca (precoVenMaca);
		setnLaranjaVenAno (nLaranjaVenAno);
		setPrecoVenLaranja (precoVenLaranja);
	}
	

	public int getnMacaVenAno() {
		return nMacaVenAno;
	}



	public void setnMacaVenAno(int nMacaVenAno) {
		this.nMacaVenAno = nMacaVenAno;
	}



	public double getPrecoVenMaca() {
		return precoVenMaca;
	}



	public void setPrecoVenMaca(double precoVenMaca) {
		this.precoVenMaca = precoVenMaca;
	}



	public int getnLaranjaVenAno() {
		return nLaranjaVenAno;
	}



	public void setnLaranjaVenAno(int nLaranjaVenAno) {
		this.nLaranjaVenAno = nLaranjaVenAno;
	}



	public double getPrecoVenLaranja() {
		return precoVenLaranja;
	}



	public void setPrecoVenLaranja(double precoVenLaranja) {
		this.precoVenLaranja = precoVenLaranja;
	}



	public double lucroMaca() {
		return nMacaVenAno * precoVenMaca;

	}

	public double lucroLaranja() {
		return nLaranjaVenAno * precoVenLaranja;
	}

	public double lucroTotal() {
		return lucroMaca() + lucroLaranja();
	}

}
