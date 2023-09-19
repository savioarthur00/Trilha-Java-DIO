package ProjetoPessoal.SociedadeCampestreapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contato {
	
	@Id
	private String celular;
	private String email;
	private String telefone;
	
	
	
	
	public Contato(String email, String telefone, String celular) {
		super();
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
	}
	
	
	
	public Contato() {
		super();
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	

}
