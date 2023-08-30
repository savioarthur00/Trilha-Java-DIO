package GerenciadorAlunos;

import java.util.Objects;

public class Aluno  implements Comparable<Aluno> {

	
	  private String nome;
	  private Long matricula;
	  private double media;
	  
	  
	public Aluno(String nome, Long matricula, double media) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Long getMatricula() {
		return matricula;
	}


	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}


	public double getMedia() {
		return media;
	}


	public void setMedia(double media) {
		this.media = media;
	}


	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Aluno))
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	@Override
	  public int compareTo(Aluno aluno) {
	    return nome.compareTo(aluno.getNome());
	  }


	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", media=" + media + "]";
	}
	
	
	
	
	
	  
	  
	  
}
