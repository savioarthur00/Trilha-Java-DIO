package Subsistema1;

public class CrmService {
	
	
	
	private CrmService() {
		super();
		
	}

	public static void gravarClient(String nome, String cep, String estado , String cidade){
		
		System.out.println("Cliente salvo no sistema service");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(estado);
		System.out.println(cidade);
		
		
	}

}
