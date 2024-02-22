package exercicio8_corrigido;

public class Endereco {
	
	private String pais;
    private String estadoa;
    private String cidade;
    private String logradouro;
    private String numero;
    public Endereco(String pais, String estadoa, String cidade, String logradouro, String numero) {
        setPais(pais);
        setEstadoa(estadoa);
        setCidade(cidade);
        setLogradouro(logradouro);
        setNumero(numero);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstadoa() {
        return estadoa;
    }

    public void setEstadoa(String estadoa) {
        this.estadoa = estadoa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

	@Override
	public String toString() {
		return "Endereco [pais=" + pais + ", estadoa=" + estadoa + ", cidade=" + cidade + ", logradouro="
				+ logradouro + ", numero=" + numero + "]";
	}
    
    
}

