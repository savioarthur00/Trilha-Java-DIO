package Subsistema2;



public class CepApi {
	
private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
		
	}
	
	public String recuperarCidade(String cidade) {
		return "Serra";
	}
	public String recuperarEstado(String estado) {
		return "PE";
	}
	

}
