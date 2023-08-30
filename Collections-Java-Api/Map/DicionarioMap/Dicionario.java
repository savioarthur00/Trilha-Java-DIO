package DicionarioMap;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	
	private Map<String , String> dicionarios;

	public Dicionario() {
		
		this.dicionarios = new HashMap<String, String>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarios .put(palavra, definicao);
		
	}
	public void removerPalavra(String palavra) {
		
		if(!dicionarios.isEmpty()) {
			dicionarios.remove(palavra);
		}
	}
	
	public void exibirPalavras() {
		System.out.println(dicionarios);
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String pesquisarNome = null;
		if(!dicionarios.isEmpty()) {
			pesquisarNome=dicionarios.get(palavra);
		}
		return pesquisarNome;
	}
	
	
	 public static void main(String[] args) {
		    Dicionario dicionario = new Dicionario();

		    // Adicionar palavras (linguagens de programação)
		    dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
		    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
		    dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

		    // Exibir todas as palavras
		    dicionario.exibirPalavras();

		    // Pesquisar palavras
		    String definicaoJava = dicionario.pesquisarPorPalavra("java");
		    System.out.println("Definição da linguagem 'java': " + definicaoJava);

		    String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
		    System.out.println(definicaoCSharp);

		    // Remover uma palavra
		    dicionario.removerPalavra("typescript");
		    dicionario.exibirPalavras();
		  }

} 

