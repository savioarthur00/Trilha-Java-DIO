package DioSpringboot;

public class Remetente {
	private String email;
	private String nome;
	
	
	public Remetente() {
				
	}

	


	@Override
	public String toString() {
		return "Remetente [email=" + email + ", nome=" + nome + "]";
	}




	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
