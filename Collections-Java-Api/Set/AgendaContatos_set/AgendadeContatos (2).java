package AgendaContatos_set;

import java.util.HashSet;
import java.util.Set;

public class AgendadeContatos {
	
	private Set<Contato> agendadeContatosSet;

	private AgendadeContatos() {		
		this.agendadeContatosSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		agendadeContatosSet.add(new Contato(nome,numero));
		
	}
	
	public void exibirContatos(){
		
		if(agendadeContatosSet.isEmpty()) {
			System.out.println("Lista vazia");
			
		}else {
			System.out.println(agendadeContatosSet);
		}
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> agenda = new HashSet<>();
		
		for (Contato a : agendadeContatosSet) {
			if(a.getNome().startsWith(nome)) {
				agenda.add(a);
				
			}
		}
		return agenda;
		
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		
		Contato c = null;
		
		if(!agendadeContatosSet.isEmpty()) {
		for (Contato a : agendadeContatosSet) {
			if(a.getNome().equalsIgnoreCase(nome)) {
				a.setNumero_telefone(novoNumero);
				c = a;
				break;
			}
		}}
		else {
			System.out.println("Agenda vazia");
		}
		
		return c;
		
	}
	
	public static void main(String[] args) {
	    // Criando uma instância da classe AgendaContatos
	    AgendadeContatos agendaContatos = new AgendadeContatos();

	    // Exibindo os contatos no conjunto (deve estar vazio)
	    agendaContatos.exibirContatos();

	    // Adicionando contatos à agenda
	    agendaContatos.adicionarContato("João", 123456789);
	    agendaContatos.adicionarContato("Maria", 987654321);
	    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
	    agendaContatos.adicionarContato("Ana", 88889999);
	    agendaContatos.adicionarContato("Fernando", 77778888);
	    agendaContatos.adicionarContato("Ana maria", 55555555);

	    // Exibindo os contatos na agenda
	    agendaContatos.exibirContatos();

	    // Pesquisando contatos pelo nome
	    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

	    // Atualizando o número de um contato
	    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Ana", 44443333);
	    System.out.println("Contato atualizado: " + contatoAtualizado);

	    // Exibindo os contatos atualizados na agenda
	    System.out.println("Contatos na agenda após atualização:");
	    agendaContatos.exibirContatos();
	  }
	
	
	

}
