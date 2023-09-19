package PadroesDeProjetosFacade;

import Subsistema1.CrmService;
import Subsistema2.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) 
	{
	
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarClient(nome, cep, estado, cidade);
	}

}
