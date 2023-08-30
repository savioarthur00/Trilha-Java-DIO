package AgendaContatos_set;

import java.util.Objects;

public class Contato {
	
	private String nome;
	private int numero_telefone;
	
	
	
	public Contato(String nome, int numero_telefone) {
		super();
		this.nome = nome;
		this.numero_telefone = numero_telefone;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Contato))
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}





	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero_telefone() {
		return numero_telefone;
	}
	public void setNumero_telefone(int numero_telefone) {
		this.numero_telefone = numero_telefone;
	}



	@Override
	public String toString() {
		return "Contato [nome= " + nome + ", numero_telefone= " + numero_telefone + "]";
	}
	
	
	
	

}
