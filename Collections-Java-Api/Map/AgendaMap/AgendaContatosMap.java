package AgendaMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatosMap {
	
	Map<String, Integer> contatosMap;

	public AgendaContatosMap() {
		this.contatosMap = new HashMap<String, Integer>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		contatosMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		
		if(!contatosMap.isEmpty()) {
			contatosMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		if(!contatosMap.isEmpty()) {
			System.out.println(contatosMap);
		}
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		
		if(!contatosMap.isEmpty()) {
			numeroPorNome=contatosMap.get(nome);
		}
		
		return numeroPorNome;
	}
	
	 public static void main(String[] args) {
		    AgendaContatosMap agendaContatos = new AgendaContatosMap();

		    // Adicionar contatos
		    agendaContatos.adicionarContato("Camila", 123456);
		    agendaContatos.adicionarContato("Jo�o", 5665);
		    agendaContatos.adicionarContato("Carlos", 1111111);
		    agendaContatos.adicionarContato("Ana", 654987);
		    agendaContatos.adicionarContato("Maria", 1111111);
		    agendaContatos.adicionarContato("Camila", 44444);

		    agendaContatos.exibirContatos();

		    // Remover um contato
		    agendaContatos.removerContato("Maria");
		    agendaContatos.exibirContatos();

		    // Pesquisar n�mero por nome
		    String nomePesquisa = "Jo�o";
		    Integer numeroPesquisa = agendaContatos.pesquisarPorNome("Jo�o");
		    System.out.println("N�mero de telefone de " + nomePesquisa + ": " + numeroPesquisa);

		    String nomePesquisaNaoExistente = "Fulana";
		    Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
		    System.out.println("N�mero de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
		  }

}
