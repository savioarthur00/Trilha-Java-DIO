package List_Atividade_1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	private List<Tarefa>tarefas; 

	private ListaTarefas() {
		this.tarefas = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao));
		
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasRemover = new ArrayList<>();
		
		for (Tarefa tarefa : tarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasRemover.add(tarefa);
			}
			
		}
		tarefas.removeAll(tarefasRemover);
	}
	
	public int obterTotalTarefas() {
		return tarefas.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefas);
		
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
			
		System.out.println(listaTarefas.obterTotalTarefas());
		
		listaTarefas.adicionarTarefa("Nova tarefa");
		listaTarefas.adicionarTarefa("Nova tarefa");
		listaTarefas.adicionarTarefa("Nova tarefa 2");
		listaTarefas.adicionarTarefa("Nova tarefa 3");
		
		System.out.println(listaTarefas.obterTotalTarefas());
		
		listaTarefas.removerTarefa("Nova tarefa");
		
		System.out.println(listaTarefas.obterTotalTarefas());
		
		listaTarefas.obterDescricoesTarefas();
		
		
	}
	
	

}
