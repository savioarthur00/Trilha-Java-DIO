package ListadeTarefas_set;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
	
	private Set<Tarefa> tarefas;

	private ListaTarefa() {
		
		this.tarefas = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(false, descricao));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa t = null;
		
		if(tarefas.isEmpty()) {
			System.out.println("Lista vazia");
		}else {
		for (Tarefa tarefa : tarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				t= tarefa;
				break;				
			}
		  }
		}
		tarefas.remove(t);
		
	}
	
	public void exibirTarefas(){
		System.out.println(tarefas);
	}
	
	public int contarTarefas() {
		int quantidade = tarefas.size();
		return quantidade;
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> concluidasTarefas = new HashSet<>();
		
		for (Tarefa tarefa : tarefas) {
			if(tarefa.isStatus()) {
				concluidasTarefas.add(tarefa);
			}
		}
		
		return concluidasTarefas;
		
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> pendentesTarefas = new HashSet<>();
		
		for (Tarefa tarefa :tarefas) {
			if(!tarefa.isStatus()) {
				pendentesTarefas.add(tarefa);
			}
		}
		
		return pendentesTarefas;
		
	}
	
	public void marcarTarefaConcluida(String descricao) {
		
		
		if(tarefas.isEmpty()) {
			System.out.println("Lista vazia");
		}else {
		for (Tarefa tarefa : tarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefa.setStatus(true);				
				break;				
			}
		  }
		}
		
	}
	
	public void marcarTarefaPendente(String descricao) {
		
		
		if(tarefas.isEmpty()) {
			System.out.println("Lista vazia");
		}else {
		for (Tarefa tarefa : tarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefa.setStatus(false);				
				break;				
			}
		  }
		}
		
	}
	
	public void limparListaTarefas() {
		
		tarefas.clear();
	}
	
	public static void main(String[] args) {
	    // Criando uma instância da classe ListaTarefas
	    ListaTarefa listaTarefas = new ListaTarefa();

	    // Adicionando tarefas à lista
	    listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");

	    // Exibindo as tarefas na lista
	    listaTarefas.exibirTarefas();

	    // Removendo uma tarefa
	    listaTarefas.removerTarefa("Fazer exercícios físicos");
	    listaTarefas.exibirTarefas();

	    // Contando o número de tarefas na lista
	    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

	    // Obtendo tarefas concluídas
	    System.out.println(listaTarefas.obterTarefasConcluidas());

	    // Obtendo tarefas pendentes
	    System.out.println(listaTarefas.obterTarefasPendentes());

	    // Marcando tarefas como concluídas
	    listaTarefas.marcarTarefaConcluida("Ler livro");
	    listaTarefas.marcarTarefaConcluida("Estudar Java");
	    listaTarefas.exibirTarefas();

	    // Marcando tarefas como pendentes
	    listaTarefas.marcarTarefaPendente("Estudar Java");
	    listaTarefas.exibirTarefas();

	    // Limpando a lista de tarefas
	    listaTarefas.limparListaTarefas();
	    listaTarefas.exibirTarefas();
	  }
	
	
	
	
	
	
	
	

}
