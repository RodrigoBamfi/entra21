package exercicio6;

public class Smartphone extends Computador {

	private int operadora;
	private boolean cameraFrontal;
	
	public Smartphone(String modelo, double ram, double armazenamento, int operadora, boolean cameraFrontal) {
		super(modelo, ram, armazenamento);
		
		setOperadora(operadora);
		setCameraFrontal(cameraFrontal);
	}

	public int getOperadora() {
		return operadora;
	}

	public void setOperadora(int operadora) {
		this.operadora = operadora;
	}

	public boolean isCameraFrontal() {
		return cameraFrontal;
	}

	public void setCameraFrontal(boolean cameraFrontal) {
		this.cameraFrontal = cameraFrontal;
	}


	//Smartphone: O método tirarSelfie deve retornar true caso o atributo camera
		 //Frontal seja true e falso caso cameraFrontal for false 
	
	public boolean tirarSelfie() {
		return this.cameraFrontal;
	}
	
	// O método ligar deve retornar true caso o primeiro número do parâmetro for igual ao número do
		 //atributo da operadora e false caso não seja.
	
	public boolean ligar(int valor) {
	
		String auxOp = "" + this.getOperadora();
		String auxValor = "" + valor;

		System.out.println(auxOp);
		System.out.println(auxValor);
		
		if(auxValor.startsWith(auxOp)) {
			return true;
		}else {
			return false;
		}
		
	}

	
	// O método rodarAplicacao deve retornar true caso o aplicativo termine em .apk
	@Override
	public boolean rodarAplicacao(String valor) {
		if(valor.endsWith(".apk")) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
