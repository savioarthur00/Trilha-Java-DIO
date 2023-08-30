package List_CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogodeLivros {
	
	public List<Livro> catalogodelivros;
	
	
	
	private CatalogodeLivros() {
		
		catalogodelivros = new ArrayList<Livro>();
	}



	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao){
		catalogodelivros.add(new Livro(titulo,autor,anoPublicacao));
		
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosEncontrados = new ArrayList<Livro>();
		
		if(!catalogodelivros.isEmpty()) {
		for (Livro livro : catalogodelivros) {
			if(livro.getAutor().equalsIgnoreCase(autor)) {
				livrosEncontrados.add(livro);
			}
			
		}}		
		
		return livrosEncontrados;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		
		List<Livro> livrosEncontrados = new ArrayList<Livro>();
		if(!catalogodelivros.isEmpty()) {
		for (Livro livro : catalogodelivros) {
			if(livro.getAnoLancamento()> anoInicial && livro.getAnoLancamento() < anoFinal) {
				livrosEncontrados.add(livro);
			}
			
		}}	
		
		return livrosEncontrados;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroEncontrado = null;
		
		if(!catalogodelivros.isEmpty()) {
		for (Livro livro : catalogodelivros) {
			if(livro.getTitulo().equalsIgnoreCase(titulo)) {
				livroEncontrado = livro;
				break;
			}
			
		}}	
		
		return livroEncontrado;
	}
	
	public static void main(String[] args) {
		CatalogodeLivros catalogodeLivros = new CatalogodeLivros();
		catalogodeLivros.adicionarLivro("Livro 1", "autor 1 ", 2011);
		catalogodeLivros.adicionarLivro("Livro 1", "autor 1 ", 2015);
		catalogodeLivros.adicionarLivro("Livro 2", "autor 2 ", 2012);
		catalogodeLivros.adicionarLivro("Livro 3", "autor 3", 2020);
		catalogodeLivros.adicionarLivro("Livro 3", "autor 3", 2023);
		
		System.out.println(catalogodeLivros.pesquisarPorAutor("autor 3"));
		System.out.println(catalogodeLivros.pesquisarPorIntervaloAnos(2010, 2016));
		System.out.println(catalogodeLivros.pesquisarPorTitulo("Livro 3"));
		
		
		
	}
	
	

}
