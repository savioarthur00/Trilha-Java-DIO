package ListadeProdutos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListadeProdutos {
	
	private Set<Produto> produtos;

	public ListadeProdutos() {		
		this.produtos = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtos.add(new Produto(nome, quantidade, cod, preco));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		 Set<Produto> listadeProdutosOrganizadosPorNome = new TreeSet<>(produtos);
		return listadeProdutosOrganizadosPorNome;
		
	}
	public Set<Produto> exibirProdutosPorPreco(){
		 Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtos);
		return produtosPorPreco;
		
	}
	
	class ComparatorPorPreco implements Comparator<Produto> {
		  @Override
		  public int compare(Produto p1, Produto p2) {
		    return Double.compare(p1.getPreco(), p2.getPreco());
	}}
	
	 public static void main(String[] args) {
		    // Criando uma instância do CadastroProdutos
		    ListadeProdutos cadastroProdutos = new ListadeProdutos();

		    // Adicionando produtos ao cadastro
		    cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
		    cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
		    cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
		    cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

		    // Exibindo todos os produtos no cadastro
		    System.out.println(cadastroProdutos.exibirProdutosPorNome());

		    // Exibindo produtos ordenados por nome
		    System.out.println(cadastroProdutos.exibirProdutosPorNome());

		    // Exibindo produtos ordenados por preço
		    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
		  }
	

}
