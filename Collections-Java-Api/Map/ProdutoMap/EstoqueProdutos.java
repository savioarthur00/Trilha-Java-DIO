package ProdutoMap;

import java.util.HashMap;
import java.util.Map;



public class EstoqueProdutos {
	
	private Map<Long, Produto> produtos;

	public EstoqueProdutos() {
		
		this.produtos =  new HashMap<Long, Produto>();
		
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		produtos.put(cod, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(produtos);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotal = 0.0;
		
		if(!produtos.isEmpty()) {
			for (Produto p : produtos.values()) {
				valorTotal += p.getPreco() * p.getQuantidade();
				
			}
			
		}
		return valorTotal;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		
		if(!produtos.isEmpty()) {
			for (Produto p : produtos.values()) {
				if(p.getPreco()> maiorPreco) {
					produtoCaro = p;
				}
				
			}
			
		}
		return produtoCaro;
		
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoBarato = null;
		double menorPreco = Double.MIN_VALUE;
		
		if(!produtos.isEmpty()) {
			for (Produto p : produtos.values()) {
				if(p.getPreco()< menorPreco) {
					produtoBarato = p;
				}
				
			}
			
		}
		return produtoBarato;
		
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		 Produto produtoMaiorQuantidadeValorNoEstoque = null;
		    double maiorValorTotalProdutoEstoque = 0d;
		    if (! produtos.isEmpty()) {
		      for (Map.Entry<Long, Produto> entry :  produtos.entrySet()) {
		        double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
		        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
		          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
		          produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
		        }
		      }
		    }
		    return produtoMaiorQuantidadeValorNoEstoque;
		
	}
	
	
	public static void main(String[] args) {
	    EstoqueProdutos estoque = new EstoqueProdutos();

	    // Exibe o estoque vazio
	    estoque.exibirProdutos();

	    // Adiciona produtos ao estoque
	    estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
	    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
	    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
	    estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

	    // Exibe os produtos no estoque
	    estoque.exibirProdutos();

	    // Calcula e exibe o valor total do estoque
	    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

	    // Obtém e exibe o produto mais caro
	    Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
	    System.out.println("Produto mais caro: " + produtoMaisCaro);

	    // Obtém e exibe o produto mais barato
	    Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
	    System.out.println("Produto mais barato: " + produtoMaisBarato);

	    // Obtém e exibe o produto com a maior quantidade em valor no estoque
	    Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
	    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
	  }

}
