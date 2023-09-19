package DioSpringboot;



public class ViaCepResponse {
	
	private String cep,logradouro,localidade;

	
	
	
	@Override
	public String toString() {
		return "ViaCepResponse [cep=" + cep + ", logradouro=" + logradouro + ", localidade=" + localidade + "]";
	}

	private ViaCepResponse(String cep, String logradouro, String localidade) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.localidade = localidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	
	

}
