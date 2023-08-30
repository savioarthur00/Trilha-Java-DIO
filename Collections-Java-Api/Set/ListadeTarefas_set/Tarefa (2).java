package ListadeTarefas_set;

import java.util.Objects;

public class Tarefa {
	
	private boolean status;
	private String descricao;
	
	
	
	
	public Tarefa(boolean status, String descricao) {
		super();
		this.status = status;
		this.descricao = descricao;
	}
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Tarefa [status= " + status + ", descricao= " + descricao + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Tarefa))
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}
	
	
	
	

}
